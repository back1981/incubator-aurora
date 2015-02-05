package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.ListBackupsResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IListBackupsResult {
  private final ListBackupsResult wrapped;
  private int cachedHashCode = 0;
  private final ImmutableSet<String> backups;

  private IListBackupsResult(ListBackupsResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.backups = !wrapped.isSetBackups()
        ? ImmutableSet.<String>of()
        : ImmutableSet.copyOf(wrapped.getBackups());
  }

  static IListBackupsResult buildNoCopy(ListBackupsResult wrapped) {
    return new IListBackupsResult(wrapped);
  }

  public static IListBackupsResult build(ListBackupsResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IListBackupsResult, ListBackupsResult> TO_BUILDER =
      new Function<IListBackupsResult, ListBackupsResult>() {
        @Override
        public ListBackupsResult apply(IListBackupsResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<ListBackupsResult, IListBackupsResult> FROM_BUILDER =
      new Function<ListBackupsResult, IListBackupsResult>() {
        @Override
        public IListBackupsResult apply(ListBackupsResult input) {
          return IListBackupsResult.build(input);
        }
      };

  public static ImmutableList<ListBackupsResult> toBuildersList(Iterable<IListBackupsResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IListBackupsResult> listFromBuilders(Iterable<ListBackupsResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<ListBackupsResult> toBuildersSet(Iterable<IListBackupsResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IListBackupsResult> setFromBuilders(Iterable<ListBackupsResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public ListBackupsResult newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetBackups() {
    return wrapped.isSetBackups();
  }

  public ImmutableSet<String> getBackups() {
    return backups;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IListBackupsResult)) {
      return false;
    }
    IListBackupsResult other = (IListBackupsResult) o;
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
