package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.JobUpdateQuery;
import org.apache.aurora.gen.JobUpdateStatus;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IJobUpdateQuery {
  private final JobUpdateQuery wrapped;
  private int cachedHashCode = 0;
  private final IJobKey jobKey;
  private final ImmutableSet<JobUpdateStatus> updateStatuses;

  private IJobUpdateQuery(JobUpdateQuery wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.jobKey = !wrapped.isSetJobKey()
        ? null
        : IJobKey.buildNoCopy(wrapped.getJobKey());
    this.updateStatuses = !wrapped.isSetUpdateStatuses()
        ? ImmutableSet.<JobUpdateStatus>of()
        : ImmutableSet.copyOf(wrapped.getUpdateStatuses());
  }

  static IJobUpdateQuery buildNoCopy(JobUpdateQuery wrapped) {
    return new IJobUpdateQuery(wrapped);
  }

  public static IJobUpdateQuery build(JobUpdateQuery wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IJobUpdateQuery, JobUpdateQuery> TO_BUILDER =
      new Function<IJobUpdateQuery, JobUpdateQuery>() {
        @Override
        public JobUpdateQuery apply(IJobUpdateQuery input) {
          return input.newBuilder();
        }
      };

  public static final Function<JobUpdateQuery, IJobUpdateQuery> FROM_BUILDER =
      new Function<JobUpdateQuery, IJobUpdateQuery>() {
        @Override
        public IJobUpdateQuery apply(JobUpdateQuery input) {
          return IJobUpdateQuery.build(input);
        }
      };

  public static ImmutableList<JobUpdateQuery> toBuildersList(Iterable<IJobUpdateQuery> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IJobUpdateQuery> listFromBuilders(Iterable<JobUpdateQuery> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<JobUpdateQuery> toBuildersSet(Iterable<IJobUpdateQuery> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IJobUpdateQuery> setFromBuilders(Iterable<JobUpdateQuery> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public JobUpdateQuery newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetUpdateId() {
    return wrapped.isSetUpdateId();
  }

  public String getUpdateId() {
    return wrapped.getUpdateId();
  }

  public boolean isSetRole() {
    return wrapped.isSetRole();
  }

  public String getRole() {
    return wrapped.getRole();
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

  public boolean isSetUpdateStatuses() {
    return wrapped.isSetUpdateStatuses();
  }

  public ImmutableSet<JobUpdateStatus> getUpdateStatuses() {
    return updateStatuses;
  }

  public boolean isSetOffset() {
    return wrapped.isSetOffset();
  }

  public int getOffset() {
    return wrapped.getOffset();
  }

  public boolean isSetLimit() {
    return wrapped.isSetLimit();
  }

  public int getLimit() {
    return wrapped.getLimit();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IJobUpdateQuery)) {
      return false;
    }
    IJobUpdateQuery other = (IJobUpdateQuery) o;
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
