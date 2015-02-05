package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.APIVersion;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IAPIVersion {
  private final APIVersion wrapped;
  private int cachedHashCode = 0;

  private IAPIVersion(APIVersion wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IAPIVersion buildNoCopy(APIVersion wrapped) {
    return new IAPIVersion(wrapped);
  }

  public static IAPIVersion build(APIVersion wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IAPIVersion, APIVersion> TO_BUILDER =
      new Function<IAPIVersion, APIVersion>() {
        @Override
        public APIVersion apply(IAPIVersion input) {
          return input.newBuilder();
        }
      };

  public static final Function<APIVersion, IAPIVersion> FROM_BUILDER =
      new Function<APIVersion, IAPIVersion>() {
        @Override
        public IAPIVersion apply(APIVersion input) {
          return IAPIVersion.build(input);
        }
      };

  public static ImmutableList<APIVersion> toBuildersList(Iterable<IAPIVersion> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IAPIVersion> listFromBuilders(Iterable<APIVersion> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<APIVersion> toBuildersSet(Iterable<IAPIVersion> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IAPIVersion> setFromBuilders(Iterable<APIVersion> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public APIVersion newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetMajor() {
    return wrapped.isSetMajor();
  }

  public int getMajor() {
    return wrapped.getMajor();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IAPIVersion)) {
      return false;
    }
    IAPIVersion other = (IAPIVersion) o;
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
