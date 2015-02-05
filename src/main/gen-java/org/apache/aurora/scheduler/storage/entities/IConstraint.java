package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.Constraint;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IConstraint {
  private final Constraint wrapped;
  private int cachedHashCode = 0;
  private final ITaskConstraint constraint;

  private IConstraint(Constraint wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.constraint = !wrapped.isSetConstraint()
        ? null
        : ITaskConstraint.buildNoCopy(wrapped.getConstraint());
  }

  static IConstraint buildNoCopy(Constraint wrapped) {
    return new IConstraint(wrapped);
  }

  public static IConstraint build(Constraint wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IConstraint, Constraint> TO_BUILDER =
      new Function<IConstraint, Constraint>() {
        @Override
        public Constraint apply(IConstraint input) {
          return input.newBuilder();
        }
      };

  public static final Function<Constraint, IConstraint> FROM_BUILDER =
      new Function<Constraint, IConstraint>() {
        @Override
        public IConstraint apply(Constraint input) {
          return IConstraint.build(input);
        }
      };

  public static ImmutableList<Constraint> toBuildersList(Iterable<IConstraint> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IConstraint> listFromBuilders(Iterable<Constraint> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<Constraint> toBuildersSet(Iterable<IConstraint> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IConstraint> setFromBuilders(Iterable<Constraint> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public Constraint newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetName() {
    return wrapped.isSetName();
  }

  public String getName() {
    return wrapped.getName();
  }

  public boolean isSetConstraint() {
    return wrapped.isSetConstraint();
  }

  public ITaskConstraint getConstraint() {
    return constraint;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IConstraint)) {
      return false;
    }
    IConstraint other = (IConstraint) o;
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
