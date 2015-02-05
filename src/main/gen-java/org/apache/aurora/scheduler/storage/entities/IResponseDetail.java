package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.ResponseDetail;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IResponseDetail {
  private final ResponseDetail wrapped;
  private int cachedHashCode = 0;

  private IResponseDetail(ResponseDetail wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IResponseDetail buildNoCopy(ResponseDetail wrapped) {
    return new IResponseDetail(wrapped);
  }

  public static IResponseDetail build(ResponseDetail wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IResponseDetail, ResponseDetail> TO_BUILDER =
      new Function<IResponseDetail, ResponseDetail>() {
        @Override
        public ResponseDetail apply(IResponseDetail input) {
          return input.newBuilder();
        }
      };

  public static final Function<ResponseDetail, IResponseDetail> FROM_BUILDER =
      new Function<ResponseDetail, IResponseDetail>() {
        @Override
        public IResponseDetail apply(ResponseDetail input) {
          return IResponseDetail.build(input);
        }
      };

  public static ImmutableList<ResponseDetail> toBuildersList(Iterable<IResponseDetail> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IResponseDetail> listFromBuilders(Iterable<ResponseDetail> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<ResponseDetail> toBuildersSet(Iterable<IResponseDetail> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IResponseDetail> setFromBuilders(Iterable<ResponseDetail> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public ResponseDetail newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetMessage() {
    return wrapped.isSetMessage();
  }

  public String getMessage() {
    return wrapped.getMessage();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IResponseDetail)) {
      return false;
    }
    IResponseDetail other = (IResponseDetail) o;
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
