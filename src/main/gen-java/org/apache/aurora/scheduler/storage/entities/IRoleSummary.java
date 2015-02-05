package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.RoleSummary;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IRoleSummary {
  private final RoleSummary wrapped;
  private int cachedHashCode = 0;

  private IRoleSummary(RoleSummary wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IRoleSummary buildNoCopy(RoleSummary wrapped) {
    return new IRoleSummary(wrapped);
  }

  public static IRoleSummary build(RoleSummary wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IRoleSummary, RoleSummary> TO_BUILDER =
      new Function<IRoleSummary, RoleSummary>() {
        @Override
        public RoleSummary apply(IRoleSummary input) {
          return input.newBuilder();
        }
      };

  public static final Function<RoleSummary, IRoleSummary> FROM_BUILDER =
      new Function<RoleSummary, IRoleSummary>() {
        @Override
        public IRoleSummary apply(RoleSummary input) {
          return IRoleSummary.build(input);
        }
      };

  public static ImmutableList<RoleSummary> toBuildersList(Iterable<IRoleSummary> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IRoleSummary> listFromBuilders(Iterable<RoleSummary> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<RoleSummary> toBuildersSet(Iterable<IRoleSummary> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IRoleSummary> setFromBuilders(Iterable<RoleSummary> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public RoleSummary newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetRole() {
    return wrapped.isSetRole();
  }

  public String getRole() {
    return wrapped.getRole();
  }

  public boolean isSetJobCount() {
    return wrapped.isSetJobCount();
  }

  public int getJobCount() {
    return wrapped.getJobCount();
  }

  public boolean isSetCronJobCount() {
    return wrapped.isSetCronJobCount();
  }

  public int getCronJobCount() {
    return wrapped.getCronJobCount();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IRoleSummary)) {
      return false;
    }
    IRoleSummary other = (IRoleSummary) o;
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
