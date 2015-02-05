package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.PopulateJobResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IPopulateJobResult {
  private final PopulateJobResult wrapped;
  private int cachedHashCode = 0;
  private final ImmutableSet<ITaskConfig> populatedDEPRECATED;
  private final ITaskConfig taskConfig;

  private IPopulateJobResult(PopulateJobResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.populatedDEPRECATED = !wrapped.isSetPopulatedDEPRECATED()
        ? ImmutableSet.<ITaskConfig>of()
        : FluentIterable.from(wrapped.getPopulatedDEPRECATED())
              .transform(ITaskConfig.FROM_BUILDER)
              .toSet();
    this.taskConfig = !wrapped.isSetTaskConfig()
        ? null
        : ITaskConfig.buildNoCopy(wrapped.getTaskConfig());
  }

  static IPopulateJobResult buildNoCopy(PopulateJobResult wrapped) {
    return new IPopulateJobResult(wrapped);
  }

  public static IPopulateJobResult build(PopulateJobResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IPopulateJobResult, PopulateJobResult> TO_BUILDER =
      new Function<IPopulateJobResult, PopulateJobResult>() {
        @Override
        public PopulateJobResult apply(IPopulateJobResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<PopulateJobResult, IPopulateJobResult> FROM_BUILDER =
      new Function<PopulateJobResult, IPopulateJobResult>() {
        @Override
        public IPopulateJobResult apply(PopulateJobResult input) {
          return IPopulateJobResult.build(input);
        }
      };

  public static ImmutableList<PopulateJobResult> toBuildersList(Iterable<IPopulateJobResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IPopulateJobResult> listFromBuilders(Iterable<PopulateJobResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<PopulateJobResult> toBuildersSet(Iterable<IPopulateJobResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IPopulateJobResult> setFromBuilders(Iterable<PopulateJobResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public PopulateJobResult newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetPopulatedDEPRECATED() {
    return wrapped.isSetPopulatedDEPRECATED();
  }

  public ImmutableSet<ITaskConfig> getPopulatedDEPRECATED() {
    return populatedDEPRECATED;
  }

  public boolean isSetTaskConfig() {
    return wrapped.isSetTaskConfig();
  }

  public ITaskConfig getTaskConfig() {
    return taskConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IPopulateJobResult)) {
      return false;
    }
    IPopulateJobResult other = (IPopulateJobResult) o;
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
