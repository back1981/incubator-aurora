package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.DockerContainer;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IDockerContainer {
  private final DockerContainer wrapped;
  private int cachedHashCode = 0;

  private IDockerContainer(DockerContainer wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IDockerContainer buildNoCopy(DockerContainer wrapped) {
    return new IDockerContainer(wrapped);
  }

  public static IDockerContainer build(DockerContainer wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IDockerContainer, DockerContainer> TO_BUILDER =
      new Function<IDockerContainer, DockerContainer>() {
        @Override
        public DockerContainer apply(IDockerContainer input) {
          return input.newBuilder();
        }
      };

  public static final Function<DockerContainer, IDockerContainer> FROM_BUILDER =
      new Function<DockerContainer, IDockerContainer>() {
        @Override
        public IDockerContainer apply(DockerContainer input) {
          return IDockerContainer.build(input);
        }
      };

  public static ImmutableList<DockerContainer> toBuildersList(Iterable<IDockerContainer> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IDockerContainer> listFromBuilders(Iterable<DockerContainer> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<DockerContainer> toBuildersSet(Iterable<IDockerContainer> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IDockerContainer> setFromBuilders(Iterable<DockerContainer> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public DockerContainer newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetImage() {
    return wrapped.isSetImage();
  }

  public String getImage() {
    return wrapped.getImage();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IDockerContainer)) {
      return false;
    }
    IDockerContainer other = (IDockerContainer) o;
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
