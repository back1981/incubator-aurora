package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.InstanceConfigRewrite;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IInstanceConfigRewrite {
  private final InstanceConfigRewrite wrapped;
  private int cachedHashCode = 0;
  private final IInstanceKey instanceKey;
  private final ITaskConfig oldTask;
  private final ITaskConfig rewrittenTask;

  private IInstanceConfigRewrite(InstanceConfigRewrite wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.instanceKey = !wrapped.isSetInstanceKey()
        ? null
        : IInstanceKey.buildNoCopy(wrapped.getInstanceKey());
    this.oldTask = !wrapped.isSetOldTask()
        ? null
        : ITaskConfig.buildNoCopy(wrapped.getOldTask());
    this.rewrittenTask = !wrapped.isSetRewrittenTask()
        ? null
        : ITaskConfig.buildNoCopy(wrapped.getRewrittenTask());
  }

  static IInstanceConfigRewrite buildNoCopy(InstanceConfigRewrite wrapped) {
    return new IInstanceConfigRewrite(wrapped);
  }

  public static IInstanceConfigRewrite build(InstanceConfigRewrite wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IInstanceConfigRewrite, InstanceConfigRewrite> TO_BUILDER =
      new Function<IInstanceConfigRewrite, InstanceConfigRewrite>() {
        @Override
        public InstanceConfigRewrite apply(IInstanceConfigRewrite input) {
          return input.newBuilder();
        }
      };

  public static final Function<InstanceConfigRewrite, IInstanceConfigRewrite> FROM_BUILDER =
      new Function<InstanceConfigRewrite, IInstanceConfigRewrite>() {
        @Override
        public IInstanceConfigRewrite apply(InstanceConfigRewrite input) {
          return IInstanceConfigRewrite.build(input);
        }
      };

  public static ImmutableList<InstanceConfigRewrite> toBuildersList(Iterable<IInstanceConfigRewrite> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IInstanceConfigRewrite> listFromBuilders(Iterable<InstanceConfigRewrite> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<InstanceConfigRewrite> toBuildersSet(Iterable<IInstanceConfigRewrite> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IInstanceConfigRewrite> setFromBuilders(Iterable<InstanceConfigRewrite> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public InstanceConfigRewrite newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetInstanceKey() {
    return wrapped.isSetInstanceKey();
  }

  public IInstanceKey getInstanceKey() {
    return instanceKey;
  }

  public boolean isSetOldTask() {
    return wrapped.isSetOldTask();
  }

  public ITaskConfig getOldTask() {
    return oldTask;
  }

  public boolean isSetRewrittenTask() {
    return wrapped.isSetRewrittenTask();
  }

  public ITaskConfig getRewrittenTask() {
    return rewrittenTask;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IInstanceConfigRewrite)) {
      return false;
    }
    IInstanceConfigRewrite other = (IInstanceConfigRewrite) o;
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
