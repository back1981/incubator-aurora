package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.ScheduleStatus;
import org.apache.aurora.gen.ScheduledTask;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IScheduledTask {
  private final ScheduledTask wrapped;
  private int cachedHashCode = 0;
  private final IAssignedTask assignedTask;
  private final ImmutableList<ITaskEvent> taskEvents;

  private IScheduledTask(ScheduledTask wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.assignedTask = !wrapped.isSetAssignedTask()
        ? null
        : IAssignedTask.buildNoCopy(wrapped.getAssignedTask());
    this.taskEvents = !wrapped.isSetTaskEvents()
        ? ImmutableList.<ITaskEvent>of()
        : FluentIterable.from(wrapped.getTaskEvents())
              .transform(ITaskEvent.FROM_BUILDER)
              .toList();
  }

  static IScheduledTask buildNoCopy(ScheduledTask wrapped) {
    return new IScheduledTask(wrapped);
  }

  public static IScheduledTask build(ScheduledTask wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IScheduledTask, ScheduledTask> TO_BUILDER =
      new Function<IScheduledTask, ScheduledTask>() {
        @Override
        public ScheduledTask apply(IScheduledTask input) {
          return input.newBuilder();
        }
      };

  public static final Function<ScheduledTask, IScheduledTask> FROM_BUILDER =
      new Function<ScheduledTask, IScheduledTask>() {
        @Override
        public IScheduledTask apply(ScheduledTask input) {
          return IScheduledTask.build(input);
        }
      };

  public static ImmutableList<ScheduledTask> toBuildersList(Iterable<IScheduledTask> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IScheduledTask> listFromBuilders(Iterable<ScheduledTask> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<ScheduledTask> toBuildersSet(Iterable<IScheduledTask> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IScheduledTask> setFromBuilders(Iterable<ScheduledTask> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public ScheduledTask newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetAssignedTask() {
    return wrapped.isSetAssignedTask();
  }

  public IAssignedTask getAssignedTask() {
    return assignedTask;
  }

  public boolean isSetStatus() {
    return wrapped.isSetStatus();
  }

  public ScheduleStatus getStatus() {
    return wrapped.getStatus();
  }

  public boolean isSetFailureCount() {
    return wrapped.isSetFailureCount();
  }

  public int getFailureCount() {
    return wrapped.getFailureCount();
  }

  public boolean isSetTaskEvents() {
    return wrapped.isSetTaskEvents();
  }

  public ImmutableList<ITaskEvent> getTaskEvents() {
    return taskEvents;
  }

  public boolean isSetAncestorId() {
    return wrapped.isSetAncestorId();
  }

  public String getAncestorId() {
    return wrapped.getAncestorId();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IScheduledTask)) {
      return false;
    }
    IScheduledTask other = (IScheduledTask) o;
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
