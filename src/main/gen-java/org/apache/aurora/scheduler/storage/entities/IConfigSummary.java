package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.ConfigSummary;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IConfigSummary {
  private final ConfigSummary wrapped;
  private int cachedHashCode = 0;
  private final IJobKey key;
  private final ImmutableSet<IConfigGroup> groups;

  private IConfigSummary(ConfigSummary wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.key = !wrapped.isSetKey()
        ? null
        : IJobKey.buildNoCopy(wrapped.getKey());
    this.groups = !wrapped.isSetGroups()
        ? ImmutableSet.<IConfigGroup>of()
        : FluentIterable.from(wrapped.getGroups())
              .transform(IConfigGroup.FROM_BUILDER)
              .toSet();
  }

  static IConfigSummary buildNoCopy(ConfigSummary wrapped) {
    return new IConfigSummary(wrapped);
  }

  public static IConfigSummary build(ConfigSummary wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IConfigSummary, ConfigSummary> TO_BUILDER =
      new Function<IConfigSummary, ConfigSummary>() {
        @Override
        public ConfigSummary apply(IConfigSummary input) {
          return input.newBuilder();
        }
      };

  public static final Function<ConfigSummary, IConfigSummary> FROM_BUILDER =
      new Function<ConfigSummary, IConfigSummary>() {
        @Override
        public IConfigSummary apply(ConfigSummary input) {
          return IConfigSummary.build(input);
        }
      };

  public static ImmutableList<ConfigSummary> toBuildersList(Iterable<IConfigSummary> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IConfigSummary> listFromBuilders(Iterable<ConfigSummary> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<ConfigSummary> toBuildersSet(Iterable<IConfigSummary> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IConfigSummary> setFromBuilders(Iterable<ConfigSummary> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public ConfigSummary newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetKey() {
    return wrapped.isSetKey();
  }

  public IJobKey getKey() {
    return key;
  }

  public boolean isSetGroups() {
    return wrapped.isSetGroups();
  }

  public ImmutableSet<IConfigGroup> getGroups() {
    return groups;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IConfigSummary)) {
      return false;
    }
    IConfigSummary other = (IConfigSummary) o;
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
