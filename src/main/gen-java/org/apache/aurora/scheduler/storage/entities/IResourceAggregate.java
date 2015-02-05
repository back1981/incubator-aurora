package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.ResourceAggregate;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IResourceAggregate {
  private final ResourceAggregate wrapped;
  private int cachedHashCode = 0;

  private IResourceAggregate(ResourceAggregate wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IResourceAggregate buildNoCopy(ResourceAggregate wrapped) {
    return new IResourceAggregate(wrapped);
  }

  public static IResourceAggregate build(ResourceAggregate wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IResourceAggregate, ResourceAggregate> TO_BUILDER =
      new Function<IResourceAggregate, ResourceAggregate>() {
        @Override
        public ResourceAggregate apply(IResourceAggregate input) {
          return input.newBuilder();
        }
      };

  public static final Function<ResourceAggregate, IResourceAggregate> FROM_BUILDER =
      new Function<ResourceAggregate, IResourceAggregate>() {
        @Override
        public IResourceAggregate apply(ResourceAggregate input) {
          return IResourceAggregate.build(input);
        }
      };

  public static ImmutableList<ResourceAggregate> toBuildersList(Iterable<IResourceAggregate> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IResourceAggregate> listFromBuilders(Iterable<ResourceAggregate> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<ResourceAggregate> toBuildersSet(Iterable<IResourceAggregate> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IResourceAggregate> setFromBuilders(Iterable<ResourceAggregate> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public ResourceAggregate newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetNumCpus() {
    return wrapped.isSetNumCpus();
  }

  public double getNumCpus() {
    return wrapped.getNumCpus();
  }

  public boolean isSetRamMb() {
    return wrapped.isSetRamMb();
  }

  public long getRamMb() {
    return wrapped.getRamMb();
  }

  public boolean isSetDiskMb() {
    return wrapped.isSetDiskMb();
  }

  public long getDiskMb() {
    return wrapped.getDiskMb();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IResourceAggregate)) {
      return false;
    }
    IResourceAggregate other = (IResourceAggregate) o;
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
