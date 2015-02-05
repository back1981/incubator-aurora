package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.Package;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IPackage {
  private final Package wrapped;
  private int cachedHashCode = 0;

  private IPackage(Package wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IPackage buildNoCopy(Package wrapped) {
    return new IPackage(wrapped);
  }

  public static IPackage build(Package wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IPackage, Package> TO_BUILDER =
      new Function<IPackage, Package>() {
        @Override
        public Package apply(IPackage input) {
          return input.newBuilder();
        }
      };

  public static final Function<Package, IPackage> FROM_BUILDER =
      new Function<Package, IPackage>() {
        @Override
        public IPackage apply(Package input) {
          return IPackage.build(input);
        }
      };

  public static ImmutableList<Package> toBuildersList(Iterable<IPackage> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IPackage> listFromBuilders(Iterable<Package> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<Package> toBuildersSet(Iterable<IPackage> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IPackage> setFromBuilders(Iterable<Package> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public Package newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetRole() {
    return wrapped.isSetRole();
  }

  public String getRole() {
    return wrapped.getRole();
  }

  public boolean isSetName() {
    return wrapped.isSetName();
  }

  public String getName() {
    return wrapped.getName();
  }

  public boolean isSetVersion() {
    return wrapped.isSetVersion();
  }

  public int getVersion() {
    return wrapped.getVersion();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IPackage)) {
      return false;
    }
    IPackage other = (IPackage) o;
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
