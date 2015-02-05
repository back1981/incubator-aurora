package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.ServerInfo;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IServerInfo {
  private final ServerInfo wrapped;
  private int cachedHashCode = 0;

  private IServerInfo(ServerInfo wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IServerInfo buildNoCopy(ServerInfo wrapped) {
    return new IServerInfo(wrapped);
  }

  public static IServerInfo build(ServerInfo wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IServerInfo, ServerInfo> TO_BUILDER =
      new Function<IServerInfo, ServerInfo>() {
        @Override
        public ServerInfo apply(IServerInfo input) {
          return input.newBuilder();
        }
      };

  public static final Function<ServerInfo, IServerInfo> FROM_BUILDER =
      new Function<ServerInfo, IServerInfo>() {
        @Override
        public IServerInfo apply(ServerInfo input) {
          return IServerInfo.build(input);
        }
      };

  public static ImmutableList<ServerInfo> toBuildersList(Iterable<IServerInfo> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IServerInfo> listFromBuilders(Iterable<ServerInfo> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<ServerInfo> toBuildersSet(Iterable<IServerInfo> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IServerInfo> setFromBuilders(Iterable<ServerInfo> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public ServerInfo newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetClusterName() {
    return wrapped.isSetClusterName();
  }

  public String getClusterName() {
    return wrapped.getClusterName();
  }

  public boolean isSetThriftAPIVersion() {
    return wrapped.isSetThriftAPIVersion();
  }

  public int getThriftAPIVersion() {
    return wrapped.getThriftAPIVersion();
  }

  public boolean isSetStatsUrlPrefix() {
    return wrapped.isSetStatsUrlPrefix();
  }

  public String getStatsUrlPrefix() {
    return wrapped.getStatsUrlPrefix();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IServerInfo)) {
      return false;
    }
    IServerInfo other = (IServerInfo) o;
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
