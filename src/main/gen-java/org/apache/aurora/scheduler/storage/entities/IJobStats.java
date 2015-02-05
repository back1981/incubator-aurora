package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.JobStats;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IJobStats {
  private final JobStats wrapped;
  private int cachedHashCode = 0;

  private IJobStats(JobStats wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IJobStats buildNoCopy(JobStats wrapped) {
    return new IJobStats(wrapped);
  }

  public static IJobStats build(JobStats wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IJobStats, JobStats> TO_BUILDER =
      new Function<IJobStats, JobStats>() {
        @Override
        public JobStats apply(IJobStats input) {
          return input.newBuilder();
        }
      };

  public static final Function<JobStats, IJobStats> FROM_BUILDER =
      new Function<JobStats, IJobStats>() {
        @Override
        public IJobStats apply(JobStats input) {
          return IJobStats.build(input);
        }
      };

  public static ImmutableList<JobStats> toBuildersList(Iterable<IJobStats> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IJobStats> listFromBuilders(Iterable<JobStats> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<JobStats> toBuildersSet(Iterable<IJobStats> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IJobStats> setFromBuilders(Iterable<JobStats> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public JobStats newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetActiveTaskCount() {
    return wrapped.isSetActiveTaskCount();
  }

  public int getActiveTaskCount() {
    return wrapped.getActiveTaskCount();
  }

  public boolean isSetFinishedTaskCount() {
    return wrapped.isSetFinishedTaskCount();
  }

  public int getFinishedTaskCount() {
    return wrapped.getFinishedTaskCount();
  }

  public boolean isSetFailedTaskCount() {
    return wrapped.isSetFailedTaskCount();
  }

  public int getFailedTaskCount() {
    return wrapped.getFailedTaskCount();
  }

  public boolean isSetPendingTaskCount() {
    return wrapped.isSetPendingTaskCount();
  }

  public int getPendingTaskCount() {
    return wrapped.getPendingTaskCount();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IJobStats)) {
      return false;
    }
    IJobStats other = (IJobStats) o;
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
