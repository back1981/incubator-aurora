package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.Attribute;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IAttribute {
  private final Attribute wrapped;
  private int cachedHashCode = 0;
  private final ImmutableSet<String> values;

  private IAttribute(Attribute wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.values = !wrapped.isSetValues()
        ? ImmutableSet.<String>of()
        : ImmutableSet.copyOf(wrapped.getValues());
  }

  static IAttribute buildNoCopy(Attribute wrapped) {
    return new IAttribute(wrapped);
  }

  public static IAttribute build(Attribute wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IAttribute, Attribute> TO_BUILDER =
      new Function<IAttribute, Attribute>() {
        @Override
        public Attribute apply(IAttribute input) {
          return input.newBuilder();
        }
      };

  public static final Function<Attribute, IAttribute> FROM_BUILDER =
      new Function<Attribute, IAttribute>() {
        @Override
        public IAttribute apply(Attribute input) {
          return IAttribute.build(input);
        }
      };

  public static ImmutableList<Attribute> toBuildersList(Iterable<IAttribute> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IAttribute> listFromBuilders(Iterable<Attribute> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<Attribute> toBuildersSet(Iterable<IAttribute> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IAttribute> setFromBuilders(Iterable<Attribute> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public Attribute newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetName() {
    return wrapped.isSetName();
  }

  public String getName() {
    return wrapped.getName();
  }

  public boolean isSetValues() {
    return wrapped.isSetValues();
  }

  public ImmutableSet<String> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IAttribute)) {
      return false;
    }
    IAttribute other = (IAttribute) o;
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
