package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.JobUpdateState;
import org.apache.aurora.gen.JobUpdateStatus;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IJobUpdateState {
  private final JobUpdateState wrapped;
  private int cachedHashCode = 0;

  private IJobUpdateState(JobUpdateState wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IJobUpdateState buildNoCopy(JobUpdateState wrapped) {
    return new IJobUpdateState(wrapped);
  }

  public static IJobUpdateState build(JobUpdateState wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IJobUpdateState, JobUpdateState> TO_BUILDER =
      new Function<IJobUpdateState, JobUpdateState>() {
        @Override
        public JobUpdateState apply(IJobUpdateState input) {
          return input.newBuilder();
        }
      };

  public static final Function<JobUpdateState, IJobUpdateState> FROM_BUILDER =
      new Function<JobUpdateState, IJobUpdateState>() {
        @Override
        public IJobUpdateState apply(JobUpdateState input) {
          return IJobUpdateState.build(input);
        }
      };

  public static ImmutableList<JobUpdateState> toBuildersList(Iterable<IJobUpdateState> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IJobUpdateState> listFromBuilders(Iterable<JobUpdateState> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<JobUpdateState> toBuildersSet(Iterable<IJobUpdateState> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IJobUpdateState> setFromBuilders(Iterable<JobUpdateState> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public JobUpdateState newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetStatus() {
    return wrapped.isSetStatus();
  }

  public JobUpdateStatus getStatus() {
    return wrapped.getStatus();
  }

  public boolean isSetCreatedTimestampMs() {
    return wrapped.isSetCreatedTimestampMs();
  }

  public long getCreatedTimestampMs() {
    return wrapped.getCreatedTimestampMs();
  }

  public boolean isSetLastModifiedTimestampMs() {
    return wrapped.isSetLastModifiedTimestampMs();
  }

  public long getLastModifiedTimestampMs() {
    return wrapped.getLastModifiedTimestampMs();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IJobUpdateState)) {
      return false;
    }
    IJobUpdateState other = (IJobUpdateState) o;
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
