package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.HostAttributes;
import org.apache.aurora.gen.MaintenanceMode;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IHostAttributes {
  private final HostAttributes wrapped;
  private int cachedHashCode = 0;
  private final ImmutableSet<IAttribute> attributes;

  private IHostAttributes(HostAttributes wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.attributes = !wrapped.isSetAttributes()
        ? ImmutableSet.<IAttribute>of()
        : FluentIterable.from(wrapped.getAttributes())
              .transform(IAttribute.FROM_BUILDER)
              .toSet();
  }

  static IHostAttributes buildNoCopy(HostAttributes wrapped) {
    return new IHostAttributes(wrapped);
  }

  public static IHostAttributes build(HostAttributes wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IHostAttributes, HostAttributes> TO_BUILDER =
      new Function<IHostAttributes, HostAttributes>() {
        @Override
        public HostAttributes apply(IHostAttributes input) {
          return input.newBuilder();
        }
      };

  public static final Function<HostAttributes, IHostAttributes> FROM_BUILDER =
      new Function<HostAttributes, IHostAttributes>() {
        @Override
        public IHostAttributes apply(HostAttributes input) {
          return IHostAttributes.build(input);
        }
      };

  public static ImmutableList<HostAttributes> toBuildersList(Iterable<IHostAttributes> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IHostAttributes> listFromBuilders(Iterable<HostAttributes> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<HostAttributes> toBuildersSet(Iterable<IHostAttributes> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IHostAttributes> setFromBuilders(Iterable<HostAttributes> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public HostAttributes newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetHost() {
    return wrapped.isSetHost();
  }

  public String getHost() {
    return wrapped.getHost();
  }

  public boolean isSetAttributes() {
    return wrapped.isSetAttributes();
  }

  public ImmutableSet<IAttribute> getAttributes() {
    return attributes;
  }

  public boolean isSetMode() {
    return wrapped.isSetMode();
  }

  public MaintenanceMode getMode() {
    return wrapped.getMode();
  }

  public boolean isSetSlaveId() {
    return wrapped.isSetSlaveId();
  }

  public String getSlaveId() {
    return wrapped.getSlaveId();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IHostAttributes)) {
      return false;
    }
    IHostAttributes other = (IHostAttributes) o;
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
