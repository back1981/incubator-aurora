package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.AddInstancesConfig;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IAddInstancesConfig {
  private final AddInstancesConfig wrapped;
  private int cachedHashCode = 0;
  private final IJobKey key;
  private final ITaskConfig taskConfig;
  private final ImmutableSet<Integer> instanceIds;

  private IAddInstancesConfig(AddInstancesConfig wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.key = !wrapped.isSetKey()
        ? null
        : IJobKey.buildNoCopy(wrapped.getKey());
    this.taskConfig = !wrapped.isSetTaskConfig()
        ? null
        : ITaskConfig.buildNoCopy(wrapped.getTaskConfig());
    this.instanceIds = !wrapped.isSetInstanceIds()
        ? ImmutableSet.<Integer>of()
        : ImmutableSet.copyOf(wrapped.getInstanceIds());
  }

  static IAddInstancesConfig buildNoCopy(AddInstancesConfig wrapped) {
    return new IAddInstancesConfig(wrapped);
  }

  public static IAddInstancesConfig build(AddInstancesConfig wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IAddInstancesConfig, AddInstancesConfig> TO_BUILDER =
      new Function<IAddInstancesConfig, AddInstancesConfig>() {
        @Override
        public AddInstancesConfig apply(IAddInstancesConfig input) {
          return input.newBuilder();
        }
      };

  public static final Function<AddInstancesConfig, IAddInstancesConfig> FROM_BUILDER =
      new Function<AddInstancesConfig, IAddInstancesConfig>() {
        @Override
        public IAddInstancesConfig apply(AddInstancesConfig input) {
          return IAddInstancesConfig.build(input);
        }
      };

  public static ImmutableList<AddInstancesConfig> toBuildersList(Iterable<IAddInstancesConfig> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IAddInstancesConfig> listFromBuilders(Iterable<AddInstancesConfig> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<AddInstancesConfig> toBuildersSet(Iterable<IAddInstancesConfig> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IAddInstancesConfig> setFromBuilders(Iterable<AddInstancesConfig> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public AddInstancesConfig newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetKey() {
    return wrapped.isSetKey();
  }

  public IJobKey getKey() {
    return key;
  }

  public boolean isSetTaskConfig() {
    return wrapped.isSetTaskConfig();
  }

  public ITaskConfig getTaskConfig() {
    return taskConfig;
  }

  public boolean isSetInstanceIds() {
    return wrapped.isSetInstanceIds();
  }

  public ImmutableSet<Integer> getInstanceIds() {
    return instanceIds;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IAddInstancesConfig)) {
      return false;
    }
    IAddInstancesConfig other = (IAddInstancesConfig) o;
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
