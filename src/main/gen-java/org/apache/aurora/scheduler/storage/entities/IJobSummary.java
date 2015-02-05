package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.JobSummary;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IJobSummary {
  private final JobSummary wrapped;
  private int cachedHashCode = 0;
  private final IJobConfiguration job;
  private final IJobStats stats;

  private IJobSummary(JobSummary wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.job = !wrapped.isSetJob()
        ? null
        : IJobConfiguration.buildNoCopy(wrapped.getJob());
    this.stats = !wrapped.isSetStats()
        ? null
        : IJobStats.buildNoCopy(wrapped.getStats());
  }

  static IJobSummary buildNoCopy(JobSummary wrapped) {
    return new IJobSummary(wrapped);
  }

  public static IJobSummary build(JobSummary wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IJobSummary, JobSummary> TO_BUILDER =
      new Function<IJobSummary, JobSummary>() {
        @Override
        public JobSummary apply(IJobSummary input) {
          return input.newBuilder();
        }
      };

  public static final Function<JobSummary, IJobSummary> FROM_BUILDER =
      new Function<JobSummary, IJobSummary>() {
        @Override
        public IJobSummary apply(JobSummary input) {
          return IJobSummary.build(input);
        }
      };

  public static ImmutableList<JobSummary> toBuildersList(Iterable<IJobSummary> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IJobSummary> listFromBuilders(Iterable<JobSummary> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<JobSummary> toBuildersSet(Iterable<IJobSummary> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IJobSummary> setFromBuilders(Iterable<JobSummary> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public JobSummary newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetJob() {
    return wrapped.isSetJob();
  }

  public IJobConfiguration getJob() {
    return job;
  }

  public boolean isSetStats() {
    return wrapped.isSetStats();
  }

  public IJobStats getStats() {
    return stats;
  }

  public boolean isSetNextCronRunMs() {
    return wrapped.isSetNextCronRunMs();
  }

  public long getNextCronRunMs() {
    return wrapped.getNextCronRunMs();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IJobSummary)) {
      return false;
    }
    IJobSummary other = (IJobSummary) o;
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
