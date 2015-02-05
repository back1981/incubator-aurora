package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.JobUpdateEvent;
import org.apache.aurora.gen.JobUpdateStatus;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IJobUpdateEvent {
  private final JobUpdateEvent wrapped;
  private int cachedHashCode = 0;

  private IJobUpdateEvent(JobUpdateEvent wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IJobUpdateEvent buildNoCopy(JobUpdateEvent wrapped) {
    return new IJobUpdateEvent(wrapped);
  }

  public static IJobUpdateEvent build(JobUpdateEvent wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IJobUpdateEvent, JobUpdateEvent> TO_BUILDER =
      new Function<IJobUpdateEvent, JobUpdateEvent>() {
        @Override
        public JobUpdateEvent apply(IJobUpdateEvent input) {
          return input.newBuilder();
        }
      };

  public static final Function<JobUpdateEvent, IJobUpdateEvent> FROM_BUILDER =
      new Function<JobUpdateEvent, IJobUpdateEvent>() {
        @Override
        public IJobUpdateEvent apply(JobUpdateEvent input) {
          return IJobUpdateEvent.build(input);
        }
      };

  public static ImmutableList<JobUpdateEvent> toBuildersList(Iterable<IJobUpdateEvent> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IJobUpdateEvent> listFromBuilders(Iterable<JobUpdateEvent> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<JobUpdateEvent> toBuildersSet(Iterable<IJobUpdateEvent> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IJobUpdateEvent> setFromBuilders(Iterable<JobUpdateEvent> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public JobUpdateEvent newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetStatus() {
    return wrapped.isSetStatus();
  }

  public JobUpdateStatus getStatus() {
    return wrapped.getStatus();
  }

  public boolean isSetTimestampMs() {
    return wrapped.isSetTimestampMs();
  }

  public long getTimestampMs() {
    return wrapped.getTimestampMs();
  }

  public boolean isSetUser() {
    return wrapped.isSetUser();
  }

  public String getUser() {
    return wrapped.getUser();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IJobUpdateEvent)) {
      return false;
    }
    IJobUpdateEvent other = (IJobUpdateEvent) o;
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
