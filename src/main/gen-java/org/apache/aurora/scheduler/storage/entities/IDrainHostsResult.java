package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.DrainHostsResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IDrainHostsResult {
  private final DrainHostsResult wrapped;
  private int cachedHashCode = 0;
  private final ImmutableSet<IHostStatus> statuses;

  private IDrainHostsResult(DrainHostsResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.statuses = !wrapped.isSetStatuses()
        ? ImmutableSet.<IHostStatus>of()
        : FluentIterable.from(wrapped.getStatuses())
              .transform(IHostStatus.FROM_BUILDER)
              .toSet();
  }

  static IDrainHostsResult buildNoCopy(DrainHostsResult wrapped) {
    return new IDrainHostsResult(wrapped);
  }

  public static IDrainHostsResult build(DrainHostsResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IDrainHostsResult, DrainHostsResult> TO_BUILDER =
      new Function<IDrainHostsResult, DrainHostsResult>() {
        @Override
        public DrainHostsResult apply(IDrainHostsResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<DrainHostsResult, IDrainHostsResult> FROM_BUILDER =
      new Function<DrainHostsResult, IDrainHostsResult>() {
        @Override
        public IDrainHostsResult apply(DrainHostsResult input) {
          return IDrainHostsResult.build(input);
        }
      };

  public static ImmutableList<DrainHostsResult> toBuildersList(Iterable<IDrainHostsResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IDrainHostsResult> listFromBuilders(Iterable<DrainHostsResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<DrainHostsResult> toBuildersSet(Iterable<IDrainHostsResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IDrainHostsResult> setFromBuilders(Iterable<DrainHostsResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public DrainHostsResult newBuilder() {
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
    if (!(o instanceof IDrainHostsResult)) {
      return false;
    }
    IDrainHostsResult other = (IDrainHostsResult) o;
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
