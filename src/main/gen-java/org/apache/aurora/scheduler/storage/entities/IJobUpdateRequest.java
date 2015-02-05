package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.JobUpdateRequest;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IJobUpdateRequest {
  private final JobUpdateRequest wrapped;
  private int cachedHashCode = 0;
  private final ITaskConfig taskConfig;
  private final IJobUpdateSettings settings;

  private IJobUpdateRequest(JobUpdateRequest wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.taskConfig = !wrapped.isSetTaskConfig()
        ? null
        : ITaskConfig.buildNoCopy(wrapped.getTaskConfig());
    this.settings = !wrapped.isSetSettings()
        ? null
        : IJobUpdateSettings.buildNoCopy(wrapped.getSettings());
  }

  static IJobUpdateRequest buildNoCopy(JobUpdateRequest wrapped) {
    return new IJobUpdateRequest(wrapped);
  }

  public static IJobUpdateRequest build(JobUpdateRequest wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IJobUpdateRequest, JobUpdateRequest> TO_BUILDER =
      new Function<IJobUpdateRequest, JobUpdateRequest>() {
        @Override
        public JobUpdateRequest apply(IJobUpdateRequest input) {
          return input.newBuilder();
        }
      };

  public static final Function<JobUpdateRequest, IJobUpdateRequest> FROM_BUILDER =
      new Function<JobUpdateRequest, IJobUpdateRequest>() {
        @Override
        public IJobUpdateRequest apply(JobUpdateRequest input) {
          return IJobUpdateRequest.build(input);
        }
      };

  public static ImmutableList<JobUpdateRequest> toBuildersList(Iterable<IJobUpdateRequest> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IJobUpdateRequest> listFromBuilders(Iterable<JobUpdateRequest> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<JobUpdateRequest> toBuildersSet(Iterable<IJobUpdateRequest> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IJobUpdateRequest> setFromBuilders(Iterable<JobUpdateRequest> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public JobUpdateRequest newBuilder() {
    return wrapped.deepCopy();
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

  public boolean isSetSettings() {
    return wrapped.isSetSettings();
  }

  public IJobUpdateSettings getSettings() {
    return settings;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IJobUpdateRequest)) {
      return false;
    }
    IJobUpdateRequest other = (IJobUpdateRequest) o;
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
