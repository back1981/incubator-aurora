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
package org.apache.aurora.scheduler.state;

import java.util.Set;
import java.util.logging.Logger;

import javax.inject.Inject;

import com.google.common.base.Optional;

import org.apache.aurora.scheduler.HostOffer;
import org.apache.aurora.scheduler.ResourceSlot;
import org.apache.aurora.scheduler.configuration.Resources;
import org.apache.aurora.scheduler.filter.SchedulingFilter;
import org.apache.aurora.scheduler.filter.SchedulingFilter.ResourceRequest;
import org.apache.aurora.scheduler.filter.SchedulingFilter.UnusedResource;
import org.apache.aurora.scheduler.filter.SchedulingFilter.Veto;
import org.apache.aurora.scheduler.mesos.MesosTaskFactory;
import org.apache.aurora.scheduler.storage.entities.IAssignedTask;
import org.apache.mesos.Protos.TaskInfo;

import static java.util.Objects.requireNonNull;

import static org.apache.aurora.scheduler.storage.Storage.MutableStoreProvider;
import static org.apache.mesos.Protos.Offer;

/**
 * Responsible for matching a task against an offer.
 */
public interface TaskAssigner {

  /**
   * Tries to match a task against an offer.  If a match is found, the assigner should
   * make the appropriate changes to the task and provide a non-empty result.
   *
   * @param storeProvider Storage provider.
   * @param offer The resource offer.
   * @param resourceRequest The request for resources being scheduled.
   * @return Instructions for launching the task if matching and assignment were successful.
   */
  Optional<TaskInfo> maybeAssign(
      MutableStoreProvider storeProvider,
      HostOffer offer,
      ResourceRequest resourceRequest);

  class TaskAssignerImpl implements TaskAssigner {
    private static final Logger LOG = Logger.getLogger(TaskAssignerImpl.class.getName());

    private final StateManager stateManager;
    private final SchedulingFilter filter;
    private final MesosTaskFactory taskFactory;

    @Inject
    public TaskAssignerImpl(
        StateManager stateManager,
        SchedulingFilter filter,
        MesosTaskFactory taskFactory) {

      this.stateManager = requireNonNull(stateManager);
      this.filter = requireNonNull(filter);
      this.taskFactory = requireNonNull(taskFactory);
    }

    private TaskInfo assign(
        MutableStoreProvider storeProvider,
        Offer offer,
        int numRequestedPorts,
        String taskId) {

      String host = offer.getHostname();
      Set<Integer> selectedPorts = Resources.getPorts(offer, numRequestedPorts);
      IAssignedTask assigned = stateManager.assignTask(
          storeProvider,
          taskId,
          host,
          offer.getSlaveId(),
          selectedPorts);
      LOG.info(String.format("Offer on slave %s (id %s) is being assigned task for %s.",
          host, offer.getSlaveId().getValue(), taskId));
      return taskFactory.createFrom(assigned, offer);
    }

    @Override
    public Optional<TaskInfo> maybeAssign(
        MutableStoreProvider storeProvider,
        HostOffer offer,
        ResourceRequest resourceRequest) {

      Set<Veto> vetoes = filter.filter(
          new UnusedResource(ResourceSlot.from(offer.getOffer()), offer.getAttributes()),
          resourceRequest);
      if (vetoes.isEmpty()) {
        return Optional.of(assign(
            storeProvider,
            offer.getOffer(),
            resourceRequest.getNumRequestedPorts(),
            resourceRequest.getTaskId()));
      } else {
        LOG.fine("Slave " + offer.getOffer().getHostname()
            + " vetoed task " + resourceRequest.getTaskId() + ": " + vetoes);
        return Optional.absent();
      }
    }
  }
}
