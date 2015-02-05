package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.ConfigSummaryResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IConfigSummaryResult {
  private final ConfigSummaryResult wrapped;
  private int cachedHashCode = 0;
  private final IConfigSummary summary;

  private IConfigSummaryResult(ConfigSummaryResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.summary = !wrapped.isSetSummary()
        ? null
        : IConfigSummary.buildNoCopy(wrapped.getSummary());
  }

  static IConfigSummaryResult buildNoCopy(ConfigSummaryResult wrapped) {
    return new IConfigSummaryResult(wrapped);
  }

  public static IConfigSummaryResult build(ConfigSummaryResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IConfigSummaryResult, ConfigSummaryResult> TO_BUILDER =
      new Function<IConfigSummaryResult, ConfigSummaryResult>() {
        @Override
        public ConfigSummaryResult apply(IConfigSummaryResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<ConfigSummaryResult, IConfigSummaryResult> FROM_BUILDER =
      new Function<ConfigSummaryResult, IConfigSummaryResult>() {
        @Override
        public IConfigSummaryResult apply(ConfigSummaryResult input) {
          return IConfigSummaryResult.build(input);
        }
      };

  public static ImmutableList<ConfigSummaryResult> toBuildersList(Iterable<IConfigSummaryResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IConfigSummaryResult> listFromBuilders(Iterable<ConfigSummaryResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<ConfigSummaryResult> toBuildersSet(Iterable<IConfigSummaryResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IConfigSummaryResult> setFromBuilders(Iterable<ConfigSummaryResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public ConfigSummaryResult newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetSummary() {
    return wrapped.isSetSummary();
  }

  public IConfigSummary getSummary() {
    return summary;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IConfigSummaryResult)) {
      return false;
    }
    IConfigSummaryResult other = (IConfigSummaryResult) o;
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
