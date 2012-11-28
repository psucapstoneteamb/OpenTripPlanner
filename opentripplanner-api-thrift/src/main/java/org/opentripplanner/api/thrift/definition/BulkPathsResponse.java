/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.opentripplanner.api.thrift.definition;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
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

public class BulkPathsResponse implements org.apache.thrift.TBase<BulkPathsResponse, BulkPathsResponse._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BulkPathsResponse");

  private static final org.apache.thrift.protocol.TField PATHS_FIELD_DESC = new org.apache.thrift.protocol.TField("paths", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BulkPathsResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BulkPathsResponseTupleSchemeFactory());
  }

  private List<TripPaths> paths; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PATHS((short)1, "paths");

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
        case 1: // PATHS
          return PATHS;
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
    tmpMap.put(_Fields.PATHS, new org.apache.thrift.meta_data.FieldMetaData("paths", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TripPaths.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BulkPathsResponse.class, metaDataMap);
  }

  public BulkPathsResponse() {
  }

  public BulkPathsResponse(
    List<TripPaths> paths)
  {
    this();
    this.paths = paths;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BulkPathsResponse(BulkPathsResponse other) {
    if (other.isSetPaths()) {
      List<TripPaths> __this__paths = new ArrayList<TripPaths>();
      for (TripPaths other_element : other.paths) {
        __this__paths.add(new TripPaths(other_element));
      }
      this.paths = __this__paths;
    }
  }

  public BulkPathsResponse deepCopy() {
    return new BulkPathsResponse(this);
  }

  @Override
  public void clear() {
    this.paths = null;
  }

  public int getPathsSize() {
    return (this.paths == null) ? 0 : this.paths.size();
  }

  public java.util.Iterator<TripPaths> getPathsIterator() {
    return (this.paths == null) ? null : this.paths.iterator();
  }

  public void addToPaths(TripPaths elem) {
    if (this.paths == null) {
      this.paths = new ArrayList<TripPaths>();
    }
    this.paths.add(elem);
  }

  public List<TripPaths> getPaths() {
    return this.paths;
  }

  public void setPaths(List<TripPaths> paths) {
    this.paths = paths;
  }

  public void unsetPaths() {
    this.paths = null;
  }

  /** Returns true if field paths is set (has been assigned a value) and false otherwise */
  public boolean isSetPaths() {
    return this.paths != null;
  }

  public void setPathsIsSet(boolean value) {
    if (!value) {
      this.paths = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PATHS:
      if (value == null) {
        unsetPaths();
      } else {
        setPaths((List<TripPaths>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PATHS:
      return getPaths();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PATHS:
      return isSetPaths();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BulkPathsResponse)
      return this.equals((BulkPathsResponse)that);
    return false;
  }

  public boolean equals(BulkPathsResponse that) {
    if (that == null)
      return false;

    boolean this_present_paths = true && this.isSetPaths();
    boolean that_present_paths = true && that.isSetPaths();
    if (this_present_paths || that_present_paths) {
      if (!(this_present_paths && that_present_paths))
        return false;
      if (!this.paths.equals(that.paths))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(BulkPathsResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    BulkPathsResponse typedOther = (BulkPathsResponse)other;

    lastComparison = Boolean.valueOf(isSetPaths()).compareTo(typedOther.isSetPaths());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPaths()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.paths, typedOther.paths);
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
    StringBuilder sb = new StringBuilder("BulkPathsResponse(");
    boolean first = true;

    sb.append("paths:");
    if (this.paths == null) {
      sb.append("null");
    } else {
      sb.append(this.paths);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetPaths()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'paths' is unset! Struct:" + toString());
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

  private static class BulkPathsResponseStandardSchemeFactory implements SchemeFactory {
    public BulkPathsResponseStandardScheme getScheme() {
      return new BulkPathsResponseStandardScheme();
    }
  }

  private static class BulkPathsResponseStandardScheme extends StandardScheme<BulkPathsResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BulkPathsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PATHS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list40 = iprot.readListBegin();
                struct.paths = new ArrayList<TripPaths>(_list40.size);
                for (int _i41 = 0; _i41 < _list40.size; ++_i41)
                {
                  TripPaths _elem42; // required
                  _elem42 = new TripPaths();
                  _elem42.read(iprot);
                  struct.paths.add(_elem42);
                }
                iprot.readListEnd();
              }
              struct.setPathsIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BulkPathsResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.paths != null) {
        oprot.writeFieldBegin(PATHS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.paths.size()));
          for (TripPaths _iter43 : struct.paths)
          {
            _iter43.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BulkPathsResponseTupleSchemeFactory implements SchemeFactory {
    public BulkPathsResponseTupleScheme getScheme() {
      return new BulkPathsResponseTupleScheme();
    }
  }

  private static class BulkPathsResponseTupleScheme extends TupleScheme<BulkPathsResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BulkPathsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.paths.size());
        for (TripPaths _iter44 : struct.paths)
        {
          _iter44.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BulkPathsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list45 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.paths = new ArrayList<TripPaths>(_list45.size);
        for (int _i46 = 0; _i46 < _list45.size; ++_i46)
        {
          TripPaths _elem47; // required
          _elem47 = new TripPaths();
          _elem47.read(iprot);
          struct.paths.add(_elem47);
        }
      }
      struct.setPathsIsSet(true);
    }
  }

}

