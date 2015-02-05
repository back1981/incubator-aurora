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

/**
 * A request to add the following instances to an existing job. Used by addInstances.
 */
public class AddInstancesConfig implements org.apache.thrift.TBase<AddInstancesConfig, AddInstancesConfig._Fields>, java.io.Serializable, Cloneable, Comparable<AddInstancesConfig> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AddInstancesConfig");

  private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TASK_CONFIG_FIELD_DESC = new org.apache.thrift.protocol.TField("taskConfig", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField INSTANCE_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("instanceIds", org.apache.thrift.protocol.TType.SET, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AddInstancesConfigStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AddInstancesConfigTupleSchemeFactory());
  }

  private JobKey key; // required
  private TaskConfig taskConfig; // required
  private Set<Integer> instanceIds; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    KEY((short)1, "key"),
    TASK_CONFIG((short)2, "taskConfig"),
    INSTANCE_IDS((short)3, "instanceIds");

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
        case 1: // KEY
          return KEY;
        case 2: // TASK_CONFIG
          return TASK_CONFIG;
        case 3: // INSTANCE_IDS
          return INSTANCE_IDS;
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
    tmpMap.put(_Fields.KEY, new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JobKey.class)));
    tmpMap.put(_Fields.TASK_CONFIG, new org.apache.thrift.meta_data.FieldMetaData("taskConfig", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TaskConfig.class)));
    tmpMap.put(_Fields.INSTANCE_IDS, new org.apache.thrift.meta_data.FieldMetaData("instanceIds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AddInstancesConfig.class, metaDataMap);
  }

  public AddInstancesConfig() {
  }

  public AddInstancesConfig(
    JobKey key,
    TaskConfig taskConfig,
    Set<Integer> instanceIds)
  {
    this();
    this.key = key;
    this.taskConfig = taskConfig;
    this.instanceIds = instanceIds;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddInstancesConfig(AddInstancesConfig other) {
    if (other.isSetKey()) {
      this.key = new JobKey(other.key);
    }
    if (other.isSetTaskConfig()) {
      this.taskConfig = new TaskConfig(other.taskConfig);
    }
    if (other.isSetInstanceIds()) {
      Set<Integer> __this__instanceIds = new HashSet<Integer>(other.instanceIds);
      this.instanceIds = __this__instanceIds;
    }
  }

  public AddInstancesConfig deepCopy() {
    return new AddInstancesConfig(this);
  }

  @Override
  public void clear() {
    this.key = null;
    this.taskConfig = null;
    this.instanceIds = null;
  }

  public JobKey getKey() {
    return this.key;
  }

  public AddInstancesConfig setKey(JobKey key) {
    this.key = key;
    return this;
  }

  public void unsetKey() {
    this.key = null;
  }

  /** Returns true if field key is set (has been assigned a value) and false otherwise */
  public boolean isSetKey() {
    return this.key != null;
  }

  public void setKeyIsSet(boolean value) {
    if (!value) {
      this.key = null;
    }
  }

  public TaskConfig getTaskConfig() {
    return this.taskConfig;
  }

  public AddInstancesConfig setTaskConfig(TaskConfig taskConfig) {
    this.taskConfig = taskConfig;
    return this;
  }

  public void unsetTaskConfig() {
    this.taskConfig = null;
  }

  /** Returns true if field taskConfig is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskConfig() {
    return this.taskConfig != null;
  }

  public void setTaskConfigIsSet(boolean value) {
    if (!value) {
      this.taskConfig = null;
    }
  }

  public int getInstanceIdsSize() {
    return (this.instanceIds == null) ? 0 : this.instanceIds.size();
  }

  public java.util.Iterator<Integer> getInstanceIdsIterator() {
    return (this.instanceIds == null) ? null : this.instanceIds.iterator();
  }

  public void addToInstanceIds(int elem) {
    if (this.instanceIds == null) {
      this.instanceIds = new HashSet<Integer>();
    }
    this.instanceIds.add(elem);
  }

  public Set<Integer> getInstanceIds() {
    return this.instanceIds;
  }

  public AddInstancesConfig setInstanceIds(Set<Integer> instanceIds) {
    this.instanceIds = instanceIds;
    return this;
  }

  public void unsetInstanceIds() {
    this.instanceIds = null;
  }

  /** Returns true if field instanceIds is set (has been assigned a value) and false otherwise */
  public boolean isSetInstanceIds() {
    return this.instanceIds != null;
  }

  public void setInstanceIdsIsSet(boolean value) {
    if (!value) {
      this.instanceIds = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case KEY:
      if (value == null) {
        unsetKey();
      } else {
        setKey((JobKey)value);
      }
      break;

    case TASK_CONFIG:
      if (value == null) {
        unsetTaskConfig();
      } else {
        setTaskConfig((TaskConfig)value);
      }
      break;

    case INSTANCE_IDS:
      if (value == null) {
        unsetInstanceIds();
      } else {
        setInstanceIds((Set<Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case KEY:
      return getKey();

    case TASK_CONFIG:
      return getTaskConfig();

    case INSTANCE_IDS:
      return getInstanceIds();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case KEY:
      return isSetKey();
    case TASK_CONFIG:
      return isSetTaskConfig();
    case INSTANCE_IDS:
      return isSetInstanceIds();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AddInstancesConfig)
      return this.equals((AddInstancesConfig)that);
    return false;
  }

  public boolean equals(AddInstancesConfig that) {
    if (that == null)
      return false;

    boolean this_present_key = true && this.isSetKey();
    boolean that_present_key = true && that.isSetKey();
    if (this_present_key || that_present_key) {
      if (!(this_present_key && that_present_key))
        return false;
      if (!this.key.equals(that.key))
        return false;
    }

    boolean this_present_taskConfig = true && this.isSetTaskConfig();
    boolean that_present_taskConfig = true && that.isSetTaskConfig();
    if (this_present_taskConfig || that_present_taskConfig) {
      if (!(this_present_taskConfig && that_present_taskConfig))
        return false;
      if (!this.taskConfig.equals(that.taskConfig))
        return false;
    }

    boolean this_present_instanceIds = true && this.isSetInstanceIds();
    boolean that_present_instanceIds = true && that.isSetInstanceIds();
    if (this_present_instanceIds || that_present_instanceIds) {
      if (!(this_present_instanceIds && that_present_instanceIds))
        return false;
      if (!this.instanceIds.equals(that.instanceIds))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_key = true && (isSetKey());
    builder.append(present_key);
    if (present_key)
      builder.append(key);

    boolean present_taskConfig = true && (isSetTaskConfig());
    builder.append(present_taskConfig);
    if (present_taskConfig)
      builder.append(taskConfig);

    boolean present_instanceIds = true && (isSetInstanceIds());
    builder.append(present_instanceIds);
    if (present_instanceIds)
      builder.append(instanceIds);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(AddInstancesConfig other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetKey()).compareTo(other.isSetKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key, other.key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTaskConfig()).compareTo(other.isSetTaskConfig());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskConfig()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskConfig, other.taskConfig);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInstanceIds()).compareTo(other.isSetInstanceIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInstanceIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.instanceIds, other.instanceIds);
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
    StringBuilder sb = new StringBuilder("AddInstancesConfig(");
    boolean first = true;

    sb.append("key:");
    if (this.key == null) {
      sb.append("null");
    } else {
      sb.append(this.key);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("taskConfig:");
    if (this.taskConfig == null) {
      sb.append("null");
    } else {
      sb.append(this.taskConfig);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("instanceIds:");
    if (this.instanceIds == null) {
      sb.append("null");
    } else {
      sb.append(this.instanceIds);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (key != null) {
      key.validate();
    }
    if (taskConfig != null) {
      taskConfig.validate();
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

  private static class AddInstancesConfigStandardSchemeFactory implements SchemeFactory {
    public AddInstancesConfigStandardScheme getScheme() {
      return new AddInstancesConfigStandardScheme();
    }
  }

  private static class AddInstancesConfigStandardScheme extends StandardScheme<AddInstancesConfig> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AddInstancesConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.key = new JobKey();
              struct.key.read(iprot);
              struct.setKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TASK_CONFIG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.taskConfig = new TaskConfig();
              struct.taskConfig.read(iprot);
              struct.setTaskConfigIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INSTANCE_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set60 = iprot.readSetBegin();
                struct.instanceIds = new HashSet<Integer>(2*_set60.size);
                for (int _i61 = 0; _i61 < _set60.size; ++_i61)
                {
                  int _elem62;
                  _elem62 = iprot.readI32();
                  struct.instanceIds.add(_elem62);
                }
                iprot.readSetEnd();
              }
              struct.setInstanceIdsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AddInstancesConfig struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.key != null) {
        oprot.writeFieldBegin(KEY_FIELD_DESC);
        struct.key.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.taskConfig != null) {
        oprot.writeFieldBegin(TASK_CONFIG_FIELD_DESC);
        struct.taskConfig.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.instanceIds != null) {
        oprot.writeFieldBegin(INSTANCE_IDS_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, struct.instanceIds.size()));
          for (int _iter63 : struct.instanceIds)
          {
            oprot.writeI32(_iter63);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AddInstancesConfigTupleSchemeFactory implements SchemeFactory {
    public AddInstancesConfigTupleScheme getScheme() {
      return new AddInstancesConfigTupleScheme();
    }
  }

  private static class AddInstancesConfigTupleScheme extends TupleScheme<AddInstancesConfig> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AddInstancesConfig struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetKey()) {
        optionals.set(0);
      }
      if (struct.isSetTaskConfig()) {
        optionals.set(1);
      }
      if (struct.isSetInstanceIds()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetKey()) {
        struct.key.write(oprot);
      }
      if (struct.isSetTaskConfig()) {
        struct.taskConfig.write(oprot);
      }
      if (struct.isSetInstanceIds()) {
        {
          oprot.writeI32(struct.instanceIds.size());
          for (int _iter64 : struct.instanceIds)
          {
            oprot.writeI32(_iter64);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AddInstancesConfig struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.key = new JobKey();
        struct.key.read(iprot);
        struct.setKeyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.taskConfig = new TaskConfig();
        struct.taskConfig.read(iprot);
        struct.setTaskConfigIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TSet _set65 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.instanceIds = new HashSet<Integer>(2*_set65.size);
          for (int _i66 = 0; _i66 < _set65.size; ++_i66)
          {
            int _elem67;
            _elem67 = iprot.readI32();
            struct.instanceIds.add(_elem67);
          }
        }
        struct.setInstanceIdsIsSet(true);
      }
    }
  }

}

