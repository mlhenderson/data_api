/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
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
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-1-25")
public class Exon_data implements org.apache.thrift.TBase<Exon_data, Exon_data._Fields>, java.io.Serializable, Cloneable, Comparable<Exon_data> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Exon_data");

  private static final org.apache.thrift.protocol.TField EXON_LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("exon_location", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField EXON_DNA_SEQUENCE_FIELD_DESC = new org.apache.thrift.protocol.TField("exon_dna_sequence", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EXON_ORDINAL_FIELD_DESC = new org.apache.thrift.protocol.TField("exon_ordinal", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new Exon_dataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new Exon_dataTupleSchemeFactory());
  }

  public Region exon_location; // required
  public String exon_dna_sequence; // required
  public long exon_ordinal; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXON_LOCATION((short)1, "exon_location"),
    EXON_DNA_SEQUENCE((short)2, "exon_dna_sequence"),
    EXON_ORDINAL((short)3, "exon_ordinal");

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
        case 1: // EXON_LOCATION
          return EXON_LOCATION;
        case 2: // EXON_DNA_SEQUENCE
          return EXON_DNA_SEQUENCE;
        case 3: // EXON_ORDINAL
          return EXON_ORDINAL;
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
  private static final int __EXON_ORDINAL_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXON_LOCATION, new org.apache.thrift.meta_data.FieldMetaData("exon_location", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Region.class)));
    tmpMap.put(_Fields.EXON_DNA_SEQUENCE, new org.apache.thrift.meta_data.FieldMetaData("exon_dna_sequence", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXON_ORDINAL, new org.apache.thrift.meta_data.FieldMetaData("exon_ordinal", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Exon_data.class, metaDataMap);
  }

  public Exon_data() {
  }

  public Exon_data(
    Region exon_location,
    String exon_dna_sequence,
    long exon_ordinal)
  {
    this();
    this.exon_location = exon_location;
    this.exon_dna_sequence = exon_dna_sequence;
    this.exon_ordinal = exon_ordinal;
    setExon_ordinalIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Exon_data(Exon_data other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetExon_location()) {
      this.exon_location = new Region(other.exon_location);
    }
    if (other.isSetExon_dna_sequence()) {
      this.exon_dna_sequence = other.exon_dna_sequence;
    }
    this.exon_ordinal = other.exon_ordinal;
  }

  public Exon_data deepCopy() {
    return new Exon_data(this);
  }

  @Override
  public void clear() {
    this.exon_location = null;
    this.exon_dna_sequence = null;
    setExon_ordinalIsSet(false);
    this.exon_ordinal = 0;
  }

  public Region getExon_location() {
    return this.exon_location;
  }

  public Exon_data setExon_location(Region exon_location) {
    this.exon_location = exon_location;
    return this;
  }

  public void unsetExon_location() {
    this.exon_location = null;
  }

  /** Returns true if field exon_location is set (has been assigned a value) and false otherwise */
  public boolean isSetExon_location() {
    return this.exon_location != null;
  }

  public void setExon_locationIsSet(boolean value) {
    if (!value) {
      this.exon_location = null;
    }
  }

  public String getExon_dna_sequence() {
    return this.exon_dna_sequence;
  }

  public Exon_data setExon_dna_sequence(String exon_dna_sequence) {
    this.exon_dna_sequence = exon_dna_sequence;
    return this;
  }

  public void unsetExon_dna_sequence() {
    this.exon_dna_sequence = null;
  }

  /** Returns true if field exon_dna_sequence is set (has been assigned a value) and false otherwise */
  public boolean isSetExon_dna_sequence() {
    return this.exon_dna_sequence != null;
  }

  public void setExon_dna_sequenceIsSet(boolean value) {
    if (!value) {
      this.exon_dna_sequence = null;
    }
  }

  public long getExon_ordinal() {
    return this.exon_ordinal;
  }

  public Exon_data setExon_ordinal(long exon_ordinal) {
    this.exon_ordinal = exon_ordinal;
    setExon_ordinalIsSet(true);
    return this;
  }

  public void unsetExon_ordinal() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EXON_ORDINAL_ISSET_ID);
  }

  /** Returns true if field exon_ordinal is set (has been assigned a value) and false otherwise */
  public boolean isSetExon_ordinal() {
    return EncodingUtils.testBit(__isset_bitfield, __EXON_ORDINAL_ISSET_ID);
  }

  public void setExon_ordinalIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EXON_ORDINAL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXON_LOCATION:
      if (value == null) {
        unsetExon_location();
      } else {
        setExon_location((Region)value);
      }
      break;

    case EXON_DNA_SEQUENCE:
      if (value == null) {
        unsetExon_dna_sequence();
      } else {
        setExon_dna_sequence((String)value);
      }
      break;

    case EXON_ORDINAL:
      if (value == null) {
        unsetExon_ordinal();
      } else {
        setExon_ordinal((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXON_LOCATION:
      return getExon_location();

    case EXON_DNA_SEQUENCE:
      return getExon_dna_sequence();

    case EXON_ORDINAL:
      return Long.valueOf(getExon_ordinal());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXON_LOCATION:
      return isSetExon_location();
    case EXON_DNA_SEQUENCE:
      return isSetExon_dna_sequence();
    case EXON_ORDINAL:
      return isSetExon_ordinal();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Exon_data)
      return this.equals((Exon_data)that);
    return false;
  }

  public boolean equals(Exon_data that) {
    if (that == null)
      return false;

    boolean this_present_exon_location = true && this.isSetExon_location();
    boolean that_present_exon_location = true && that.isSetExon_location();
    if (this_present_exon_location || that_present_exon_location) {
      if (!(this_present_exon_location && that_present_exon_location))
        return false;
      if (!this.exon_location.equals(that.exon_location))
        return false;
    }

    boolean this_present_exon_dna_sequence = true && this.isSetExon_dna_sequence();
    boolean that_present_exon_dna_sequence = true && that.isSetExon_dna_sequence();
    if (this_present_exon_dna_sequence || that_present_exon_dna_sequence) {
      if (!(this_present_exon_dna_sequence && that_present_exon_dna_sequence))
        return false;
      if (!this.exon_dna_sequence.equals(that.exon_dna_sequence))
        return false;
    }

    boolean this_present_exon_ordinal = true;
    boolean that_present_exon_ordinal = true;
    if (this_present_exon_ordinal || that_present_exon_ordinal) {
      if (!(this_present_exon_ordinal && that_present_exon_ordinal))
        return false;
      if (this.exon_ordinal != that.exon_ordinal)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_exon_location = true && (isSetExon_location());
    list.add(present_exon_location);
    if (present_exon_location)
      list.add(exon_location);

    boolean present_exon_dna_sequence = true && (isSetExon_dna_sequence());
    list.add(present_exon_dna_sequence);
    if (present_exon_dna_sequence)
      list.add(exon_dna_sequence);

    boolean present_exon_ordinal = true;
    list.add(present_exon_ordinal);
    if (present_exon_ordinal)
      list.add(exon_ordinal);

    return list.hashCode();
  }

  @Override
  public int compareTo(Exon_data other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetExon_location()).compareTo(other.isSetExon_location());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExon_location()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exon_location, other.exon_location);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExon_dna_sequence()).compareTo(other.isSetExon_dna_sequence());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExon_dna_sequence()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exon_dna_sequence, other.exon_dna_sequence);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExon_ordinal()).compareTo(other.isSetExon_ordinal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExon_ordinal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exon_ordinal, other.exon_ordinal);
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
    StringBuilder sb = new StringBuilder("Exon_data(");
    boolean first = true;

    sb.append("exon_location:");
    if (this.exon_location == null) {
      sb.append("null");
    } else {
      sb.append(this.exon_location);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("exon_dna_sequence:");
    if (this.exon_dna_sequence == null) {
      sb.append("null");
    } else {
      sb.append(this.exon_dna_sequence);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("exon_ordinal:");
    sb.append(this.exon_ordinal);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (exon_location != null) {
      exon_location.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class Exon_dataStandardSchemeFactory implements SchemeFactory {
    public Exon_dataStandardScheme getScheme() {
      return new Exon_dataStandardScheme();
    }
  }

  private static class Exon_dataStandardScheme extends StandardScheme<Exon_data> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Exon_data struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXON_LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.exon_location = new Region();
              struct.exon_location.read(iprot);
              struct.setExon_locationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXON_DNA_SEQUENCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.exon_dna_sequence = iprot.readString();
              struct.setExon_dna_sequenceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXON_ORDINAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.exon_ordinal = iprot.readI64();
              struct.setExon_ordinalIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Exon_data struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.exon_location != null) {
        oprot.writeFieldBegin(EXON_LOCATION_FIELD_DESC);
        struct.exon_location.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.exon_dna_sequence != null) {
        oprot.writeFieldBegin(EXON_DNA_SEQUENCE_FIELD_DESC);
        oprot.writeString(struct.exon_dna_sequence);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(EXON_ORDINAL_FIELD_DESC);
      oprot.writeI64(struct.exon_ordinal);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class Exon_dataTupleSchemeFactory implements SchemeFactory {
    public Exon_dataTupleScheme getScheme() {
      return new Exon_dataTupleScheme();
    }
  }

  private static class Exon_dataTupleScheme extends TupleScheme<Exon_data> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Exon_data struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetExon_location()) {
        optionals.set(0);
      }
      if (struct.isSetExon_dna_sequence()) {
        optionals.set(1);
      }
      if (struct.isSetExon_ordinal()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetExon_location()) {
        struct.exon_location.write(oprot);
      }
      if (struct.isSetExon_dna_sequence()) {
        oprot.writeString(struct.exon_dna_sequence);
      }
      if (struct.isSetExon_ordinal()) {
        oprot.writeI64(struct.exon_ordinal);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Exon_data struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.exon_location = new Region();
        struct.exon_location.read(iprot);
        struct.setExon_locationIsSet(true);
      }
      if (incoming.get(1)) {
        struct.exon_dna_sequence = iprot.readString();
        struct.setExon_dna_sequenceIsSet(true);
      }
      if (incoming.get(2)) {
        struct.exon_ordinal = iprot.readI64();
        struct.setExon_ordinalIsSet(true);
      }
    }
  }

}

