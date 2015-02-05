package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.JobUpdateDetails;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IJobUpdateDetails {
  private final JobUpdateDetails wrapped;
  private int cachedHashCode = 0;
  private final IJobUpdate update;
  private final ImmutableList<IJobUpdateEvent> updateEvents;
  private final ImmutableList<IJobInstanceUpdateEvent> instanceEvents;

  private IJobUpdateDetails(JobUpdateDetails wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.update = !wrapped.isSetUpdate()
        ? null
        : IJobUpdate.buildNoCopy(wrapped.getUpdate());
    this.updateEvents = !wrapped.isSetUpdateEvents()
        ? ImmutableList.<IJobUpdateEvent>of()
        : FluentIterable.from(wrapped.getUpdateEvents())
              .transform(IJobUpdateEvent.FROM_BUILDER)
              .toList();
    this.instanceEvents = !wrapped.isSetInstanceEvents()
        ? ImmutableList.<IJobInstanceUpdateEvent>of()
        : FluentIterable.from(wrapped.getInstanceEvents())
              .transform(IJobInstanceUpdateEvent.FROM_BUILDER)
              .toList();
  }

  static IJobUpdateDetails buildNoCopy(JobUpdateDetails wrapped) {
    return new IJobUpdateDetails(wrapped);
  }

  public static IJobUpdateDetails build(JobUpdateDetails wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IJobUpdateDetails, JobUpdateDetails> TO_BUILDER =
      new Function<IJobUpdateDetails, JobUpdateDetails>() {
        @Override
        public JobUpdateDetails apply(IJobUpdateDetails input) {
          return input.newBuilder();
        }
      };

  public static final Function<JobUpdateDetails, IJobUpdateDetails> FROM_BUILDER =
      new Function<JobUpdateDetails, IJobUpdateDetails>() {
        @Override
        public IJobUpdateDetails apply(JobUpdateDetails input) {
          return IJobUpdateDetails.build(input);
        }
      };

  public static ImmutableList<JobUpdateDetails> toBuildersList(Iterable<IJobUpdateDetails> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IJobUpdateDetails> listFromBuilders(Iterable<JobUpdateDetails> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<JobUpdateDetails> toBuildersSet(Iterable<IJobUpdateDetails> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IJobUpdateDetails> setFromBuilders(Iterable<JobUpdateDetails> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public JobUpdateDetails newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetUpdate() {
    return wrapped.isSetUpdate();
  }

  public IJobUpdate getUpdate() {
    return update;
  }

  public boolean isSetUpdateEvents() {
    return wrapped.isSetUpdateEvents();
  }

  public ImmutableList<IJobUpdateEvent> getUpdateEvents() {
    return updateEvents;
  }

  public boolean isSetInstanceEvents() {
    return wrapped.isSetInstanceEvents();
  }

  public ImmutableList<IJobInstanceUpdateEvent> getInstanceEvents() {
    return instanceEvents;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IJobUpdateDetails)) {
      return false;
    }
    IJobUpdateDetails other = (IJobUpdateDetails) o;
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
