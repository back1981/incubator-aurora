package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.LimitConstraint;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class ILimitConstraint {
  private final LimitConstraint wrapped;
  private int cachedHashCode = 0;

  private ILimitConstraint(LimitConstraint wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static ILimitConstraint buildNoCopy(LimitConstraint wrapped) {
    return new ILimitConstraint(wrapped);
  }

  public static ILimitConstraint build(LimitConstraint wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<ILimitConstraint, LimitConstraint> TO_BUILDER =
      new Function<ILimitConstraint, LimitConstraint>() {
        @Override
        public LimitConstraint apply(ILimitConstraint input) {
          return input.newBuilder();
        }
      };

  public static final Function<LimitConstraint, ILimitConstraint> FROM_BUILDER =
      new Function<LimitConstraint, ILimitConstraint>() {
        @Override
        public ILimitConstraint apply(LimitConstraint input) {
          return ILimitConstraint.build(input);
        }
      };

  public static ImmutableList<LimitConstraint> toBuildersList(Iterable<ILimitConstraint> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<ILimitConstraint> listFromBuilders(Iterable<LimitConstraint> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<LimitConstraint> toBuildersSet(Iterable<ILimitConstraint> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<ILimitConstraint> setFromBuilders(Iterable<LimitConstraint> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public LimitConstraint newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetLimit() {
    return wrapped.isSetLimit();
  }

  public int getLimit() {
    return wrapped.getLimit();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof ILimitConstraint)) {
      return false;
    }
    ILimitConstraint other = (ILimitConstraint) o;
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
