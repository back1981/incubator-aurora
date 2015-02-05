package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.ValueConstraint;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IValueConstraint {
  private final ValueConstraint wrapped;
  private int cachedHashCode = 0;
  private final ImmutableSet<String> values;

  private IValueConstraint(ValueConstraint wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.values = !wrapped.isSetValues()
        ? ImmutableSet.<String>of()
        : ImmutableSet.copyOf(wrapped.getValues());
  }

  static IValueConstraint buildNoCopy(ValueConstraint wrapped) {
    return new IValueConstraint(wrapped);
  }

  public static IValueConstraint build(ValueConstraint wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IValueConstraint, ValueConstraint> TO_BUILDER =
      new Function<IValueConstraint, ValueConstraint>() {
        @Override
        public ValueConstraint apply(IValueConstraint input) {
          return input.newBuilder();
        }
      };

  public static final Function<ValueConstraint, IValueConstraint> FROM_BUILDER =
      new Function<ValueConstraint, IValueConstraint>() {
        @Override
        public IValueConstraint apply(ValueConstraint input) {
          return IValueConstraint.build(input);
        }
      };

  public static ImmutableList<ValueConstraint> toBuildersList(Iterable<IValueConstraint> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IValueConstraint> listFromBuilders(Iterable<ValueConstraint> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<ValueConstraint> toBuildersSet(Iterable<IValueConstraint> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IValueConstraint> setFromBuilders(Iterable<ValueConstraint> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public ValueConstraint newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetNegated() {
    return wrapped.isSetNegated();
  }

  public boolean isNegated() {
    return wrapped.isNegated();
  }

  public boolean isSetValues() {
    return wrapped.isSetValues();
  }

  public ImmutableSet<String> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IValueConstraint)) {
      return false;
    }
    IValueConstraint other = (IValueConstraint) o;
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
