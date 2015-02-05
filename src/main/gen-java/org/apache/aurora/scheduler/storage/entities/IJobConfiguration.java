package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.CronCollisionPolicy;
import org.apache.aurora.gen.JobConfiguration;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IJobConfiguration {
  private final JobConfiguration wrapped;
  private int cachedHashCode = 0;
  private final IJobKey key;
  private final IIdentity owner;
  private final ITaskConfig taskConfig;

  private IJobConfiguration(JobConfiguration wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.key = !wrapped.isSetKey()
        ? null
        : IJobKey.buildNoCopy(wrapped.getKey());
    this.owner = !wrapped.isSetOwner()
        ? null
        : IIdentity.buildNoCopy(wrapped.getOwner());
    this.taskConfig = !wrapped.isSetTaskConfig()
        ? null
        : ITaskConfig.buildNoCopy(wrapped.getTaskConfig());
  }

  static IJobConfiguration buildNoCopy(JobConfiguration wrapped) {
    return new IJobConfiguration(wrapped);
  }

  public static IJobConfiguration build(JobConfiguration wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IJobConfiguration, JobConfiguration> TO_BUILDER =
      new Function<IJobConfiguration, JobConfiguration>() {
        @Override
        public JobConfiguration apply(IJobConfiguration input) {
          return input.newBuilder();
        }
      };

  public static final Function<JobConfiguration, IJobConfiguration> FROM_BUILDER =
      new Function<JobConfiguration, IJobConfiguration>() {
        @Override
        public IJobConfiguration apply(JobConfiguration input) {
          return IJobConfiguration.build(input);
        }
      };

  public static ImmutableList<JobConfiguration> toBuildersList(Iterable<IJobConfiguration> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IJobConfiguration> listFromBuilders(Iterable<JobConfiguration> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<JobConfiguration> toBuildersSet(Iterable<IJobConfiguration> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IJobConfiguration> setFromBuilders(Iterable<JobConfiguration> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public JobConfiguration newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetKey() {
    return wrapped.isSetKey();
  }

  public IJobKey getKey() {
    return key;
  }

  public boolean isSetOwner() {
    return wrapped.isSetOwner();
  }

  public IIdentity getOwner() {
    return owner;
  }

  public boolean isSetCronSchedule() {
    return wrapped.isSetCronSchedule();
  }

  public String getCronSchedule() {
    return wrapped.getCronSchedule();
  }

  public boolean isSetCronCollisionPolicy() {
    return wrapped.isSetCronCollisionPolicy();
  }

  public CronCollisionPolicy getCronCollisionPolicy() {
    return wrapped.getCronCollisionPolicy();
  }

  public boolean isSetTaskConfig() {
    return wrapped.isSetTaskConfig();
  }

  public ITaskConfig getTaskConfig() {
    return taskConfig;
  }

  public boolean isSetInstanceCount() {
    return wrapped.isSetInstanceCount();
  }

  public int getInstanceCount() {
    return wrapped.getInstanceCount();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IJobConfiguration)) {
      return false;
    }
    IJobConfiguration other = (IJobConfiguration) o;
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
