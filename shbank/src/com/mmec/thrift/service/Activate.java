/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.mmec.thrift.service;

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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-12-29")
public class Activate implements org.apache.thrift.TBase<Activate, Activate._Fields>, java.io.Serializable, Cloneable, Comparable<Activate> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Activate");

  private static final org.apache.thrift.protocol.TField CERT_SERIAL_FIELD_DESC = new org.apache.thrift.protocol.TField("certSerial", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PLATFORM_USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("platformUserId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COMPANY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("companyName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PERSON_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("personName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField MOBILE_FIELD_DESC = new org.apache.thrift.protocol.TField("mobile", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField APP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("appId", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ActivateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ActivateTupleSchemeFactory());
  }

  public String certSerial; // required
  public String platformUserId; // required
  public String companyName; // required
  public String personName; // required
  public String mobile; // required
  public String appId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CERT_SERIAL((short)1, "certSerial"),
    PLATFORM_USER_ID((short)2, "platformUserId"),
    COMPANY_NAME((short)3, "companyName"),
    PERSON_NAME((short)4, "personName"),
    MOBILE((short)5, "mobile"),
    APP_ID((short)6, "appId");

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
        case 1: // CERT_SERIAL
          return CERT_SERIAL;
        case 2: // PLATFORM_USER_ID
          return PLATFORM_USER_ID;
        case 3: // COMPANY_NAME
          return COMPANY_NAME;
        case 4: // PERSON_NAME
          return PERSON_NAME;
        case 5: // MOBILE
          return MOBILE;
        case 6: // APP_ID
          return APP_ID;
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
    tmpMap.put(_Fields.CERT_SERIAL, new org.apache.thrift.meta_data.FieldMetaData("certSerial", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PLATFORM_USER_ID, new org.apache.thrift.meta_data.FieldMetaData("platformUserId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COMPANY_NAME, new org.apache.thrift.meta_data.FieldMetaData("companyName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PERSON_NAME, new org.apache.thrift.meta_data.FieldMetaData("personName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MOBILE, new org.apache.thrift.meta_data.FieldMetaData("mobile", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.APP_ID, new org.apache.thrift.meta_data.FieldMetaData("appId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Activate.class, metaDataMap);
  }

  public Activate() {
  }

  public Activate(
    String certSerial,
    String platformUserId,
    String companyName,
    String personName,
    String mobile,
    String appId)
  {
    this();
    this.certSerial = certSerial;
    this.platformUserId = platformUserId;
    this.companyName = companyName;
    this.personName = personName;
    this.mobile = mobile;
    this.appId = appId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Activate(Activate other) {
    if (other.isSetCertSerial()) {
      this.certSerial = other.certSerial;
    }
    if (other.isSetPlatformUserId()) {
      this.platformUserId = other.platformUserId;
    }
    if (other.isSetCompanyName()) {
      this.companyName = other.companyName;
    }
    if (other.isSetPersonName()) {
      this.personName = other.personName;
    }
    if (other.isSetMobile()) {
      this.mobile = other.mobile;
    }
    if (other.isSetAppId()) {
      this.appId = other.appId;
    }
  }

  public Activate deepCopy() {
    return new Activate(this);
  }

  @Override
  public void clear() {
    this.certSerial = null;
    this.platformUserId = null;
    this.companyName = null;
    this.personName = null;
    this.mobile = null;
    this.appId = null;
  }

  public String getCertSerial() {
    return this.certSerial;
  }

  public Activate setCertSerial(String certSerial) {
    this.certSerial = certSerial;
    return this;
  }

  public void unsetCertSerial() {
    this.certSerial = null;
  }

  /** Returns true if field certSerial is set (has been assigned a value) and false otherwise */
  public boolean isSetCertSerial() {
    return this.certSerial != null;
  }

  public void setCertSerialIsSet(boolean value) {
    if (!value) {
      this.certSerial = null;
    }
  }

  public String getPlatformUserId() {
    return this.platformUserId;
  }

  public Activate setPlatformUserId(String platformUserId) {
    this.platformUserId = platformUserId;
    return this;
  }

  public void unsetPlatformUserId() {
    this.platformUserId = null;
  }

  /** Returns true if field platformUserId is set (has been assigned a value) and false otherwise */
  public boolean isSetPlatformUserId() {
    return this.platformUserId != null;
  }

  public void setPlatformUserIdIsSet(boolean value) {
    if (!value) {
      this.platformUserId = null;
    }
  }

  public String getCompanyName() {
    return this.companyName;
  }

  public Activate setCompanyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  public void unsetCompanyName() {
    this.companyName = null;
  }

  /** Returns true if field companyName is set (has been assigned a value) and false otherwise */
  public boolean isSetCompanyName() {
    return this.companyName != null;
  }

  public void setCompanyNameIsSet(boolean value) {
    if (!value) {
      this.companyName = null;
    }
  }

  public String getPersonName() {
    return this.personName;
  }

  public Activate setPersonName(String personName) {
    this.personName = personName;
    return this;
  }

  public void unsetPersonName() {
    this.personName = null;
  }

  /** Returns true if field personName is set (has been assigned a value) and false otherwise */
  public boolean isSetPersonName() {
    return this.personName != null;
  }

  public void setPersonNameIsSet(boolean value) {
    if (!value) {
      this.personName = null;
    }
  }

  public String getMobile() {
    return this.mobile;
  }

  public Activate setMobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  public void unsetMobile() {
    this.mobile = null;
  }

  /** Returns true if field mobile is set (has been assigned a value) and false otherwise */
  public boolean isSetMobile() {
    return this.mobile != null;
  }

  public void setMobileIsSet(boolean value) {
    if (!value) {
      this.mobile = null;
    }
  }

  public String getAppId() {
    return this.appId;
  }

  public Activate setAppId(String appId) {
    this.appId = appId;
    return this;
  }

  public void unsetAppId() {
    this.appId = null;
  }

  /** Returns true if field appId is set (has been assigned a value) and false otherwise */
  public boolean isSetAppId() {
    return this.appId != null;
  }

  public void setAppIdIsSet(boolean value) {
    if (!value) {
      this.appId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CERT_SERIAL:
      if (value == null) {
        unsetCertSerial();
      } else {
        setCertSerial((String)value);
      }
      break;

    case PLATFORM_USER_ID:
      if (value == null) {
        unsetPlatformUserId();
      } else {
        setPlatformUserId((String)value);
      }
      break;

    case COMPANY_NAME:
      if (value == null) {
        unsetCompanyName();
      } else {
        setCompanyName((String)value);
      }
      break;

    case PERSON_NAME:
      if (value == null) {
        unsetPersonName();
      } else {
        setPersonName((String)value);
      }
      break;

    case MOBILE:
      if (value == null) {
        unsetMobile();
      } else {
        setMobile((String)value);
      }
      break;

    case APP_ID:
      if (value == null) {
        unsetAppId();
      } else {
        setAppId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CERT_SERIAL:
      return getCertSerial();

    case PLATFORM_USER_ID:
      return getPlatformUserId();

    case COMPANY_NAME:
      return getCompanyName();

    case PERSON_NAME:
      return getPersonName();

    case MOBILE:
      return getMobile();

    case APP_ID:
      return getAppId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CERT_SERIAL:
      return isSetCertSerial();
    case PLATFORM_USER_ID:
      return isSetPlatformUserId();
    case COMPANY_NAME:
      return isSetCompanyName();
    case PERSON_NAME:
      return isSetPersonName();
    case MOBILE:
      return isSetMobile();
    case APP_ID:
      return isSetAppId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Activate)
      return this.equals((Activate)that);
    return false;
  }

  public boolean equals(Activate that) {
    if (that == null)
      return false;

    boolean this_present_certSerial = true && this.isSetCertSerial();
    boolean that_present_certSerial = true && that.isSetCertSerial();
    if (this_present_certSerial || that_present_certSerial) {
      if (!(this_present_certSerial && that_present_certSerial))
        return false;
      if (!this.certSerial.equals(that.certSerial))
        return false;
    }

    boolean this_present_platformUserId = true && this.isSetPlatformUserId();
    boolean that_present_platformUserId = true && that.isSetPlatformUserId();
    if (this_present_platformUserId || that_present_platformUserId) {
      if (!(this_present_platformUserId && that_present_platformUserId))
        return false;
      if (!this.platformUserId.equals(that.platformUserId))
        return false;
    }

    boolean this_present_companyName = true && this.isSetCompanyName();
    boolean that_present_companyName = true && that.isSetCompanyName();
    if (this_present_companyName || that_present_companyName) {
      if (!(this_present_companyName && that_present_companyName))
        return false;
      if (!this.companyName.equals(that.companyName))
        return false;
    }

    boolean this_present_personName = true && this.isSetPersonName();
    boolean that_present_personName = true && that.isSetPersonName();
    if (this_present_personName || that_present_personName) {
      if (!(this_present_personName && that_present_personName))
        return false;
      if (!this.personName.equals(that.personName))
        return false;
    }

    boolean this_present_mobile = true && this.isSetMobile();
    boolean that_present_mobile = true && that.isSetMobile();
    if (this_present_mobile || that_present_mobile) {
      if (!(this_present_mobile && that_present_mobile))
        return false;
      if (!this.mobile.equals(that.mobile))
        return false;
    }

    boolean this_present_appId = true && this.isSetAppId();
    boolean that_present_appId = true && that.isSetAppId();
    if (this_present_appId || that_present_appId) {
      if (!(this_present_appId && that_present_appId))
        return false;
      if (!this.appId.equals(that.appId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_certSerial = true && (isSetCertSerial());
    list.add(present_certSerial);
    if (present_certSerial)
      list.add(certSerial);

    boolean present_platformUserId = true && (isSetPlatformUserId());
    list.add(present_platformUserId);
    if (present_platformUserId)
      list.add(platformUserId);

    boolean present_companyName = true && (isSetCompanyName());
    list.add(present_companyName);
    if (present_companyName)
      list.add(companyName);

    boolean present_personName = true && (isSetPersonName());
    list.add(present_personName);
    if (present_personName)
      list.add(personName);

    boolean present_mobile = true && (isSetMobile());
    list.add(present_mobile);
    if (present_mobile)
      list.add(mobile);

    boolean present_appId = true && (isSetAppId());
    list.add(present_appId);
    if (present_appId)
      list.add(appId);

    return list.hashCode();
  }

  @Override
  public int compareTo(Activate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCertSerial()).compareTo(other.isSetCertSerial());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCertSerial()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.certSerial, other.certSerial);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPlatformUserId()).compareTo(other.isSetPlatformUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPlatformUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.platformUserId, other.platformUserId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCompanyName()).compareTo(other.isSetCompanyName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompanyName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.companyName, other.companyName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPersonName()).compareTo(other.isSetPersonName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPersonName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.personName, other.personName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMobile()).compareTo(other.isSetMobile());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMobile()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mobile, other.mobile);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAppId()).compareTo(other.isSetAppId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appId, other.appId);
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
    StringBuilder sb = new StringBuilder("Activate(");
    boolean first = true;

    sb.append("certSerial:");
    if (this.certSerial == null) {
      sb.append("null");
    } else {
      sb.append(this.certSerial);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("platformUserId:");
    if (this.platformUserId == null) {
      sb.append("null");
    } else {
      sb.append(this.platformUserId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("companyName:");
    if (this.companyName == null) {
      sb.append("null");
    } else {
      sb.append(this.companyName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("personName:");
    if (this.personName == null) {
      sb.append("null");
    } else {
      sb.append(this.personName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mobile:");
    if (this.mobile == null) {
      sb.append("null");
    } else {
      sb.append(this.mobile);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("appId:");
    if (this.appId == null) {
      sb.append("null");
    } else {
      sb.append(this.appId);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ActivateStandardSchemeFactory implements SchemeFactory {
    public ActivateStandardScheme getScheme() {
      return new ActivateStandardScheme();
    }
  }

  private static class ActivateStandardScheme extends StandardScheme<Activate> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Activate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CERT_SERIAL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.certSerial = iprot.readString();
              struct.setCertSerialIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PLATFORM_USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.platformUserId = iprot.readString();
              struct.setPlatformUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COMPANY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.companyName = iprot.readString();
              struct.setCompanyNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PERSON_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.personName = iprot.readString();
              struct.setPersonNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MOBILE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mobile = iprot.readString();
              struct.setMobileIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // APP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.appId = iprot.readString();
              struct.setAppIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Activate struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.certSerial != null) {
        oprot.writeFieldBegin(CERT_SERIAL_FIELD_DESC);
        oprot.writeString(struct.certSerial);
        oprot.writeFieldEnd();
      }
      if (struct.platformUserId != null) {
        oprot.writeFieldBegin(PLATFORM_USER_ID_FIELD_DESC);
        oprot.writeString(struct.platformUserId);
        oprot.writeFieldEnd();
      }
      if (struct.companyName != null) {
        oprot.writeFieldBegin(COMPANY_NAME_FIELD_DESC);
        oprot.writeString(struct.companyName);
        oprot.writeFieldEnd();
      }
      if (struct.personName != null) {
        oprot.writeFieldBegin(PERSON_NAME_FIELD_DESC);
        oprot.writeString(struct.personName);
        oprot.writeFieldEnd();
      }
      if (struct.mobile != null) {
        oprot.writeFieldBegin(MOBILE_FIELD_DESC);
        oprot.writeString(struct.mobile);
        oprot.writeFieldEnd();
      }
      if (struct.appId != null) {
        oprot.writeFieldBegin(APP_ID_FIELD_DESC);
        oprot.writeString(struct.appId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ActivateTupleSchemeFactory implements SchemeFactory {
    public ActivateTupleScheme getScheme() {
      return new ActivateTupleScheme();
    }
  }

  private static class ActivateTupleScheme extends TupleScheme<Activate> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Activate struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCertSerial()) {
        optionals.set(0);
      }
      if (struct.isSetPlatformUserId()) {
        optionals.set(1);
      }
      if (struct.isSetCompanyName()) {
        optionals.set(2);
      }
      if (struct.isSetPersonName()) {
        optionals.set(3);
      }
      if (struct.isSetMobile()) {
        optionals.set(4);
      }
      if (struct.isSetAppId()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetCertSerial()) {
        oprot.writeString(struct.certSerial);
      }
      if (struct.isSetPlatformUserId()) {
        oprot.writeString(struct.platformUserId);
      }
      if (struct.isSetCompanyName()) {
        oprot.writeString(struct.companyName);
      }
      if (struct.isSetPersonName()) {
        oprot.writeString(struct.personName);
      }
      if (struct.isSetMobile()) {
        oprot.writeString(struct.mobile);
      }
      if (struct.isSetAppId()) {
        oprot.writeString(struct.appId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Activate struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.certSerial = iprot.readString();
        struct.setCertSerialIsSet(true);
      }
      if (incoming.get(1)) {
        struct.platformUserId = iprot.readString();
        struct.setPlatformUserIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.companyName = iprot.readString();
        struct.setCompanyNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.personName = iprot.readString();
        struct.setPersonNameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.mobile = iprot.readString();
        struct.setMobileIsSet(true);
      }
      if (incoming.get(5)) {
        struct.appId = iprot.readString();
        struct.setAppIdIsSet(true);
      }
    }
  }

}

