// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Make.proto

package com.vv.personal.prom.artifactory.proto;

/**
 * Protobuf type {@code com.vv.personal.prom.artifactory.proto.Make}
 */
public final class Make extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:com.vv.personal.prom.artifactory.proto.Make)
        MakeOrBuilder {
  public static final int MAKEID_FIELD_NUMBER = 1;

  // Use Make.newBuilder() to construct.
  private Make(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Make() {
    makeId_ = 0;
    makeName_ = "";
  }

  public static final int MAKENAME_FIELD_NUMBER = 2;
  private static final long serialVersionUID = 0L;
  // @@protoc_insertion_point(class_scope:com.vv.personal.prom.artifactory.proto.Make)
  private static final com.vv.personal.prom.artifactory.proto.Make DEFAULT_INSTANCE;
  private static final com.google.protobuf.Parser<Make>
          PARSER = new com.google.protobuf.AbstractParser<Make>() {
    @java.lang.Override
    public Make parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return new Make(input, extensionRegistry);
    }
  };

  static {
    DEFAULT_INSTANCE = new com.vv.personal.prom.artifactory.proto.Make();
  }

  private int makeId_;
  private volatile java.lang.Object makeName_;
  private byte memoizedIsInitialized = -1;

  private Make(
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

            makeId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            makeName_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor
  getDescriptor() {
    return com.vv.personal.prom.artifactory.proto.MakeProto.internal_static_com_vv_personal_prom_artifactory_proto_Make_descriptor;
  }

  public static com.vv.personal.prom.artifactory.proto.Make parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.vv.personal.prom.artifactory.proto.Make parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public static com.vv.personal.prom.artifactory.proto.Make parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.vv.personal.prom.artifactory.proto.Make parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.Make parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MAKEID_FIELD_NUMBER;
    hash = (53 * hash) + getMakeId();
    hash = (37 * hash) + MAKENAME_FIELD_NUMBER;
    hash = (53 * hash) + getMakeName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.vv.personal.prom.artifactory.proto.Make parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.Make parseFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static com.vv.personal.prom.artifactory.proto.Make parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.Make parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.vv.personal.prom.artifactory.proto.Make parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.Make parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static com.vv.personal.prom.artifactory.proto.Make parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.vv.personal.prom.artifactory.proto.Make prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static com.vv.personal.prom.artifactory.proto.Make getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Parser<Make> parser() {
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
    return com.vv.personal.prom.artifactory.proto.MakeProto.internal_static_com_vv_personal_prom_artifactory_proto_Make_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                    com.vv.personal.prom.artifactory.proto.Make.class, com.vv.personal.prom.artifactory.proto.Make.Builder.class);
  }

  /**
   * <pre>
   * assuming that there'll never be need to go to long
   * </pre>
   *
   * <code>int32 makeId = 1;</code>
   */
  public int getMakeId() {
    return makeId_;
  }

  /**
   * <code>string makeName = 2;</code>
   */
  public java.lang.String getMakeName() {
    java.lang.Object ref = makeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      makeName_ = s;
      return s;
    }
  }

  /**
   * <code>string makeName = 2;</code>
   */
  public com.google.protobuf.ByteString
  getMakeNameBytes() {
    java.lang.Object ref = makeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                      (java.lang.String) ref);
      makeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
          throws java.io.IOException {
    if (makeId_ != 0) {
      output.writeInt32(1, makeId_);
    }
    if (!getMakeNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, makeName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (makeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
              .computeInt32Size(1, makeId_);
    }
    if (!getMakeNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, makeName_);
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
    if (!(obj instanceof com.vv.personal.prom.artifactory.proto.Make)) {
      return super.equals(obj);
    }
    com.vv.personal.prom.artifactory.proto.Make other = (com.vv.personal.prom.artifactory.proto.Make) obj;

    boolean result = true;
    result = result && (getMakeId()
            == other.getMakeId());
    result = result && getMakeName()
            .equals(other.getMakeName());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder(); }

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
  public com.google.protobuf.Parser<Make> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.vv.personal.prom.artifactory.proto.Make getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  /**
   * Protobuf type {@code com.vv.personal.prom.artifactory.proto.Make}
   */
  public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:com.vv.personal.prom.artifactory.proto.Make)
          com.vv.personal.prom.artifactory.proto.MakeOrBuilder {
    private int makeId_;
    private java.lang.Object makeName_ = "";

    // Construct using com.vv.personal.prom.artifactory.proto.Make.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      makeId_ = 0;

      makeName_ = "";

      return this;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.vv.personal.prom.artifactory.proto.MakeProto.internal_static_com_vv_personal_prom_artifactory_proto_Make_descriptor;
    }

    @java.lang.Override
    public com.vv.personal.prom.artifactory.proto.Make getDefaultInstanceForType() {
      return com.vv.personal.prom.artifactory.proto.Make.getDefaultInstance();
    }

    @java.lang.Override
    public com.vv.personal.prom.artifactory.proto.Make build() {
      com.vv.personal.prom.artifactory.proto.Make result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.vv.personal.prom.artifactory.proto.Make buildPartial() {
      com.vv.personal.prom.artifactory.proto.Make result = new com.vv.personal.prom.artifactory.proto.Make(this);
      result.makeId_ = makeId_;
      result.makeName_ = makeName_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.vv.personal.prom.artifactory.proto.MakeProto.internal_static_com_vv_personal_prom_artifactory_proto_Make_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      com.vv.personal.prom.artifactory.proto.Make.class, com.vv.personal.prom.artifactory.proto.Make.Builder.class);
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return com.vv.personal.prom.artifactory.proto.MakeProto.internal_static_com_vv_personal_prom_artifactory_proto_Make_descriptor;
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

    public Builder mergeFrom(com.vv.personal.prom.artifactory.proto.Make other) {
      if (other == com.vv.personal.prom.artifactory.proto.Make.getDefaultInstance()) return this;
      if (other.getMakeId() != 0) {
        setMakeId(other.getMakeId());
      }
      if (!other.getMakeName().isEmpty()) {
        makeName_ = other.makeName_;
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
    public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.vv.personal.prom.artifactory.proto.Make) {
        return mergeFrom((com.vv.personal.prom.artifactory.proto.Make) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      com.vv.personal.prom.artifactory.proto.Make parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.vv.personal.prom.artifactory.proto.Make) e.getUnfinishedMessage();
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
     * <code>int32 makeId = 1;</code>
     */
    public int getMakeId() {
      return makeId_;
    }

    /**
     * <pre>
     *assuming that there'll never be need to go to long
     * </pre>
     *
     * <code>int32 makeId = 1;</code>
     */
    public Builder setMakeId(int value) {

      makeId_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     *assuming that there'll never be need to go to long
     * </pre>
     *
     * <code>int32 makeId = 1;</code>
     */
    public Builder clearMakeId() {

      makeId_ = 0;
      onChanged();
      return this;
    }

    /**
     * <code>string makeName = 2;</code>
     */
    public java.lang.String getMakeName() {
      java.lang.Object ref = makeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        makeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>string makeName = 2;</code>
     */
    public Builder setMakeName(
            java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      makeName_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string makeName = 2;</code>
     */
    public com.google.protobuf.ByteString
    getMakeNameBytes() {
      java.lang.Object ref = makeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                        (java.lang.String) ref);
        makeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>string makeName = 2;</code>
     */
    public Builder setMakeNameBytes(
            com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      makeName_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string makeName = 2;</code>
     */
    public Builder clearMakeName() {

      makeName_ = getDefaultInstance().getMakeName();
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


    // @@protoc_insertion_point(builder_scope:com.vv.personal.prom.artifactory.proto.Make)
  }

}

