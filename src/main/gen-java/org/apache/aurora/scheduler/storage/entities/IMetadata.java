package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.Metadata;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IMetadata {
  private final Metadata wrapped;
  private int cachedHashCode = 0;

  private IMetadata(Metadata wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IMetadata buildNoCopy(Metadata wrapped) {
    return new IMetadata(wrapped);
  }

  public static IMetadata build(Metadata wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IMetadata, Metadata> TO_BUILDER =
      new Function<IMetadata, Metadata>() {
        @Override
        public Metadata apply(IMetadata input) {
          return input.newBuilder();
        }
      };

  public static final Function<Metadata, IMetadata> FROM_BUILDER =
      new Function<Metadata, IMetadata>() {
        @Override
        public IMetadata apply(Metadata input) {
          return IMetadata.build(input);
        }
      };

  public static ImmutableList<Metadata> toBuildersList(Iterable<IMetadata> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IMetadata> listFromBuilders(Iterable<Metadata> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<Metadata> toBuildersSet(Iterable<IMetadata> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IMetadata> setFromBuilders(Iterable<Metadata> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public Metadata newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetKey() {
    return wrapped.isSetKey();
  }

  public String getKey() {
    return wrapped.getKey();
  }

  public boolean isSetValue() {
    return wrapped.isSetValue();
  }

  public String getValue() {
    return wrapped.getValue();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IMetadata)) {
      return false;
    }
    IMetadata other = (IMetadata) o;
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
