package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.SessionKey;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class ISessionKey {
  private final SessionKey wrapped;
  private int cachedHashCode = 0;

  private ISessionKey(SessionKey wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static ISessionKey buildNoCopy(SessionKey wrapped) {
    return new ISessionKey(wrapped);
  }

  public static ISessionKey build(SessionKey wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<ISessionKey, SessionKey> TO_BUILDER =
      new Function<ISessionKey, SessionKey>() {
        @Override
        public SessionKey apply(ISessionKey input) {
          return input.newBuilder();
        }
      };

  public static final Function<SessionKey, ISessionKey> FROM_BUILDER =
      new Function<SessionKey, ISessionKey>() {
        @Override
        public ISessionKey apply(SessionKey input) {
          return ISessionKey.build(input);
        }
      };

  public static ImmutableList<SessionKey> toBuildersList(Iterable<ISessionKey> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<ISessionKey> listFromBuilders(Iterable<SessionKey> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<SessionKey> toBuildersSet(Iterable<ISessionKey> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<ISessionKey> setFromBuilders(Iterable<SessionKey> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public SessionKey newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetMechanism() {
    return wrapped.isSetMechanism();
  }

  public String getMechanism() {
    return wrapped.getMechanism();
  }

  public boolean isSetData() {
    return wrapped.isSetData();
  }

  public byte[] getData() {
    return wrapped.getData();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof ISessionKey)) {
      return false;
    }
    ISessionKey other = (ISessionKey) o;
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
