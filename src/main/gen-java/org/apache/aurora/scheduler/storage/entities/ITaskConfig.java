package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.TaskConfig;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class ITaskConfig {
  private final TaskConfig wrapped;
  private int cachedHashCode = 0;
  private final IJobKey job;
  private final IIdentity owner;
  private final ImmutableSet<IConstraint> constraints;
  private final ImmutableSet<String> requestedPorts;
  private final IContainer container;

  private ITaskConfig(TaskConfig wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.job = !wrapped.isSetJob()
        ? null
        : IJobKey.buildNoCopy(wrapped.getJob());
    this.owner = !wrapped.isSetOwner()
        ? null
        : IIdentity.buildNoCopy(wrapped.getOwner());
    this.constraints = !wrapped.isSetConstraints()
        ? ImmutableSet.<IConstraint>of()
        : FluentIterable.from(wrapped.getConstraints())
              .transform(IConstraint.FROM_BUILDER)
              .toSet();
    this.requestedPorts = !wrapped.isSetRequestedPorts()
        ? ImmutableSet.<String>of()
        : ImmutableSet.copyOf(wrapped.getRequestedPorts());
    this.container = !wrapped.isSetContainer()
        ? null
        : IContainer.buildNoCopy(wrapped.getContainer());
  }

  static ITaskConfig buildNoCopy(TaskConfig wrapped) {
    return new ITaskConfig(wrapped);
  }

  public static ITaskConfig build(TaskConfig wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<ITaskConfig, TaskConfig> TO_BUILDER =
      new Function<ITaskConfig, TaskConfig>() {
        @Override
        public TaskConfig apply(ITaskConfig input) {
          return input.newBuilder();
        }
      };

  public static final Function<TaskConfig, ITaskConfig> FROM_BUILDER =
      new Function<TaskConfig, ITaskConfig>() {
        @Override
        public ITaskConfig apply(TaskConfig input) {
          return ITaskConfig.build(input);
        }
      };

  public static ImmutableList<TaskConfig> toBuildersList(Iterable<ITaskConfig> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<ITaskConfig> listFromBuilders(Iterable<TaskConfig> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<TaskConfig> toBuildersSet(Iterable<ITaskConfig> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<ITaskConfig> setFromBuilders(Iterable<TaskConfig> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public TaskConfig newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetJob() {
    return wrapped.isSetJob();
  }

  public IJobKey getJob() {
    return job;
  }

  public boolean isSetOwner() {
    return wrapped.isSetOwner();
  }

  public IIdentity getOwner() {
    return owner;
  }

  public boolean isSetEnvironment() {
    return wrapped.isSetEnvironment();
  }

  public String getEnvironment() {
    return wrapped.getEnvironment();
  }

  public boolean isSetJobName() {
    return wrapped.isSetJobName();
  }

  public String getJobName() {
    return wrapped.getJobName();
  }

  public boolean isSetIsService() {
    return wrapped.isSetIsService();
  }

  public boolean isIsService() {
    return wrapped.isIsService();
  }

  public boolean isSetNumCpus() {
    return wrapped.isSetNumCpus();
  }

  public double getNumCpus() {
    return wrapped.getNumCpus();
  }

  public boolean isSetRamMb() {
    return wrapped.isSetRamMb();
  }

  public long getRamMb() {
    return wrapped.getRamMb();
  }

  public boolean isSetDiskMb() {
    return wrapped.isSetDiskMb();
  }

  public long getDiskMb() {
    return wrapped.getDiskMb();
  }

  public boolean isSetPriority() {
    return wrapped.isSetPriority();
  }

  public int getPriority() {
    return wrapped.getPriority();
  }

  public boolean isSetMaxTaskFailures() {
    return wrapped.isSetMaxTaskFailures();
  }

  public int getMaxTaskFailures() {
    return wrapped.getMaxTaskFailures();
  }

  public boolean isSetProduction() {
    return wrapped.isSetProduction();
  }

  public boolean isProduction() {
    return wrapped.isProduction();
  }

  public boolean isSetConstraints() {
    return wrapped.isSetConstraints();
  }

  public ImmutableSet<IConstraint> getConstraints() {
    return constraints;
  }

  public boolean isSetRequestedPorts() {
    return wrapped.isSetRequestedPorts();
  }

  public ImmutableSet<String> getRequestedPorts() {
    return requestedPorts;
  }

  public boolean isSetContainer() {
    return wrapped.isSetContainer();
  }

  public IContainer getContainer() {
    return container;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof ITaskConfig)) {
      return false;
    }
    ITaskConfig other = (ITaskConfig) o;
    return wrapped.equals(other.wrapped);
  }

  @Override
  public int hashCode() {
    // Following java.lang.String's example of caching hashCode.
    // This is thread safe in that multiple threads may wind up
    // computing the value, which is apparently favorable to constant
    // synchronization overhead.
    if (cachedHashCode == 0) {
      cachedHashCode = wrapped.hashCode();
    }
    return cachedHashCode;
  }

  @Override
  public String toString() {
    return wrapped.toString();
  }
}
