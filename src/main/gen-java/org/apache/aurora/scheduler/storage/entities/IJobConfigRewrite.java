package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.JobConfigRewrite;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IJobConfigRewrite {
  private final JobConfigRewrite wrapped;
  private int cachedHashCode = 0;
  private final IJobConfiguration oldJob;
  private final IJobConfiguration rewrittenJob;

  private IJobConfigRewrite(JobConfigRewrite wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.oldJob = !wrapped.isSetOldJob()
        ? null
        : IJobConfiguration.buildNoCopy(wrapped.getOldJob());
    this.rewrittenJob = !wrapped.isSetRewrittenJob()
        ? null
        : IJobConfiguration.buildNoCopy(wrapped.getRewrittenJob());
  }

  static IJobConfigRewrite buildNoCopy(JobConfigRewrite wrapped) {
    return new IJobConfigRewrite(wrapped);
  }

  public static IJobConfigRewrite build(JobConfigRewrite wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IJobConfigRewrite, JobConfigRewrite> TO_BUILDER =
      new Function<IJobConfigRewrite, JobConfigRewrite>() {
        @Override
        public JobConfigRewrite apply(IJobConfigRewrite input) {
          return input.newBuilder();
        }
      };

  public static final Function<JobConfigRewrite, IJobConfigRewrite> FROM_BUILDER =
      new Function<JobConfigRewrite, IJobConfigRewrite>() {
        @Override
        public IJobConfigRewrite apply(JobConfigRewrite input) {
          return IJobConfigRewrite.build(input);
        }
      };

  public static ImmutableList<JobConfigRewrite> toBuildersList(Iterable<IJobConfigRewrite> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IJobConfigRewrite> listFromBuilders(Iterable<JobConfigRewrite> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<JobConfigRewrite> toBuildersSet(Iterable<IJobConfigRewrite> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IJobConfigRewrite> setFromBuilders(Iterable<JobConfigRewrite> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public JobConfigRewrite newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetOldJob() {
    return wrapped.isSetOldJob();
  }

  public IJobConfiguration getOldJob() {
    return oldJob;
  }

  public boolean isSetRewrittenJob() {
    return wrapped.isSetRewrittenJob();
  }

  public IJobConfiguration getRewrittenJob() {
    return rewrittenJob;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IJobConfigRewrite)) {
      return false;
    }
    IJobConfigRewrite other = (IJobConfigRewrite) o;
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
