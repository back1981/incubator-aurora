package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.GetPendingReasonResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IGetPendingReasonResult {
  private final GetPendingReasonResult wrapped;
  private int cachedHashCode = 0;
  private final ImmutableSet<IPendingReason> reasons;

  private IGetPendingReasonResult(GetPendingReasonResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.reasons = !wrapped.isSetReasons()
        ? ImmutableSet.<IPendingReason>of()
        : FluentIterable.from(wrapped.getReasons())
              .transform(IPendingReason.FROM_BUILDER)
              .toSet();
  }

  static IGetPendingReasonResult buildNoCopy(GetPendingReasonResult wrapped) {
    return new IGetPendingReasonResult(wrapped);
  }

  public static IGetPendingReasonResult build(GetPendingReasonResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IGetPendingReasonResult, GetPendingReasonResult> TO_BUILDER =
      new Function<IGetPendingReasonResult, GetPendingReasonResult>() {
        @Override
        public GetPendingReasonResult apply(IGetPendingReasonResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<GetPendingReasonResult, IGetPendingReasonResult> FROM_BUILDER =
      new Function<GetPendingReasonResult, IGetPendingReasonResult>() {
        @Override
        public IGetPendingReasonResult apply(GetPendingReasonResult input) {
          return IGetPendingReasonResult.build(input);
        }
      };

  public static ImmutableList<GetPendingReasonResult> toBuildersList(Iterable<IGetPendingReasonResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IGetPendingReasonResult> listFromBuilders(Iterable<GetPendingReasonResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<GetPendingReasonResult> toBuildersSet(Iterable<IGetPendingReasonResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IGetPendingReasonResult> setFromBuilders(Iterable<GetPendingReasonResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public GetPendingReasonResult newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetReasons() {
    return wrapped.isSetReasons();
  }

  public ImmutableSet<IPendingReason> getReasons() {
    return reasons;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IGetPendingReasonResult)) {
      return false;
    }
    IGetPendingReasonResult other = (IGetPendingReasonResult) o;
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
