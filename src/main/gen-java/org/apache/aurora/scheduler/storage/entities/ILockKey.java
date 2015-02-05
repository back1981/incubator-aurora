package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.LockKey;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class ILockKey {
  private final LockKey wrapped;
  private int cachedHashCode = 0;

  private ILockKey(LockKey wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static ILockKey buildNoCopy(LockKey wrapped) {
    return new ILockKey(wrapped);
  }

  public static ILockKey build(LockKey wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<ILockKey, LockKey> TO_BUILDER =
      new Function<ILockKey, LockKey>() {
        @Override
        public LockKey apply(ILockKey input) {
          return input.newBuilder();
        }
      };

  public static final Function<LockKey, ILockKey> FROM_BUILDER =
      new Function<LockKey, ILockKey>() {
        @Override
        public ILockKey apply(LockKey input) {
          return ILockKey.build(input);
        }
      };

  public static ImmutableList<LockKey> toBuildersList(Iterable<ILockKey> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<ILockKey> listFromBuilders(Iterable<LockKey> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<LockKey> toBuildersSet(Iterable<ILockKey> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<ILockKey> setFromBuilders(Iterable<LockKey> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public LockKey newBuilder() {
    return wrapped.deepCopy();
  }

  public LockKey._Fields getSetField() {
    return wrapped.getSetField();
  }

  public boolean isSetJob() {
    return wrapped.isSetJob();
  }

  public IJobKey getJob() {
    return IJobKey.build(wrapped.getJob());
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof ILockKey)) {
      return false;
    }
    ILockKey other = (ILockKey) o;
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
