package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.GetJobUpdateSummariesResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IGetJobUpdateSummariesResult {
  private final GetJobUpdateSummariesResult wrapped;
  private int cachedHashCode = 0;
  private final ImmutableList<IJobUpdateSummary> updateSummaries;

  private IGetJobUpdateSummariesResult(GetJobUpdateSummariesResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.updateSummaries = !wrapped.isSetUpdateSummaries()
        ? ImmutableList.<IJobUpdateSummary>of()
        : FluentIterable.from(wrapped.getUpdateSummaries())
              .transform(IJobUpdateSummary.FROM_BUILDER)
              .toList();
  }

  static IGetJobUpdateSummariesResult buildNoCopy(GetJobUpdateSummariesResult wrapped) {
    return new IGetJobUpdateSummariesResult(wrapped);
  }

  public static IGetJobUpdateSummariesResult build(GetJobUpdateSummariesResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IGetJobUpdateSummariesResult, GetJobUpdateSummariesResult> TO_BUILDER =
      new Function<IGetJobUpdateSummariesResult, GetJobUpdateSummariesResult>() {
        @Override
        public GetJobUpdateSummariesResult apply(IGetJobUpdateSummariesResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<GetJobUpdateSummariesResult, IGetJobUpdateSummariesResult> FROM_BUILDER =
      new Function<GetJobUpdateSummariesResult, IGetJobUpdateSummariesResult>() {
        @Override
        public IGetJobUpdateSummariesResult apply(GetJobUpdateSummariesResult input) {
          return IGetJobUpdateSummariesResult.build(input);
        }
      };

  public static ImmutableList<GetJobUpdateSummariesResult> toBuildersList(Iterable<IGetJobUpdateSummariesResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IGetJobUpdateSummariesResult> listFromBuilders(Iterable<GetJobUpdateSummariesResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<GetJobUpdateSummariesResult> toBuildersSet(Iterable<IGetJobUpdateSummariesResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IGetJobUpdateSummariesResult> setFromBuilders(Iterable<GetJobUpdateSummariesResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public GetJobUpdateSummariesResult newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetUpdateSummaries() {
    return wrapped.isSetUpdateSummaries();
  }

  public ImmutableList<IJobUpdateSummary> getUpdateSummaries() {
    return updateSummaries;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IGetJobUpdateSummariesResult)) {
      return false;
    }
    IGetJobUpdateSummariesResult other = (IGetJobUpdateSummariesResult) o;
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
