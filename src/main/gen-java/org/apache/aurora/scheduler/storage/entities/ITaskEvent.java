package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.ScheduleStatus;
import org.apache.aurora.gen.TaskEvent;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class ITaskEvent {
  private final TaskEvent wrapped;
  private int cachedHashCode = 0;

  private ITaskEvent(TaskEvent wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static ITaskEvent buildNoCopy(TaskEvent wrapped) {
    return new ITaskEvent(wrapped);
  }

  public static ITaskEvent build(TaskEvent wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<ITaskEvent, TaskEvent> TO_BUILDER =
      new Function<ITaskEvent, TaskEvent>() {
        @Override
        public TaskEvent apply(ITaskEvent input) {
          return input.newBuilder();
        }
      };

  public static final Function<TaskEvent, ITaskEvent> FROM_BUILDER =
      new Function<TaskEvent, ITaskEvent>() {
        @Override
        public ITaskEvent apply(TaskEvent input) {
          return ITaskEvent.build(input);
        }
      };

  public static ImmutableList<TaskEvent> toBuildersList(Iterable<ITaskEvent> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<ITaskEvent> listFromBuilders(Iterable<TaskEvent> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<TaskEvent> toBuildersSet(Iterable<ITaskEvent> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<ITaskEvent> setFromBuilders(Iterable<TaskEvent> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public TaskEvent newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetTimestamp() {
    return wrapped.isSetTimestamp();
  }

  public long getTimestamp() {
    return wrapped.getTimestamp();
  }

  public boolean isSetStatus() {
    return wrapped.isSetStatus();
  }

  public ScheduleStatus getStatus() {
    return wrapped.getStatus();
  }

  public boolean isSetMessage() {
    return wrapped.isSetMessage();
  }

  public String getMessage() {
    return wrapped.getMessage();
  }

  public boolean isSetScheduler() {
    return wrapped.isSetScheduler();
  }

  public String getScheduler() {
    return wrapped.getScheduler();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof ITaskEvent)) {
      return false;
    }
    ITaskEvent other = (ITaskEvent) o;
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
