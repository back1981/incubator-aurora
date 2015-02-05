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
 * Full definition of the job update.
 */
public class JobUpdate implements org.apache.thrift.TBase<JobUpdate, JobUpdate._Fields>, java.io.Serializable, Cloneable, Comparable<JobUpdate> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobUpdate");

  private static final org.apache.thrift.protocol.TField SUMMARY_FIELD_DESC = new org.apache.thrift.protocol.TField("summary", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField INSTRUCTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("instructions", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobUpdateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new JobUpdateTupleSchemeFactory());
  }

  private JobUpdateSummary summary; // required
  private JobUpdateInstructions instructions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Update summary.
     */
    SUMMARY((short)1, "summary"),
    /**
     * Update configuration.
     */
    INSTRUCTIONS((short)2, "instructions");

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
        case 1: // SUMMARY
          return SUMMARY;
        case 2: // INSTRUCTIONS
          return INSTRUCTIONS;
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
    tmpMap.put(_Fields.SUMMARY, new org.apache.thrift.meta_data.FieldMetaData("summary", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JobUpdateSummary.class)));
    tmpMap.put(_Fields.INSTRUCTIONS, new org.apache.thrift.meta_data.FieldMetaData("instructions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JobUpdateInstructions.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobUpdate.class, metaDataMap);
  }

  public JobUpdate() {
  }

  public JobUpdate(
    JobUpdateSummary summary,
    JobUpdateInstructions instructions)
  {
    this();
    this.summary = summary;
    this.instructions = instructions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobUpdate(JobUpdate other) {
    if (other.isSetSummary()) {
      this.summary = new JobUpdateSummary(other.summary);
    }
    if (other.isSetInstructions()) {
      this.instructions = new JobUpdateInstructions(other.instructions);
    }
  }

  public JobUpdate deepCopy() {
    return new JobUpdate(this);
  }

  @Override
  public void clear() {
    this.summary = null;
    this.instructions = null;
  }

  /**
   * Update summary.
   */
  public JobUpdateSummary getSummary() {
    return this.summary;
  }

  /**
   * Update summary.
   */
  public JobUpdate setSummary(JobUpdateSummary summary) {
    this.summary = summary;
    return this;
  }

  public void unsetSummary() {
    this.summary = null;
  }

  /** Returns true if field summary is set (has been assigned a value) and false otherwise */
  public boolean isSetSummary() {
    return this.summary != null;
  }

  public void setSummaryIsSet(boolean value) {
    if (!value) {
      this.summary = null;
    }
  }

  /**
   * Update configuration.
   */
  public JobUpdateInstructions getInstructions() {
    return this.instructions;
  }

  /**
   * Update configuration.
   */
  public JobUpdate setInstructions(JobUpdateInstructions instructions) {
    this.instructions = instructions;
    return this;
  }

  public void unsetInstructions() {
    this.instructions = null;
  }

  /** Returns true if field instructions is set (has been assigned a value) and false otherwise */
  public boolean isSetInstructions() {
    return this.instructions != null;
  }

  public void setInstructionsIsSet(boolean value) {
    if (!value) {
      this.instructions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SUMMARY:
      if (value == null) {
        unsetSummary();
      } else {
        setSummary((JobUpdateSummary)value);
      }
      break;

    case INSTRUCTIONS:
      if (value == null) {
        unsetInstructions();
      } else {
        setInstructions((JobUpdateInstructions)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SUMMARY:
      return getSummary();

    case INSTRUCTIONS:
      return getInstructions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SUMMARY:
      return isSetSummary();
    case INSTRUCTIONS:
      return isSetInstructions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobUpdate)
      return this.equals((JobUpdate)that);
    return false;
  }

  public boolean equals(JobUpdate that) {
    if (that == null)
      return false;

    boolean this_present_summary = true && this.isSetSummary();
    boolean that_present_summary = true && that.isSetSummary();
    if (this_present_summary || that_present_summary) {
      if (!(this_present_summary && that_present_summary))
        return false;
      if (!this.summary.equals(that.summary))
        return false;
    }

    boolean this_present_instructions = true && this.isSetInstructions();
    boolean that_present_instructions = true && that.isSetInstructions();
    if (this_present_instructions || that_present_instructions) {
      if (!(this_present_instructions && that_present_instructions))
        return false;
      if (!this.instructions.equals(that.instructions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_summary = true && (isSetSummary());
    builder.append(present_summary);
    if (present_summary)
      builder.append(summary);

    boolean present_instructions = true && (isSetInstructions());
    builder.append(present_instructions);
    if (present_instructions)
      builder.append(instructions);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(JobUpdate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSummary()).compareTo(other.isSetSummary());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSummary()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.summary, other.summary);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInstructions()).compareTo(other.isSetInstructions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInstructions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.instructions, other.instructions);
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
    StringBuilder sb = new StringBuilder("JobUpdate(");
    boolean first = true;

    sb.append("summary:");
    if (this.summary == null) {
      sb.append("null");
    } else {
      sb.append(this.summary);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("instructions:");
    if (this.instructions == null) {
      sb.append("null");
    } else {
      sb.append(this.instructions);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (summary != null) {
      summary.validate();
    }
    if (instructions != null) {
      instructions.validate();
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

  private static class JobUpdateStandardSchemeFactory implements SchemeFactory {
    public JobUpdateStandardScheme getScheme() {
      return new JobUpdateStandardScheme();
    }
  }

  private static class JobUpdateStandardScheme extends StandardScheme<JobUpdate> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobUpdate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUMMARY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.summary = new JobUpdateSummary();
              struct.summary.read(iprot);
              struct.setSummaryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INSTRUCTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.instructions = new JobUpdateInstructions();
              struct.instructions.read(iprot);
              struct.setInstructionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobUpdate struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.summary != null) {
        oprot.writeFieldBegin(SUMMARY_FIELD_DESC);
        struct.summary.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.instructions != null) {
        oprot.writeFieldBegin(INSTRUCTIONS_FIELD_DESC);
        struct.instructions.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobUpdateTupleSchemeFactory implements SchemeFactory {
    public JobUpdateTupleScheme getScheme() {
      return new JobUpdateTupleScheme();
    }
  }

  private static class JobUpdateTupleScheme extends TupleScheme<JobUpdate> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JobUpdate struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSummary()) {
        optionals.set(0);
      }
      if (struct.isSetInstructions()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSummary()) {
        struct.summary.write(oprot);
      }
      if (struct.isSetInstructions()) {
        struct.instructions.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JobUpdate struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.summary = new JobUpdateSummary();
        struct.summary.read(iprot);
        struct.setSummaryIsSet(true);
      }
      if (incoming.get(1)) {
        struct.instructions = new JobUpdateInstructions();
        struct.instructions.read(iprot);
        struct.setInstructionsIsSet(true);
      }
    }
  }

}

