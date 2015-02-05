package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.MesosContainer;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IMesosContainer {
  private final MesosContainer wrapped;
  private int cachedHashCode = 0;

  private IMesosContainer(MesosContainer wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IMesosContainer buildNoCopy(MesosContainer wrapped) {
    return new IMesosContainer(wrapped);
  }

  public static IMesosContainer build(MesosContainer wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IMesosContainer, MesosContainer> TO_BUILDER =
      new Function<IMesosContainer, MesosContainer>() {
        @Override
        public MesosContainer apply(IMesosContainer input) {
          return input.newBuilder();
        }
      };

  public static final Function<MesosContainer, IMesosContainer> FROM_BUILDER =
      new Function<MesosContainer, IMesosContainer>() {
        @Override
        public IMesosContainer apply(MesosContainer input) {
          return IMesosContainer.build(input);
        }
      };

  public static ImmutableList<MesosContainer> toBuildersList(Iterable<IMesosContainer> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IMesosContainer> listFromBuilders(Iterable<MesosContainer> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<MesosContainer> toBuildersSet(Iterable<IMesosContainer> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IMesosContainer> setFromBuilders(Iterable<MesosContainer> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public MesosContainer newBuilder() {
    return wrapped.deepCopy();
  }



  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IMesosContainer)) {
      return false;
    }
    IMesosContainer other = (IMesosContainer) o;
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
