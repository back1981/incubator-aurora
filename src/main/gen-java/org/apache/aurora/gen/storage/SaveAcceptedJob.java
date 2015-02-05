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

public class SaveAcceptedJob implements org.apache.thrift.TBase<SaveAcceptedJob, SaveAcceptedJob._Fields>, java.io.Serializable, Cloneable, Comparable<SaveAcceptedJob> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SaveAcceptedJob");

  private static final org.apache.thrift.protocol.TField MANAGER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("managerId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField JOB_CONFIG_FIELD_DESC = new org.apache.thrift.protocol.TField("jobConfig", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SaveAcceptedJobStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SaveAcceptedJobTupleSchemeFactory());
  }

  private String managerId; // required
  private org.apache.aurora.gen.JobConfiguration jobConfig; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MANAGER_ID((short)1, "managerId"),
    JOB_CONFIG((short)2, "jobConfig");

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
        case 1: // MANAGER_ID
          return MANAGER_ID;
        case 2: // JOB_CONFIG
          return JOB_CONFIG;
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
    tmpMap.put(_Fields.MANAGER_ID, new org.apache.thrift.meta_data.FieldMetaData("managerId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.JOB_CONFIG, new org.apache.thrift.meta_data.FieldMetaData("jobConfig", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.aurora.gen.JobConfiguration.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SaveAcceptedJob.class, metaDataMap);
  }

  public SaveAcceptedJob() {
  }

  public SaveAcceptedJob(
    String managerId,
    org.apache.aurora.gen.JobConfiguration jobConfig)
  {
    this();
    this.managerId = managerId;
    this.jobConfig = jobConfig;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SaveAcceptedJob(SaveAcceptedJob other) {
    if (other.isSetManagerId()) {
      this.managerId = other.managerId;
    }
    if (other.isSetJobConfig()) {
      this.jobConfig = new org.apache.aurora.gen.JobConfiguration(other.jobConfig);
    }
  }

  public SaveAcceptedJob deepCopy() {
    return new SaveAcceptedJob(this);
  }

  @Override
  public void clear() {
    this.managerId = null;
    this.jobConfig = null;
  }

  public String getManagerId() {
    return this.managerId;
  }

  public SaveAcceptedJob setManagerId(String managerId) {
    this.managerId = managerId;
    return this;
  }

  public void unsetManagerId() {
    this.managerId = null;
  }

  /** Returns true if field managerId is set (has been assigned a value) and false otherwise */
  public boolean isSetManagerId() {
    return this.managerId != null;
  }

  public void setManagerIdIsSet(boolean value) {
    if (!value) {
      this.managerId = null;
    }
  }

  public org.apache.aurora.gen.JobConfiguration getJobConfig() {
    return this.jobConfig;
  }

  public SaveAcceptedJob setJobConfig(org.apache.aurora.gen.JobConfiguration jobConfig) {
    this.jobConfig = jobConfig;
    return this;
  }

  public void unsetJobConfig() {
    this.jobConfig = null;
  }

  /** Returns true if field jobConfig is set (has been assigned a value) and false otherwise */
  public boolean isSetJobConfig() {
    return this.jobConfig != null;
  }

  public void setJobConfigIsSet(boolean value) {
    if (!value) {
      this.jobConfig = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MANAGER_ID:
      if (value == null) {
        unsetManagerId();
      } else {
        setManagerId((String)value);
      }
      break;

    case JOB_CONFIG:
      if (value == null) {
        unsetJobConfig();
      } else {
        setJobConfig((org.apache.aurora.gen.JobConfiguration)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MANAGER_ID:
      return getManagerId();

    case JOB_CONFIG:
      return getJobConfig();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MANAGER_ID:
      return isSetManagerId();
    case JOB_CONFIG:
      return isSetJobConfig();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SaveAcceptedJob)
      return this.equals((SaveAcceptedJob)that);
    return false;
  }

  public boolean equals(SaveAcceptedJob that) {
    if (that == null)
      return false;

    boolean this_present_managerId = true && this.isSetManagerId();
    boolean that_present_managerId = true && that.isSetManagerId();
    if (this_present_managerId || that_present_managerId) {
      if (!(this_present_managerId && that_present_managerId))
        return false;
      if (!this.managerId.equals(that.managerId))
        return false;
    }

    boolean this_present_jobConfig = true && this.isSetJobConfig();
    boolean that_present_jobConfig = true && that.isSetJobConfig();
    if (this_present_jobConfig || that_present_jobConfig) {
      if (!(this_present_jobConfig && that_present_jobConfig))
        return false;
      if (!this.jobConfig.equals(that.jobConfig))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_managerId = true && (isSetManagerId());
    builder.append(present_managerId);
    if (present_managerId)
      builder.append(managerId);

    boolean present_jobConfig = true && (isSetJobConfig());
    builder.append(present_jobConfig);
    if (present_jobConfig)
      builder.append(jobConfig);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(SaveAcceptedJob other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetManagerId()).compareTo(other.isSetManagerId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetManagerId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.managerId, other.managerId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobConfig()).compareTo(other.isSetJobConfig());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobConfig()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobConfig, other.jobConfig);
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
    StringBuilder sb = new StringBuilder("SaveAcceptedJob(");
    boolean first = true;

    sb.append("managerId:");
    if (this.managerId == null) {
      sb.append("null");
    } else {
      sb.append(this.managerId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("jobConfig:");
    if (this.jobConfig == null) {
      sb.append("null");
    } else {
      sb.append(this.jobConfig);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (jobConfig != null) {
      jobConfig.validate();
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

  private static class SaveAcceptedJobStandardSchemeFactory implements SchemeFactory {
    public SaveAcceptedJobStandardScheme getScheme() {
      return new SaveAcceptedJobStandardScheme();
    }
  }

  private static class SaveAcceptedJobStandardScheme extends StandardScheme<SaveAcceptedJob> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SaveAcceptedJob struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MANAGER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.managerId = iprot.readString();
              struct.setManagerIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // JOB_CONFIG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.jobConfig = new org.apache.aurora.gen.JobConfiguration();
              struct.jobConfig.read(iprot);
              struct.setJobConfigIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SaveAcceptedJob struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.managerId != null) {
        oprot.writeFieldBegin(MANAGER_ID_FIELD_DESC);
        oprot.writeString(struct.managerId);
        oprot.writeFieldEnd();
      }
      if (struct.jobConfig != null) {
        oprot.writeFieldBegin(JOB_CONFIG_FIELD_DESC);
        struct.jobConfig.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SaveAcceptedJobTupleSchemeFactory implements SchemeFactory {
    public SaveAcceptedJobTupleScheme getScheme() {
      return new SaveAcceptedJobTupleScheme();
    }
  }

  private static class SaveAcceptedJobTupleScheme extends TupleScheme<SaveAcceptedJob> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SaveAcceptedJob struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetManagerId()) {
        optionals.set(0);
      }
      if (struct.isSetJobConfig()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetManagerId()) {
        oprot.writeString(struct.managerId);
      }
      if (struct.isSetJobConfig()) {
        struct.jobConfig.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SaveAcceptedJob struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.managerId = iprot.readString();
        struct.setManagerIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.jobConfig = new org.apache.aurora.gen.JobConfiguration();
        struct.jobConfig.read(iprot);
        struct.setJobConfigIsSet(true);
      }
    }
  }

}

