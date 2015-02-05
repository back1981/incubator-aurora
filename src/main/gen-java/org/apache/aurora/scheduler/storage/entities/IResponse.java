package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.Response;
import org.apache.aurora.gen.ResponseCode;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IResponse {
  private final Response wrapped;
  private int cachedHashCode = 0;
  private final IServerInfo serverInfo;
  private final IResult result;
  private final ImmutableList<IResponseDetail> details;

  private IResponse(Response wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
    this.serverInfo = !wrapped.isSetServerInfo()
        ? null
        : IServerInfo.buildNoCopy(wrapped.getServerInfo());
    this.result = !wrapped.isSetResult()
        ? null
        : IResult.buildNoCopy(wrapped.getResult());
    this.details = !wrapped.isSetDetails()
        ? ImmutableList.<IResponseDetail>of()
        : FluentIterable.from(wrapped.getDetails())
              .transform(IResponseDetail.FROM_BUILDER)
              .toList();
  }

  static IResponse buildNoCopy(Response wrapped) {
    return new IResponse(wrapped);
  }

  public static IResponse build(Response wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IResponse, Response> TO_BUILDER =
      new Function<IResponse, Response>() {
        @Override
        public Response apply(IResponse input) {
          return input.newBuilder();
        }
      };

  public static final Function<Response, IResponse> FROM_BUILDER =
      new Function<Response, IResponse>() {
        @Override
        public IResponse apply(Response input) {
          return IResponse.build(input);
        }
      };

  public static ImmutableList<Response> toBuildersList(Iterable<IResponse> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IResponse> listFromBuilders(Iterable<Response> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<Response> toBuildersSet(Iterable<IResponse> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IResponse> setFromBuilders(Iterable<Response> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public Response newBuilder() {
    return wrapped.deepCopy();
  }

  public boolean isSetResponseCode() {
    return wrapped.isSetResponseCode();
  }

  public ResponseCode getResponseCode() {
    return wrapped.getResponseCode();
  }

  public boolean isSetServerInfo() {
    return wrapped.isSetServerInfo();
  }

  public IServerInfo getServerInfo() {
    return serverInfo;
  }

  public boolean isSetResult() {
    return wrapped.isSetResult();
  }

  public IResult getResult() {
    return result;
  }

  public boolean isSetDetails() {
    return wrapped.isSetDetails();
  }

  public ImmutableList<IResponseDetail> getDetails() {
    return details;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IResponse)) {
      return false;
    }
    IResponse other = (IResponse) o;
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
