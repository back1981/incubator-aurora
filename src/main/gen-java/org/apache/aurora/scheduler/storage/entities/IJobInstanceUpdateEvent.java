package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.JobInstanceUpdateEvent;
import org.apache.aurora.gen.JobUpdateAction;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IJobInstanceUpdateEvent {
  private final JobInstanceUpdateEvent wrapped;
  private int cachedHashCode = 0;

  private IJobInstanceUpdateEvent(JobInstanceUpdateEvent wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IJobInstanceUpdateEvent buildNoCopy(JobInstanceUpdateEvent wrapped) {
    return new IJobInstanceUpdateEvent(wrapped);
  }

  public static IJobInstanceUpdateEvent build(JobInstanceUpdateEvent wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IJobInstanceUpdateEvent, JobInstanceUpdateEvent> TO_BUILDER =
      new Function<IJobInstanceUpdateEvent, JobInstanceUpdateEvent>() {
        @Override
        public JobInstanceUpdateEvent apply(IJobInstanceUpdateEvent input) {
          return input.newBuilder();
        }
      };

  public static final Function<JobInstanceUpdateEvent, IJobInstanceUpdateEvent> FROM_BUILDER =
      new Function<JobInstanceUpdateEvent, IJobInstanceUpdateEvent>() {
        @Override
        public IJobInstanceUpdateEvent apply(JobInstanceUpdateEvent input) {
          return IJobInstanceUpdateEvent.build(input);
        }
      };

  public static ImmutableList<JobInstanceUpdateEvent> toBuildersList(Iterable<IJobInstanceUpdateEvent> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IJobInstanceUpdateEvent> listFromBuilders(Iterable<JobInstanceUpdateEvent> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<JobInstanceUpdateEvent> toBuildersSet(Iterable<IJobInstanceUpdateEvent> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IJobInstanceUpdateEvent> setFromBuilders(Iterable<JobInstanceUpdateEvent> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public JobInstanceUpdateEvent newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetInstanceId() {
    return wrapped.isSetInstanceId();
  }

  public int getInstanceId() {
    return wrapped.getInstanceId();
  }

  public boolean isSetTimestampMs() {
    return wrapped.isSetTimestampMs();
  }

  public long getTimestampMs() {
    return wrapped.getTimestampMs();
  }

  public boolean isSetAction() {
    return wrapped.isSetAction();
  }

  public JobUpdateAction getAction() {
    return wrapped.getAction();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IJobInstanceUpdateEvent)) {
      return false;
    }
    IJobInstanceUpdateEvent other = (IJobInstanceUpdateEvent) o;
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
