package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.Hosts;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IHosts {
  private final Hosts wrapped;
  private int cachedHashCode = 0;
  private final ImmutableSet<String> hostNames;

  private IHosts(Hosts wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.hostNames = !wrapped.isSetHostNames()
        ? ImmutableSet.<String>of()
        : ImmutableSet.copyOf(wrapped.getHostNames());
  }

  static IHosts buildNoCopy(Hosts wrapped) {
    return new IHosts(wrapped);
  }

  public static IHosts build(Hosts wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IHosts, Hosts> TO_BUILDER =
      new Function<IHosts, Hosts>() {
        @Override
        public Hosts apply(IHosts input) {
          return input.newBuilder();
        }
      };

  public static final Function<Hosts, IHosts> FROM_BUILDER =
      new Function<Hosts, IHosts>() {
        @Override
        public IHosts apply(Hosts input) {
          return IHosts.build(input);
        }
      };

  public static ImmutableList<Hosts> toBuildersList(Iterable<IHosts> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IHosts> listFromBuilders(Iterable<Hosts> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<Hosts> toBuildersSet(Iterable<IHosts> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IHosts> setFromBuilders(Iterable<Hosts> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public Hosts newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetHostNames() {
    return wrapped.isSetHostNames();
  }

  public ImmutableSet<String> getHostNames() {
    return hostNames;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IHosts)) {
      return false;
    }
    IHosts other = (IHosts) o;
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
