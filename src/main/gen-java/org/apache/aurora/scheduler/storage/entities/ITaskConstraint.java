package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.TaskConstraint;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class ITaskConstraint {
  private final TaskConstraint wrapped;
  private int cachedHashCode = 0;

  private ITaskConstraint(TaskConstraint wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static ITaskConstraint buildNoCopy(TaskConstraint wrapped) {
    return new ITaskConstraint(wrapped);
  }

  public static ITaskConstraint build(TaskConstraint wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<ITaskConstraint, TaskConstraint> TO_BUILDER =
      new Function<ITaskConstraint, TaskConstraint>() {
        @Override
        public TaskConstraint apply(ITaskConstraint input) {
          return input.newBuilder();
        }
      };

  public static final Function<TaskConstraint, ITaskConstraint> FROM_BUILDER =
      new Function<TaskConstraint, ITaskConstraint>() {
        @Override
        public ITaskConstraint apply(TaskConstraint input) {
          return ITaskConstraint.build(input);
        }
      };

  public static ImmutableList<TaskConstraint> toBuildersList(Iterable<ITaskConstraint> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<ITaskConstraint> listFromBuilders(Iterable<TaskConstraint> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<TaskConstraint> toBuildersSet(Iterable<ITaskConstraint> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<ITaskConstraint> setFromBuilders(Iterable<TaskConstraint> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public TaskConstraint newBuilder() {
    return wrapped.deepCopy();
  }

  public TaskConstraint._Fields getSetField() {
    return wrapped.getSetField();
  }

  public boolean isSetValue() {
    return wrapped.isSetValue();
  }

  public IValueConstraint getValue() {
    return IValueConstraint.build(wrapped.getValue());
  }

  public boolean isSetLimit() {
    return wrapped.isSetLimit();
  }

  public ILimitConstraint getLimit() {
    return ILimitConstraint.build(wrapped.getLimit());
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof ITaskConstraint)) {
      return false;
    }
    ITaskConstraint other = (ITaskConstraint) o;
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
