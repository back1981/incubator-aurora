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

public class DeduplicatedSnapshot implements org.apache.thrift.TBase<DeduplicatedSnapshot, DeduplicatedSnapshot._Fields>, java.io.Serializable, Cloneable, Comparable<DeduplicatedSnapshot> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DeduplicatedSnapshot");

  private static final org.apache.thrift.protocol.TField PARTIAL_SNAPSHOT_FIELD_DESC = new org.apache.thrift.protocol.TField("partialSnapshot", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PARTIAL_TASKS_FIELD_DESC = new org.apache.thrift.protocol.TField("partialTasks", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField TASK_CONFIGS_FIELD_DESC = new org.apache.thrift.protocol.TField("taskConfigs", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeduplicatedSnapshotStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeduplicatedSnapshotTupleSchemeFactory());
  }

  private Snapshot partialSnapshot; // required
  private List<DeduplicatedScheduledTask> partialTasks; // required
  private List<org.apache.aurora.gen.TaskConfig> taskConfigs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARTIAL_SNAPSHOT((short)1, "partialSnapshot"),
    PARTIAL_TASKS((short)2, "partialTasks"),
    TASK_CONFIGS((short)3, "taskConfigs");

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
        case 1: // PARTIAL_SNAPSHOT
          return PARTIAL_SNAPSHOT;
        case 2: // PARTIAL_TASKS
          return PARTIAL_TASKS;
        case 3: // TASK_CONFIGS
          return TASK_CONFIGS;
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
    tmpMap.put(_Fields.PARTIAL_SNAPSHOT, new org.apache.thrift.meta_data.FieldMetaData("partialSnapshot", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Snapshot.class)));
    tmpMap.put(_Fields.PARTIAL_TASKS, new org.apache.thrift.meta_data.FieldMetaData("partialTasks", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DeduplicatedScheduledTask.class))));
    tmpMap.put(_Fields.TASK_CONFIGS, new org.apache.thrift.meta_data.FieldMetaData("taskConfigs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.aurora.gen.TaskConfig.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DeduplicatedSnapshot.class, metaDataMap);
  }

  public DeduplicatedSnapshot() {
  }

  public DeduplicatedSnapshot(
    Snapshot partialSnapshot,
    List<DeduplicatedScheduledTask> partialTasks,
    List<org.apache.aurora.gen.TaskConfig> taskConfigs)
  {
    this();
    this.partialSnapshot = partialSnapshot;
    this.partialTasks = partialTasks;
    this.taskConfigs = taskConfigs;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DeduplicatedSnapshot(DeduplicatedSnapshot other) {
    if (other.isSetPartialSnapshot()) {
      this.partialSnapshot = new Snapshot(other.partialSnapshot);
    }
    if (other.isSetPartialTasks()) {
      List<DeduplicatedScheduledTask> __this__partialTasks = new ArrayList<DeduplicatedScheduledTask>(other.partialTasks.size());
      for (DeduplicatedScheduledTask other_element : other.partialTasks) {
        __this__partialTasks.add(new DeduplicatedScheduledTask(other_element));
      }
      this.partialTasks = __this__partialTasks;
    }
    if (other.isSetTaskConfigs()) {
      List<org.apache.aurora.gen.TaskConfig> __this__taskConfigs = new ArrayList<org.apache.aurora.gen.TaskConfig>(other.taskConfigs.size());
      for (org.apache.aurora.gen.TaskConfig other_element : other.taskConfigs) {
        __this__taskConfigs.add(new org.apache.aurora.gen.TaskConfig(other_element));
      }
      this.taskConfigs = __this__taskConfigs;
    }
  }

  public DeduplicatedSnapshot deepCopy() {
    return new DeduplicatedSnapshot(this);
  }

  @Override
  public void clear() {
    this.partialSnapshot = null;
    this.partialTasks = null;
    this.taskConfigs = null;
  }

  public Snapshot getPartialSnapshot() {
    return this.partialSnapshot;
  }

  public DeduplicatedSnapshot setPartialSnapshot(Snapshot partialSnapshot) {
    this.partialSnapshot = partialSnapshot;
    return this;
  }

  public void unsetPartialSnapshot() {
    this.partialSnapshot = null;
  }

  /** Returns true if field partialSnapshot is set (has been assigned a value) and false otherwise */
  public boolean isSetPartialSnapshot() {
    return this.partialSnapshot != null;
  }

  public void setPartialSnapshotIsSet(boolean value) {
    if (!value) {
      this.partialSnapshot = null;
    }
  }

  public int getPartialTasksSize() {
    return (this.partialTasks == null) ? 0 : this.partialTasks.size();
  }

  public java.util.Iterator<DeduplicatedScheduledTask> getPartialTasksIterator() {
    return (this.partialTasks == null) ? null : this.partialTasks.iterator();
  }

  public void addToPartialTasks(DeduplicatedScheduledTask elem) {
    if (this.partialTasks == null) {
      this.partialTasks = new ArrayList<DeduplicatedScheduledTask>();
    }
    this.partialTasks.add(elem);
  }

  public List<DeduplicatedScheduledTask> getPartialTasks() {
    return this.partialTasks;
  }

  public DeduplicatedSnapshot setPartialTasks(List<DeduplicatedScheduledTask> partialTasks) {
    this.partialTasks = partialTasks;
    return this;
  }

  public void unsetPartialTasks() {
    this.partialTasks = null;
  }

  /** Returns true if field partialTasks is set (has been assigned a value) and false otherwise */
  public boolean isSetPartialTasks() {
    return this.partialTasks != null;
  }

  public void setPartialTasksIsSet(boolean value) {
    if (!value) {
      this.partialTasks = null;
    }
  }

  public int getTaskConfigsSize() {
    return (this.taskConfigs == null) ? 0 : this.taskConfigs.size();
  }

  public java.util.Iterator<org.apache.aurora.gen.TaskConfig> getTaskConfigsIterator() {
    return (this.taskConfigs == null) ? null : this.taskConfigs.iterator();
  }

  public void addToTaskConfigs(org.apache.aurora.gen.TaskConfig elem) {
    if (this.taskConfigs == null) {
      this.taskConfigs = new ArrayList<org.apache.aurora.gen.TaskConfig>();
    }
    this.taskConfigs.add(elem);
  }

  public List<org.apache.aurora.gen.TaskConfig> getTaskConfigs() {
    return this.taskConfigs;
  }

  public DeduplicatedSnapshot setTaskConfigs(List<org.apache.aurora.gen.TaskConfig> taskConfigs) {
    this.taskConfigs = taskConfigs;
    return this;
  }

  public void unsetTaskConfigs() {
    this.taskConfigs = null;
  }

  /** Returns true if field taskConfigs is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskConfigs() {
    return this.taskConfigs != null;
  }

  public void setTaskConfigsIsSet(boolean value) {
    if (!value) {
      this.taskConfigs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PARTIAL_SNAPSHOT:
      if (value == null) {
        unsetPartialSnapshot();
      } else {
        setPartialSnapshot((Snapshot)value);
      }
      break;

    case PARTIAL_TASKS:
      if (value == null) {
        unsetPartialTasks();
      } else {
        setPartialTasks((List<DeduplicatedScheduledTask>)value);
      }
      break;

    case TASK_CONFIGS:
      if (value == null) {
        unsetTaskConfigs();
      } else {
        setTaskConfigs((List<org.apache.aurora.gen.TaskConfig>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTIAL_SNAPSHOT:
      return getPartialSnapshot();

    case PARTIAL_TASKS:
      return getPartialTasks();

    case TASK_CONFIGS:
      return getTaskConfigs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PARTIAL_SNAPSHOT:
      return isSetPartialSnapshot();
    case PARTIAL_TASKS:
      return isSetPartialTasks();
    case TASK_CONFIGS:
      return isSetTaskConfigs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DeduplicatedSnapshot)
      return this.equals((DeduplicatedSnapshot)that);
    return false;
  }

  public boolean equals(DeduplicatedSnapshot that) {
    if (that == null)
      return false;

    boolean this_present_partialSnapshot = true && this.isSetPartialSnapshot();
    boolean that_present_partialSnapshot = true && that.isSetPartialSnapshot();
    if (this_present_partialSnapshot || that_present_partialSnapshot) {
      if (!(this_present_partialSnapshot && that_present_partialSnapshot))
        return false;
      if (!this.partialSnapshot.equals(that.partialSnapshot))
        return false;
    }

    boolean this_present_partialTasks = true && this.isSetPartialTasks();
    boolean that_present_partialTasks = true && that.isSetPartialTasks();
    if (this_present_partialTasks || that_present_partialTasks) {
      if (!(this_present_partialTasks && that_present_partialTasks))
        return false;
      if (!this.partialTasks.equals(that.partialTasks))
        return false;
    }

    boolean this_present_taskConfigs = true && this.isSetTaskConfigs();
    boolean that_present_taskConfigs = true && that.isSetTaskConfigs();
    if (this_present_taskConfigs || that_present_taskConfigs) {
      if (!(this_present_taskConfigs && that_present_taskConfigs))
        return false;
      if (!this.taskConfigs.equals(that.taskConfigs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_partialSnapshot = true && (isSetPartialSnapshot());
    builder.append(present_partialSnapshot);
    if (present_partialSnapshot)
      builder.append(partialSnapshot);

    boolean present_partialTasks = true && (isSetPartialTasks());
    builder.append(present_partialTasks);
    if (present_partialTasks)
      builder.append(partialTasks);

    boolean present_taskConfigs = true && (isSetTaskConfigs());
    builder.append(present_taskConfigs);
    if (present_taskConfigs)
      builder.append(taskConfigs);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(DeduplicatedSnapshot other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPartialSnapshot()).compareTo(other.isSetPartialSnapshot());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartialSnapshot()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partialSnapshot, other.partialSnapshot);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartialTasks()).compareTo(other.isSetPartialTasks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartialTasks()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partialTasks, other.partialTasks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTaskConfigs()).compareTo(other.isSetTaskConfigs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskConfigs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskConfigs, other.taskConfigs);
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
    StringBuilder sb = new StringBuilder("DeduplicatedSnapshot(");
    boolean first = true;

    sb.append("partialSnapshot:");
    if (this.partialSnapshot == null) {
      sb.append("null");
    } else {
      sb.append(this.partialSnapshot);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("partialTasks:");
    if (this.partialTasks == null) {
      sb.append("null");
    } else {
      sb.append(this.partialTasks);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("taskConfigs:");
    if (this.taskConfigs == null) {
      sb.append("null");
    } else {
      sb.append(this.taskConfigs);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (partialSnapshot != null) {
      partialSnapshot.validate();
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

  private static class DeduplicatedSnapshotStandardSchemeFactory implements SchemeFactory {
    public DeduplicatedSnapshotStandardScheme getScheme() {
      return new DeduplicatedSnapshotStandardScheme();
    }
  }

  private static class DeduplicatedSnapshotStandardScheme extends StandardScheme<DeduplicatedSnapshot> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DeduplicatedSnapshot struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTIAL_SNAPSHOT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.partialSnapshot = new Snapshot();
              struct.partialSnapshot.read(iprot);
              struct.setPartialSnapshotIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARTIAL_TASKS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list72 = iprot.readListBegin();
                struct.partialTasks = new ArrayList<DeduplicatedScheduledTask>(_list72.size);
                for (int _i73 = 0; _i73 < _list72.size; ++_i73)
                {
                  DeduplicatedScheduledTask _elem74;
                  _elem74 = new DeduplicatedScheduledTask();
                  _elem74.read(iprot);
                  struct.partialTasks.add(_elem74);
                }
                iprot.readListEnd();
              }
              struct.setPartialTasksIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TASK_CONFIGS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list75 = iprot.readListBegin();
                struct.taskConfigs = new ArrayList<org.apache.aurora.gen.TaskConfig>(_list75.size);
                for (int _i76 = 0; _i76 < _list75.size; ++_i76)
                {
                  org.apache.aurora.gen.TaskConfig _elem77;
                  _elem77 = new org.apache.aurora.gen.TaskConfig();
                  _elem77.read(iprot);
                  struct.taskConfigs.add(_elem77);
                }
                iprot.readListEnd();
              }
              struct.setTaskConfigsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DeduplicatedSnapshot struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.partialSnapshot != null) {
        oprot.writeFieldBegin(PARTIAL_SNAPSHOT_FIELD_DESC);
        struct.partialSnapshot.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.partialTasks != null) {
        oprot.writeFieldBegin(PARTIAL_TASKS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.partialTasks.size()));
          for (DeduplicatedScheduledTask _iter78 : struct.partialTasks)
          {
            _iter78.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.taskConfigs != null) {
        oprot.writeFieldBegin(TASK_CONFIGS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.taskConfigs.size()));
          for (org.apache.aurora.gen.TaskConfig _iter79 : struct.taskConfigs)
          {
            _iter79.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DeduplicatedSnapshotTupleSchemeFactory implements SchemeFactory {
    public DeduplicatedSnapshotTupleScheme getScheme() {
      return new DeduplicatedSnapshotTupleScheme();
    }
  }

  private static class DeduplicatedSnapshotTupleScheme extends TupleScheme<DeduplicatedSnapshot> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DeduplicatedSnapshot struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPartialSnapshot()) {
        optionals.set(0);
      }
      if (struct.isSetPartialTasks()) {
        optionals.set(1);
      }
      if (struct.isSetTaskConfigs()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetPartialSnapshot()) {
        struct.partialSnapshot.write(oprot);
      }
      if (struct.isSetPartialTasks()) {
        {
          oprot.writeI32(struct.partialTasks.size());
          for (DeduplicatedScheduledTask _iter80 : struct.partialTasks)
          {
            _iter80.write(oprot);
          }
        }
      }
      if (struct.isSetTaskConfigs()) {
        {
          oprot.writeI32(struct.taskConfigs.size());
          for (org.apache.aurora.gen.TaskConfig _iter81 : struct.taskConfigs)
          {
            _iter81.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DeduplicatedSnapshot struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.partialSnapshot = new Snapshot();
        struct.partialSnapshot.read(iprot);
        struct.setPartialSnapshotIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list82 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.partialTasks = new ArrayList<DeduplicatedScheduledTask>(_list82.size);
          for (int _i83 = 0; _i83 < _list82.size; ++_i83)
          {
            DeduplicatedScheduledTask _elem84;
            _elem84 = new DeduplicatedScheduledTask();
            _elem84.read(iprot);
            struct.partialTasks.add(_elem84);
          }
        }
        struct.setPartialTasksIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list85 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.taskConfigs = new ArrayList<org.apache.aurora.gen.TaskConfig>(_list85.size);
          for (int _i86 = 0; _i86 < _list85.size; ++_i86)
          {
            org.apache.aurora.gen.TaskConfig _elem87;
            _elem87 = new org.apache.aurora.gen.TaskConfig();
            _elem87.read(iprot);
            struct.taskConfigs.add(_elem87);
          }
        }
        struct.setTaskConfigsIsSet(true);
      }
    }
  }

}

