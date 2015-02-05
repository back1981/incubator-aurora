/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.aurora.gen;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class apiConstants {

  public static final int THRIFT_API_VERSION = 3;

  public static final APIVersion CURRENT_API_VERSION = new APIVersion();
  static {
    CURRENT_API_VERSION.setMajor(3);
  }

  public static final String AURORA_EXECUTOR_NAME = "AuroraExecutor";

  public static final Set<ScheduleStatus> ACTIVE_STATES = new HashSet<ScheduleStatus>();
  static {
    ACTIVE_STATES.add(org.apache.aurora.gen.ScheduleStatus.ASSIGNED);
    ACTIVE_STATES.add(org.apache.aurora.gen.ScheduleStatus.DRAINING);
    ACTIVE_STATES.add(org.apache.aurora.gen.ScheduleStatus.KILLING);
    ACTIVE_STATES.add(org.apache.aurora.gen.ScheduleStatus.PENDING);
    ACTIVE_STATES.add(org.apache.aurora.gen.ScheduleStatus.PREEMPTING);
    ACTIVE_STATES.add(org.apache.aurora.gen.ScheduleStatus.RESTARTING);
    ACTIVE_STATES.add(org.apache.aurora.gen.ScheduleStatus.RUNNING);
    ACTIVE_STATES.add(org.apache.aurora.gen.ScheduleStatus.STARTING);
    ACTIVE_STATES.add(org.apache.aurora.gen.ScheduleStatus.THROTTLED);
  }

  public static final Set<ScheduleStatus> SLAVE_ASSIGNED_STATES = new HashSet<ScheduleStatus>();
  static {
    SLAVE_ASSIGNED_STATES.add(org.apache.aurora.gen.ScheduleStatus.ASSIGNED);
    SLAVE_ASSIGNED_STATES.add(org.apache.aurora.gen.ScheduleStatus.DRAINING);
    SLAVE_ASSIGNED_STATES.add(org.apache.aurora.gen.ScheduleStatus.KILLING);
    SLAVE_ASSIGNED_STATES.add(org.apache.aurora.gen.ScheduleStatus.PREEMPTING);
    SLAVE_ASSIGNED_STATES.add(org.apache.aurora.gen.ScheduleStatus.RESTARTING);
    SLAVE_ASSIGNED_STATES.add(org.apache.aurora.gen.ScheduleStatus.RUNNING);
    SLAVE_ASSIGNED_STATES.add(org.apache.aurora.gen.ScheduleStatus.STARTING);
  }

  public static final Set<ScheduleStatus> LIVE_STATES = new HashSet<ScheduleStatus>();
  static {
    LIVE_STATES.add(org.apache.aurora.gen.ScheduleStatus.KILLING);
    LIVE_STATES.add(org.apache.aurora.gen.ScheduleStatus.PREEMPTING);
    LIVE_STATES.add(org.apache.aurora.gen.ScheduleStatus.RESTARTING);
    LIVE_STATES.add(org.apache.aurora.gen.ScheduleStatus.DRAINING);
    LIVE_STATES.add(org.apache.aurora.gen.ScheduleStatus.RUNNING);
  }

  public static final Set<ScheduleStatus> TERMINAL_STATES = new HashSet<ScheduleStatus>();
  static {
    TERMINAL_STATES.add(org.apache.aurora.gen.ScheduleStatus.FAILED);
    TERMINAL_STATES.add(org.apache.aurora.gen.ScheduleStatus.FINISHED);
    TERMINAL_STATES.add(org.apache.aurora.gen.ScheduleStatus.KILLED);
    TERMINAL_STATES.add(org.apache.aurora.gen.ScheduleStatus.LOST);
  }

  public static final String GOOD_IDENTIFIER_PATTERN = "^[\\w\\-\\.]+$";

  public static final String GOOD_IDENTIFIER_PATTERN_JVM = "^[\\w\\-\\.]+$";

  public static final String GOOD_IDENTIFIER_PATTERN_PYTHON = "^[\\w\\-\\.]+$";

  /**
   * States the job update can be in while still considered active.
   */
  public static final Set<JobUpdateStatus> ACTIVE_JOB_UPDATE_STATES = new HashSet<JobUpdateStatus>();
  static {
    ACTIVE_JOB_UPDATE_STATES.add(org.apache.aurora.gen.JobUpdateStatus.ROLLING_FORWARD);
    ACTIVE_JOB_UPDATE_STATES.add(org.apache.aurora.gen.JobUpdateStatus.ROLLING_BACK);
    ACTIVE_JOB_UPDATE_STATES.add(org.apache.aurora.gen.JobUpdateStatus.ROLL_FORWARD_PAUSED);
    ACTIVE_JOB_UPDATE_STATES.add(org.apache.aurora.gen.JobUpdateStatus.ROLL_BACK_PAUSED);
  }

}