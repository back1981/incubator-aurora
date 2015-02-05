package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.MaintenanceStatusResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IMaintenanceStatusResult {
  private final MaintenanceStatusResult wrapped;
  private int cachedHashCode = 0;
  private final ImmutableSet<IHostStatus> statuses;

  private IMaintenanceStatusResult(MaintenanceStatusResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.statuses = !wrapped.isSetStatuses()
        ? ImmutableSet.<IHostStatus>of()
        : FluentIterable.from(wrapped.getStatuses())
              .transform(IHostStatus.FROM_BUILDER)
              .toSet();
  }

  static IMaintenanceStatusResult buildNoCopy(MaintenanceStatusResult wrapped) {
    return new IMaintenanceStatusResult(wrapped);
  }

  public static IMaintenanceStatusResult build(MaintenanceStatusResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IMaintenanceStatusResult, MaintenanceStatusResult> TO_BUILDER =
      new Function<IMaintenanceStatusResult, MaintenanceStatusResult>() {
        @Override
        public MaintenanceStatusResult apply(IMaintenanceStatusResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<MaintenanceStatusResult, IMaintenanceStatusResult> FROM_BUILDER =
      new Function<MaintenanceStatusResult, IMaintenanceStatusResult>() {
        @Override
        public IMaintenanceStatusResult apply(MaintenanceStatusResult input) {
          return IMaintenanceStatusResult.build(input);
        }
      };

  public static ImmutableList<MaintenanceStatusResult> toBuildersList(Iterable<IMaintenanceStatusResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IMaintenanceStatusResult> listFromBuilders(Iterable<MaintenanceStatusResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<MaintenanceStatusResult> toBuildersSet(Iterable<IMaintenanceStatusResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IMaintenanceStatusResult> setFromBuilders(Iterable<MaintenanceStatusResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public MaintenanceStatusResult newBuilder() {
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
    if (!(o instanceof IMaintenanceStatusResult)) {
      return false;
    }
    IMaintenanceStatusResult other = (IMaintenanceStatusResult) o;
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
