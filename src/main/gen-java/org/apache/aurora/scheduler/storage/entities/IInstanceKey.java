package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.InstanceKey;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IInstanceKey {
  private final InstanceKey wrapped;
  private int cachedHashCode = 0;
  private final IJobKey jobKey;

  private IInstanceKey(InstanceKey wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.jobKey = !wrapped.isSetJobKey()
        ? null
        : IJobKey.buildNoCopy(wrapped.getJobKey());
  }

  static IInstanceKey buildNoCopy(InstanceKey wrapped) {
    return new IInstanceKey(wrapped);
  }

  public static IInstanceKey build(InstanceKey wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IInstanceKey, InstanceKey> TO_BUILDER =
      new Function<IInstanceKey, InstanceKey>() {
        @Override
        public InstanceKey apply(IInstanceKey input) {
          return input.newBuilder();
        }
      };

  public static final Function<InstanceKey, IInstanceKey> FROM_BUILDER =
      new Function<InstanceKey, IInstanceKey>() {
        @Override
        public IInstanceKey apply(InstanceKey input) {
          return IInstanceKey.build(input);
        }
      };

  public static ImmutableList<InstanceKey> toBuildersList(Iterable<IInstanceKey> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IInstanceKey> listFromBuilders(Iterable<InstanceKey> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<InstanceKey> toBuildersSet(Iterable<IInstanceKey> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IInstanceKey> setFromBuilders(Iterable<InstanceKey> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public InstanceKey newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetJobKey() {
    return wrapped.isSetJobKey();
  }

  public IJobKey getJobKey() {
    return jobKey;
  }

  public boolean isSetInstanceId() {
    return wrapped.isSetInstanceId();
  }

  public int getInstanceId() {
    return wrapped.getInstanceId();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IInstanceKey)) {
      return false;
    }
    IInstanceKey other = (IInstanceKey) o;
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
