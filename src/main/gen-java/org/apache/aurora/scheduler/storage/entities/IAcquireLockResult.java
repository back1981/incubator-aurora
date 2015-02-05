package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.AcquireLockResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IAcquireLockResult {
  private final AcquireLockResult wrapped;
  private int cachedHashCode = 0;
  private final ILock lock;

  private IAcquireLockResult(AcquireLockResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.lock = !wrapped.isSetLock()
        ? null
        : ILock.buildNoCopy(wrapped.getLock());
  }

  static IAcquireLockResult buildNoCopy(AcquireLockResult wrapped) {
    return new IAcquireLockResult(wrapped);
  }

  public static IAcquireLockResult build(AcquireLockResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IAcquireLockResult, AcquireLockResult> TO_BUILDER =
      new Function<IAcquireLockResult, AcquireLockResult>() {
        @Override
        public AcquireLockResult apply(IAcquireLockResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<AcquireLockResult, IAcquireLockResult> FROM_BUILDER =
      new Function<AcquireLockResult, IAcquireLockResult>() {
        @Override
        public IAcquireLockResult apply(AcquireLockResult input) {
          return IAcquireLockResult.build(input);
        }
      };

  public static ImmutableList<AcquireLockResult> toBuildersList(Iterable<IAcquireLockResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IAcquireLockResult> listFromBuilders(Iterable<AcquireLockResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<AcquireLockResult> toBuildersSet(Iterable<IAcquireLockResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IAcquireLockResult> setFromBuilders(Iterable<AcquireLockResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public AcquireLockResult newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetLock() {
    return wrapped.isSetLock();
  }

  public ILock getLock() {
    return lock;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IAcquireLockResult)) {
      return false;
    }
    IAcquireLockResult other = (IAcquireLockResult) o;
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
