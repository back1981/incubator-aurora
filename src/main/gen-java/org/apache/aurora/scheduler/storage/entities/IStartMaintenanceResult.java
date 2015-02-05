package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.StartMaintenanceResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IStartMaintenanceResult {
  private final StartMaintenanceResult wrapped;
  private int cachedHashCode = 0;
  private final ImmutableSet<IHostStatus> statuses;

  private IStartMaintenanceResult(StartMaintenanceResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.statuses = !wrapped.isSetStatuses()
        ? ImmutableSet.<IHostStatus>of()
        : FluentIterable.from(wrapped.getStatuses())
              .transform(IHostStatus.FROM_BUILDER)
              .toSet();
  }

  static IStartMaintenanceResult buildNoCopy(StartMaintenanceResult wrapped) {
    return new IStartMaintenanceResult(wrapped);
  }

  public static IStartMaintenanceResult build(StartMaintenanceResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IStartMaintenanceResult, StartMaintenanceResult> TO_BUILDER =
      new Function<IStartMaintenanceResult, StartMaintenanceResult>() {
        @Override
        public StartMaintenanceResult apply(IStartMaintenanceResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<StartMaintenanceResult, IStartMaintenanceResult> FROM_BUILDER =
      new Function<StartMaintenanceResult, IStartMaintenanceResult>() {
        @Override
        public IStartMaintenanceResult apply(StartMaintenanceResult input) {
          return IStartMaintenanceResult.build(input);
        }
      };

  public static ImmutableList<StartMaintenanceResult> toBuildersList(Iterable<IStartMaintenanceResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IStartMaintenanceResult> listFromBuilders(Iterable<StartMaintenanceResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<StartMaintenanceResult> toBuildersSet(Iterable<IStartMaintenanceResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IStartMaintenanceResult> setFromBuilders(Iterable<StartMaintenanceResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public StartMaintenanceResult newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetStatuses() {
    return wrapped.isSetStatuses();
  }

  public ImmutableSet<IHostStatus> getStatuses() {
    return statuses;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IStartMaintenanceResult)) {
      return false;
    }
    IStartMaintenanceResult other = (IStartMaintenanceResult) o;
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
