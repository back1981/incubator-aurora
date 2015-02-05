package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.HostStatus;
import org.apache.aurora.gen.MaintenanceMode;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IHostStatus {
  private final HostStatus wrapped;
  private int cachedHashCode = 0;

  private IHostStatus(HostStatus wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IHostStatus buildNoCopy(HostStatus wrapped) {
    return new IHostStatus(wrapped);
  }

  public static IHostStatus build(HostStatus wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IHostStatus, HostStatus> TO_BUILDER =
      new Function<IHostStatus, HostStatus>() {
        @Override
        public HostStatus apply(IHostStatus input) {
          return input.newBuilder();
        }
      };

  public static final Function<HostStatus, IHostStatus> FROM_BUILDER =
      new Function<HostStatus, IHostStatus>() {
        @Override
        public IHostStatus apply(HostStatus input) {
          return IHostStatus.build(input);
        }
      };

  public static ImmutableList<HostStatus> toBuildersList(Iterable<IHostStatus> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IHostStatus> listFromBuilders(Iterable<HostStatus> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<HostStatus> toBuildersSet(Iterable<IHostStatus> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IHostStatus> setFromBuilders(Iterable<HostStatus> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public HostStatus newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetHost() {
    return wrapped.isSetHost();
  }

  public String getHost() {
    return wrapped.getHost();
  }

  public boolean isSetMode() {
    return wrapped.isSetMode();
  }

  public MaintenanceMode getMode() {
    return wrapped.getMode();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IHostStatus)) {
      return false;
    }
    IHostStatus other = (IHostStatus) o;
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
