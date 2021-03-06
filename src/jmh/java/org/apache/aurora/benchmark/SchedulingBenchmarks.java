/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.aurora.benchmark;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import javax.inject.Singleton;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.eventbus.EventBus;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.TypeLiteral;
import com.twitter.common.quantity.Amount;
import com.twitter.common.quantity.Data;
import com.twitter.common.quantity.Time;
import com.twitter.common.stats.StatsProvider;
import com.twitter.common.util.Clock;
import com.twitter.common.util.testing.FakeClock;

import org.apache.aurora.benchmark.fakes.FakeDriver;
import org.apache.aurora.benchmark.fakes.FakeRescheduleCalculator;
import org.apache.aurora.benchmark.fakes.FakeStatsProvider;
import org.apache.aurora.scheduler.HostOffer;
import org.apache.aurora.scheduler.TaskIdGenerator;
import org.apache.aurora.scheduler.async.OfferQueue;
import org.apache.aurora.scheduler.async.RescheduleCalculator;
import org.apache.aurora.scheduler.async.TaskScheduler;
import org.apache.aurora.scheduler.async.TaskScheduler.TaskSchedulerImpl.ReservationDuration;
import org.apache.aurora.scheduler.async.preemptor.CachedClusterState;
import org.apache.aurora.scheduler.async.preemptor.ClusterState;
import org.apache.aurora.scheduler.async.preemptor.Preemptor;
import org.apache.aurora.scheduler.async.preemptor.PreemptorImpl;
import org.apache.aurora.scheduler.configuration.Resources;
import org.apache.aurora.scheduler.events.EventSink;
import org.apache.aurora.scheduler.events.PubsubEvent;
import org.apache.aurora.scheduler.filter.SchedulingFilter;
import org.apache.aurora.scheduler.filter.SchedulingFilterImpl;
import org.apache.aurora.scheduler.mesos.Driver;
import org.apache.aurora.scheduler.mesos.ExecutorSettings;
import org.apache.aurora.scheduler.state.StateModule;
import org.apache.aurora.scheduler.storage.Storage;
import org.apache.aurora.scheduler.storage.entities.IHostAttributes;
import org.apache.aurora.scheduler.storage.entities.IScheduledTask;
import org.apache.aurora.scheduler.storage.mem.MemStorage;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

/**
 * Performance benchmarks for the task scheduling loop.
 */
public class SchedulingBenchmarks {

  /**
   * Constructs scheduler objects and populates offers/tasks for the benchmark run.
   */
  @State(Scope.Thread)
  public abstract static class AbstractBase {
    protected Storage storage;
    protected TaskScheduler taskScheduler;
    protected OfferQueue offerQueue;
    protected IScheduledTask task;
    protected Set<HostOffer> offers;
    protected Set<IHostAttributes> hostAttributes;
    protected EventBus eventBus;

    /**
     * Runs once to setup up benchmark state.
     */
    @Setup(Level.Trial)
    public void prepare() {
      storage = MemStorage.newEmptyStorage();
      eventBus = new EventBus();
      final FakeClock clock = new FakeClock();
      clock.setNowMillis(System.currentTimeMillis());

      Injector injector = Guice.createInjector(
          new StateModule(),
          new AbstractModule() {
            @Override
            protected void configure() {
              final ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(
                  1,
                  new ThreadFactoryBuilder()
                      .setDaemon(true)
                      .setNameFormat("TestProcessor-%d").build());
              bind(ScheduledExecutorService.class).toInstance(executor);

              bind(OfferQueue.class).to(OfferQueue.OfferQueueImpl.class);
              bind(OfferQueue.OfferQueueImpl.class).in(Singleton.class);
              bind(OfferQueue.OfferReturnDelay.class).toInstance(
                  new OfferQueue.OfferReturnDelay() {
                    @Override
                    public Amount<Long, Time> get() {
                      return Amount.of(30L, Time.DAYS);
                    }
                  });

              bind(new TypeLiteral<Amount<Long, Time>>() { })
                  .annotatedWith(ReservationDuration.class)
                  .toInstance(Amount.of(30L, Time.DAYS));
              bind(TaskScheduler.class).to(TaskScheduler.TaskSchedulerImpl.class);
              bind(TaskScheduler.TaskSchedulerImpl.class).in(Singleton.class);
              bind(TaskIdGenerator.class).to(TaskIdGenerator.TaskIdGeneratorImpl.class);
              bind(SchedulingFilter.class).to(SchedulingFilterImpl.class);
              bind(SchedulingFilterImpl.class).in(Singleton.class);
              bind(ExecutorSettings.class)
                  .toInstance(new ExecutorSettings(
                      "/executor/thermos",
                      ImmutableList.<String>of(),
                      "/var/run/thermos",
                      Optional.<String>absent(),
                      new Resources(0.0, Amount.of(0L, Data.MB), Amount.of(0L, Data.MB), 0)));

              bind(Preemptor.class).to(PreemptorImpl.class);
              bind(PreemptorImpl.class).in(Singleton.class);
              bind(new TypeLiteral<Amount<Long, Time>>() { })
                  .annotatedWith(PreemptorImpl.PreemptionDelay.class)
                  .toInstance(Amount.of(0L, Time.MILLISECONDS));
              bind(ClusterState.class).to(CachedClusterState.class);
              bind(CachedClusterState.class).in(Singleton.class);

              bind(Storage.class).toInstance(storage);
              bind(Driver.class).toInstance(new FakeDriver());
              bind(RescheduleCalculator.class).toInstance(new FakeRescheduleCalculator());
              bind(Clock.class).toInstance(clock);
              bind(StatsProvider.class).toInstance(new FakeStatsProvider());
              bind(EventSink.class).toInstance(new EventSink() {
                @Override
                public void post(PubsubEvent event) {
                  eventBus.post(event);
                }
              });
            }
          }
      );

      taskScheduler = injector.getInstance(TaskScheduler.class);
      offerQueue = injector.getInstance(OfferQueue.class);
      eventBus.register(injector.getInstance(CachedClusterState.class));

      hostAttributes = createHostAttributes();
      saveHostAttributes(hostAttributes);

      offers = createOffers(hostAttributes);
      Offers.addOffers(offerQueue, offers);
      fillUpCluster();

      task = createTask();
      saveTasks(ImmutableSet.of(task));
    }

