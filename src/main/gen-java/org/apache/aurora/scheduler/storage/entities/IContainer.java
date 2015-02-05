package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.Container;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IContainer {
  private final Container wrapped;
  private int cachedHashCode = 0;

  private IContainer(Container wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IContainer buildNoCopy(Container wrapped) {
    return new IContainer(wrapped);
  }

  public static IContainer build(Container wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IContainer, Container> TO_BUILDER =
      new Function<IContainer, Container>() {
        @Override
        public Container apply(IContainer input) {
          return input.newBuilder();
        }
      };

  public static final Function<Container, IContainer> FROM_BUILDER =
      new Function<Container, IContainer>() {
        @Override
        public IContainer apply(Container input) {
          return IContainer.build(input);
        }
      };

  public static ImmutableList<Container> toBuildersList(Iterable<IContainer> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IContainer> listFromBuilders(Iterable<Container> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<Container> toBuildersSet(Iterable<IContainer> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IContainer> setFromBuilders(Iterable<Container> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public Container newBuilder() {
    return wrapped.deepCopy();
  }

  public Container._Fields getSetField() {
    return wrapped.getSetField();
  }

  public boolean isSetMesos() {
    return wrapped.isSetMesos();
  }

  public IMesosContainer getMesos() {
    return IMesosContainer.build(wrapped.getMesos());
  }

  public boolean isSetDocker() {
    return wrapped.isSetDocker();
  }

  public IDockerContainer getDocker() {
    return IDockerContainer.build(wrapped.getDocker());
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IContainer)) {
      return false;
    }
    IContainer other = (IContainer) o;
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
