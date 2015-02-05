package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.RoleSummaryResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IRoleSummaryResult {
  private final RoleSummaryResult wrapped;
  private int cachedHashCode = 0;
  private final ImmutableSet<IRoleSummary> summaries;

  private IRoleSummaryResult(RoleSummaryResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.summaries = !wrapped.isSetSummaries()
        ? ImmutableSet.<IRoleSummary>of()
        : FluentIterable.from(wrapped.getSummaries())
              .transform(IRoleSummary.FROM_BUILDER)
              .toSet();
  }

  static IRoleSummaryResult buildNoCopy(RoleSummaryResult wrapped) {
    return new IRoleSummaryResult(wrapped);
  }

  public static IRoleSummaryResult build(RoleSummaryResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IRoleSummaryResult, RoleSummaryResult> TO_BUILDER =
      new Function<IRoleSummaryResult, RoleSummaryResult>() {
        @Override
        public RoleSummaryResult apply(IRoleSummaryResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<RoleSummaryResult, IRoleSummaryResult> FROM_BUILDER =
      new Function<RoleSummaryResult, IRoleSummaryResult>() {
        @Override
        public IRoleSummaryResult apply(RoleSummaryResult input) {
          return IRoleSummaryResult.build(input);
        }
      };

  public static ImmutableList<RoleSummaryResult> toBuildersList(Iterable<IRoleSummaryResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IRoleSummaryResult> listFromBuilders(Iterable<RoleSummaryResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<RoleSummaryResult> toBuildersSet(Iterable<IRoleSummaryResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IRoleSummaryResult> setFromBuilders(Iterable<RoleSummaryResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public RoleSummaryResult newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetSummaries() {
    return wrapped.isSetSummaries();
  }

  public ImmutableSet<IRoleSummary> getSummaries() {
    return summaries;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IRoleSummaryResult)) {
      return false;
    }
    IRoleSummaryResult other = (IRoleSummaryResult) o;
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
