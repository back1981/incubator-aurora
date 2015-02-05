package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.ExecutorConfig;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IExecutorConfig {
  private final ExecutorConfig wrapped;
  private int cachedHashCode = 0;

  private IExecutorConfig(ExecutorConfig wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IExecutorConfig buildNoCopy(ExecutorConfig wrapped) {
    return new IExecutorConfig(wrapped);
  }

  public static IExecutorConfig build(ExecutorConfig wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IExecutorConfig, ExecutorConfig> TO_BUILDER =
      new Function<IExecutorConfig, ExecutorConfig>() {
        @Override
        public ExecutorConfig apply(IExecutorConfig input) {
          return input.newBuilder();
        }
      };

  public static final Function<ExecutorConfig, IExecutorConfig> FROM_BUILDER =
      new Function<ExecutorConfig, IExecutorConfig>() {
        @Override
        public IExecutorConfig apply(ExecutorConfig input) {
          return IExecutorConfig.build(input);
        }
      };

  public static ImmutableList<ExecutorConfig> toBuildersList(Iterable<IExecutorConfig> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IExecutorConfig> listFromBuilders(Iterable<ExecutorConfig> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<ExecutorConfig> toBuildersSet(Iterable<IExecutorConfig> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IExecutorConfig> setFromBuilders(Iterable<ExecutorConfig> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public ExecutorConfig newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetName() {
    return wrapped.isSetName();
  }

  public String getName() {
    return wrapped.getName();
  }

  public boolean isSetData() {
    return wrapped.isSetData();
  }

  public String getData() {
    return wrapped.getData();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IExecutorConfig)) {
      return false;
    }
    IExecutorConfig other = (IExecutorConfig) o;
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
