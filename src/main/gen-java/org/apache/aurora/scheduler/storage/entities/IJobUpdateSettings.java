package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.JobUpdateSettings;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IJobUpdateSettings {
  private final JobUpdateSettings wrapped;
  private int cachedHashCode = 0;
  private final ImmutableSet<IRange> updateOnlyTheseInstances;

  private IJobUpdateSettings(JobUpdateSettings wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.updateOnlyTheseInstances = !wrapped.isSetUpdateOnlyTheseInstances()
        ? ImmutableSet.<IRange>of()
        : FluentIterable.from(wrapped.getUpdateOnlyTheseInstances())
              .transform(IRange.FROM_BUILDER)
              .toSet();
  }

  static IJobUpdateSettings buildNoCopy(JobUpdateSettings wrapped) {
    return new IJobUpdateSettings(wrapped);
  }

  public static IJobUpdateSettings build(JobUpdateSettings wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IJobUpdateSettings, JobUpdateSettings> TO_BUILDER =
      new Function<IJobUpdateSettings, JobUpdateSettings>() {
        @Override
        public JobUpdateSettings apply(IJobUpdateSettings input) {
          return input.newBuilder();
        }
      };

  public static final Function<JobUpdateSettings, IJobUpdateSettings> FROM_BUILDER =
      new Function<JobUpdateSettings, IJobUpdateSettings>() {
        @Override
        public IJobUpdateSettings apply(JobUpdateSettings input) {
          return IJobUpdateSettings.build(input);
        }
      };

  public static ImmutableList<JobUpdateSettings> toBuildersList(Iterable<IJobUpdateSettings> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IJobUpdateSettings> listFromBuilders(Iterable<JobUpdateSettings> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<JobUpdateSettings> toBuildersSet(Iterable<IJobUpdateSettings> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IJobUpdateSettings> setFromBuilders(Iterable<JobUpdateSettings> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public JobUpdateSettings newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetUpdateGroupSize() {
    return wrapped.isSetUpdateGroupSize();
  }

  public int getUpdateGroupSize() {
    return wrapped.getUpdateGroupSize();
  }

  public boolean isSetMaxPerInstanceFailures() {
    return wrapped.isSetMaxPerInstanceFailures();
  }

  public int getMaxPerInstanceFailures() {
    return wrapped.getMaxPerInstanceFailures();
  }

  public boolean isSetMaxFailedInstances() {
    return wrapped.isSetMaxFailedInstances();
  }

  public int getMaxFailedInstances() {
    return wrapped.getMaxFailedInstances();
  }

  public boolean isSetMaxWaitToInstanceRunningMs() {
    return wrapped.isSetMaxWaitToInstanceRunningMs();
  }

  public int getMaxWaitToInstanceRunningMs() {
    return wrapped.getMaxWaitToInstanceRunningMs();
  }

  public boolean isSetMinWaitInInstanceRunningMs() {
    return wrapped.isSetMinWaitInInstanceRunningMs();
  }

  public int getMinWaitInInstanceRunningMs() {
    return wrapped.getMinWaitInInstanceRunningMs();
  }

  public boolean isSetRollbackOnFailure() {
    return wrapped.isSetRollbackOnFailure();
  }

  public boolean isRollbackOnFailure() {
    return wrapped.isRollbackOnFailure();
  }

  public boolean isSetUpdateOnlyTheseInstances() {
    return wrapped.isSetUpdateOnlyTheseInstances();
  }

  public ImmutableSet<IRange> getUpdateOnlyTheseInstances() {
    return updateOnlyTheseInstances;
  }

  public boolean isSetWaitForBatchCompletion() {
    return wrapped.isSetWaitForBatchCompletion();
  }

  public boolean isWaitForBatchCompletion() {
    return wrapped.isWaitForBatchCompletion();
  }

  public boolean isSetBlockIfNoPulsesAfterMs() {
    return wrapped.isSetBlockIfNoPulsesAfterMs();
  }

  public int getBlockIfNoPulsesAfterMs() {
    return wrapped.getBlockIfNoPulsesAfterMs();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IJobUpdateSettings)) {
      return false;
    }
    IJobUpdateSettings other = (IJobUpdateSettings) o;
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
