package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.GetQuotaResult;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IGetQuotaResult {
  private final GetQuotaResult wrapped;
  private int cachedHashCode = 0;
  private final IResourceAggregate quota;
  private final IResourceAggregate prodConsumption;
  private final IResourceAggregate nonProdConsumption;

  private IGetQuotaResult(GetQuotaResult wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.quota = !wrapped.isSetQuota()
        ? null
        : IResourceAggregate.buildNoCopy(wrapped.getQuota());
    this.prodConsumption = !wrapped.isSetProdConsumption()
        ? null
        : IResourceAggregate.buildNoCopy(wrapped.getProdConsumption());
    this.nonProdConsumption = !wrapped.isSetNonProdConsumption()
        ? null
        : IResourceAggregate.buildNoCopy(wrapped.getNonProdConsumption());
  }

  static IGetQuotaResult buildNoCopy(GetQuotaResult wrapped) {
    return new IGetQuotaResult(wrapped);
  }

  public static IGetQuotaResult build(GetQuotaResult wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IGetQuotaResult, GetQuotaResult> TO_BUILDER =
      new Function<IGetQuotaResult, GetQuotaResult>() {
        @Override
        public GetQuotaResult apply(IGetQuotaResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<GetQuotaResult, IGetQuotaResult> FROM_BUILDER =
      new Function<GetQuotaResult, IGetQuotaResult>() {
        @Override
        public IGetQuotaResult apply(GetQuotaResult input) {
          return IGetQuotaResult.build(input);
        }
      };

  public static ImmutableList<GetQuotaResult> toBuildersList(Iterable<IGetQuotaResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IGetQuotaResult> listFromBuilders(Iterable<GetQuotaResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<GetQuotaResult> toBuildersSet(Iterable<IGetQuotaResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IGetQuotaResult> setFromBuilders(Iterable<GetQuotaResult> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public GetQuotaResult newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetQuota() {
    return wrapped.isSetQuota();
  }

  public IResourceAggregate getQuota() {
    return quota;
  }

  public boolean isSetProdConsumption() {
    return wrapped.isSetProdConsumption();
  }

  public IResourceAggregate getProdConsumption() {
    return prodConsumption;
  }

  public boolean isSetNonProdConsumption() {
    return wrapped.isSetNonProdConsumption();
  }

  public IResourceAggregate getNonProdConsumption() {
    return nonProdConsumption;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IGetQuotaResult)) {
      return false;
    }
    IGetQuotaResult other = (IGetQuotaResult) o;
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
