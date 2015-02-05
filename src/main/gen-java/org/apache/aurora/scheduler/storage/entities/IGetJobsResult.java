package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.GetJobsResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IGetJobsResult {
  private final GetJobsResult wrapped;
  private int cachedHashCode = 0;
  private final ImmutableSet<IJobConfiguration> configs;

  private IGetJobsResult(GetJobsResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.configs = !wrapped.isSetConfigs()
        ? ImmutableSet.<IJobConfiguration>of()
        : FluentIterable.from(wrapped.getConfigs())
              .transform(IJobConfiguration.FROM_BUILDER)
              .toSet();
  }

  static IGetJobsResult buildNoCopy(GetJobsResult wrapped) {
    return new IGetJobsResult(wrapped);
  }

  public static IGetJobsResult build(GetJobsResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IGetJobsResult, GetJobsResult> TO_BUILDER =
      new Function<IGetJobsResult, GetJobsResult>() {
        @Override
        public GetJobsResult apply(IGetJobsResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<GetJobsResult, IGetJobsResult> FROM_BUILDER =
      new Function<GetJobsResult, IGetJobsResult>() {
        @Override
        public IGetJobsResult apply(GetJobsResult input) {
          return IGetJobsResult.build(input);
        }
      };

  public static ImmutableList<GetJobsResult> toBuildersList(Iterable<IGetJobsResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IGetJobsResult> listFromBuilders(Iterable<GetJobsResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<GetJobsResult> toBuildersSet(Iterable<IGetJobsResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IGetJobsResult> setFromBuilders(Iterable<GetJobsResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public GetJobsResult newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetConfigs() {
    return wrapped.isSetConfigs();
  }

  public ImmutableSet<IJobConfiguration> getConfigs() {
    return configs;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IGetJobsResult)) {
      return false;
    }
    IGetJobsResult other = (IGetJobsResult) o;
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
