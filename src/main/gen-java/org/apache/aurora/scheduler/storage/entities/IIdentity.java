package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.Identity;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IIdentity {
  private final Identity wrapped;
  private int cachedHashCode = 0;

  private IIdentity(Identity wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IIdentity buildNoCopy(Identity wrapped) {
    return new IIdentity(wrapped);
  }

  public static IIdentity build(Identity wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IIdentity, Identity> TO_BUILDER =
      new Function<IIdentity, Identity>() {
        @Override
        public Identity apply(IIdentity input) {
          return input.newBuilder();
        }
      };

  public static final Function<Identity, IIdentity> FROM_BUILDER =
      new Function<Identity, IIdentity>() {
        @Override
        public IIdentity apply(Identity input) {
          return IIdentity.build(input);
        }
      };

  public static ImmutableList<Identity> toBuildersList(Iterable<IIdentity> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IIdentity> listFromBuilders(Iterable<Identity> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<Identity> toBuildersSet(Iterable<IIdentity> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IIdentity> setFromBuilders(Iterable<Identity> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public Identity newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetRole() {
    return wrapped.isSetRole();
  }

  public String getRole() {
    return wrapped.getRole();
  }

  public boolean isSetUser() {
    return wrapped.isSetUser();
  }

  public String getUser() {
    return wrapped.getUser();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IIdentity)) {
      return false;
    }
    IIdentity other = (IIdentity) o;
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
