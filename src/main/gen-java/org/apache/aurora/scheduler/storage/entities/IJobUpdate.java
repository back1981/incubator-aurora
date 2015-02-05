package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.JobUpdate;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IJobUpdate {
  private final JobUpdate wrapped;
  private int cachedHashCode = 0;
  private final IJobUpdateSummary summary;
  private final IJobUpdateInstructions instructions;

  private IJobUpdate(JobUpdate wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.summary = !wrapped.isSetSummary()
        ? null
        : IJobUpdateSummary.buildNoCopy(wrapped.getSummary());
    this.instructions = !wrapped.isSetInstructions()
        ? null
        : IJobUpdateInstructions.buildNoCopy(wrapped.getInstructions());
  }

  static IJobUpdate buildNoCopy(JobUpdate wrapped) {
    return new IJobUpdate(wrapped);
  }

  public static IJobUpdate build(JobUpdate wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IJobUpdate, JobUpdate> TO_BUILDER =
      new Function<IJobUpdate, JobUpdate>() {
        @Override
        public JobUpdate apply(IJobUpdate input) {
          return input.newBuilder();
        }
      };

  public static final Function<JobUpdate, IJobUpdate> FROM_BUILDER =
      new Function<JobUpdate, IJobUpdate>() {
        @Override
        public IJobUpdate apply(JobUpdate input) {
          return IJobUpdate.build(input);
        }
      };

  public static ImmutableList<JobUpdate> toBuildersList(Iterable<IJobUpdate> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IJobUpdate> listFromBuilders(Iterable<JobUpdate> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<JobUpdate> toBuildersSet(Iterable<IJobUpdate> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IJobUpdate> setFromBuilders(Iterable<JobUpdate> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public JobUpdate newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetSummary() {
    return wrapped.isSetSummary();
  }

  public IJobUpdateSummary getSummary() {
    return summary;
  }

  public boolean isSetInstructions() {
    return wrapped.isSetInstructions();
  }

  public IJobUpdateInstructions getInstructions() {
    return instructions;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IJobUpdate)) {
      return false;
    }
    IJobUpdate other = (IJobUpdate) o;
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
