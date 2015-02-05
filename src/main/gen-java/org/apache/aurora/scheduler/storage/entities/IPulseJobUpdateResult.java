package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.JobUpdatePulseStatus;
import org.apache.aurora.gen.PulseJobUpdateResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IPulseJobUpdateResult {
  private final PulseJobUpdateResult wrapped;
  private int cachedHashCode = 0;

  private IPulseJobUpdateResult(PulseJobUpdateResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IPulseJobUpdateResult buildNoCopy(PulseJobUpdateResult wrapped) {
    return new IPulseJobUpdateResult(wrapped);
  }

  public static IPulseJobUpdateResult build(PulseJobUpdateResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IPulseJobUpdateResult, PulseJobUpdateResult> TO_BUILDER =
      new Function<IPulseJobUpdateResult, PulseJobUpdateResult>() {
        @Override
        public PulseJobUpdateResult apply(IPulseJobUpdateResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<PulseJobUpdateResult, IPulseJobUpdateResult> FROM_BUILDER =
      new Function<PulseJobUpdateResult, IPulseJobUpdateResult>() {
        @Override
        public IPulseJobUpdateResult apply(PulseJobUpdateResult input) {
          return IPulseJobUpdateResult.build(input);
        }
      };

  public static ImmutableList<PulseJobUpdateResult> toBuildersList(Iterable<IPulseJobUpdateResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IPulseJobUpdateResult> listFromBuilders(Iterable<PulseJobUpdateResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<PulseJobUpdateResult> toBuildersSet(Iterable<IPulseJobUpdateResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IPulseJobUpdateResult> setFromBuilders(Iterable<PulseJobUpdateResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public PulseJobUpdateResult newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetStatus() {
    return wrapped.isSetStatus();
  }

  public JobUpdatePulseStatus getStatus() {
    return wrapped.getStatus();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IPulseJobUpdateResult)) {
      return false;
    }
    IPulseJobUpdateResult other = (IPulseJobUpdateResult) o;
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
