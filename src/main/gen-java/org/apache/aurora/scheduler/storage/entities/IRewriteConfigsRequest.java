package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.RewriteConfigsRequest;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IRewriteConfigsRequest {
  private final RewriteConfigsRequest wrapped;
  private int cachedHashCode = 0;
  private final ImmutableList<IConfigRewrite> rewriteCommands;

  private IRewriteConfigsRequest(RewriteConfigsRequest wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.rewriteCommands = !wrapped.isSetRewriteCommands()
        ? ImmutableList.<IConfigRewrite>of()
        : FluentIterable.from(wrapped.getRewriteCommands())
              .transform(IConfigRewrite.FROM_BUILDER)
              .toList();
  }

  static IRewriteConfigsRequest buildNoCopy(RewriteConfigsRequest wrapped) {
    return new IRewriteConfigsRequest(wrapped);
  }

  public static IRewriteConfigsRequest build(RewriteConfigsRequest wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IRewriteConfigsRequest, RewriteConfigsRequest> TO_BUILDER =
      new Function<IRewriteConfigsRequest, RewriteConfigsRequest>() {
        @Override
        public RewriteConfigsRequest apply(IRewriteConfigsRequest input) {
          return input.newBuilder();
        }
      };

  public static final Function<RewriteConfigsRequest, IRewriteConfigsRequest> FROM_BUILDER =
      new Function<RewriteConfigsRequest, IRewriteConfigsRequest>() {
        @Override
        public IRewriteConfigsRequest apply(RewriteConfigsRequest input) {
          return IRewriteConfigsRequest.build(input);
        }
      };

  public static ImmutableList<RewriteConfigsRequest> toBuildersList(Iterable<IRewriteConfigsRequest> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IRewriteConfigsRequest> listFromBuilders(Iterable<RewriteConfigsRequest> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<RewriteConfigsRequest> toBuildersSet(Iterable<IRewriteConfigsRequest> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IRewriteConfigsRequest> setFromBuilders(Iterable<RewriteConfigsRequest> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public RewriteConfigsRequest newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetRewriteCommands() {
    return wrapped.isSetRewriteCommands();
  }

  public ImmutableList<IConfigRewrite> getRewriteCommands() {
    return rewriteCommands;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IRewriteConfigsRequest)) {
      return false;
    }
    IRewriteConfigsRequest other = (IRewriteConfigsRequest) o;
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
