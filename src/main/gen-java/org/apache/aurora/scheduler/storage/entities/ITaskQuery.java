package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.ScheduleStatus;
import org.apache.aurora.gen.TaskQuery;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class ITaskQuery {
  private final TaskQuery wrapped;
  private int cachedHashCode = 0;
  private final IIdentity owner;
  private final ImmutableSet<String> taskIds;
  private final ImmutableSet<ScheduleStatus> statuses;
  private final ImmutableSet<Integer> instanceIds;
  private final ImmutableSet<String> slaveHosts;
  private final ImmutableSet<IJobKey> jobKeys;

  private ITaskQuery(TaskQuery wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.owner = !wrapped.isSetOwner()
        ? null
        : IIdentity.buildNoCopy(wrapped.getOwner());
    this.taskIds = !wrapped.isSetTaskIds()
        ? ImmutableSet.<String>of()
        : ImmutableSet.copyOf(wrapped.getTaskIds());
    this.statuses = !wrapped.isSetStatuses()
        ? ImmutableSet.<ScheduleStatus>of()
        : ImmutableSet.copyOf(wrapped.getStatuses());
    this.instanceIds = !wrapped.isSetInstanceIds()
        ? ImmutableSet.<Integer>of()
        : ImmutableSet.copyOf(wrapped.getInstanceIds());
    this.slaveHosts = !wrapped.isSetSlaveHosts()
        ? ImmutableSet.<String>of()
        : ImmutableSet.copyOf(wrapped.getSlaveHosts());
    this.jobKeys = !wrapped.isSetJobKeys()
        ? ImmutableSet.<IJobKey>of()
        : FluentIterable.from(wrapped.getJobKeys())
              .transform(IJobKey.FROM_BUILDER)
              .toSet();
  }

  static ITaskQuery buildNoCopy(TaskQuery wrapped) {
    return new ITaskQuery(wrapped);
  }

  public static ITaskQuery build(TaskQuery wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<ITaskQuery, TaskQuery> TO_BUILDER =
      new Function<ITaskQuery, TaskQuery>() {
        @Override
        public TaskQuery apply(ITaskQuery input) {
          return input.newBuilder();
        }
      };

  public static final Function<TaskQuery, ITaskQuery> FROM_BUILDER =
      new Function<TaskQuery, ITaskQuery>() {
        @Override
        public ITaskQuery apply(TaskQuery input) {
          return ITaskQuery.build(input);
        }
      };

  public static ImmutableList<TaskQuery> toBuildersList(Iterable<ITaskQuery> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<ITaskQuery> listFromBuilders(Iterable<TaskQuery> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<TaskQuery> toBuildersSet(Iterable<ITaskQuery> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<ITaskQuery> setFromBuilders(Iterable<TaskQuery> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public TaskQuery newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetOwner() {
    return wrapped.isSetOwner();
  }

  public IIdentity getOwner() {
    return owner;
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

  public boolean isSetJobName() {
    return wrapped.isSetJobName();
  }

  public String getJobName() {
    return wrapped.getJobName();
  }

  public boolean isSetTaskIds() {
    return wrapped.isSetTaskIds();
  }

  public ImmutableSet<String> getTaskIds() {
    return taskIds;
  }

  public boolean isSetStatuses() {
    return wrapped.isSetStatuses();
  }

  public ImmutableSet<ScheduleStatus> getStatuses() {
    return statuses;
  }

  public boolean isSetInstanceIds() {
    return wrapped.isSetInstanceIds();
  }

  public ImmutableSet<Integer> getInstanceIds() {
    return instanceIds;
  }

  public boolean isSetSlaveHosts() {
    return wrapped.isSetSlaveHosts();
  }

  public ImmutableSet<String> getSlaveHosts() {
    return slaveHosts;
  }

  public boolean isSetJobKeys() {
    return wrapped.isSetJobKeys();
  }

  public ImmutableSet<IJobKey> getJobKeys() {
    return jobKeys;
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
    if (!(o instanceof ITaskQuery)) {
      return false;
    }
    ITaskQuery other = (ITaskQuery) o;
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
