package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.GetLocksResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IGetLocksResult {
  private final GetLocksResult wrapped;
  private int cachedHashCode = 0;
  private final ImmutableSet<ILock> locks;

  private IGetLocksResult(GetLocksResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.locks = !wrapped.isSetLocks()
        ? ImmutableSet.<ILock>of()
        : FluentIterable.from(wrapped.getLocks())
              .transform(ILock.FROM_BUILDER)
              .toSet();
  }

  static IGetLocksResult buildNoCopy(GetLocksResult wrapped) {
    return new IGetLocksResult(wrapped);
  }

  public static IGetLocksResult build(GetLocksResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IGetLocksResult, GetLocksResult> TO_BUILDER =
      new Function<IGetLocksResult, GetLocksResult>() {
        @Override
        public GetLocksResult apply(IGetLocksResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<GetLocksResult, IGetLocksResult> FROM_BUILDER =
      new Function<GetLocksResult, IGetLocksResult>() {
        @Override
        public IGetLocksResult apply(GetLocksResult input) {
          return IGetLocksResult.build(input);
        }
      };

  public static ImmutableList<GetLocksResult> toBuildersList(Iterable<IGetLocksResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IGetLocksResult> listFromBuilders(Iterable<GetLocksResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<GetLocksResult> toBuildersSet(Iterable<IGetLocksResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IGetLocksResult> setFromBuilders(Iterable<GetLocksResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public GetLocksResult newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetLocks() {
    return wrapped.isSetLocks();
  }

  public ImmutableSet<ILock> getLocks() {
    return locks;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IGetLocksResult)) {
      return false;
    }
    IGetLocksResult other = (IGetLocksResult) o;
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
