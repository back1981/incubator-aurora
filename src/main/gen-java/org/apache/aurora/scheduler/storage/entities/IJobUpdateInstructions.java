package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.JobUpdateInstructions;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IJobUpdateInstructions {
  private final JobUpdateInstructions wrapped;
  private int cachedHashCode = 0;
  private final ImmutableSet<IInstanceTaskConfig> initialState;
  private final IInstanceTaskConfig desiredState;
  private final IJobUpdateSettings settings;

  private IJobUpdateInstructions(JobUpdateInstructions wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.initialState = !wrapped.isSetInitialState()
        ? ImmutableSet.<IInstanceTaskConfig>of()
        : FluentIterable.from(wrapped.getInitialState())
              .transform(IInstanceTaskConfig.FROM_BUILDER)
              .toSet();
    this.desiredState = !wrapped.isSetDesiredState()
        ? null
        : IInstanceTaskConfig.buildNoCopy(wrapped.getDesiredState());
    this.settings = !wrapped.isSetSettings()
        ? null
        : IJobUpdateSettings.buildNoCopy(wrapped.getSettings());
  }

  static IJobUpdateInstructions buildNoCopy(JobUpdateInstructions wrapped) {
    return new IJobUpdateInstructions(wrapped);
  }

  public static IJobUpdateInstructions build(JobUpdateInstructions wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IJobUpdateInstructions, JobUpdateInstructions> TO_BUILDER =
      new Function<IJobUpdateInstructions, JobUpdateInstructions>() {
        @Override
        public JobUpdateInstructions apply(IJobUpdateInstructions input) {
          return input.newBuilder();
        }
      };

  public static final Function<JobUpdateInstructions, IJobUpdateInstructions> FROM_BUILDER =
      new Function<JobUpdateInstructions, IJobUpdateInstructions>() {
        @Override
        public IJobUpdateInstructions apply(JobUpdateInstructions input) {
          return IJobUpdateInstructions.build(input);
        }
      };

  public static ImmutableList<JobUpdateInstructions> toBuildersList(Iterable<IJobUpdateInstructions> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IJobUpdateInstructions> listFromBuilders(Iterable<JobUpdateInstructions> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<JobUpdateInstructions> toBuildersSet(Iterable<IJobUpdateInstructions> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IJobUpdateInstructions> setFromBuilders(Iterable<JobUpdateInstructions> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public JobUpdateInstructions newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetInitialState() {
    return wrapped.isSetInitialState();
  }

  public ImmutableSet<IInstanceTaskConfig> getInitialState() {
    return initialState;
  }

  public boolean isSetDesiredState() {
    return wrapped.isSetDesiredState();
  }

  public IInstanceTaskConfig getDesiredState() {
    return desiredState;
  }

  public boolean isSetSettings() {
    return wrapped.isSetSettings();
  }

  public IJobUpdateSettings getSettings() {
    return settings;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IJobUpdateInstructions)) {
      return false;
    }
    IJobUpdateInstructions other = (IJobUpdateInstructions) o;
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
