package org.apache.aurora.scheduler.storage.entities;

import java.util.Objects;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.apache.aurora.gen.Result;

/**
 * An immutable wrapper class.
 * <p>
 * This code is auto-generated, and should not be directly modified.
 */
public final class IResult {
  private final Result wrapped;
  private int cachedHashCode = 0;

  private IResult(Result wrapped) {
    this.wrapped = Objects.requireNonNull(wrapped);
  }

  static IResult buildNoCopy(Result wrapped) {
    return new IResult(wrapped);
  }

  public static IResult build(Result wrapped) {
    return buildNoCopy(wrapped.deepCopy());
  }

  public static final Function<IResult, Result> TO_BUILDER =
      new Function<IResult, Result>() {
        @Override
        public Result apply(IResult input) {
          return input.newBuilder();
        }
      };

  public static final Function<Result, IResult> FROM_BUILDER =
      new Function<Result, IResult>() {
        @Override
        public IResult apply(Result input) {
          return IResult.build(input);
        }
      };

  public static ImmutableList<Result> toBuildersList(Iterable<IResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toList();
  }

  public static ImmutableList<IResult> listFromBuilders(Iterable<Result> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toList();
  }

  public static ImmutableSet<Result> toBuildersSet(Iterable<IResult> w) {
    return FluentIterable.from(w).transform(TO_BUILDER).toSet();
  }

  public static ImmutableSet<IResult> setFromBuilders(Iterable<Result> b) {
    return FluentIterable.from(b).transform(FROM_BUILDER).toSet();
  }

  public Result newBuilder() {
    return wrapped.deepCopy();
  }

  public Result._Fields getSetField() {
    return wrapped.getSetField();
  }

  public boolean isSetPopulateJobResult() {
    return wrapped.isSetPopulateJobResult();
  }

  public IPopulateJobResult getPopulateJobResult() {
    return IPopulateJobResult.build(wrapped.getPopulateJobResult());
  }

  public boolean isSetScheduleStatusResult() {
    return wrapped.isSetScheduleStatusResult();
  }

  public IScheduleStatusResult getScheduleStatusResult() {
    return IScheduleStatusResult.build(wrapped.getScheduleStatusResult());
  }

  public boolean isSetGetJobsResult() {
    return wrapped.isSetGetJobsResult();
  }

  public IGetJobsResult getGetJobsResult() {
    return IGetJobsResult.build(wrapped.getGetJobsResult());
  }

  public boolean isSetGetQuotaResult() {
    return wrapped.isSetGetQuotaResult();
  }

  public IGetQuotaResult getGetQuotaResult() {
    return IGetQuotaResult.build(wrapped.getGetQuotaResult());
  }

  public boolean isSetListBackupsResult() {
    return wrapped.isSetListBackupsResult();
  }

  public IListBackupsResult getListBackupsResult() {
    return IListBackupsResult.build(wrapped.getListBackupsResult());
  }

  public boolean isSetStartMaintenanceResult() {
    return wrapped.isSetStartMaintenanceResult();
  }

  public IStartMaintenanceResult getStartMaintenanceResult() {
    return IStartMaintenanceResult.build(wrapped.getStartMaintenanceResult());
  }

  public boolean isSetDrainHostsResult() {
    return wrapped.isSetDrainHostsResult();
  }

  public IDrainHostsResult getDrainHostsResult() {
    return IDrainHostsResult.build(wrapped.getDrainHostsResult());
  }

  public boolean isSetQueryRecoveryResult() {
    return wrapped.isSetQueryRecoveryResult();
  }

  public IQueryRecoveryResult getQueryRecoveryResult() {
    return IQueryRecoveryResult.build(wrapped.getQueryRecoveryResult());
  }

  public boolean isSetMaintenanceStatusResult() {
    return wrapped.isSetMaintenanceStatusResult();
  }

  public IMaintenanceStatusResult getMaintenanceStatusResult() {
    return IMaintenanceStatusResult.build(wrapped.getMaintenanceStatusResult());
  }

  public boolean isSetEndMaintenanceResult() {
    return wrapped.isSetEndMaintenanceResult();
  }

  public IEndMaintenanceResult getEndMaintenanceResult() {
    return IEndMaintenanceResult.build(wrapped.getEndMaintenanceResult());
  }

  public boolean isSetGetVersionResult() {
    return wrapped.isSetGetVersionResult();
  }

  public IAPIVersion getGetVersionResult() {
    return IAPIVersion.build(wrapped.getGetVersionResult());
  }

  public boolean isSetAcquireLockResult() {
    return wrapped.isSetAcquireLockResult();
  }

  public IAcquireLockResult getAcquireLockResult() {
    return IAcquireLockResult.build(wrapped.getAcquireLockResult());
  }

  public boolean isSetRoleSummaryResult() {
    return wrapped.isSetRoleSummaryResult();
  }

  public IRoleSummaryResult getRoleSummaryResult() {
    return IRoleSummaryResult.build(wrapped.getRoleSummaryResult());
  }

  public boolean isSetJobSummaryResult() {
    return wrapped.isSetJobSummaryResult();
  }

  public IJobSummaryResult getJobSummaryResult() {
    return IJobSummaryResult.build(wrapped.getJobSummaryResult());
  }

  public boolean isSetGetLocksResult() {
    return wrapped.isSetGetLocksResult();
  }

  public IGetLocksResult getGetLocksResult() {
    return IGetLocksResult.build(wrapped.getGetLocksResult());
  }

  public boolean isSetConfigSummaryResult() {
    return wrapped.isSetConfigSummaryResult();
  }

  public IConfigSummaryResult getConfigSummaryResult() {
    return IConfigSummaryResult.build(wrapped.getConfigSummaryResult());
  }

  public boolean isSetGetPendingReasonResult() {
    return wrapped.isSetGetPendingReasonResult();
  }

  public IGetPendingReasonResult getGetPendingReasonResult() {
    return IGetPendingReasonResult.build(wrapped.getGetPendingReasonResult());
  }

  public boolean isSetStartJobUpdateResult() {
    return wrapped.isSetStartJobUpdateResult();
  }

  public IStartJobUpdateResult getStartJobUpdateResult() {
    return IStartJobUpdateResult.build(wrapped.getStartJobUpdateResult());
  }

  public boolean isSetGetJobUpdateSummariesResult() {
    return wrapped.isSetGetJobUpdateSummariesResult();
  }

  public IGetJobUpdateSummariesResult getGetJobUpdateSummariesResult() {
    return IGetJobUpdateSummariesResult.build(wrapped.getGetJobUpdateSummariesResult());
  }

  public boolean isSetGetJobUpdateDetailsResult() {
    return wrapped.isSetGetJobUpdateDetailsResult();
  }

  public IGetJobUpdateDetailsResult getGetJobUpdateDetailsResult() {
    return IGetJobUpdateDetailsResult.build(wrapped.getGetJobUpdateDetailsResult());
  }

  public boolean isSetPulseJobUpdateResult() {
    return wrapped.isSetPulseJobUpdateResult();
  }

  public IPulseJobUpdateResult getPulseJobUpdateResult() {
    return IPulseJobUpdateResult.build(wrapped.getPulseJobUpdateResult());
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof IResult)) {
      return false;
    }
    IResult other = (IResult) o;
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
