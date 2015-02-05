package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.JobSummaryResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IJobSummaryResult {
  private final JobSummaryResult wrapped;
  private int cachedHashCode = 0;
  private final ImmutableSet<IJobSummary> summaries;

  private IJobSummaryResult(JobSummaryResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.summaries = !wrapped.isSetSummaries()
        ? ImmutableSet.<IJobSummary>of()
        : FluentIterable.from(wrapped.getSummaries())
              .transform(IJobSummary.FROM_BUILDER)
              .toSet();
  }

  static IJobSummaryResult buildNoCopy(JobSummaryResult wrapped) {
    return new IJobSummaryResult(wrapped);
  }

  public static IJobSummaryResult build(JobSummaryResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IJobSummaryResult, JobSummaryResult> TO_BUILDER =
      new Function<IJobSummaryResult, JobSummaryResult>() {
        @Override
        public JobSummaryResult apply(IJobSummaryResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<JobSummaryResult, IJobSummaryResult> FROM_BUILDER =
      new Function<JobSummaryResult, IJobSummaryResult>() {
        @Override
        public IJobSummaryResult apply(JobSummaryResult input) {
          return IJobSummaryResult.build(input);
        }
      };

  public static ImmutableList<JobSummaryResult> toBuildersList(Iterable<IJobSummaryResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IJobSummaryResult> listFromBuilders(Iterable<JobSummaryResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<JobSummaryResult> toBuildersSet(Iterable<IJobSummaryResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IJobSummaryResult> setFromBuilders(Iterable<JobSummaryResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public JobSummaryResult newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetSummaries() {
    return wrapped.isSetSummaries();
  }

  public ImmutableSet<IJobSummary> getSummaries() {
    return summaries;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IJobSummaryResult)) {
      return false;
    }
    IJobSummaryResult other = (IJobSummaryResult) o;
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
