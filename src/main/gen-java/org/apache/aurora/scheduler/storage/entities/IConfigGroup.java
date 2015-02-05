package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.ConfigGroup;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IConfigGroup {
  private final ConfigGroup wrapped;
  private int cachedHashCode = 0;
  private final ITaskConfig config;
  private final ImmutableSet<Integer> instanceIds;

  private IConfigGroup(ConfigGroup wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.config = !wrapped.isSetConfig()
        ? null
        : ITaskConfig.buildNoCopy(wrapped.getConfig());
    this.instanceIds = !wrapped.isSetInstanceIds()
        ? ImmutableSet.<Integer>of()
        : ImmutableSet.copyOf(wrapped.getInstanceIds());
  }

  static IConfigGroup buildNoCopy(ConfigGroup wrapped) {
    return new IConfigGroup(wrapped);
  }

  public static IConfigGroup build(ConfigGroup wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IConfigGroup, ConfigGroup> TO_BUILDER =
      new Function<IConfigGroup, ConfigGroup>() {
        @Override
        public ConfigGroup apply(IConfigGroup input) {
          return input.newBuilder();
        }
      };

  public static final Function<ConfigGroup, IConfigGroup> FROM_BUILDER =
      new Function<ConfigGroup, IConfigGroup>() {
        @Override
        public IConfigGroup apply(ConfigGroup input) {
          return IConfigGroup.build(input);
        }
      };

  public static ImmutableList<ConfigGroup> toBuildersList(Iterable<IConfigGroup> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IConfigGroup> listFromBuilders(Iterable<ConfigGroup> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<ConfigGroup> toBuildersSet(Iterable<IConfigGroup> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IConfigGroup> setFromBuilders(Iterable<ConfigGroup> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public ConfigGroup newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetConfig() {
    return wrapped.isSetConfig();
  }

  public ITaskConfig getConfig() {
    return config;
  }

  public boolean isSetInstanceIds() {
    return wrapped.isSetInstanceIds();
  }

  public ImmutableSet<Integer> getInstanceIds() {
    return instanceIds;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IConfigGroup)) {
      return false;
    }
    IConfigGroup other = (IConfigGroup) o;
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
