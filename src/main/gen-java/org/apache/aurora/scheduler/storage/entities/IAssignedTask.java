package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.AssignedTask;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IAssignedTask {
  private final AssignedTask wrapped;
  private int cachedHashCode = 0;
  private final ITaskConfig task;
  private final ImmutableMap<String, Integer> assignedPorts;

  private IAssignedTask(AssignedTask wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.task = !wrapped.isSetTask()
        ? null
        : ITaskConfig.buildNoCopy(wrapped.getTask());
    this.assignedPorts = !wrapped.isSetAssignedPorts()
        ? ImmutableMap.<String, Integer>of()
        : ImmutableMap.copyOf(wrapped.getAssignedPorts());
  }

  static IAssignedTask buildNoCopy(AssignedTask wrapped) {
    return new IAssignedTask(wrapped);
  }

  public static IAssignedTask build(AssignedTask wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IAssignedTask, AssignedTask> TO_BUILDER =
      new Function<IAssignedTask, AssignedTask>() {
        @Override
        public AssignedTask apply(IAssignedTask input) {
          return input.newBuilder();
        }
      };

  public static final Function<AssignedTask, IAssignedTask> FROM_BUILDER =
      new Function<AssignedTask, IAssignedTask>() {
        @Override
        public IAssignedTask apply(AssignedTask input) {
          return IAssignedTask.build(input);
        }
      };

  public static ImmutableList<AssignedTask> toBuildersList(Iterable<IAssignedTask> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IAssignedTask> listFromBuilders(Iterable<AssignedTask> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<AssignedTask> toBuildersSet(Iterable<IAssignedTask> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IAssignedTask> setFromBuilders(Iterable<AssignedTask> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public AssignedTask newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetTaskId() {
    return wrapped.isSetTaskId();
  }

  public String getTaskId() {
    return wrapped.getTaskId();
  }

  public boolean isSetSlaveId() {
    return wrapped.isSetSlaveId();
  }

  public String getSlaveId() {
    return wrapped.getSlaveId();
  }

  public boolean isSetSlaveHost() {
    return wrapped.isSetSlaveHost();
  }

  public String getSlaveHost() {
    return wrapped.getSlaveHost();
  }

  public boolean isSetTask() {
    return wrapped.isSetTask();
  }

  public ITaskConfig getTask() {
    return task;
  }

  public boolean isSetAssignedPorts() {
    return wrapped.isSetAssignedPorts();
  }

  public ImmutableMap<String, Integer> getAssignedPorts() {
    return assignedPorts;
  }

  public boolean isSetInstanceId() {
    return wrapped.isSetInstanceId();
  }

  public int getInstanceId() {
    return wrapped.getInstanceId();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IAssignedTask)) {
      return false;
    }
    IAssignedTask other = (IAssignedTask) o;
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
