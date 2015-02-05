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
 * Summary of the job update including job key, user and current state.
 */
public class JobUpdateSummary implements org.apache.thrift.TBase<JobUpdateSummary, JobUpdateSummary._Fields>, java.io.Serializable, Cloneable, Comparable<JobUpdateSummary> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobUpdateSummary");

  private static final org.apache.thrift.protocol.TField UPDATE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("updateId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField JOB_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("jobKey", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobUpdateSummaryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new JobUpdateSummaryTupleSchemeFactory());
  }

  private String updateId; // required
  private JobKey jobKey; // required
  private String user; // required
  private JobUpdateState state; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Update ID.
     */
    UPDATE_ID((short)1, "updateId"),
    /**
     * Job key.
     */
    JOB_KEY((short)2, "jobKey"),
    /**
     * User initiated an update.
     */
    USER((short)3, "user"),
    /**
     * Current job update state.
     */
    STATE((short)4, "state");

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
        case 1: // UPDATE_ID
          return UPDATE_ID;
        case 2: // JOB_KEY
          return JOB_KEY;
        case 3: // USER
          return USER;
        case 4: // STATE
          return STATE;
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
    tmpMap.put(_Fields.UPDATE_ID, new org.apache.thrift.meta_data.FieldMetaData("updateId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.JOB_KEY, new org.apache.thrift.meta_data.FieldMetaData("jobKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JobKey.class)));
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JobUpdateState.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobUpdateSummary.class, metaDataMap);
  }

  public JobUpdateSummary() {
  }

  public JobUpdateSummary(
    String updateId,
    JobKey jobKey,
    String user,
    JobUpdateState state)
  {
    this();
    this.updateId = updateId;
    this.jobKey = jobKey;
    this.user = user;
    this.state = state;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobUpdateSummary(JobUpdateSummary other) {
    if (other.isSetUpdateId()) {
      this.updateId = other.updateId;
    }
    if (other.isSetJobKey()) {
      this.jobKey = new JobKey(other.jobKey);
    }
    if (other.isSetUser()) {
      this.user = other.user;
    }
    if (other.isSetState()) {
      this.state = new JobUpdateState(other.state);
    }
  }

  public JobUpdateSummary deepCopy() {
    return new JobUpdateSummary(this);
  }

  @Override
  public void clear() {
    this.updateId = null;
    this.jobKey = null;
    this.user = null;
    this.state = null;
  }

  /**
   * Update ID.
   */
  public String getUpdateId() {
    return this.updateId;
  }

  /**
   * Update ID.
   */
  public JobUpdateSummary setUpdateId(String updateId) {
    this.updateId = updateId;
    return this;
  }

  public void unsetUpdateId() {
    this.updateId = null;
  }

  /** Returns true if field updateId is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdateId() {
    return this.updateId != null;
  }

  public void setUpdateIdIsSet(boolean value) {
    if (!value) {
      this.updateId = null;
    }
  }

  /**
   * Job key.
   */
  public JobKey getJobKey() {
    return this.jobKey;
  }

  /**
   * Job key.
   */
  public JobUpdateSummary setJobKey(JobKey jobKey) {
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

  /**
   * User initiated an update.
   */
  public String getUser() {
    return this.user;
  }

  /**
   * User initiated an update.
   */
  public JobUpdateSummary setUser(String user) {
    this.user = user;
    return this;
  }

  public void unsetUser() {
    this.user = null;
  }

  /** Returns true if field user is set (has been assigned a value) and false otherwise */
  public boolean isSetUser() {
    return this.user != null;
  }

  public void setUserIsSet(boolean value) {
    if (!value) {
      this.user = null;
    }
  }

  /**
   * Current job update state.
   */
  public JobUpdateState getState() {
    return this.state;
  }

  /**
   * Current job update state.
   */
  public JobUpdateSummary setState(JobUpdateState state) {
    this.state = state;
    return this;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UPDATE_ID:
      if (value == null) {
        unsetUpdateId();
      } else {
        setUpdateId((String)value);
      }
      break;

    case JOB_KEY:
      if (value == null) {
        unsetJobKey();
      } else {
        setJobKey((JobKey)value);
      }
      break;

    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((String)value);
      }
      break;

    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((JobUpdateState)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UPDATE_ID:
      return getUpdateId();

    case JOB_KEY:
      return getJobKey();

    case USER:
      return getUser();

    case STATE:
      return getState();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UPDATE_ID:
      return isSetUpdateId();
    case JOB_KEY:
      return isSetJobKey();
    case USER:
      return isSetUser();
    case STATE:
      return isSetState();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobUpdateSummary)
      return this.equals((JobUpdateSummary)that);
    return false;
  }

  public boolean equals(JobUpdateSummary that) {
    if (that == null)
      return false;

    boolean this_present_updateId = true && this.isSetUpdateId();
    boolean that_present_updateId = true && that.isSetUpdateId();
    if (this_present_updateId || that_present_updateId) {
      if (!(this_present_updateId && that_present_updateId))
        return false;
      if (!this.updateId.equals(that.updateId))
        return false;
    }

    boolean this_present_jobKey = true && this.isSetJobKey();
    boolean that_present_jobKey = true && that.isSetJobKey();
    if (this_present_jobKey || that_present_jobKey) {
      if (!(this_present_jobKey && that_present_jobKey))
        return false;
      if (!this.jobKey.equals(that.jobKey))
        return false;
    }

    boolean this_present_user = true && this.isSetUser();
    boolean that_present_user = true && that.isSetUser();
    if (this_present_user || that_present_user) {
      if (!(this_present_user && that_present_user))
        return false;
      if (!this.user.equals(that.user))
        return false;
    }

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_updateId = true && (isSetUpdateId());
    builder.append(present_updateId);
    if (present_updateId)
      builder.append(updateId);

    boolean present_jobKey = true && (isSetJobKey());
    builder.append(present_jobKey);
    if (present_jobKey)
      builder.append(jobKey);

    boolean present_user = true && (isSetUser());
    builder.append(present_user);
    if (present_user)
      builder.append(user);

    boolean present_state = true && (isSetState());
    builder.append(present_state);
    if (present_state)
      builder.append(state);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(JobUpdateSummary other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUpdateId()).compareTo(other.isSetUpdateId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdateId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updateId, other.updateId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetUser()).compareTo(other.isSetUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user, other.user);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetState()).compareTo(other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, other.state);
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
    StringBuilder sb = new StringBuilder("JobUpdateSummary(");
    boolean first = true;

    sb.append("updateId:");
    if (this.updateId == null) {
      sb.append("null");
    } else {
      sb.append(this.updateId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("jobKey:");
    if (this.jobKey == null) {
      sb.append("null");
    } else {
      sb.append(this.jobKey);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("user:");
    if (this.user == null) {
      sb.append("null");
    } else {
      sb.append(this.user);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
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
    if (state != null) {
      state.validate();
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

  private static class JobUpdateSummaryStandardSchemeFactory implements SchemeFactory {
    public JobUpdateSummaryStandardScheme getScheme() {
      return new JobUpdateSummaryStandardScheme();
    }
  }

  private static class JobUpdateSummaryStandardScheme extends StandardScheme<JobUpdateSummary> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobUpdateSummary struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UPDATE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.updateId = iprot.readString();
              struct.setUpdateIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // JOB_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.jobKey = new JobKey();
              struct.jobKey.read(iprot);
              struct.setJobKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user = iprot.readString();
              struct.setUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.state = new JobUpdateState();
              struct.state.read(iprot);
              struct.setStateIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobUpdateSummary struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.updateId != null) {
        oprot.writeFieldBegin(UPDATE_ID_FIELD_DESC);
        oprot.writeString(struct.updateId);
        oprot.writeFieldEnd();
      }
      if (struct.jobKey != null) {
        oprot.writeFieldBegin(JOB_KEY_FIELD_DESC);
        struct.jobKey.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.user != null) {
        oprot.writeFieldBegin(USER_FIELD_DESC);
        oprot.writeString(struct.user);
        oprot.writeFieldEnd();
      }
      if (struct.state != null) {
        oprot.writeFieldBegin(STATE_FIELD_DESC);
        struct.state.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobUpdateSummaryTupleSchemeFactory implements SchemeFactory {
    public JobUpdateSummaryTupleScheme getScheme() {
      return new JobUpdateSummaryTupleScheme();
    }
  }

  private static class JobUpdateSummaryTupleScheme extends TupleScheme<JobUpdateSummary> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JobUpdateSummary struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUpdateId()) {
        optionals.set(0);
      }
      if (struct.isSetJobKey()) {
        optionals.set(1);
      }
      if (struct.isSetUser()) {
        optionals.set(2);
      }
      if (struct.isSetState()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetUpdateId()) {
        oprot.writeString(struct.updateId);
      }
      if (struct.isSetJobKey()) {
        struct.jobKey.write(oprot);
      }
      if (struct.isSetUser()) {
        oprot.writeString(struct.user);
      }
      if (struct.isSetState()) {
        struct.state.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JobUpdateSummary struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.updateId = iprot.readString();
        struct.setUpdateIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.jobKey = new JobKey();
        struct.jobKey.read(iprot);
        struct.setJobKeyIsSet(true);
      }
      if (incoming.get(2)) {
        struct.user = iprot.readString();
        struct.setUserIsSet(true);
      }
      if (incoming.get(3)) {
        struct.state = new JobUpdateState();
        struct.state.read(iprot);
        struct.setStateIsSet(true);
      }
    }
  }

}

