// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Customer.proto

package com.vv.personal.prom.artifactory.proto;

/**
 * Protobuf type {@code com.vv.personal.prom.artifactory.proto.Company}
 */
public final class Company extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:com.vv.personal.prom.artifactory.proto.Company)
        CompanyOrBuilder {
  public static final int COMPANYID_FIELD_NUMBER = 1;

  // Use Company.newBuilder() to construct.
  private Company(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Company() {
    companyId_ = 0;
    companyName_ = "";
    companyContactPerson_ = "";
    contactNumbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  public static final int COMPANYNAME_FIELD_NUMBER = 2;
  public static final int COMPANYCONTACTPERSON_FIELD_NUMBER = 3;
  public static final int CONTACTNUMBERS_FIELD_NUMBER = 4;
  private static final long serialVersionUID = 0L;
  // @@protoc_insertion_point(class_scope:com.vv.personal.prom.artifactory.proto.Company)
  private static final com.vv.personal.prom.artifactory.proto.Company DEFAULT_INSTANCE;
  private static final com.google.protobuf.Parser<Company>
          PARSER = new com.google.protobuf.AbstractParser<Company>() {
    @java.lang.Override
    public Company parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return new Company(input, extensionRegistry);
    }
  };

  static {
    DEFAULT_INSTANCE = new com.vv.personal.prom.artifactory.proto.Company();
  }

  private int bitField0_;
  private int companyId_;
  private volatile java.lang.Object companyName_;
  private volatile java.lang.Object companyContactPerson_;
  private com.google.protobuf.LazyStringList contactNumbers_;
  private byte memoizedIsInitialized = -1;

  private Company(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            companyId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            companyName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            companyContactPerson_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              contactNumbers_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000008;
            }
            contactNumbers_.add(s);
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                    input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        contactNumbers_ = contactNumbers_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor
  getDescriptor() {
    return com.vv.personal.prom.artifactory.proto.CustomerProto.internal_static_com_vv_personal_prom_artifactory_proto_Company_descriptor;
  }

  public static com.vv.personal.prom.artifactory.proto.Company parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.vv.personal.prom.artifactory.proto.Company parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.Company parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.vv.personal.prom.artifactory.proto.Company parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.Company parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.vv.personal.prom.artifactory.proto.Company parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.Company parseFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static com.vv.personal.prom.artifactory.proto.Company parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.Company parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.vv.personal.prom.artifactory.proto.Company parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.Company parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static com.vv.personal.prom.artifactory.proto.Company parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + COMPANYID_FIELD_NUMBER;
    hash = (53 * hash) + getCompanyId();
    hash = (37 * hash) + COMPANYNAME_FIELD_NUMBER;
    hash = (53 * hash) + getCompanyName().hashCode();
    hash = (37 * hash) + COMPANYCONTACTPERSON_FIELD_NUMBER;
    hash = (53 * hash) + getCompanyContactPerson().hashCode();
    if (getContactNumbersCount() > 0) {
      hash = (37 * hash) + CONTACTNUMBERS_FIELD_NUMBER;
      hash = (53 * hash) + getContactNumbersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.vv.personal.prom.artifactory.proto.Company prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static com.vv.personal.prom.artifactory.proto.Company getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Parser<Company> parser() {
    return PARSER;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return com.vv.personal.prom.artifactory.proto.CustomerProto.internal_static_com_vv_personal_prom_artifactory_proto_Company_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                    com.vv.personal.prom.artifactory.proto.Company.class, com.vv.personal.prom.artifactory.proto.Company.Builder.class);
  }

  /**
   * <code>int32 companyId = 1;</code>
   */
  public int getCompanyId() {
    return companyId_;
  }

  /**
   * <code>string companyName = 2;</code>
   */
  public java.lang.String getCompanyName() {
    java.lang.Object ref = companyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      companyName_ = s;
      return s;
    }
  }

  /**
   * <code>string companyName = 2;</code>
   */
  public com.google.protobuf.ByteString
  getCompanyNameBytes() {
    java.lang.Object ref = companyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
      companyName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  /**
   * <pre>
   *could be the owner as well, but can be left empty.
   * </pre>
   *
   * <code>string companyContactPerson = 3;</code>
   */
  public java.lang.String getCompanyContactPerson() {
    java.lang.Object ref = companyContactPerson_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      companyContactPerson_ = s;
      return s;
    }
  }

  /**
   * <pre>
   * could be the owner as well, but can be left empty.
   * </pre>
   *
   * <code>string companyContactPerson = 3;</code>
   */
  public com.google.protobuf.ByteString
  getCompanyContactPersonBytes() {
    java.lang.Object ref = companyContactPerson_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
      companyContactPerson_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  /**
   * <pre>
   * can be left empty.
   * </pre>
   *
   * <code>repeated string contactNumbers = 4;</code>
   */
  public com.google.protobuf.ProtocolStringList
  getContactNumbersList() {
    return contactNumbers_;
  }

  /**
   * <pre>
   *can be left empty.
   * </pre>
   *
   * <code>repeated string contactNumbers = 4;</code>
   */
  public int getContactNumbersCount() {
    return contactNumbers_.size();
  }

  /**
   * <pre>
   *can be left empty.
   * </pre>
   *
   * <code>repeated string contactNumbers = 4;</code>
   */
  public java.lang.String getContactNumbers(int index) {
    return contactNumbers_.get(index);
  }

  /**
   * <pre>
   * can be left empty.
   * </pre>
   *
   * <code>repeated string contactNumbers = 4;</code>
   */
  public com.google.protobuf.ByteString
  getContactNumbersBytes(int index) {
    return contactNumbers_.getByteString(index);
  }

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
          throws java.io.IOException {
    if (companyId_ != 0) {
      output.writeInt32(1, companyId_);
    }
    if (!getCompanyNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, companyName_);
    }
    if (!getCompanyContactPersonBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, companyContactPerson_);
    }
    for (int i = 0; i < contactNumbers_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, contactNumbers_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (companyId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, companyId_);
    }
    if (!getCompanyNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, companyName_);
    }
    if (!getCompanyContactPersonBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, companyContactPerson_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < contactNumbers_.size(); i++) {
        dataSize += computeStringSizeNoTag(contactNumbers_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getContactNumbersList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.vv.personal.prom.artifactory.proto.Company)) {
      return super.equals(obj);
    }
    com.vv.personal.prom.artifactory.proto.Company other = (com.vv.personal.prom.artifactory.proto.Company) obj;

    boolean result = true;
    result = result && (getCompanyId()
            == other.getCompanyId());
    result = result && getCompanyName()
            .equals(other.getCompanyName());
    result = result && getCompanyContactPerson()
            .equals(other.getCompanyContactPerson());
    result = result && getContactNumbersList()
            .equals(other.getContactNumbersList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Company> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.vv.personal.prom.artifactory.proto.Company getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  /**
   * Protobuf type {@code com.vv.personal.prom.artifactory.proto.Company}
   */
  public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:com.vv.personal.prom.artifactory.proto.Company)
          com.vv.personal.prom.artifactory.proto.CompanyOrBuilder {
    private int bitField0_;
    private int companyId_;
    private java.lang.Object companyName_ = "";
    private java.lang.Object companyContactPerson_ = "";
    private com.google.protobuf.LazyStringList contactNumbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;

    @java.lang.Override
    public Builder clear() {
      super.clear();
      companyId_ = 0;

      companyName_ = "";

      companyContactPerson_ = "";

      contactNumbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    // Construct using com.vv.personal.prom.artifactory.proto.Company.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.vv.personal.prom.artifactory.proto.CustomerProto.internal_static_com_vv_personal_prom_artifactory_proto_Company_descriptor;
    }

    @java.lang.Override
    public com.vv.personal.prom.artifactory.proto.Company buildPartial() {
      com.vv.personal.prom.artifactory.proto.Company result = new com.vv.personal.prom.artifactory.proto.Company(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.companyId_ = companyId_;
      result.companyName_ = companyName_;
      result.companyContactPerson_ = companyContactPerson_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        contactNumbers_ = contactNumbers_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.contactNumbers_ = contactNumbers_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.vv.personal.prom.artifactory.proto.CustomerProto.internal_static_com_vv_personal_prom_artifactory_proto_Company_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      com.vv.personal.prom.artifactory.proto.Company.class, com.vv.personal.prom.artifactory.proto.Company.Builder.class);
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return com.vv.personal.prom.artifactory.proto.CustomerProto.internal_static_com_vv_personal_prom_artifactory_proto_Company_descriptor;
    }

    @java.lang.Override
    public com.vv.personal.prom.artifactory.proto.Company getDefaultInstanceForType() {
      return com.vv.personal.prom.artifactory.proto.Company.getDefaultInstance();
    }

    @java.lang.Override
    public com.vv.personal.prom.artifactory.proto.Company build() {
      com.vv.personal.prom.artifactory.proto.Company result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.vv.personal.prom.artifactory.proto.Company) {
        return mergeFrom((com.vv.personal.prom.artifactory.proto.Company) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.vv.personal.prom.artifactory.proto.Company other) {
      if (other == com.vv.personal.prom.artifactory.proto.Company.getDefaultInstance()) return this;
      if (other.getCompanyId() != 0) {
        setCompanyId(other.getCompanyId());
      }
      if (!other.getCompanyName().isEmpty()) {
        companyName_ = other.companyName_;
        onChanged();
      }
      if (!other.getCompanyContactPerson().isEmpty()) {
        companyContactPerson_ = other.companyContactPerson_;
        onChanged();
      }
      if (!other.contactNumbers_.isEmpty()) {
        if (contactNumbers_.isEmpty()) {
          contactNumbers_ = other.contactNumbers_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureContactNumbersIsMutable();
          contactNumbers_.addAll(other.contactNumbers_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      com.vv.personal.prom.artifactory.proto.Company parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.vv.personal.prom.artifactory.proto.Company) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    /**
     * <code>int32 companyId = 1;</code>
     */
    public int getCompanyId() {
      return companyId_;
    }

    /**
     * <code>int32 companyId = 1;</code>
     */
    public Builder setCompanyId(int value) {

      companyId_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>int32 companyId = 1;</code>
     */
    public Builder clearCompanyId() {

      companyId_ = 0;
      onChanged();
      return this;
    }

    /**
     * <code>string companyName = 2;</code>
     */
    public java.lang.String getCompanyName() {
      java.lang.Object ref = companyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        companyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>string companyName = 2;</code>
     */
    public Builder setCompanyName(
            java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      companyName_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string companyName = 2;</code>
     */
    public com.google.protobuf.ByteString
    getCompanyNameBytes() {
      java.lang.Object ref = companyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        companyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>string companyName = 2;</code>
     */
    public Builder setCompanyNameBytes(
            com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      companyName_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string companyName = 2;</code>
     */
    public Builder clearCompanyName() {

      companyName_ = getDefaultInstance().getCompanyName();
      onChanged();
      return this;
    }

    /**
     * <pre>
     *could be the owner as well, but can be left empty.
     * </pre>
     *
     * <code>string companyContactPerson = 3;</code>
     */
    public java.lang.String getCompanyContactPerson() {
      java.lang.Object ref = companyContactPerson_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        companyContactPerson_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <pre>
     * could be the owner as well, but can be left empty.
     * </pre>
     *
     * <code>string companyContactPerson = 3;</code>
     */
    public Builder setCompanyContactPerson(
            java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      companyContactPerson_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * could be the owner as well, but can be left empty.
     * </pre>
     *
     * <code>string companyContactPerson = 3;</code>
     */
    public com.google.protobuf.ByteString
    getCompanyContactPersonBytes() {
      java.lang.Object ref = companyContactPerson_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        companyContactPerson_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <pre>
     * could be the owner as well, but can be left empty.
     * </pre>
     *
     * <code>string companyContactPerson = 3;</code>
     */
    public Builder setCompanyContactPersonBytes(
            com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      companyContactPerson_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     *could be the owner as well, but can be left empty.
     * </pre>
     *
     * <code>string companyContactPerson = 3;</code>
     */
    public Builder clearCompanyContactPerson() {

      companyContactPerson_ = getDefaultInstance().getCompanyContactPerson();
      onChanged();
      return this;
    }

    private void ensureContactNumbersIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        contactNumbers_ = new com.google.protobuf.LazyStringArrayList(contactNumbers_);
        bitField0_ |= 0x00000008;
      }
    }

    /**
     * <pre>
     * can be left empty.
     * </pre>
     *
     * <code>repeated string contactNumbers = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList
    getContactNumbersList() {
      return contactNumbers_.getUnmodifiableView();
    }

    /**
     * <pre>
     *can be left empty.
     * </pre>
     *
     * <code>repeated string contactNumbers = 4;</code>
     */
    public int getContactNumbersCount() {
      return contactNumbers_.size();
    }

    /**
     * <pre>
     * can be left empty.
     * </pre>
     *
     * <code>repeated string contactNumbers = 4;</code>
     */
    public java.lang.String getContactNumbers(int index) {
      return contactNumbers_.get(index);
    }

    /**
     * <pre>
     * can be left empty.
     * </pre>
     *
     * <code>repeated string contactNumbers = 4;</code>
     */
    public com.google.protobuf.ByteString
    getContactNumbersBytes(int index) {
      return contactNumbers_.getByteString(index);
    }

    /**
     * <pre>
     * can be left empty.
     * </pre>
     *
     * <code>repeated string contactNumbers = 4;</code>
     */
    public Builder setContactNumbers(
            int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureContactNumbersIsMutable();
      contactNumbers_.set(index, value);
      onChanged();
      return this;
    }

    /**
     * <pre>
     * can be left empty.
     * </pre>
     *
     * <code>repeated string contactNumbers = 4;</code>
     */
    public Builder addContactNumbers(
            java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureContactNumbersIsMutable();
      contactNumbers_.add(value);
      onChanged();
      return this;
    }

    /**
     * <pre>
     * can be left empty.
     * </pre>
     *
     * <code>repeated string contactNumbers = 4;</code>
     */
    public Builder addAllContactNumbers(
            java.lang.Iterable<java.lang.String> values) {
      ensureContactNumbersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, contactNumbers_);
      onChanged();
      return this;
    }

    /**
     * <pre>
     * can be left empty.
     * </pre>
     *
     * <code>repeated string contactNumbers = 4;</code>
     */
    public Builder clearContactNumbers() {
      contactNumbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }

    /**
     * <pre>
     * can be left empty.
     * </pre>
     *
     * <code>repeated string contactNumbers = 4;</code>
     */
    public Builder addContactNumbersBytes(
            com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureContactNumbersIsMutable();
      contactNumbers_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.vv.personal.prom.artifactory.proto.Company)
  }

}

