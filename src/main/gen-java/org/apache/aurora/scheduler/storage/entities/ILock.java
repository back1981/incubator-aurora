package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.Lock;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class ILock {
  private final Lock wrapped;
  private int cachedHashCode = 0;
  private final ILockKey key;

  private ILock(Lock wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.key = !wrapped.isSetKey()
        ? null
        : ILockKey.buildNoCopy(wrapped.getKey());
  }

  static ILock buildNoCopy(Lock wrapped) {
    return new ILock(wrapped);
  }

  public static ILock build(Lock wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<ILock, Lock> TO_BUILDER =
      new Function<ILock, Lock>() {
        @Override
        public Lock apply(ILock input) {
          return input.newBuilder();
        }
      };

  public static final Function<Lock, ILock> FROM_BUILDER =
      new Function<Lock, ILock>() {
        @Override
        public ILock apply(Lock input) {
          return ILock.build(input);
        }
      };

  public static ImmutableList<Lock> toBuildersList(Iterable<ILock> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<ILock> listFromBuilders(Iterable<Lock> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<Lock> toBuildersSet(Iterable<ILock> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<ILock> setFromBuilders(Iterable<Lock> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public Lock newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetKey() {
    return wrapped.isSetKey();
  }

  public ILockKey getKey() {
    return key;
  }

  public boolean isSetToken() {
    return wrapped.isSetToken();
  }

  public String getToken() {
    return wrapped.getToken();
  }

  public boolean isSetUser() {
    return wrapped.isSetUser();
  }

  public String getUser() {
    return wrapped.getUser();
  }

  public boolean isSetTimestampMs() {
    return wrapped.isSetTimestampMs();
  }

  public long getTimestampMs() {
    return wrapped.getTimestampMs();
  }

  public boolean isSetMessage() {
    return wrapped.isSetMessage();
  }

  public String getMessage() {
    return wrapped.getMessage();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof ILock)) {
      return false;
    }
    ILock other = (ILock) o;
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
