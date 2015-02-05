package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.GetJobUpdateDetailsResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IGetJobUpdateDetailsResult {
  private final GetJobUpdateDetailsResult wrapped;
  private int cachedHashCode = 0;
  private final IJobUpdateDetails details;

  private IGetJobUpdateDetailsResult(GetJobUpdateDetailsResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.details = !wrapped.isSetDetails()
        ? null
        : IJobUpdateDetails.buildNoCopy(wrapped.getDetails());
  }

  static IGetJobUpdateDetailsResult buildNoCopy(GetJobUpdateDetailsResult wrapped) {
    return new IGetJobUpdateDetailsResult(wrapped);
  }

  public static IGetJobUpdateDetailsResult build(GetJobUpdateDetailsResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IGetJobUpdateDetailsResult, GetJobUpdateDetailsResult> TO_BUILDER =
      new Function<IGetJobUpdateDetailsResult, GetJobUpdateDetailsResult>() {
        @Override
        public GetJobUpdateDetailsResult apply(IGetJobUpdateDetailsResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<GetJobUpdateDetailsResult, IGetJobUpdateDetailsResult> FROM_BUILDER =
      new Function<GetJobUpdateDetailsResult, IGetJobUpdateDetailsResult>() {
        @Override
        public IGetJobUpdateDetailsResult apply(GetJobUpdateDetailsResult input) {
          return IGetJobUpdateDetailsResult.build(input);
        }
      };

  public static ImmutableList<GetJobUpdateDetailsResult> toBuildersList(Iterable<IGetJobUpdateDetailsResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IGetJobUpdateDetailsResult> listFromBuilders(Iterable<GetJobUpdateDetailsResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<GetJobUpdateDetailsResult> toBuildersSet(Iterable<IGetJobUpdateDetailsResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IGetJobUpdateDetailsResult> setFromBuilders(Iterable<GetJobUpdateDetailsResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public GetJobUpdateDetailsResult newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetDetails() {
    return wrapped.isSetDetails();
  }

  public IJobUpdateDetails getDetails() {
    return details;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IGetJobUpdateDetailsResult)) {
      return false;
    }
    IGetJobUpdateDetailsResult other = (IGetJobUpdateDetailsResult) o;
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
