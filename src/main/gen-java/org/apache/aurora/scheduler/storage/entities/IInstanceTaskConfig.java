package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.InstanceTaskConfig;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IInstanceTaskConfig {
  private final InstanceTaskConfig wrapped;
  private int cachedHashCode = 0;
  private final ITaskConfig task;
  private final ImmutableSet<IRange> instances;

  private IInstanceTaskConfig(InstanceTaskConfig wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.task = !wrapped.isSetTask()
        ? null
        : ITaskConfig.buildNoCopy(wrapped.getTask());
    this.instances = !wrapped.isSetInstances()
        ? ImmutableSet.<IRange>of()
        : FluentIterable.from(wrapped.getInstances())
              .transform(IRange.FROM_BUILDER)
              .toSet();
  }

  static IInstanceTaskConfig buildNoCopy(InstanceTaskConfig wrapped) {
    return new IInstanceTaskConfig(wrapped);
  }

  public static IInstanceTaskConfig build(InstanceTaskConfig wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IInstanceTaskConfig, InstanceTaskConfig> TO_BUILDER =
      new Function<IInstanceTaskConfig, InstanceTaskConfig>() {
        @Override
        public InstanceTaskConfig apply(IInstanceTaskConfig input) {
          return input.newBuilder();
        }
      };

  public static final Function<InstanceTaskConfig, IInstanceTaskConfig> FROM_BUILDER =
      new Function<InstanceTaskConfig, IInstanceTaskConfig>() {
        @Override
        public IInstanceTaskConfig apply(InstanceTaskConfig input) {
          return IInstanceTaskConfig.build(input);
        }
      };

  public static ImmutableList<InstanceTaskConfig> toBuildersList(Iterable<IInstanceTaskConfig> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IInstanceTaskConfig> listFromBuilders(Iterable<InstanceTaskConfig> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<InstanceTaskConfig> toBuildersSet(Iterable<IInstanceTaskConfig> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IInstanceTaskConfig> setFromBuilders(Iterable<InstanceTaskConfig> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public InstanceTaskConfig newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetTask() {
    return wrapped.isSetTask();
  }

  public ITaskConfig getTask() {
    return task;
  }

  public boolean isSetInstances() {
    return wrapped.isSetInstances();
  }

  public ImmutableSet<IRange> getInstances() {
    return instances;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IInstanceTaskConfig)) {
      return false;
    }
    IInstanceTaskConfig other = (IInstanceTaskConfig) o;
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
