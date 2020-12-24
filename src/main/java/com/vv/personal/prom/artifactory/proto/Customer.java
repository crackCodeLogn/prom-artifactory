// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Customer.proto

package com.vv.personal.prom.artifactory.proto;

/**
 * Protobuf type {@code com.vv.personal.prom.artifactory.proto.Customer}
 */
public final class Customer extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:com.vv.personal.prom.artifactory.proto.Customer)
        CustomerOrBuilder {
  public static final int CUSTOMERID_FIELD_NUMBER = 1;

  // Use Customer.newBuilder() to construct.
  private Customer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  public static final int FIRSTNAME_FIELD_NUMBER = 2;
  public static final int LASTNAME_FIELD_NUMBER = 3;
  public static final int CONTACTNUMBERS_FIELD_NUMBER = 4;
  public static final int COMPANYID_FIELD_NUMBER = 5;
  public static final int COMPANYNAME_FIELD_NUMBER = 6;
  private static final long serialVersionUID = 0L;
  // @@protoc_insertion_point(class_scope:com.vv.personal.prom.artifactory.proto.Customer)
  private static final com.vv.personal.prom.artifactory.proto.Customer DEFAULT_INSTANCE;
  private static final com.google.protobuf.Parser<Customer>
          PARSER = new com.google.protobuf.AbstractParser<Customer>() {
    @java.lang.Override
    public Customer parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return new Customer(input, extensionRegistry);
    }
  };

  static {
    DEFAULT_INSTANCE = new com.vv.personal.prom.artifactory.proto.Customer();
  }

  private int bitField0_;
  private int customerId_;
  private volatile java.lang.Object firstName_;
  private volatile java.lang.Object lastName_;
  private com.google.protobuf.LazyStringList contactNumbers_;
  private int companyId_;
  private volatile java.lang.Object companyName_;
  private byte memoizedIsInitialized = -1;

  private Customer() {
    customerId_ = 0;
    firstName_ = "";
    lastName_ = "";
    contactNumbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    companyId_ = 0;
    companyName_ = "";
  }

  private Customer(
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

            customerId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            firstName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            lastName_ = s;
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
          case 40: {

            companyId_ = input.readInt32();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            companyName_ = s;
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
    return com.vv.personal.prom.artifactory.proto.CustomerProto.internal_static_com_vv_personal_prom_artifactory_proto_Customer_descriptor;
  }

  public static com.vv.personal.prom.artifactory.proto.Customer parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.vv.personal.prom.artifactory.proto.Customer parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.Customer parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.vv.personal.prom.artifactory.proto.Customer parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.Customer parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.vv.personal.prom.artifactory.proto.Customer parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.Customer parseFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static com.vv.personal.prom.artifactory.proto.Customer parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.Customer parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.vv.personal.prom.artifactory.proto.Customer parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.Customer parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static com.vv.personal.prom.artifactory.proto.Customer parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.vv.personal.prom.artifactory.proto.Customer prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static com.vv.personal.prom.artifactory.proto.Customer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Parser<Customer> parser() {
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
    return com.vv.personal.prom.artifactory.proto.CustomerProto.internal_static_com_vv_personal_prom_artifactory_proto_Customer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                    com.vv.personal.prom.artifactory.proto.Customer.class, com.vv.personal.prom.artifactory.proto.Customer.Builder.class);
  }

  /**
   * <pre>
   * assuming that there'll never be need to go to long
   * </pre>
   *
   * <code>int32 customerId = 1;</code>
   */
  public int getCustomerId() {
    return customerId_;
  }

  /**
   * <code>string firstName = 2;</code>
   */
  public java.lang.String getFirstName() {
    java.lang.Object ref = firstName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      firstName_ = s;
      return s;
    }
  }

  /**
   * <code>string firstName = 2;</code>
   */
  public com.google.protobuf.ByteString
  getFirstNameBytes() {
    java.lang.Object ref = firstName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
      firstName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  /**
   * <code>string lastName = 3;</code>
   */
  public java.lang.String getLastName() {
    java.lang.Object ref = lastName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lastName_ = s;
      return s;
    }
  }

  /**
   * <code>string lastName = 3;</code>
   */
  public com.google.protobuf.ByteString
  getLastNameBytes() {
    java.lang.Object ref = lastName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
      lastName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  /**
   * <code>repeated string contactNumbers = 4;</code>
   */
  public com.google.protobuf.ProtocolStringList
  getContactNumbersList() {
    return contactNumbers_;
  }

  /**
   * <code>repeated string contactNumbers = 4;</code>
   */
  public int getContactNumbersCount() {
    return contactNumbers_.size();
  }

  /**
   * <code>repeated string contactNumbers = 4;</code>
   */
  public java.lang.String getContactNumbers(int index) {
    return contactNumbers_.get(index);
  }

  /**
   * <code>repeated string contactNumbers = 4;</code>
   */
  public com.google.protobuf.ByteString
  getContactNumbersBytes(int index) {
    return contactNumbers_.getByteString(index);
  }

  /**
   * <code>int32 companyId = 5;</code>
   */
  public int getCompanyId() {
    return companyId_;
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  /**
   * <code>string companyName = 6;</code>
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
   * <code>string companyName = 6;</code>
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
    if (customerId_ != 0) {
      output.writeInt32(1, customerId_);
    }
    if (!getFirstNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, firstName_);
    }
    if (!getLastNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lastName_);
    }
    for (int i = 0; i < contactNumbers_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, contactNumbers_.getRaw(i));
    }
    if (companyId_ != 0) {
      output.writeInt32(5, companyId_);
    }
    if (!getCompanyNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, companyName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (customerId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, customerId_);
    }
    if (!getFirstNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, firstName_);
    }
    if (!getLastNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lastName_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < contactNumbers_.size(); i++) {
        dataSize += computeStringSizeNoTag(contactNumbers_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getContactNumbersList().size();
    }
    if (companyId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
              .computeInt32Size(5, companyId_);
    }
    if (!getCompanyNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, companyName_);
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
    if (!(obj instanceof com.vv.personal.prom.artifactory.proto.Customer)) {
      return super.equals(obj);
    }
    com.vv.personal.prom.artifactory.proto.Customer other = (com.vv.personal.prom.artifactory.proto.Customer) obj;

    boolean result = true;
    result = result && (getCustomerId()
            == other.getCustomerId());
    result = result && getFirstName()
            .equals(other.getFirstName());
    result = result && getLastName()
            .equals(other.getLastName());
    result = result && getContactNumbersList()
            .equals(other.getContactNumbersList());
    result = result && (getCompanyId()
            == other.getCompanyId());
    result = result && getCompanyName()
            .equals(other.getCompanyName());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CUSTOMERID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId();
    hash = (37 * hash) + FIRSTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getFirstName().hashCode();
    hash = (37 * hash) + LASTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getLastName().hashCode();
    if (getContactNumbersCount() > 0) {
      hash = (37 * hash) + CONTACTNUMBERS_FIELD_NUMBER;
      hash = (53 * hash) + getContactNumbersList().hashCode();
    }
    hash = (37 * hash) + COMPANYID_FIELD_NUMBER;
    hash = (53 * hash) + getCompanyId();
    hash = (37 * hash) + COMPANYNAME_FIELD_NUMBER;
    hash = (53 * hash) + getCompanyName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

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
  public com.google.protobuf.Parser<Customer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.vv.personal.prom.artifactory.proto.Customer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  /**
   * Protobuf type {@code com.vv.personal.prom.artifactory.proto.Customer}
   */
  public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:com.vv.personal.prom.artifactory.proto.Customer)
          com.vv.personal.prom.artifactory.proto.CustomerOrBuilder {
    private int bitField0_;
    private int customerId_;
    private java.lang.Object firstName_ = "";
    private java.lang.Object lastName_ = "";
    private com.google.protobuf.LazyStringList contactNumbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private int companyId_;
    private java.lang.Object companyName_ = "";

    // Construct using com.vv.personal.prom.artifactory.proto.Customer.newBuilder()
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
      return com.vv.personal.prom.artifactory.proto.CustomerProto.internal_static_com_vv_personal_prom_artifactory_proto_Customer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.vv.personal.prom.artifactory.proto.CustomerProto.internal_static_com_vv_personal_prom_artifactory_proto_Customer_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      com.vv.personal.prom.artifactory.proto.Customer.class, com.vv.personal.prom.artifactory.proto.Customer.Builder.class);
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      customerId_ = 0;

      firstName_ = "";

      lastName_ = "";

      contactNumbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      companyId_ = 0;

      companyName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return com.vv.personal.prom.artifactory.proto.CustomerProto.internal_static_com_vv_personal_prom_artifactory_proto_Customer_descriptor;
    }

    @java.lang.Override
    public com.vv.personal.prom.artifactory.proto.Customer getDefaultInstanceForType() {
      return com.vv.personal.prom.artifactory.proto.Customer.getDefaultInstance();
    }

    @java.lang.Override
    public com.vv.personal.prom.artifactory.proto.Customer build() {
      com.vv.personal.prom.artifactory.proto.Customer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.vv.personal.prom.artifactory.proto.Customer) {
        return mergeFrom((com.vv.personal.prom.artifactory.proto.Customer) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    @java.lang.Override
    public com.vv.personal.prom.artifactory.proto.Customer buildPartial() {
      com.vv.personal.prom.artifactory.proto.Customer result = new com.vv.personal.prom.artifactory.proto.Customer(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.customerId_ = customerId_;
      result.firstName_ = firstName_;
      result.lastName_ = lastName_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        contactNumbers_ = contactNumbers_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.contactNumbers_ = contactNumbers_;
      result.companyId_ = companyId_;
      result.companyName_ = companyName_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
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

    public Builder mergeFrom(com.vv.personal.prom.artifactory.proto.Customer other) {
      if (other == com.vv.personal.prom.artifactory.proto.Customer.getDefaultInstance()) return this;
      if (other.getCustomerId() != 0) {
        setCustomerId(other.getCustomerId());
      }
      if (!other.getFirstName().isEmpty()) {
        firstName_ = other.firstName_;
        onChanged();
      }
      if (!other.getLastName().isEmpty()) {
        lastName_ = other.lastName_;
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
      if (other.getCompanyId() != 0) {
        setCompanyId(other.getCompanyId());
      }
      if (!other.getCompanyName().isEmpty()) {
        companyName_ = other.companyName_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
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
      com.vv.personal.prom.artifactory.proto.Customer parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.vv.personal.prom.artifactory.proto.Customer) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    /**
     * <pre>
     *assuming that there'll never be need to go to long
     * </pre>
     *
     * <code>int32 customerId = 1;</code>
     */
    public int getCustomerId() {
      return customerId_;
    }

    /**
     * <pre>
     *assuming that there'll never be need to go to long
     * </pre>
     *
     * <code>int32 customerId = 1;</code>
     */
    public Builder setCustomerId(int value) {

      customerId_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     *assuming that there'll never be need to go to long
     * </pre>
     *
     * <code>int32 customerId = 1;</code>
     */
    public Builder clearCustomerId() {

      customerId_ = 0;
      onChanged();
      return this;
    }

    /**
     * <code>string firstName = 2;</code>
     */
    public java.lang.String getFirstName() {
      java.lang.Object ref = firstName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        firstName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>string firstName = 2;</code>
     */
    public Builder setFirstName(
            java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      firstName_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string firstName = 2;</code>
     */
    public com.google.protobuf.ByteString
    getFirstNameBytes() {
      java.lang.Object ref = firstName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        firstName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>string firstName = 2;</code>
     */
    public Builder setFirstNameBytes(
            com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      firstName_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string firstName = 2;</code>
     */
    public Builder clearFirstName() {

      firstName_ = getDefaultInstance().getFirstName();
      onChanged();
      return this;
    }

    /**
     * <code>string lastName = 3;</code>
     */
    public java.lang.String getLastName() {
      java.lang.Object ref = lastName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>string lastName = 3;</code>
     */
    public Builder setLastName(
            java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      lastName_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string lastName = 3;</code>
     */
    public com.google.protobuf.ByteString
    getLastNameBytes() {
      java.lang.Object ref = lastName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        lastName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>string lastName = 3;</code>
     */
    public Builder setLastNameBytes(
            com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      lastName_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string lastName = 3;</code>
     */
    public Builder clearLastName() {

      lastName_ = getDefaultInstance().getLastName();
      onChanged();
      return this;
    }

    /**
     * <code>repeated string contactNumbers = 4;</code>
     */
    public int getContactNumbersCount() {
      return contactNumbers_.size();
    }

    /**
     * <code>repeated string contactNumbers = 4;</code>
     */
    public java.lang.String getContactNumbers(int index) {
      return contactNumbers_.get(index);
    }

    private void ensureContactNumbersIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        contactNumbers_ = new com.google.protobuf.LazyStringArrayList(contactNumbers_);
        bitField0_ |= 0x00000008;
      }
    }

    /**
     * <code>repeated string contactNumbers = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList
    getContactNumbersList() {
      return contactNumbers_.getUnmodifiableView();
    }

    /**
     * <code>repeated string contactNumbers = 4;</code>
     */
    public com.google.protobuf.ByteString
    getContactNumbersBytes(int index) {
      return contactNumbers_.getByteString(index);
    }

    /**
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
     * <code>repeated string contactNumbers = 4;</code>
     */
    public Builder clearContactNumbers() {
      contactNumbers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }

    /**
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

    /**
     * <code>int32 companyId = 5;</code>
     */
    public int getCompanyId() {
      return companyId_;
    }

    /**
     * <code>int32 companyId = 5;</code>
     */
    public Builder setCompanyId(int value) {

      companyId_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>int32 companyId = 5;</code>
     */
    public Builder clearCompanyId() {

      companyId_ = 0;
      onChanged();
      return this;
    }

    /**
     * <code>string companyName = 6;</code>
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
     * <code>string companyName = 6;</code>
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
     * <code>string companyName = 6;</code>
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
     * <code>string companyName = 6;</code>
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
     * <code>string companyName = 6;</code>
     */
    public Builder clearCompanyName() {

      companyName_ = getDefaultInstance().getCompanyName();
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


    // @@protoc_insertion_point(builder_scope:com.vv.personal.prom.artifactory.proto.Customer)
  }

}

