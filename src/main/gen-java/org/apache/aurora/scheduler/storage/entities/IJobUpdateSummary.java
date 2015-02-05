package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.JobUpdateSummary;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IJobUpdateSummary {
  private final JobUpdateSummary wrapped;
  private int cachedHashCode = 0;
  private final IJobKey jobKey;
  private final IJobUpdateState state;

  private IJobUpdateSummary(JobUpdateSummary wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.jobKey = !wrapped.isSetJobKey()
        ? null
        : IJobKey.buildNoCopy(wrapped.getJobKey());
    this.state = !wrapped.isSetState()
        ? null
        : IJobUpdateState.buildNoCopy(wrapped.getState());
  }

  static IJobUpdateSummary buildNoCopy(JobUpdateSummary wrapped) {
    return new IJobUpdateSummary(wrapped);
  }

  public static IJobUpdateSummary build(JobUpdateSummary wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IJobUpdateSummary, JobUpdateSummary> TO_BUILDER =
      new Function<IJobUpdateSummary, JobUpdateSummary>() {
        @Override
        public JobUpdateSummary apply(IJobUpdateSummary input) {
          return input.newBuilder();
        }
      };

  public static final Function<JobUpdateSummary, IJobUpdateSummary> FROM_BUILDER =
      new Function<JobUpdateSummary, IJobUpdateSummary>() {
        @Override
        public IJobUpdateSummary apply(JobUpdateSummary input) {
          return IJobUpdateSummary.build(input);
        }
      };

  public static ImmutableList<JobUpdateSummary> toBuildersList(Iterable<IJobUpdateSummary> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IJobUpdateSummary> listFromBuilders(Iterable<JobUpdateSummary> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<JobUpdateSummary> toBuildersSet(Iterable<IJobUpdateSummary> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IJobUpdateSummary> setFromBuilders(Iterable<JobUpdateSummary> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public JobUpdateSummary newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetUpdateId() {
    return wrapped.isSetUpdateId();
  }

  public String getUpdateId() {
    return wrapped.getUpdateId();
  }

  public boolean isSetJobKey() {
    return wrapped.isSetJobKey();
  }

  public IJobKey getJobKey() {
    return jobKey;
  }

  public boolean isSetUser() {
    return wrapped.isSetUser();
  }

  public String getUser() {
    return wrapped.getUser();
  }

  public boolean isSetState() {
    return wrapped.isSetState();
  }

  public IJobUpdateState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IJobUpdateSummary)) {
      return false;
    }
    IJobUpdateSummary other = (IJobUpdateSummary) o;
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
