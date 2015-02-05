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

public class RemoveJob implements org.apache.thrift.TBase<RemoveJob, RemoveJob._Fields>, java.io.Serializable, Cloneable, Comparable<RemoveJob> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RemoveJob");

  private static final org.apache.thrift.protocol.TField JOB_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("jobKey", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RemoveJobStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RemoveJobTupleSchemeFactory());
  }

  private org.apache.aurora.gen.JobKey jobKey; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOB_KEY((short)2, "jobKey");

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
        case 2: // JOB_KEY
          return JOB_KEY;
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
    tmpMap.put(_Fields.JOB_KEY, new org.apache.thrift.meta_data.FieldMetaData("jobKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.aurora.gen.JobKey.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RemoveJob.class, metaDataMap);
  }

  public RemoveJob() {
  }

  public RemoveJob(
    org.apache.aurora.gen.JobKey jobKey)
  {
    this();
    this.jobKey = jobKey;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RemoveJob(RemoveJob other) {
    if (other.isSetJobKey()) {
      this.jobKey = new org.apache.aurora.gen.JobKey(other.jobKey);
    }
  }

  public RemoveJob deepCopy() {
    return new RemoveJob(this);
  }

  @Override
  public void clear() {
    this.jobKey = null;
  }

  public org.apache.aurora.gen.JobKey getJobKey() {
    return this.jobKey;
  }

  public RemoveJob setJobKey(org.apache.aurora.gen.JobKey jobKey) {
    this.jobKey = jobKey;
    return this;
  }

  public void unsetJobKey() {
    this.jobKey = null;
  }

  /** Returns true if field jobKey is set (has been assigned a value) and false otherwise */
  public boolean isSetJobKey() {
    return this.jobKey != null;
  }

  public void setJobKeyIsSet(boolean value) {
    if (!value) {
      this.jobKey = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB_KEY:
      if (value == null) {
        unsetJobKey();
      } else {
        setJobKey((org.apache.aurora.gen.JobKey)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_KEY:
      return getJobKey();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB_KEY:
      return isSetJobKey();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RemoveJob)
      return this.equals((RemoveJob)that);
    return false;
  }

  public boolean equals(RemoveJob that) {
    if (that == null)
      return false;

    boolean this_present_jobKey = true && this.isSetJobKey();
    boolean that_present_jobKey = true && that.isSetJobKey();
    if (this_present_jobKey || that_present_jobKey) {
      if (!(this_present_jobKey && that_present_jobKey))
        return false;
      if (!this.jobKey.equals(that.jobKey))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_jobKey = true && (isSetJobKey());
    builder.append(present_jobKey);
    if (present_jobKey)
      builder.append(jobKey);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(RemoveJob other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetJobKey()).compareTo(other.isSetJobKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobKey, other.jobKey);
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
    StringBuilder sb = new StringBuilder("RemoveJob(");
    boolean first = true;

    sb.append("jobKey:");
    if (this.jobKey == null) {
      sb.append("null");
    } else {
      sb.append(this.jobKey);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (jobKey != null) {
      jobKey.validate();
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

  private static class RemoveJobStandardSchemeFactory implements SchemeFactory {
    public RemoveJobStandardScheme getScheme() {
      return new RemoveJobStandardScheme();
    }
  }

  private static class RemoveJobStandardScheme extends StandardScheme<RemoveJob> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RemoveJob struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 2: // JOB_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.jobKey = new org.apache.aurora.gen.JobKey();
              struct.jobKey.read(iprot);
              struct.setJobKeyIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RemoveJob struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jobKey != null) {
        oprot.writeFieldBegin(JOB_KEY_FIELD_DESC);
        struct.jobKey.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RemoveJobTupleSchemeFactory implements SchemeFactory {
    public RemoveJobTupleScheme getScheme() {
      return new RemoveJobTupleScheme();
    }
  }

  private static class RemoveJobTupleScheme extends TupleScheme<RemoveJob> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RemoveJob struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetJobKey()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetJobKey()) {
        struct.jobKey.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RemoveJob struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.jobKey = new org.apache.aurora.gen.JobKey();
        struct.jobKey.read(iprot);
        struct.setJobKeyIsSet(true);
      }
    }
  }

}

