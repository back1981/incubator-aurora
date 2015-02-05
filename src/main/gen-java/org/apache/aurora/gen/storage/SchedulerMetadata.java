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

public class SchedulerMetadata implements org.apache.thrift.TBase<SchedulerMetadata, SchedulerMetadata._Fields>, java.io.Serializable, Cloneable, Comparable<SchedulerMetadata> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SchedulerMetadata");

  private static final org.apache.thrift.protocol.TField FRAMEWORK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("frameworkId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField REVISION_FIELD_DESC = new org.apache.thrift.protocol.TField("revision", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TAG_FIELD_DESC = new org.apache.thrift.protocol.TField("tag", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField MACHINE_FIELD_DESC = new org.apache.thrift.protocol.TField("machine", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.STRUCT, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SchedulerMetadataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SchedulerMetadataTupleSchemeFactory());
  }

  private String frameworkId; // required
  private String revision; // required
  private String tag; // required
  private String timestamp; // required
  private String user; // required
  private String machine; // required
  private org.apache.aurora.gen.APIVersion version; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FRAMEWORK_ID((short)1, "frameworkId"),
    REVISION((short)2, "revision"),
    TAG((short)3, "tag"),
    TIMESTAMP((short)4, "timestamp"),
    USER((short)5, "user"),
    MACHINE((short)6, "machine"),
    VERSION((short)7, "version");

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
        case 1: // FRAMEWORK_ID
          return FRAMEWORK_ID;
        case 2: // REVISION
          return REVISION;
        case 3: // TAG
          return TAG;
        case 4: // TIMESTAMP
          return TIMESTAMP;
        case 5: // USER
          return USER;
        case 6: // MACHINE
          return MACHINE;
        case 7: // VERSION
          return VERSION;
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
    tmpMap.put(_Fields.FRAMEWORK_ID, new org.apache.thrift.meta_data.FieldMetaData("frameworkId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REVISION, new org.apache.thrift.meta_data.FieldMetaData("revision", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TAG, new org.apache.thrift.meta_data.FieldMetaData("tag", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MACHINE, new org.apache.thrift.meta_data.FieldMetaData("machine", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.aurora.gen.APIVersion.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SchedulerMetadata.class, metaDataMap);
  }

  public SchedulerMetadata() {
  }

  public SchedulerMetadata(
    String frameworkId,
    String revision,
    String tag,
    String timestamp,
    String user,
    String machine,
    org.apache.aurora.gen.APIVersion version)
  {
    this();
    this.frameworkId = frameworkId;
    this.revision = revision;
    this.tag = tag;
    this.timestamp = timestamp;
    this.user = user;
    this.machine = machine;
    this.version = version;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SchedulerMetadata(SchedulerMetadata other) {
    if (other.isSetFrameworkId()) {
      this.frameworkId = other.frameworkId;
    }
    if (other.isSetRevision()) {
      this.revision = other.revision;
    }
    if (other.isSetTag()) {
      this.tag = other.tag;
    }
    if (other.isSetTimestamp()) {
      this.timestamp = other.timestamp;
    }
    if (other.isSetUser()) {
      this.user = other.user;
    }
    if (other.isSetMachine()) {
      this.machine = other.machine;
    }
    if (other.isSetVersion()) {
      this.version = new org.apache.aurora.gen.APIVersion(other.version);
    }
  }

  public SchedulerMetadata deepCopy() {
    return new SchedulerMetadata(this);
  }

  @Override
  public void clear() {
    this.frameworkId = null;
    this.revision = null;
    this.tag = null;
    this.timestamp = null;
    this.user = null;
    this.machine = null;
    this.version = null;
  }

  public String getFrameworkId() {
    return this.frameworkId;
  }

  public SchedulerMetadata setFrameworkId(String frameworkId) {
    this.frameworkId = frameworkId;
    return this;
  }

  public void unsetFrameworkId() {
    this.frameworkId = null;
  }

  /** Returns true if field frameworkId is set (has been assigned a value) and false otherwise */
  public boolean isSetFrameworkId() {
    return this.frameworkId != null;
  }

  public void setFrameworkIdIsSet(boolean value) {
    if (!value) {
      this.frameworkId = null;
    }
  }

  public String getRevision() {
    return this.revision;
  }

  public SchedulerMetadata setRevision(String revision) {
    this.revision = revision;
    return this;
  }

  public void unsetRevision() {
    this.revision = null;
  }

  /** Returns true if field revision is set (has been assigned a value) and false otherwise */
  public boolean isSetRevision() {
    return this.revision != null;
  }

  public void setRevisionIsSet(boolean value) {
    if (!value) {
      this.revision = null;
    }
  }

  public String getTag() {
    return this.tag;
  }

  public SchedulerMetadata setTag(String tag) {
    this.tag = tag;
    return this;
  }

  public void unsetTag() {
    this.tag = null;
  }

  /** Returns true if field tag is set (has been assigned a value) and false otherwise */
  public boolean isSetTag() {
    return this.tag != null;
  }

  public void setTagIsSet(boolean value) {
    if (!value) {
      this.tag = null;
    }
  }

  public String getTimestamp() {
    return this.timestamp;
  }

  public SchedulerMetadata setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public void unsetTimestamp() {
    this.timestamp = null;
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return this.timestamp != null;
  }

  public void setTimestampIsSet(boolean value) {
    if (!value) {
      this.timestamp = null;
    }
  }

  public String getUser() {
    return this.user;
  }

  public SchedulerMetadata setUser(String user) {
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

  public String getMachine() {
    return this.machine;
  }

  public SchedulerMetadata setMachine(String machine) {
    this.machine = machine;
    return this;
  }

  public void unsetMachine() {
    this.machine = null;
  }

  /** Returns true if field machine is set (has been assigned a value) and false otherwise */
  public boolean isSetMachine() {
    return this.machine != null;
  }

  public void setMachineIsSet(boolean value) {
    if (!value) {
      this.machine = null;
    }
  }

  public org.apache.aurora.gen.APIVersion getVersion() {
    return this.version;
  }

  public SchedulerMetadata setVersion(org.apache.aurora.gen.APIVersion version) {
    this.version = version;
    return this;
  }

  public void unsetVersion() {
    this.version = null;
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return this.version != null;
  }

  public void setVersionIsSet(boolean value) {
    if (!value) {
      this.version = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FRAMEWORK_ID:
      if (value == null) {
        unsetFrameworkId();
      } else {
        setFrameworkId((String)value);
      }
      break;

    case REVISION:
      if (value == null) {
        unsetRevision();
      } else {
        setRevision((String)value);
      }
      break;

    case TAG:
      if (value == null) {
        unsetTag();
      } else {
        setTag((String)value);
      }
      break;

    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((String)value);
      }
      break;

    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((String)value);
      }
      break;

    case MACHINE:
      if (value == null) {
        unsetMachine();
      } else {
        setMachine((String)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((org.apache.aurora.gen.APIVersion)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FRAMEWORK_ID:
      return getFrameworkId();

    case REVISION:
      return getRevision();

    case TAG:
      return getTag();

    case TIMESTAMP:
      return getTimestamp();

    case USER:
      return getUser();

    case MACHINE:
      return getMachine();

    case VERSION:
      return getVersion();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FRAMEWORK_ID:
      return isSetFrameworkId();
    case REVISION:
      return isSetRevision();
    case TAG:
      return isSetTag();
    case TIMESTAMP:
      return isSetTimestamp();
    case USER:
      return isSetUser();
    case MACHINE:
      return isSetMachine();
    case VERSION:
      return isSetVersion();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SchedulerMetadata)
      return this.equals((SchedulerMetadata)that);
    return false;
  }

  public boolean equals(SchedulerMetadata that) {
    if (that == null)
      return false;

    boolean this_present_frameworkId = true && this.isSetFrameworkId();
    boolean that_present_frameworkId = true && that.isSetFrameworkId();
    if (this_present_frameworkId || that_present_frameworkId) {
      if (!(this_present_frameworkId && that_present_frameworkId))
        return false;
      if (!this.frameworkId.equals(that.frameworkId))
        return false;
    }

    boolean this_present_revision = true && this.isSetRevision();
    boolean that_present_revision = true && that.isSetRevision();
    if (this_present_revision || that_present_revision) {
      if (!(this_present_revision && that_present_revision))
        return false;
      if (!this.revision.equals(that.revision))
        return false;
    }

    boolean this_present_tag = true && this.isSetTag();
    boolean that_present_tag = true && that.isSetTag();
    if (this_present_tag || that_present_tag) {
      if (!(this_present_tag && that_present_tag))
        return false;
      if (!this.tag.equals(that.tag))
        return false;
    }

    boolean this_present_timestamp = true && this.isSetTimestamp();
    boolean that_present_timestamp = true && that.isSetTimestamp();
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (!this.timestamp.equals(that.timestamp))
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

    boolean this_present_machine = true && this.isSetMachine();
    boolean that_present_machine = true && that.isSetMachine();
    if (this_present_machine || that_present_machine) {
      if (!(this_present_machine && that_present_machine))
        return false;
      if (!this.machine.equals(that.machine))
        return false;
    }

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (!this.version.equals(that.version))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_frameworkId = true && (isSetFrameworkId());
    builder.append(present_frameworkId);
    if (present_frameworkId)
      builder.append(frameworkId);

    boolean present_revision = true && (isSetRevision());
    builder.append(present_revision);
    if (present_revision)
      builder.append(revision);

    boolean present_tag = true && (isSetTag());
    builder.append(present_tag);
    if (present_tag)
      builder.append(tag);

    boolean present_timestamp = true && (isSetTimestamp());
    builder.append(present_timestamp);
    if (present_timestamp)
      builder.append(timestamp);

    boolean present_user = true && (isSetUser());
    builder.append(present_user);
    if (present_user)
      builder.append(user);

    boolean present_machine = true && (isSetMachine());
    builder.append(present_machine);
    if (present_machine)
      builder.append(machine);

    boolean present_version = true && (isSetVersion());
    builder.append(present_version);
    if (present_version)
      builder.append(version);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(SchedulerMetadata other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFrameworkId()).compareTo(other.isSetFrameworkId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFrameworkId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.frameworkId, other.frameworkId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRevision()).compareTo(other.isSetRevision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRevision()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.revision, other.revision);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTag()).compareTo(other.isSetTag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTag()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tag, other.tag);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(other.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, other.timestamp);
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
    lastComparison = Boolean.valueOf(isSetMachine()).compareTo(other.isSetMachine());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMachine()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.machine, other.machine);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
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
    StringBuilder sb = new StringBuilder("SchedulerMetadata(");
    boolean first = true;

    sb.append("frameworkId:");
    if (this.frameworkId == null) {
      sb.append("null");
    } else {
      sb.append(this.frameworkId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("revision:");
    if (this.revision == null) {
      sb.append("null");
    } else {
      sb.append(this.revision);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tag:");
    if (this.tag == null) {
      sb.append("null");
    } else {
      sb.append(this.tag);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("timestamp:");
    if (this.timestamp == null) {
      sb.append("null");
    } else {
      sb.append(this.timestamp);
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
    sb.append("machine:");
    if (this.machine == null) {
      sb.append("null");
    } else {
      sb.append(this.machine);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    if (this.version == null) {
      sb.append("null");
    } else {
      sb.append(this.version);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (version != null) {
      version.validate();
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

  private static class SchedulerMetadataStandardSchemeFactory implements SchemeFactory {
    public SchedulerMetadataStandardScheme getScheme() {
      return new SchedulerMetadataStandardScheme();
    }
  }

  private static class SchedulerMetadataStandardScheme extends StandardScheme<SchedulerMetadata> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SchedulerMetadata struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FRAMEWORK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.frameworkId = iprot.readString();
              struct.setFrameworkIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REVISION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.revision = iprot.readString();
              struct.setRevisionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TAG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tag = iprot.readString();
              struct.setTagIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.timestamp = iprot.readString();
              struct.setTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user = iprot.readString();
              struct.setUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // MACHINE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.machine = iprot.readString();
              struct.setMachineIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.version = new org.apache.aurora.gen.APIVersion();
              struct.version.read(iprot);
              struct.setVersionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SchedulerMetadata struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.frameworkId != null) {
        oprot.writeFieldBegin(FRAMEWORK_ID_FIELD_DESC);
        oprot.writeString(struct.frameworkId);
        oprot.writeFieldEnd();
      }
      if (struct.revision != null) {
        oprot.writeFieldBegin(REVISION_FIELD_DESC);
        oprot.writeString(struct.revision);
        oprot.writeFieldEnd();
      }
      if (struct.tag != null) {
        oprot.writeFieldBegin(TAG_FIELD_DESC);
        oprot.writeString(struct.tag);
        oprot.writeFieldEnd();
      }
      if (struct.timestamp != null) {
        oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
        oprot.writeString(struct.timestamp);
        oprot.writeFieldEnd();
      }
      if (struct.user != null) {
        oprot.writeFieldBegin(USER_FIELD_DESC);
        oprot.writeString(struct.user);
        oprot.writeFieldEnd();
      }
      if (struct.machine != null) {
        oprot.writeFieldBegin(MACHINE_FIELD_DESC);
        oprot.writeString(struct.machine);
        oprot.writeFieldEnd();
      }
      if (struct.version != null) {
        oprot.writeFieldBegin(VERSION_FIELD_DESC);
        struct.version.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SchedulerMetadataTupleSchemeFactory implements SchemeFactory {
    public SchedulerMetadataTupleScheme getScheme() {
      return new SchedulerMetadataTupleScheme();
    }
  }

  private static class SchedulerMetadataTupleScheme extends TupleScheme<SchedulerMetadata> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SchedulerMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFrameworkId()) {
        optionals.set(0);
      }
      if (struct.isSetRevision()) {
        optionals.set(1);
      }
      if (struct.isSetTag()) {
        optionals.set(2);
      }
      if (struct.isSetTimestamp()) {
        optionals.set(3);
      }
      if (struct.isSetUser()) {
        optionals.set(4);
      }
      if (struct.isSetMachine()) {
        optionals.set(5);
      }
      if (struct.isSetVersion()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetFrameworkId()) {
        oprot.writeString(struct.frameworkId);
      }
      if (struct.isSetRevision()) {
        oprot.writeString(struct.revision);
      }
      if (struct.isSetTag()) {
        oprot.writeString(struct.tag);
      }
      if (struct.isSetTimestamp()) {
        oprot.writeString(struct.timestamp);
      }
      if (struct.isSetUser()) {
        oprot.writeString(struct.user);
      }
      if (struct.isSetMachine()) {
        oprot.writeString(struct.machine);
      }
      if (struct.isSetVersion()) {
        struct.version.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SchedulerMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.frameworkId = iprot.readString();
        struct.setFrameworkIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.revision = iprot.readString();
        struct.setRevisionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.tag = iprot.readString();
        struct.setTagIsSet(true);
      }
      if (incoming.get(3)) {
        struct.timestamp = iprot.readString();
        struct.setTimestampIsSet(true);
      }
      if (incoming.get(4)) {
        struct.user = iprot.readString();
        struct.setUserIsSet(true);
      }
      if (incoming.get(5)) {
        struct.machine = iprot.readString();
        struct.setMachineIsSet(true);
      }
      if (incoming.get(6)) {
        struct.version = new org.apache.aurora.gen.APIVersion();
        struct.version.read(iprot);
        struct.setVersionIsSet(true);
      }
    }
  }

}

