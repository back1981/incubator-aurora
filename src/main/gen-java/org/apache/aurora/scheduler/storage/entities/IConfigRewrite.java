package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.ConfigRewrite;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IConfigRewrite {
  private final ConfigRewrite wrapped;
  private int cachedHashCode = 0;

  private IConfigRewrite(ConfigRewrite wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IConfigRewrite buildNoCopy(ConfigRewrite wrapped) {
    return new IConfigRewrite(wrapped);
  }

  public static IConfigRewrite build(ConfigRewrite wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IConfigRewrite, ConfigRewrite> TO_BUILDER =
      new Function<IConfigRewrite, ConfigRewrite>() {
        @Override
        public ConfigRewrite apply(IConfigRewrite input) {
          return input.newBuilder();
        }
      };

  public static final Function<ConfigRewrite, IConfigRewrite> FROM_BUILDER =
      new Function<ConfigRewrite, IConfigRewrite>() {
        @Override
        public IConfigRewrite apply(ConfigRewrite input) {
          return IConfigRewrite.build(input);
        }
      };

  public static ImmutableList<ConfigRewrite> toBuildersList(Iterable<IConfigRewrite> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IConfigRewrite> listFromBuilders(Iterable<ConfigRewrite> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<ConfigRewrite> toBuildersSet(Iterable<IConfigRewrite> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IConfigRewrite> setFromBuilders(Iterable<ConfigRewrite> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public ConfigRewrite newBuilder() {
    return wrapped.deepCopy();
  }

  public ConfigRewrite._Fields getSetField() {
    return wrapped.getSetField();
  }

  public boolean isSetJobRewrite() {
    return wrapped.isSetJobRewrite();
  }

  public IJobConfigRewrite getJobRewrite() {
    return IJobConfigRewrite.build(wrapped.getJobRewrite());
  }

  public boolean isSetInstanceRewrite() {
    return wrapped.isSetInstanceRewrite();
  }

  public IInstanceConfigRewrite getInstanceRewrite() {
    return IInstanceConfigRewrite.build(wrapped.getInstanceRewrite());
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IConfigRewrite)) {
      return false;
    }
    IConfigRewrite other = (IConfigRewrite) o;
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
