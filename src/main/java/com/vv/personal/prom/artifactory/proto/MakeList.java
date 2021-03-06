// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Make.proto

package com.vv.personal.prom.artifactory.proto;

/**
 * Protobuf type {@code com.vv.personal.prom.artifactory.proto.MakeList}
 */
public final class MakeList extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:com.vv.personal.prom.artifactory.proto.MakeList)
        MakeListOrBuilder {
  public static final int MAKE_FIELD_NUMBER = 1;

  // Use MakeList.newBuilder() to construct.
  private MakeList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MakeList() {
    make_ = java.util.Collections.emptyList();
  }

  public static final int AUTH_FIELD_NUMBER = 2;
  private static final long serialVersionUID = 0L;
  // @@protoc_insertion_point(class_scope:com.vv.personal.prom.artifactory.proto.MakeList)
  private static final com.vv.personal.prom.artifactory.proto.MakeList DEFAULT_INSTANCE;
  private static final com.google.protobuf.Parser<MakeList>
          PARSER = new com.google.protobuf.AbstractParser<MakeList>() {
    @java.lang.Override
    public MakeList parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return new MakeList(input, extensionRegistry);
    }
  };

  static {
    DEFAULT_INSTANCE = new com.vv.personal.prom.artifactory.proto.MakeList();
  }

  private int bitField0_;
  private java.util.List<com.vv.personal.prom.artifactory.proto.Make> make_;

  /**
   * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
   */
  public java.util.List<com.vv.personal.prom.artifactory.proto.Make> getMakeList() {
    return make_;
  }

  private com.vv.personal.prom.artifactory.proto.Auth auth_;

  /**
   * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
   */
  public int getMakeCount() {
    return make_.size();
  }

  /**
   * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
   */
  public com.vv.personal.prom.artifactory.proto.Make getMake(int index) {
    return make_.get(index);
  }

  private byte memoizedIsInitialized = -1;

  private MakeList(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              make_ = new java.util.ArrayList<com.vv.personal.prom.artifactory.proto.Make>();
              mutable_bitField0_ |= 0x00000001;
            }
            make_.add(
                    input.readMessage(com.vv.personal.prom.artifactory.proto.Make.parser(), extensionRegistry));
            break;
          }
          case 18: {
            com.vv.personal.prom.artifactory.proto.Auth.Builder subBuilder = null;
            if (auth_ != null) {
              subBuilder = auth_.toBuilder();
            }
            auth_ = input.readMessage(com.vv.personal.prom.artifactory.proto.Auth.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(auth_);
              auth_ = subBuilder.buildPartial();
            }

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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        make_ = java.util.Collections.unmodifiableList(make_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor
  getDescriptor() {
    return com.vv.personal.prom.artifactory.proto.MakeProto.internal_static_com_vv_personal_prom_artifactory_proto_MakeList_descriptor;
  }

  public static com.vv.personal.prom.artifactory.proto.MakeList parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.vv.personal.prom.artifactory.proto.MakeList parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.MakeList parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.vv.personal.prom.artifactory.proto.MakeList parseFrom(
          com.google.protobuf.ByteString data,
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

  public static com.vv.personal.prom.artifactory.proto.MakeList parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.vv.personal.prom.artifactory.proto.MakeList parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.MakeList parseFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static com.vv.personal.prom.artifactory.proto.MakeList parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.MakeList parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.vv.personal.prom.artifactory.proto.MakeList parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.MakeList parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static com.vv.personal.prom.artifactory.proto.MakeList parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.vv.personal.prom.artifactory.proto.MakeList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static com.vv.personal.prom.artifactory.proto.MakeList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Parser<MakeList> parser() {
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
    return com.vv.personal.prom.artifactory.proto.MakeProto.internal_static_com_vv_personal_prom_artifactory_proto_MakeList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                    com.vv.personal.prom.artifactory.proto.MakeList.class, com.vv.personal.prom.artifactory.proto.MakeList.Builder.class);
  }

  /**
   * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
   */
  public java.util.List<? extends com.vv.personal.prom.artifactory.proto.MakeOrBuilder>
  getMakeOrBuilderList() {
    return make_;
  }

  /**
   * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
   */
  public com.vv.personal.prom.artifactory.proto.MakeOrBuilder getMakeOrBuilder(
          int index) {
    return make_.get(index);
  }

  /**
   * <code>.com.vv.personal.prom.artifactory.proto.Auth auth = 2;</code>
   */
  public boolean hasAuth() {
    return auth_ != null;
  }

  /**
   * <code>.com.vv.personal.prom.artifactory.proto.Auth auth = 2;</code>
   */
  public com.vv.personal.prom.artifactory.proto.Auth getAuth() {
    return auth_ == null ? com.vv.personal.prom.artifactory.proto.Auth.getDefaultInstance() : auth_;
  }

  /**
   * <code>.com.vv.personal.prom.artifactory.proto.Auth auth = 2;</code>
   */
  public com.vv.personal.prom.artifactory.proto.AuthOrBuilder getAuthOrBuilder() {
    return getAuth();
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
          throws java.io.IOException {
    for (int i = 0; i < make_.size(); i++) {
      output.writeMessage(1, make_.get(i));
    }
    if (auth_ != null) {
      output.writeMessage(2, getAuth());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < make_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
              .computeMessageSize(1, make_.get(i));
    }
    if (auth_ != null) {
      size += com.google.protobuf.CodedOutputStream
              .computeMessageSize(2, getAuth());
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
    if (!(obj instanceof com.vv.personal.prom.artifactory.proto.MakeList)) {
      return super.equals(obj);
    }
    com.vv.personal.prom.artifactory.proto.MakeList other = (com.vv.personal.prom.artifactory.proto.MakeList) obj;

    boolean result = true;
    result = result && getMakeList()
            .equals(other.getMakeList());
    result = result && (hasAuth() == other.hasAuth());
    if (hasAuth()) {
      result = result && getAuth()
              .equals(other.getAuth());
    }
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
    if (getMakeCount() > 0) {
      hash = (37 * hash) + MAKE_FIELD_NUMBER;
      hash = (53 * hash) + getMakeList().hashCode();
    }
    if (hasAuth()) {
      hash = (37 * hash) + AUTH_FIELD_NUMBER;
      hash = (53 * hash) + getAuth().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
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
  public com.google.protobuf.Parser<MakeList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.vv.personal.prom.artifactory.proto.MakeList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  /**
   * Protobuf type {@code com.vv.personal.prom.artifactory.proto.MakeList}
   */
  public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:com.vv.personal.prom.artifactory.proto.MakeList)
          com.vv.personal.prom.artifactory.proto.MakeListOrBuilder {
    private int bitField0_;
    private java.util.List<com.vv.personal.prom.artifactory.proto.Make> make_ =
            java.util.Collections.emptyList();
    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.vv.personal.prom.artifactory.proto.Make, com.vv.personal.prom.artifactory.proto.Make.Builder, com.vv.personal.prom.artifactory.proto.MakeOrBuilder> makeBuilder_;
    private com.vv.personal.prom.artifactory.proto.Auth auth_ = null;

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getMakeFieldBuilder();
      }
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.vv.personal.prom.artifactory.proto.Auth, com.vv.personal.prom.artifactory.proto.Auth.Builder, com.vv.personal.prom.artifactory.proto.AuthOrBuilder> authBuilder_;

    // Construct using com.vv.personal.prom.artifactory.proto.MakeList.newBuilder()
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
      return com.vv.personal.prom.artifactory.proto.MakeProto.internal_static_com_vv_personal_prom_artifactory_proto_MakeList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.vv.personal.prom.artifactory.proto.MakeProto.internal_static_com_vv_personal_prom_artifactory_proto_MakeList_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      com.vv.personal.prom.artifactory.proto.MakeList.class, com.vv.personal.prom.artifactory.proto.MakeList.Builder.class);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (makeBuilder_ == null) {
        make_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        makeBuilder_.clear();
      }
      if (authBuilder_ == null) {
        auth_ = null;
      } else {
        auth_ = null;
        authBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return com.vv.personal.prom.artifactory.proto.MakeProto.internal_static_com_vv_personal_prom_artifactory_proto_MakeList_descriptor;
    }

    @java.lang.Override
    public com.vv.personal.prom.artifactory.proto.MakeList getDefaultInstanceForType() {
      return com.vv.personal.prom.artifactory.proto.MakeList.getDefaultInstance();
    }

    @java.lang.Override
    public com.vv.personal.prom.artifactory.proto.MakeList build() {
      com.vv.personal.prom.artifactory.proto.MakeList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.vv.personal.prom.artifactory.proto.MakeList buildPartial() {
      com.vv.personal.prom.artifactory.proto.MakeList result = new com.vv.personal.prom.artifactory.proto.MakeList(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (makeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          make_ = java.util.Collections.unmodifiableList(make_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.make_ = make_;
      } else {
        result.make_ = makeBuilder_.build();
      }
      if (authBuilder_ == null) {
        result.auth_ = auth_;
      } else {
        result.auth_ = authBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.vv.personal.prom.artifactory.proto.MakeList) {
        return mergeFrom((com.vv.personal.prom.artifactory.proto.MakeList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
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

    public Builder mergeFrom(com.vv.personal.prom.artifactory.proto.MakeList other) {
      if (other == com.vv.personal.prom.artifactory.proto.MakeList.getDefaultInstance()) return this;
      if (makeBuilder_ == null) {
        if (!other.make_.isEmpty()) {
          if (make_.isEmpty()) {
            make_ = other.make_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMakeIsMutable();
            make_.addAll(other.make_);
          }
          onChanged();
        }
      } else {
        if (!other.make_.isEmpty()) {
          if (makeBuilder_.isEmpty()) {
            makeBuilder_.dispose();
            makeBuilder_ = null;
            make_ = other.make_;
            bitField0_ = (bitField0_ & ~0x00000001);
            makeBuilder_ =
                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                            getMakeFieldBuilder() : null;
          } else {
            makeBuilder_.addAllMessages(other.make_);
          }
        }
      }
      if (other.hasAuth()) {
        mergeAuth(other.getAuth());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
     */
    public java.util.List<com.vv.personal.prom.artifactory.proto.Make> getMakeList() {
      if (makeBuilder_ == null) {
        return java.util.Collections.unmodifiableList(make_);
      } else {
        return makeBuilder_.getMessageList();
      }
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
     */
    public int getMakeCount() {
      if (makeBuilder_ == null) {
        return make_.size();
      } else {
        return makeBuilder_.getCount();
      }
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
     */
    public com.vv.personal.prom.artifactory.proto.Make getMake(int index) {
      if (makeBuilder_ == null) {
        return make_.get(index);
      } else {
        return makeBuilder_.getMessage(index);
      }
    }

    @java.lang.Override
    public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      com.vv.personal.prom.artifactory.proto.MakeList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.vv.personal.prom.artifactory.proto.MakeList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private void ensureMakeIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        make_ = new java.util.ArrayList<com.vv.personal.prom.artifactory.proto.Make>(make_);
        bitField0_ |= 0x00000001;
      }
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
     */
    public Builder addMake(com.vv.personal.prom.artifactory.proto.Make value) {
      if (makeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMakeIsMutable();
        make_.add(value);
        onChanged();
      } else {
        makeBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
     */
    public Builder setMake(
            int index, com.vv.personal.prom.artifactory.proto.Make value) {
      if (makeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMakeIsMutable();
        make_.set(index, value);
        onChanged();
      } else {
        makeBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
     */
    public Builder setMake(
            int index, com.vv.personal.prom.artifactory.proto.Make.Builder builderForValue) {
      if (makeBuilder_ == null) {
        ensureMakeIsMutable();
        make_.set(index, builderForValue.build());
        onChanged();
      } else {
        makeBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
     */
    public Builder addMake(
            int index, com.vv.personal.prom.artifactory.proto.Make value) {
      if (makeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMakeIsMutable();
        make_.add(index, value);
        onChanged();
      } else {
        makeBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
     */
    public Builder addMake(
            com.vv.personal.prom.artifactory.proto.Make.Builder builderForValue) {
      if (makeBuilder_ == null) {
        ensureMakeIsMutable();
        make_.add(builderForValue.build());
        onChanged();
      } else {
        makeBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
     */
    public Builder clearMake() {
      if (makeBuilder_ == null) {
        make_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        makeBuilder_.clear();
      }
      return this;
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
     */
    public Builder removeMake(int index) {
      if (makeBuilder_ == null) {
        ensureMakeIsMutable();
        make_.remove(index);
        onChanged();
      } else {
        makeBuilder_.remove(index);
      }
      return this;
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
     */
    public Builder addMake(
            int index, com.vv.personal.prom.artifactory.proto.Make.Builder builderForValue) {
      if (makeBuilder_ == null) {
        ensureMakeIsMutable();
        make_.add(index, builderForValue.build());
        onChanged();
      } else {
        makeBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
     */
    public Builder addAllMake(
            java.lang.Iterable<? extends com.vv.personal.prom.artifactory.proto.Make> values) {
      if (makeBuilder_ == null) {
        ensureMakeIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
                values, make_);
        onChanged();
      } else {
        makeBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
     */
    public com.vv.personal.prom.artifactory.proto.Make.Builder getMakeBuilder(
            int index) {
      return getMakeFieldBuilder().getBuilder(index);
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
     */
    public com.vv.personal.prom.artifactory.proto.MakeOrBuilder getMakeOrBuilder(
            int index) {
      if (makeBuilder_ == null) {
        return make_.get(index);
      } else {
        return makeBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
     */
    public java.util.List<? extends com.vv.personal.prom.artifactory.proto.MakeOrBuilder>
    getMakeOrBuilderList() {
      if (makeBuilder_ != null) {
        return makeBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(make_);
      }
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
     */
    public com.vv.personal.prom.artifactory.proto.Make.Builder addMakeBuilder() {
      return getMakeFieldBuilder().addBuilder(
              com.vv.personal.prom.artifactory.proto.Make.getDefaultInstance());
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
     */
    public com.vv.personal.prom.artifactory.proto.Make.Builder addMakeBuilder(
            int index) {
      return getMakeFieldBuilder().addBuilder(
              index, com.vv.personal.prom.artifactory.proto.Make.getDefaultInstance());
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Make make = 1;</code>
     */
    public java.util.List<com.vv.personal.prom.artifactory.proto.Make.Builder>
    getMakeBuilderList() {
      return getMakeFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.vv.personal.prom.artifactory.proto.Make, com.vv.personal.prom.artifactory.proto.Make.Builder, com.vv.personal.prom.artifactory.proto.MakeOrBuilder>
    getMakeFieldBuilder() {
      if (makeBuilder_ == null) {
        makeBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                com.vv.personal.prom.artifactory.proto.Make, com.vv.personal.prom.artifactory.proto.Make.Builder, com.vv.personal.prom.artifactory.proto.MakeOrBuilder>(
                make_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        make_ = null;
      }
      return makeBuilder_;
    }

    /**
     * <code>.com.vv.personal.prom.artifactory.proto.Auth auth = 2;</code>
     */
    public boolean hasAuth() {
      return authBuilder_ != null || auth_ != null;
    }

    /**
     * <code>.com.vv.personal.prom.artifactory.proto.Auth auth = 2;</code>
     */
    public com.vv.personal.prom.artifactory.proto.Auth getAuth() {
      if (authBuilder_ == null) {
        return auth_ == null ? com.vv.personal.prom.artifactory.proto.Auth.getDefaultInstance() : auth_;
      } else {
        return authBuilder_.getMessage();
      }
    }

    /**
     * <code>.com.vv.personal.prom.artifactory.proto.Auth auth = 2;</code>
     */
    public Builder setAuth(com.vv.personal.prom.artifactory.proto.Auth value) {
      if (authBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        auth_ = value;
        onChanged();
      } else {
        authBuilder_.setMessage(value);
      }

      return this;
    }

    /**
     * <code>.com.vv.personal.prom.artifactory.proto.Auth auth = 2;</code>
     */
    public Builder setAuth(
            com.vv.personal.prom.artifactory.proto.Auth.Builder builderForValue) {
      if (authBuilder_ == null) {
        auth_ = builderForValue.build();
        onChanged();
      } else {
        authBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }

    /**
     * <code>.com.vv.personal.prom.artifactory.proto.Auth auth = 2;</code>
     */
    public Builder mergeAuth(com.vv.personal.prom.artifactory.proto.Auth value) {
      if (authBuilder_ == null) {
        if (auth_ != null) {
          auth_ =
                  com.vv.personal.prom.artifactory.proto.Auth.newBuilder(auth_).mergeFrom(value).buildPartial();
        } else {
          auth_ = value;
        }
        onChanged();
      } else {
        authBuilder_.mergeFrom(value);
      }

      return this;
    }

    /**
     * <code>.com.vv.personal.prom.artifactory.proto.Auth auth = 2;</code>
     */
    public Builder clearAuth() {
      if (authBuilder_ == null) {
        auth_ = null;
        onChanged();
      } else {
        auth_ = null;
        authBuilder_ = null;
      }

      return this;
    }

    /**
     * <code>.com.vv.personal.prom.artifactory.proto.Auth auth = 2;</code>
     */
    public com.vv.personal.prom.artifactory.proto.Auth.Builder getAuthBuilder() {

      onChanged();
      return getAuthFieldBuilder().getBuilder();
    }

    /**
     * <code>.com.vv.personal.prom.artifactory.proto.Auth auth = 2;</code>
     */
    public com.vv.personal.prom.artifactory.proto.AuthOrBuilder getAuthOrBuilder() {
      if (authBuilder_ != null) {
        return authBuilder_.getMessageOrBuilder();
      } else {
        return auth_ == null ?
                com.vv.personal.prom.artifactory.proto.Auth.getDefaultInstance() : auth_;
      }
    }

    /**
     * <code>.com.vv.personal.prom.artifactory.proto.Auth auth = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.vv.personal.prom.artifactory.proto.Auth, com.vv.personal.prom.artifactory.proto.Auth.Builder, com.vv.personal.prom.artifactory.proto.AuthOrBuilder>
    getAuthFieldBuilder() {
      if (authBuilder_ == null) {
        authBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                com.vv.personal.prom.artifactory.proto.Auth, com.vv.personal.prom.artifactory.proto.Auth.Builder, com.vv.personal.prom.artifactory.proto.AuthOrBuilder>(
                getAuth(),
                getParentForChildren(),
                isClean());
        auth_ = null;
      }
      return authBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.vv.personal.prom.artifactory.proto.MakeList)
  }

}

