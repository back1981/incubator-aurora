package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.Range;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IRange {
  private final Range wrapped;
  private int cachedHashCode = 0;

  private IRange(Range wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IRange buildNoCopy(Range wrapped) {
    return new IRange(wrapped);
  }

  public static IRange build(Range wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IRange, Range> TO_BUILDER =
      new Function<IRange, Range>() {
        @Override
        public Range apply(IRange input) {
          return input.newBuilder();
        }
      };

  public static final Function<Range, IRange> FROM_BUILDER =
      new Function<Range, IRange>() {
        @Override
        public IRange apply(Range input) {
          return IRange.build(input);
        }
      };

  public static ImmutableList<Range> toBuildersList(Iterable<IRange> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IRange> listFromBuilders(Iterable<Range> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<Range> toBuildersSet(Iterable<IRange> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IRange> setFromBuilders(Iterable<Range> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public Range newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetFirst() {
    return wrapped.isSetFirst();
  }

  public int getFirst() {
    return wrapped.getFirst();
  }

  public boolean isSetLast() {
    return wrapped.isSetLast();
  }

  public int getLast() {
    return wrapped.getLast();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IRange)) {
      return false;
    }
    IRange other = (IRange) o;
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
