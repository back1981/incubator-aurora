package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.JobKey;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IJobKey {
  private final JobKey wrapped;
  private int cachedHashCode = 0;

  private IJobKey(JobKey wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IJobKey buildNoCopy(JobKey wrapped) {
    return new IJobKey(wrapped);
  }

  public static IJobKey build(JobKey wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IJobKey, JobKey> TO_BUILDER =
      new Function<IJobKey, JobKey>() {
        @Override
        public JobKey apply(IJobKey input) {
          return input.newBuilder();
        }
      };

  public static final Function<JobKey, IJobKey> FROM_BUILDER =
      new Function<JobKey, IJobKey>() {
        @Override
        public IJobKey apply(JobKey input) {
          return IJobKey.build(input);
        }
      };

  public static ImmutableList<JobKey> toBuildersList(Iterable<IJobKey> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IJobKey> listFromBuilders(Iterable<JobKey> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<JobKey> toBuildersSet(Iterable<IJobKey> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IJobKey> setFromBuilders(Iterable<JobKey> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public JobKey newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetRole() {
    return wrapped.isSetRole();
  }

  public String getRole() {
    return wrapped.getRole();
  }

  public boolean isSetEnvironment() {
    return wrapped.isSetEnvironment();
  }

  public String getEnvironment() {
    return wrapped.getEnvironment();
  }

  public boolean isSetName() {
    return wrapped.isSetName();
  }

  public String getName() {
    return wrapped.getName();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IJobKey)) {
      return false;
    }
    IJobKey other = (IJobKey) o;
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