    private void fillUpCluster() {
      int numOffersToFill = (int) Math.round(offers.size() * getClusterUtilization());
      Set<IScheduledTask> tasksToAssign = new Tasks.Builder().build(numOffersToFill);
      saveTasks(tasksToAssign);
      for (IScheduledTask scheduledTask : tasksToAssign) {
        taskScheduler.schedule(scheduledTask.getAssignedTask().getTaskId());
      }
    }

    private void saveTasks(final Set<IScheduledTask> tasks) {
      storage.write(new Storage.MutateWork.NoResult.Quiet() {
        @Override
        protected void execute(Storage.MutableStoreProvider storeProvider) {
          storeProvider.getUnsafeTaskStore().saveTasks(tasks);
        }
      });
    }

    private void saveHostAttributes(final Set<IHostAttributes> hostAttributesToSave) {
      storage.write(new Storage.MutateWork.NoResult.Quiet() {
        @Override
        protected void execute(Storage.MutableStoreProvider storeProvider) {
          for (IHostAttributes attributes : hostAttributesToSave) {
            storeProvider.getAttributeStore().saveHostAttributes(attributes);
          }
        }
      });
    }

    protected abstract double getClusterUtilization();

    protected abstract Set<IHostAttributes> createHostAttributes();

    protected abstract Set<HostOffer> createOffers(Set<IHostAttributes> attributes);

    protected abstract IScheduledTask createTask();

    /**
     * Benchmark entry point. All settings (e.g. iterations, benchmarkMode and etc.) are defined
     * in build.gradle.
     *
     * @return A "blackhole" to make sure the result is not optimized out.
     * See {@see http://openjdk.java.net/projects/code-tools/jmh/} for more info.
     */
    @Benchmark
    public boolean runBenchmark() {
      return taskScheduler.schedule(task.getAssignedTask().getTaskId());
    }
  }

  /**
   * Tests scheduling performance with a task vetoed due to insufficient CPU.
   */
  public static class InsufficientResourcesSchedulingBenchmark extends AbstractBase {
    @Override
    protected Set<IHostAttributes> createHostAttributes() {
      return new Hosts.Builder().setNumHostsPerRack(2).build(1000);
    }

    @Override
    protected Set<HostOffer> createOffers(Set<IHostAttributes> hostAttributes) {
      return new Offers.Builder().build(hostAttributes);
    }

    @Override
    protected double getClusterUtilization() {
      return 0.9;
    }

    @Override
    protected IScheduledTask createTask() {
      return Iterables.getOnlyElement(new Tasks.Builder()
          .setProduction(true)
          .setCpu(32)
          .setTaskIdFormat("test-%s")
          .build(1));
    }
  }

  /**
   * Tests scheduling performance with a task vetoed due to constraint mismatch.
   */
  public static class ConstraintMismatchsSchedulingBenchmark extends AbstractBase {
    @Override
    protected Set<IHostAttributes> createHostAttributes() {
      return new Hosts.Builder().setNumHostsPerRack(2).build(1000);
    }

    @Override
    protected Set<HostOffer> createOffers(Set<IHostAttributes> hostAttributes) {
      return new Offers.Builder().build(hostAttributes);
    }

    @Override
    protected double getClusterUtilization() {
      return 0.9;
    }

    @Override
    protected IScheduledTask createTask() {
      return Iterables.getOnlyElement(new Tasks.Builder()
          .setProduction(true)
          .addValueConstraint("host", "denied")
          .setTaskIdFormat("test-%s")
          .build(1));
    }
  }

  /**
   * Tests scheduling performance with a large number of tasks and slaves where the cluster
   * is completely filled up and preemptor is invoked for all slaves in the cluster.
   */
  public static class PreemptorFallbackForLargeClusterBenchmark extends AbstractBase {
    @Override
    protected Set<IHostAttributes> createHostAttributes() {
      return new Hosts.Builder().setNumHostsPerRack(2).build(10000);
    }

    @Override
    protected Set<HostOffer> createOffers(Set<IHostAttributes> hostAttributes) {
      return new Offers.Builder().build(hostAttributes);
    }

    @Override
    protected double getClusterUtilization() {
      return 1.0;
    }

    @Override
    protected IScheduledTask createTask() {
      return Iterables.getOnlyElement(new Tasks.Builder()
          .setProduction(true)
          .addValueConstraint("host", "denied")
          .setTaskIdFormat("test-%s")
          .build(1));
    }
  }
}
