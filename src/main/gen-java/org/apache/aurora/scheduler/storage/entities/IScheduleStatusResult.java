package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.ScheduleStatusResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IScheduleStatusResult {
  private final ScheduleStatusResult wrapped;
  private int cachedHashCode = 0;
  private final ImmutableList<IScheduledTask> tasks;

  private IScheduleStatusResult(ScheduleStatusResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.tasks = !wrapped.isSetTasks()
        ? ImmutableList.<IScheduledTask>of()
        : FluentIterable.from(wrapped.getTasks())
              .transform(IScheduledTask.FROM_BUILDER)
              .toList();
  }

  static IScheduleStatusResult buildNoCopy(ScheduleStatusResult wrapped) {
    return new IScheduleStatusResult(wrapped);
  }

  public static IScheduleStatusResult build(ScheduleStatusResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IScheduleStatusResult, ScheduleStatusResult> TO_BUILDER =
      new Function<IScheduleStatusResult, ScheduleStatusResult>() {
        @Override
        public ScheduleStatusResult apply(IScheduleStatusResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<ScheduleStatusResult, IScheduleStatusResult> FROM_BUILDER =
      new Function<ScheduleStatusResult, IScheduleStatusResult>() {
        @Override
        public IScheduleStatusResult apply(ScheduleStatusResult input) {
          return IScheduleStatusResult.build(input);
        }
      };

  public static ImmutableList<ScheduleStatusResult> toBuildersList(Iterable<IScheduleStatusResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IScheduleStatusResult> listFromBuilders(Iterable<ScheduleStatusResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<ScheduleStatusResult> toBuildersSet(Iterable<IScheduleStatusResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IScheduleStatusResult> setFromBuilders(Iterable<ScheduleStatusResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public ScheduleStatusResult newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetTasks() {
    return wrapped.isSetTasks();
  }

  public ImmutableList<IScheduledTask> getTasks() {
    return tasks;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IScheduleStatusResult)) {
      return false;
    }
    IScheduleStatusResult other = (IScheduleStatusResult) o;
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
