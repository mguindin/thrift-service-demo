/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.sailthru.service.job.thrift;

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

public class JobDummy implements org.apache.thrift.TBase<JobDummy, JobDummy._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobDummy");

  private static final org.apache.thrift.protocol.TField JOB_FIELD_DESC = new org.apache.thrift.protocol.TField("job", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField BLAST_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("blastId", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobDummyStandardSchemeFactory());
    schemes.put(TupleScheme.class, new JobDummyTupleSchemeFactory());
  }

  public Job job; // required
  public int blastId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOB((short)1, "job"),
    BLAST_ID((short)2, "blastId");

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
        case 1: // JOB
          return JOB;
        case 2: // BLAST_ID
          return BLAST_ID;
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
  private static final int __BLASTID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB, new org.apache.thrift.meta_data.FieldMetaData("job", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Job.class)));
    tmpMap.put(_Fields.BLAST_ID, new org.apache.thrift.meta_data.FieldMetaData("blastId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobDummy.class, metaDataMap);
  }

  public JobDummy() {
  }

  public JobDummy(
    Job job,
    int blastId)
  {
    this();
    this.job = job;
    this.blastId = blastId;
    setBlastIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobDummy(JobDummy other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetJob()) {
      this.job = new Job(other.job);
    }
    this.blastId = other.blastId;
  }

  public JobDummy deepCopy() {
    return new JobDummy(this);
  }

  @Override
  public void clear() {
    this.job = null;
    setBlastIdIsSet(false);
    this.blastId = 0;
  }

  public Job getJob() {
    return this.job;
  }

  public JobDummy setJob(Job job) {
    this.job = job;
    return this;
  }

  public void unsetJob() {
    this.job = null;
  }

  /** Returns true if field job is set (has been assigned a value) and false otherwise */
  public boolean isSetJob() {
    return this.job != null;
  }

  public void setJobIsSet(boolean value) {
    if (!value) {
      this.job = null;
    }
  }

  public int getBlastId() {
    return this.blastId;
  }

  public JobDummy setBlastId(int blastId) {
    this.blastId = blastId;
    setBlastIdIsSet(true);
    return this;
  }

  public void unsetBlastId() {
    __isset_bit_vector.clear(__BLASTID_ISSET_ID);
  }

  /** Returns true if field blastId is set (has been assigned a value) and false otherwise */
  public boolean isSetBlastId() {
    return __isset_bit_vector.get(__BLASTID_ISSET_ID);
  }

  public void setBlastIdIsSet(boolean value) {
    __isset_bit_vector.set(__BLASTID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB:
      if (value == null) {
        unsetJob();
      } else {
        setJob((Job)value);
      }
      break;

    case BLAST_ID:
      if (value == null) {
        unsetBlastId();
      } else {
        setBlastId((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB:
      return getJob();

    case BLAST_ID:
      return Integer.valueOf(getBlastId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB:
      return isSetJob();
    case BLAST_ID:
      return isSetBlastId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobDummy)
      return this.equals((JobDummy)that);
    return false;
  }

  public boolean equals(JobDummy that) {
    if (that == null)
      return false;

    boolean this_present_job = true && this.isSetJob();
    boolean that_present_job = true && that.isSetJob();
    if (this_present_job || that_present_job) {
      if (!(this_present_job && that_present_job))
        return false;
      if (!this.job.equals(that.job))
        return false;
    }

    boolean this_present_blastId = true;
    boolean that_present_blastId = true;
    if (this_present_blastId || that_present_blastId) {
      if (!(this_present_blastId && that_present_blastId))
        return false;
      if (this.blastId != that.blastId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(JobDummy other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    JobDummy typedOther = (JobDummy)other;

    lastComparison = Boolean.valueOf(isSetJob()).compareTo(typedOther.isSetJob());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJob()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.job, typedOther.job);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBlastId()).compareTo(typedOther.isSetBlastId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBlastId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.blastId, typedOther.blastId);
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
    StringBuilder sb = new StringBuilder("JobDummy(");
    boolean first = true;

    sb.append("job:");
    if (this.job == null) {
      sb.append("null");
    } else {
      sb.append(this.job);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("blastId:");
    sb.append(this.blastId);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JobDummyStandardSchemeFactory implements SchemeFactory {
    public JobDummyStandardScheme getScheme() {
      return new JobDummyStandardScheme();
    }
  }

  private static class JobDummyStandardScheme extends StandardScheme<JobDummy> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobDummy struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.job = new Job();
              struct.job.read(iprot);
              struct.setJobIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BLAST_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.blastId = iprot.readI32();
              struct.setBlastIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobDummy struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.job != null) {
        oprot.writeFieldBegin(JOB_FIELD_DESC);
        struct.job.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(BLAST_ID_FIELD_DESC);
      oprot.writeI32(struct.blastId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobDummyTupleSchemeFactory implements SchemeFactory {
    public JobDummyTupleScheme getScheme() {
      return new JobDummyTupleScheme();
    }
  }

  private static class JobDummyTupleScheme extends TupleScheme<JobDummy> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JobDummy struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetJob()) {
        optionals.set(0);
      }
      if (struct.isSetBlastId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetJob()) {
        struct.job.write(oprot);
      }
      if (struct.isSetBlastId()) {
        oprot.writeI32(struct.blastId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JobDummy struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.job = new Job();
        struct.job.read(iprot);
        struct.setJobIsSet(true);
      }
      if (incoming.get(1)) {
        struct.blastId = iprot.readI32();
        struct.setBlastIdIsSet(true);
      }
    }
  }

}

