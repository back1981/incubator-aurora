/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.aurora.gen.storage;

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

public class RewriteTask implements org.apache.thrift.TBase<RewriteTask, RewriteTask._Fields>, java.io.Serializable, Cloneable, Comparable<RewriteTask> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RewriteTask");

  private static final org.apache.thrift.protocol.TField TASK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("taskId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TASK_FIELD_DESC = new org.apache.thrift.protocol.TField("task", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RewriteTaskStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RewriteTaskTupleSchemeFactory());
  }

  private String taskId; // required
  private org.apache.aurora.gen.TaskConfig task; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TASK_ID((short)1, "taskId"),
    TASK((short)2, "task");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TASK_ID
          return TASK_ID;
        case 2: // TASK
          return TASK;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASK_ID, new org.apache.thrift.meta_data.FieldMetaData("taskId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TASK, new org.apache.thrift.meta_data.FieldMetaData("task", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.aurora.gen.TaskConfig.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RewriteTask.class, metaDataMap);
  }

  public RewriteTask() {
  }

  public RewriteTask(
    String taskId,
    org.apache.aurora.gen.TaskConfig task)
  {
    this();
    this.taskId = taskId;
    this.task = task;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RewriteTask(RewriteTask other) {
    if (other.isSetTaskId()) {
      this.taskId = other.taskId;
    }
    if (other.isSetTask()) {
      this.task = new org.apache.aurora.gen.TaskConfig(other.task);
    }
  }

  public RewriteTask deepCopy() {
    return new RewriteTask(this);
  }

  @Override
  public void clear() {
    this.taskId = null;
    this.task = null;
  }

  public String getTaskId() {
    return this.taskId;
  }

  public RewriteTask setTaskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  public void unsetTaskId() {
    this.taskId = null;
  }

  /** Returns true if field taskId is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskId() {
    return this.taskId != null;
  }

  public void setTaskIdIsSet(boolean value) {
    if (!value) {
      this.taskId = null;
    }
  }

  public org.apache.aurora.gen.TaskConfig getTask() {
    return this.task;
  }

  public RewriteTask setTask(org.apache.aurora.gen.TaskConfig task) {
    this.task = task;
    return this;
  }

  public void unsetTask() {
    this.task = null;
  }

  /** Returns true if field task is set (has been assigned a value) and false otherwise */
  public boolean isSetTask() {
    return this.task != null;
  }

  public void setTaskIsSet(boolean value) {
    if (!value) {
      this.task = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TASK_ID:
      if (value == null) {
        unsetTaskId();
      } else {
        setTaskId((String)value);
      }
      break;

    case TASK:
      if (value == null) {
        unsetTask();
      } else {
        setTask((org.apache.aurora.gen.TaskConfig)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TASK_ID:
      return getTaskId();

    case TASK:
      return getTask();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TASK_ID:
      return isSetTaskId();
    case TASK:
      return isSetTask();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RewriteTask)
      return this.equals((RewriteTask)that);
    return false;
  }

  public boolean equals(RewriteTask that) {
    if (that == null)
      return false;

    boolean this_present_taskId = true && this.isSetTaskId();
    boolean that_present_taskId = true && that.isSetTaskId();
    if (this_present_taskId || that_present_taskId) {
      if (!(this_present_taskId && that_present_taskId))
        return false;
      if (!this.taskId.equals(that.taskId))
        return false;
    }

    boolean this_present_task = true && this.isSetTask();
    boolean that_present_task = true && that.isSetTask();
    if (this_present_task || that_present_task) {
      if (!(this_present_task && that_present_task))
        return false;
      if (!this.task.equals(that.task))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_taskId = true && (isSetTaskId());
    builder.append(present_taskId);
    if (present_taskId)
      builder.append(taskId);

    boolean present_task = true && (isSetTask());
    builder.append(present_task);
    if (present_task)
      builder.append(task);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(RewriteTask other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTaskId()).compareTo(other.isSetTaskId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskId, other.taskId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTask()).compareTo(other.isSetTask());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTask()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.task, other.task);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RewriteTask(");
    boolean first = true;

    sb.append("taskId:");
    if (this.taskId == null) {
      sb.append("null");
    } else {
      sb.append(this.taskId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("task:");
    if (this.task == null) {
      sb.append("null");
    } else {
      sb.append(this.task);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (task != null) {
      task.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RewriteTaskStandardSchemeFactory implements SchemeFactory {
    public RewriteTaskStandardScheme getScheme() {
      return new RewriteTaskStandardScheme();
    }
  }

  private static class RewriteTaskStandardScheme extends StandardScheme<RewriteTask> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RewriteTask struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TASK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.taskId = iprot.readString();
              struct.setTaskIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TASK
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.task = new org.apache.aurora.gen.TaskConfig();
              struct.task.read(iprot);
              struct.setTaskIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RewriteTask struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.taskId != null) {
        oprot.writeFieldBegin(TASK_ID_FIELD_DESC);
        oprot.writeString(struct.taskId);
        oprot.writeFieldEnd();
      }
      if (struct.task != null) {
        oprot.writeFieldBegin(TASK_FIELD_DESC);
        struct.task.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RewriteTaskTupleSchemeFactory implements SchemeFactory {
    public RewriteTaskTupleScheme getScheme() {
      return new RewriteTaskTupleScheme();
    }
  }

  private static class RewriteTaskTupleScheme extends TupleScheme<RewriteTask> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RewriteTask struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTaskId()) {
        optionals.set(0);
      }
      if (struct.isSetTask()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTaskId()) {
        oprot.writeString(struct.taskId);
      }
      if (struct.isSetTask()) {
        struct.task.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RewriteTask struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.taskId = iprot.readString();
        struct.setTaskIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.task = new org.apache.aurora.gen.TaskConfig();
        struct.task.read(iprot);
        struct.setTaskIsSet(true);
      }
    }
  }

}
