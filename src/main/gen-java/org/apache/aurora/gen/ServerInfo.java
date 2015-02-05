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
 * Information about the scheduler.
 */
public class ServerInfo implements org.apache.thrift.TBase<ServerInfo, ServerInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ServerInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ServerInfo");

  private static final org.apache.thrift.protocol.TField CLUSTER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("clusterName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField THRIFT_APIVERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("thriftAPIVersion", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField STATS_URL_PREFIX_FIELD_DESC = new org.apache.thrift.protocol.TField("statsUrlPrefix", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ServerInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ServerInfoTupleSchemeFactory());
  }

  private String clusterName; // required
  private int thriftAPIVersion; // required
  private String statsUrlPrefix; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CLUSTER_NAME((short)1, "clusterName"),
    THRIFT_APIVERSION((short)2, "thriftAPIVersion"),
    /**
     * A url prefix for job container stats.
     */
    STATS_URL_PREFIX((short)3, "statsUrlPrefix");

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
        case 1: // CLUSTER_NAME
          return CLUSTER_NAME;
        case 2: // THRIFT_APIVERSION
          return THRIFT_APIVERSION;
        case 3: // STATS_URL_PREFIX
          return STATS_URL_PREFIX;
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
  private static final int __THRIFTAPIVERSION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLUSTER_NAME, new org.apache.thrift.meta_data.FieldMetaData("clusterName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.THRIFT_APIVERSION, new org.apache.thrift.meta_data.FieldMetaData("thriftAPIVersion", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STATS_URL_PREFIX, new org.apache.thrift.meta_data.FieldMetaData("statsUrlPrefix", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ServerInfo.class, metaDataMap);
  }

  public ServerInfo() {
  }

  public ServerInfo(
    String clusterName,
    int thriftAPIVersion,
    String statsUrlPrefix)
  {
    this();
    this.clusterName = clusterName;
    this.thriftAPIVersion = thriftAPIVersion;
    setThriftAPIVersionIsSet(true);
    this.statsUrlPrefix = statsUrlPrefix;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ServerInfo(ServerInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetClusterName()) {
      this.clusterName = other.clusterName;
    }
    this.thriftAPIVersion = other.thriftAPIVersion;
    if (other.isSetStatsUrlPrefix()) {
      this.statsUrlPrefix = other.statsUrlPrefix;
    }
  }

  public ServerInfo deepCopy() {
    return new ServerInfo(this);
  }

  @Override
  public void clear() {
    this.clusterName = null;
    setThriftAPIVersionIsSet(false);
    this.thriftAPIVersion = 0;
    this.statsUrlPrefix = null;
  }

  public String getClusterName() {
    return this.clusterName;
  }

  public ServerInfo setClusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  public void unsetClusterName() {
    this.clusterName = null;
  }

  /** Returns true if field clusterName is set (has been assigned a value) and false otherwise */
  public boolean isSetClusterName() {
    return this.clusterName != null;
  }

  public void setClusterNameIsSet(boolean value) {
    if (!value) {
      this.clusterName = null;
    }
  }

  public int getThriftAPIVersion() {
    return this.thriftAPIVersion;
  }

  public ServerInfo setThriftAPIVersion(int thriftAPIVersion) {
    this.thriftAPIVersion = thriftAPIVersion;
    setThriftAPIVersionIsSet(true);
    return this;
  }

  public void unsetThriftAPIVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __THRIFTAPIVERSION_ISSET_ID);
  }

  /** Returns true if field thriftAPIVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetThriftAPIVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __THRIFTAPIVERSION_ISSET_ID);
  }

  public void setThriftAPIVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __THRIFTAPIVERSION_ISSET_ID, value);
  }

  /**
   * A url prefix for job container stats.
   */
  public String getStatsUrlPrefix() {
    return this.statsUrlPrefix;
  }

  /**
   * A url prefix for job container stats.
   */
  public ServerInfo setStatsUrlPrefix(String statsUrlPrefix) {
    this.statsUrlPrefix = statsUrlPrefix;
    return this;
  }

  public void unsetStatsUrlPrefix() {
    this.statsUrlPrefix = null;
  }

  /** Returns true if field statsUrlPrefix is set (has been assigned a value) and false otherwise */
  public boolean isSetStatsUrlPrefix() {
    return this.statsUrlPrefix != null;
  }

  public void setStatsUrlPrefixIsSet(boolean value) {
    if (!value) {
      this.statsUrlPrefix = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CLUSTER_NAME:
      if (value == null) {
        unsetClusterName();
      } else {
        setClusterName((String)value);
      }
      break;

    case THRIFT_APIVERSION:
      if (value == null) {
        unsetThriftAPIVersion();
      } else {
        setThriftAPIVersion((Integer)value);
      }
      break;

    case STATS_URL_PREFIX:
      if (value == null) {
        unsetStatsUrlPrefix();
      } else {
        setStatsUrlPrefix((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CLUSTER_NAME:
      return getClusterName();

    case THRIFT_APIVERSION:
      return Integer.valueOf(getThriftAPIVersion());

    case STATS_URL_PREFIX:
      return getStatsUrlPrefix();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CLUSTER_NAME:
      return isSetClusterName();
    case THRIFT_APIVERSION:
      return isSetThriftAPIVersion();
    case STATS_URL_PREFIX:
      return isSetStatsUrlPrefix();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ServerInfo)
      return this.equals((ServerInfo)that);
    return false;
  }

  public boolean equals(ServerInfo that) {
    if (that == null)
      return false;

    boolean this_present_clusterName = true && this.isSetClusterName();
    boolean that_present_clusterName = true && that.isSetClusterName();
    if (this_present_clusterName || that_present_clusterName) {
      if (!(this_present_clusterName && that_present_clusterName))
        return false;
      if (!this.clusterName.equals(that.clusterName))
        return false;
    }

    boolean this_present_thriftAPIVersion = true;
    boolean that_present_thriftAPIVersion = true;
    if (this_present_thriftAPIVersion || that_present_thriftAPIVersion) {
      if (!(this_present_thriftAPIVersion && that_present_thriftAPIVersion))
        return false;
      if (this.thriftAPIVersion != that.thriftAPIVersion)
        return false;
    }

    boolean this_present_statsUrlPrefix = true && this.isSetStatsUrlPrefix();
    boolean that_present_statsUrlPrefix = true && that.isSetStatsUrlPrefix();
    if (this_present_statsUrlPrefix || that_present_statsUrlPrefix) {
      if (!(this_present_statsUrlPrefix && that_present_statsUrlPrefix))
        return false;
      if (!this.statsUrlPrefix.equals(that.statsUrlPrefix))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_clusterName = true && (isSetClusterName());
    builder.append(present_clusterName);
    if (present_clusterName)
      builder.append(clusterName);

    boolean present_thriftAPIVersion = true;
    builder.append(present_thriftAPIVersion);
    if (present_thriftAPIVersion)
      builder.append(thriftAPIVersion);

    boolean present_statsUrlPrefix = true && (isSetStatsUrlPrefix());
    builder.append(present_statsUrlPrefix);
    if (present_statsUrlPrefix)
      builder.append(statsUrlPrefix);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(ServerInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetClusterName()).compareTo(other.isSetClusterName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClusterName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clusterName, other.clusterName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetThriftAPIVersion()).compareTo(other.isSetThriftAPIVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThriftAPIVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.thriftAPIVersion, other.thriftAPIVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatsUrlPrefix()).compareTo(other.isSetStatsUrlPrefix());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatsUrlPrefix()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statsUrlPrefix, other.statsUrlPrefix);
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
    StringBuilder sb = new StringBuilder("ServerInfo(");
    boolean first = true;

    sb.append("clusterName:");
    if (this.clusterName == null) {
      sb.append("null");
    } else {
      sb.append(this.clusterName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("thriftAPIVersion:");
    sb.append(this.thriftAPIVersion);
    first = false;
    if (!first) sb.append(", ");
    sb.append("statsUrlPrefix:");
    if (this.statsUrlPrefix == null) {
      sb.append("null");
    } else {
      sb.append(this.statsUrlPrefix);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ServerInfoStandardSchemeFactory implements SchemeFactory {
    public ServerInfoStandardScheme getScheme() {
      return new ServerInfoStandardScheme();
    }
  }

  private static class ServerInfoStandardScheme extends StandardScheme<ServerInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ServerInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLUSTER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.clusterName = iprot.readString();
              struct.setClusterNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // THRIFT_APIVERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.thriftAPIVersion = iprot.readI32();
              struct.setThriftAPIVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STATS_URL_PREFIX
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.statsUrlPrefix = iprot.readString();
              struct.setStatsUrlPrefixIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ServerInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.clusterName != null) {
        oprot.writeFieldBegin(CLUSTER_NAME_FIELD_DESC);
        oprot.writeString(struct.clusterName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(THRIFT_APIVERSION_FIELD_DESC);
      oprot.writeI32(struct.thriftAPIVersion);
      oprot.writeFieldEnd();
      if (struct.statsUrlPrefix != null) {
        oprot.writeFieldBegin(STATS_URL_PREFIX_FIELD_DESC);
        oprot.writeString(struct.statsUrlPrefix);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ServerInfoTupleSchemeFactory implements SchemeFactory {
    public ServerInfoTupleScheme getScheme() {
      return new ServerInfoTupleScheme();
    }
  }

  private static class ServerInfoTupleScheme extends TupleScheme<ServerInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ServerInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetClusterName()) {
        optionals.set(0);
      }
      if (struct.isSetThriftAPIVersion()) {
        optionals.set(1);
      }
      if (struct.isSetStatsUrlPrefix()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetClusterName()) {
        oprot.writeString(struct.clusterName);
      }
      if (struct.isSetThriftAPIVersion()) {
        oprot.writeI32(struct.thriftAPIVersion);
      }
      if (struct.isSetStatsUrlPrefix()) {
        oprot.writeString(struct.statsUrlPrefix);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ServerInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.clusterName = iprot.readString();
        struct.setClusterNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.thriftAPIVersion = iprot.readI32();
        struct.setThriftAPIVersionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.statsUrlPrefix = iprot.readString();
        struct.setStatsUrlPrefixIsSet(true);
      }
    }
  }

}
