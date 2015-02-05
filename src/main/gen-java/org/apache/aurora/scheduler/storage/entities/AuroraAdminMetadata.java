package org.apache.aurora.scheduler.storage.entities;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.ImmutableMap;
import com.google.gson.reflect.TypeToken;

import org.apache.aurora.gen.*;

public final class AuroraAdminMetadata {
  public static final Map<String, Map<String, Type>> METHODS =
      ImmutableMap.<String, Map<String, Type>>builder()
          .put(
              "setQuota",
              ImmutableMap.<String, Type>builder()
                  .put("ownerRole", String.class)
                  .put("quota", ResourceAggregate.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "forceTaskState",
              ImmutableMap.<String, Type>builder()
                  .put("taskId", String.class)
                  .put("status", ScheduleStatus.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "performBackup",
              ImmutableMap.<String, Type>builder()
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "listBackups",
              ImmutableMap.<String, Type>builder()
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "stageRecovery",
              ImmutableMap.<String, Type>builder()
                  .put("backupId", String.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "queryRecovery",
              ImmutableMap.<String, Type>builder()
                  .put("query", TaskQuery.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "deleteRecoveryTasks",
              ImmutableMap.<String, Type>builder()
                  .put("query", TaskQuery.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "commitRecovery",
              ImmutableMap.<String, Type>builder()
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "unloadRecovery",
              ImmutableMap.<String, Type>builder()
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "startMaintenance",
              ImmutableMap.<String, Type>builder()
                  .put("hosts", Hosts.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "drainHosts",
              ImmutableMap.<String, Type>builder()
                  .put("hosts", Hosts.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "maintenanceStatus",
              ImmutableMap.<String, Type>builder()
                  .put("hosts", Hosts.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "endMaintenance",
              ImmutableMap.<String, Type>builder()
                  .put("hosts", Hosts.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "snapshot",
              ImmutableMap.<String, Type>builder()
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "rewriteConfigs",
              ImmutableMap.<String, Type>builder()
                  .put("request", RewriteConfigsRequest.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "createJob",
              ImmutableMap.<String, Type>builder()
                  .put("description", JobConfiguration.class)
                  .put("lock", Lock.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "scheduleCronJob",
              ImmutableMap.<String, Type>builder()
                  .put("description", JobConfiguration.class)
                  .put("lock", Lock.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "descheduleCronJob",
              ImmutableMap.<String, Type>builder()
                  .put("job", JobKey.class)
                  .put("lock", Lock.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "startCronJob",
              ImmutableMap.<String, Type>builder()
                  .put("job", JobKey.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "restartShards",
              ImmutableMap.<String, Type>builder()
                  .put("job", JobKey.class)
                  .put("shardIds", new TypeToken<Set<Integer>>() {}.getType())
                  .put("lock", Lock.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "killTasks",
              ImmutableMap.<String, Type>builder()
                  .put("query", TaskQuery.class)
                  .put("lock", Lock.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "addInstances",
              ImmutableMap.<String, Type>builder()
                  .put("config", AddInstancesConfig.class)
                  .put("lock", Lock.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "acquireLock",
              ImmutableMap.<String, Type>builder()
                  .put("lockKey", LockKey.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "releaseLock",
              ImmutableMap.<String, Type>builder()
                  .put("lock", Lock.class)
                  .put("validation", LockValidation.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "replaceCronTemplate",
              ImmutableMap.<String, Type>builder()
                  .put("config", JobConfiguration.class)
                  .put("lock", Lock.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "startJobUpdate",
              ImmutableMap.<String, Type>builder()
                  .put("request", JobUpdateRequest.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "pauseJobUpdate",
              ImmutableMap.<String, Type>builder()
                  .put("jobKey", JobKey.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "resumeJobUpdate",
              ImmutableMap.<String, Type>builder()
                  .put("jobKey", JobKey.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "abortJobUpdate",
              ImmutableMap.<String, Type>builder()
                  .put("jobKey", JobKey.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "pulseJobUpdate",
              ImmutableMap.<String, Type>builder()
                  .put("updateId", String.class)
                  .put("session", SessionKey.class)
                  .build())
          .put(
              "getRoleSummary",
              ImmutableMap.<String, Type>builder()
                  .build())
          .put(
              "getJobSummary",
              ImmutableMap.<String, Type>builder()
                  .put("role", String.class)
                  .build())
          .put(
              "getTasksStatus",
              ImmutableMap.<String, Type>builder()
                  .put("query", TaskQuery.class)
                  .build())
          .put(
              "getTasksWithoutConfigs",
              ImmutableMap.<String, Type>builder()
                  .put("query", TaskQuery.class)
                  .build())
          .put(
              "getPendingReason",
              ImmutableMap.<String, Type>builder()
                  .put("query", TaskQuery.class)
                  .build())
          .put(
              "getConfigSummary",
              ImmutableMap.<String, Type>builder()
                  .put("job", JobKey.class)
                  .build())
          .put(
              "getJobs",
              ImmutableMap.<String, Type>builder()
                  .put("ownerRole", String.class)
                  .build())
          .put(
              "getQuota",
              ImmutableMap.<String, Type>builder()
                  .put("ownerRole", String.class)
                  .build())
          .put(
              "populateJobConfig",
              ImmutableMap.<String, Type>builder()
                  .put("description", JobConfiguration.class)
                  .build())
          .put(
              "getLocks",
              ImmutableMap.<String, Type>builder()
                  .build())
          .put(
              "getJobUpdateSummaries",
              ImmutableMap.<String, Type>builder()
                  .put("jobUpdateQuery", JobUpdateQuery.class)
                  .build())
          .put(
              "getJobUpdateDetails",
              ImmutableMap.<String, Type>builder()
                  .put("updateId", String.class)
                  .build())
          .build();

  private AuroraAdminMetadata() {
    // Utility class
  }
}

