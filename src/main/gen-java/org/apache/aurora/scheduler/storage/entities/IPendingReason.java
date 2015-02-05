package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.PendingReason;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IPendingReason {
  private final PendingReason wrapped;
  private int cachedHashCode = 0;

  private IPendingReason(PendingReason wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IPendingReason buildNoCopy(PendingReason wrapped) {
    return new IPendingReason(wrapped);
  }

  public static IPendingReason build(PendingReason wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IPendingReason, PendingReason> TO_BUILDER =
      new Function<IPendingReason, PendingReason>() {
        @Override
        public PendingReason apply(IPendingReason input) {
          return input.newBuilder();
        }
      };

  public static final Function<PendingReason, IPendingReason> FROM_BUILDER =
      new Function<PendingReason, IPendingReason>() {
        @Override
        public IPendingReason apply(PendingReason input) {
          return IPendingReason.build(input);
        }
      };

  public static ImmutableList<PendingReason> toBuildersList(Iterable<IPendingReason> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IPendingReason> listFromBuilders(Iterable<PendingReason> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<PendingReason> toBuildersSet(Iterable<IPendingReason> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IPendingReason> setFromBuilders(Iterable<PendingReason> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public PendingReason newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetTaskId() {
    return wrapped.isSetTaskId();
  }

  public String getTaskId() {
    return wrapped.getTaskId();
  }

  public boolean isSetReason() {
    return wrapped.isSetReason();
  }

  public String getReason() {
    return wrapped.getReason();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IPendingReason)) {
      return false;
    }
    IPendingReason other = (IPendingReason) o;
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
