package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.QueryRecoveryResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IQueryRecoveryResult {
  private final QueryRecoveryResult wrapped;
  private int cachedHashCode = 0;
  private final ImmutableSet<IScheduledTask> tasks;

  private IQueryRecoveryResult(QueryRecoveryResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.tasks = !wrapped.isSetTasks()
        ? ImmutableSet.<IScheduledTask>of()
        : FluentIterable.from(wrapped.getTasks())
              .transform(IScheduledTask.FROM_BUILDER)
              .toSet();
  }

  static IQueryRecoveryResult buildNoCopy(QueryRecoveryResult wrapped) {
    return new IQueryRecoveryResult(wrapped);
  }

  public static IQueryRecoveryResult build(QueryRecoveryResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IQueryRecoveryResult, QueryRecoveryResult> TO_BUILDER =
      new Function<IQueryRecoveryResult, QueryRecoveryResult>() {
        @Override
        public QueryRecoveryResult apply(IQueryRecoveryResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<QueryRecoveryResult, IQueryRecoveryResult> FROM_BUILDER =
      new Function<QueryRecoveryResult, IQueryRecoveryResult>() {
        @Override
        public IQueryRecoveryResult apply(QueryRecoveryResult input) {
          return IQueryRecoveryResult.build(input);
        }
      };

  public static ImmutableList<QueryRecoveryResult> toBuildersList(Iterable<IQueryRecoveryResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IQueryRecoveryResult> listFromBuilders(Iterable<QueryRecoveryResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<QueryRecoveryResult> toBuildersSet(Iterable<IQueryRecoveryResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IQueryRecoveryResult> setFromBuilders(Iterable<QueryRecoveryResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public QueryRecoveryResult newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetTasks() {
    return wrapped.isSetTasks();
  }

  public ImmutableSet<IScheduledTask> getTasks() {
    return tasks;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IQueryRecoveryResult)) {
      return false;
    }
    IQueryRecoveryResult other = (IQueryRecoveryResult) o;
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
