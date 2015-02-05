package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.StartJobUpdateResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IStartJobUpdateResult {
  private final StartJobUpdateResult wrapped;
  private int cachedHashCode = 0;

  private IStartJobUpdateResult(StartJobUpdateResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IStartJobUpdateResult buildNoCopy(StartJobUpdateResult wrapped) {
    return new IStartJobUpdateResult(wrapped);
  }

  public static IStartJobUpdateResult build(StartJobUpdateResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IStartJobUpdateResult, StartJobUpdateResult> TO_BUILDER =
      new Function<IStartJobUpdateResult, StartJobUpdateResult>() {
        @Override
        public StartJobUpdateResult apply(IStartJobUpdateResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<StartJobUpdateResult, IStartJobUpdateResult> FROM_BUILDER =
      new Function<StartJobUpdateResult, IStartJobUpdateResult>() {
        @Override
        public IStartJobUpdateResult apply(StartJobUpdateResult input) {
          return IStartJobUpdateResult.build(input);
        }
      };

  public static ImmutableList<StartJobUpdateResult> toBuildersList(Iterable<IStartJobUpdateResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IStartJobUpdateResult> listFromBuilders(Iterable<StartJobUpdateResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<StartJobUpdateResult> toBuildersSet(Iterable<IStartJobUpdateResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IStartJobUpdateResult> setFromBuilders(Iterable<StartJobUpdateResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public StartJobUpdateResult newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetUpdateId() {
    return wrapped.isSetUpdateId();
  }

  public String getUpdateId() {
    return wrapped.getUpdateId();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IStartJobUpdateResult)) {
      return false;
    }
    IStartJobUpdateResult other = (IStartJobUpdateResult) o;
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
