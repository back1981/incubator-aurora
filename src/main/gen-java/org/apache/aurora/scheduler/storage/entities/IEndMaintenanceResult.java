package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.EndMaintenanceResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IEndMaintenanceResult {
  private final EndMaintenanceResult wrapped;
  private int cachedHashCode = 0;
  private final ImmutableSet<IHostStatus> statuses;

  private IEndMaintenanceResult(EndMaintenanceResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.statuses = !wrapped.isSetStatuses()
        ? ImmutableSet.<IHostStatus>of()
        : FluentIterable.from(wrapped.getStatuses())
              .transform(IHostStatus.FROM_BUILDER)
              .toSet();
  }

  static IEndMaintenanceResult buildNoCopy(EndMaintenanceResult wrapped) {
    return new IEndMaintenanceResult(wrapped);
  }

  public static IEndMaintenanceResult build(EndMaintenanceResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IEndMaintenanceResult, EndMaintenanceResult> TO_BUILDER =
      new Function<IEndMaintenanceResult, EndMaintenanceResult>() {
        @Override
        public EndMaintenanceResult apply(IEndMaintenanceResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<EndMaintenanceResult, IEndMaintenanceResult> FROM_BUILDER =
      new Function<EndMaintenanceResult, IEndMaintenanceResult>() {
        @Override
        public IEndMaintenanceResult apply(EndMaintenanceResult input) {
          return IEndMaintenanceResult.build(input);
        }
      };

  public static ImmutableList<EndMaintenanceResult> toBuildersList(Iterable<IEndMaintenanceResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IEndMaintenanceResult> listFromBuilders(Iterable<EndMaintenanceResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<EndMaintenanceResult> toBuildersSet(Iterable<IEndMaintenanceResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IEndMaintenanceResult> setFromBuilders(Iterable<EndMaintenanceResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public EndMaintenanceResult newBuilder() {
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
    if (!(o instanceof IEndMaintenanceResult)) {
      return false;
    }
    IEndMaintenanceResult other = (IEndMaintenanceResult) o;
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
