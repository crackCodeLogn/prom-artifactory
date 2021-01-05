// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Component.proto

package com.vv.personal.prom.artifactory.proto;

/**
 * Protobuf type {@code com.vv.personal.prom.artifactory.proto.ComponentList}
 */
public final class ComponentList extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:com.vv.personal.prom.artifactory.proto.ComponentList)
        ComponentListOrBuilder {
  public static final int COMPONENTS_FIELD_NUMBER = 1;
  private static final long serialVersionUID = 0L;
  // @@protoc_insertion_point(class_scope:com.vv.personal.prom.artifactory.proto.ComponentList)
  private static final com.vv.personal.prom.artifactory.proto.ComponentList DEFAULT_INSTANCE;
  private static final com.google.protobuf.Parser<ComponentList>
          PARSER = new com.google.protobuf.AbstractParser<ComponentList>() {
    @java.lang.Override
    public ComponentList parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return new ComponentList(input, extensionRegistry);
    }
  };

  static {
    DEFAULT_INSTANCE = new com.vv.personal.prom.artifactory.proto.ComponentList();
  }

  private java.util.List<com.vv.personal.prom.artifactory.proto.Component> components_;
  private byte memoizedIsInitialized = -1;

  // Use ComponentList.newBuilder() to construct.
  private ComponentList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ComponentList() {
    components_ = java.util.Collections.emptyList();
  }

  private ComponentList(
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
              components_ = new java.util.ArrayList<com.vv.personal.prom.artifactory.proto.Component>();
              mutable_bitField0_ |= 0x00000001;
            }
            components_.add(
                    input.readMessage(com.vv.personal.prom.artifactory.proto.Component.parser(), extensionRegistry));
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
        components_ = java.util.Collections.unmodifiableList(components_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor
  getDescriptor() {
    return com.vv.personal.prom.artifactory.proto.ComponentProto.internal_static_com_vv_personal_prom_artifactory_proto_ComponentList_descriptor;
  }

  public static com.vv.personal.prom.artifactory.proto.ComponentList parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.vv.personal.prom.artifactory.proto.ComponentList parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.ComponentList parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.vv.personal.prom.artifactory.proto.ComponentList parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.ComponentList parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.vv.personal.prom.artifactory.proto.ComponentList parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.ComponentList parseFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static com.vv.personal.prom.artifactory.proto.ComponentList parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.ComponentList parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.vv.personal.prom.artifactory.proto.ComponentList parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.vv.personal.prom.artifactory.proto.ComponentList parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
  }

  public static com.vv.personal.prom.artifactory.proto.ComponentList parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.vv.personal.prom.artifactory.proto.ComponentList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public static com.vv.personal.prom.artifactory.proto.ComponentList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Parser<ComponentList> parser() {
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
    return com.vv.personal.prom.artifactory.proto.ComponentProto.internal_static_com_vv_personal_prom_artifactory_proto_ComponentList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                    com.vv.personal.prom.artifactory.proto.ComponentList.class, com.vv.personal.prom.artifactory.proto.ComponentList.Builder.class);
  }

  /**
   * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
   */
  public java.util.List<com.vv.personal.prom.artifactory.proto.Component> getComponentsList() {
    return components_;
  }

  /**
   * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
   */
  public java.util.List<? extends com.vv.personal.prom.artifactory.proto.ComponentOrBuilder>
  getComponentsOrBuilderList() {
    return components_;
  }

  /**
   * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
   */
  public int getComponentsCount() {
    return components_.size();
  }

  /**
   * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
   */
  public com.vv.personal.prom.artifactory.proto.Component getComponents(int index) {
    return components_.get(index);
  }

  /**
   * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
   */
  public com.vv.personal.prom.artifactory.proto.ComponentOrBuilder getComponentsOrBuilder(
          int index) {
    return components_.get(index);
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
    for (int i = 0; i < components_.size(); i++) {
      output.writeMessage(1, components_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < components_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
              .computeMessageSize(1, components_.get(i));
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
    if (!(obj instanceof com.vv.personal.prom.artifactory.proto.ComponentList)) {
      return super.equals(obj);
    }
    com.vv.personal.prom.artifactory.proto.ComponentList other = (com.vv.personal.prom.artifactory.proto.ComponentList) obj;

    boolean result = true;
    result = result && getComponentsList()
            .equals(other.getComponentsList());
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
    if (getComponentsCount() > 0) {
      hash = (37 * hash) + COMPONENTS_FIELD_NUMBER;
      hash = (53 * hash) + getComponentsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
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
  public com.google.protobuf.Parser<ComponentList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.vv.personal.prom.artifactory.proto.ComponentList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

  /**
   * Protobuf type {@code com.vv.personal.prom.artifactory.proto.ComponentList}
   */
  public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:com.vv.personal.prom.artifactory.proto.ComponentList)
          com.vv.personal.prom.artifactory.proto.ComponentListOrBuilder {
    private int bitField0_;
    private java.util.List<com.vv.personal.prom.artifactory.proto.Component> components_ =
            java.util.Collections.emptyList();
    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.vv.personal.prom.artifactory.proto.Component, com.vv.personal.prom.artifactory.proto.Component.Builder, com.vv.personal.prom.artifactory.proto.ComponentOrBuilder> componentsBuilder_;

    // Construct using com.vv.personal.prom.artifactory.proto.ComponentList.newBuilder()
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
      return com.vv.personal.prom.artifactory.proto.ComponentProto.internal_static_com_vv_personal_prom_artifactory_proto_ComponentList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.vv.personal.prom.artifactory.proto.ComponentProto.internal_static_com_vv_personal_prom_artifactory_proto_ComponentList_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                      com.vv.personal.prom.artifactory.proto.ComponentList.class, com.vv.personal.prom.artifactory.proto.ComponentList.Builder.class);
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getComponentsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (componentsBuilder_ == null) {
        components_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        componentsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return com.vv.personal.prom.artifactory.proto.ComponentProto.internal_static_com_vv_personal_prom_artifactory_proto_ComponentList_descriptor;
    }

    @java.lang.Override
    public com.vv.personal.prom.artifactory.proto.ComponentList getDefaultInstanceForType() {
      return com.vv.personal.prom.artifactory.proto.ComponentList.getDefaultInstance();
    }

    @java.lang.Override
    public com.vv.personal.prom.artifactory.proto.ComponentList build() {
      com.vv.personal.prom.artifactory.proto.ComponentList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.vv.personal.prom.artifactory.proto.ComponentList buildPartial() {
      com.vv.personal.prom.artifactory.proto.ComponentList result = new com.vv.personal.prom.artifactory.proto.ComponentList(this);
      int from_bitField0_ = bitField0_;
      if (componentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          components_ = java.util.Collections.unmodifiableList(components_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.components_ = components_;
      } else {
        result.components_ = componentsBuilder_.build();
      }
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

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.vv.personal.prom.artifactory.proto.ComponentList) {
        return mergeFrom((com.vv.personal.prom.artifactory.proto.ComponentList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.vv.personal.prom.artifactory.proto.ComponentList other) {
      if (other == com.vv.personal.prom.artifactory.proto.ComponentList.getDefaultInstance()) return this;
      if (componentsBuilder_ == null) {
        if (!other.components_.isEmpty()) {
          if (components_.isEmpty()) {
            components_ = other.components_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureComponentsIsMutable();
            components_.addAll(other.components_);
          }
          onChanged();
        }
      } else {
        if (!other.components_.isEmpty()) {
          if (componentsBuilder_.isEmpty()) {
            componentsBuilder_.dispose();
            componentsBuilder_ = null;
            components_ = other.components_;
            bitField0_ = (bitField0_ & ~0x00000001);
            componentsBuilder_ =
                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                            getComponentsFieldBuilder() : null;
          } else {
            componentsBuilder_.addAllMessages(other.components_);
          }
        }
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
      com.vv.personal.prom.artifactory.proto.ComponentList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.vv.personal.prom.artifactory.proto.ComponentList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private void ensureComponentsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        components_ = new java.util.ArrayList<com.vv.personal.prom.artifactory.proto.Component>(components_);
        bitField0_ |= 0x00000001;
      }
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
     */
    public java.util.List<com.vv.personal.prom.artifactory.proto.Component> getComponentsList() {
      if (componentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(components_);
      } else {
        return componentsBuilder_.getMessageList();
      }
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
     */
    public int getComponentsCount() {
      if (componentsBuilder_ == null) {
        return components_.size();
      } else {
        return componentsBuilder_.getCount();
      }
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
     */
    public com.vv.personal.prom.artifactory.proto.Component getComponents(int index) {
      if (componentsBuilder_ == null) {
        return components_.get(index);
      } else {
        return componentsBuilder_.getMessage(index);
      }
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
     */
    public Builder setComponents(
            int index, com.vv.personal.prom.artifactory.proto.Component value) {
      if (componentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureComponentsIsMutable();
        components_.set(index, value);
        onChanged();
      } else {
        componentsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
     */
    public Builder setComponents(
            int index, com.vv.personal.prom.artifactory.proto.Component.Builder builderForValue) {
      if (componentsBuilder_ == null) {
        ensureComponentsIsMutable();
        components_.set(index, builderForValue.build());
        onChanged();
      } else {
        componentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
     */
    public Builder addComponents(com.vv.personal.prom.artifactory.proto.Component value) {
      if (componentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureComponentsIsMutable();
        components_.add(value);
        onChanged();
      } else {
        componentsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
     */
    public Builder addComponents(
            int index, com.vv.personal.prom.artifactory.proto.Component value) {
      if (componentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureComponentsIsMutable();
        components_.add(index, value);
        onChanged();
      } else {
        componentsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
     */
    public Builder addComponents(
            com.vv.personal.prom.artifactory.proto.Component.Builder builderForValue) {
      if (componentsBuilder_ == null) {
        ensureComponentsIsMutable();
        components_.add(builderForValue.build());
        onChanged();
      } else {
        componentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
     */
    public Builder addComponents(
            int index, com.vv.personal.prom.artifactory.proto.Component.Builder builderForValue) {
      if (componentsBuilder_ == null) {
        ensureComponentsIsMutable();
        components_.add(index, builderForValue.build());
        onChanged();
      } else {
        componentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
     */
    public Builder addAllComponents(
            java.lang.Iterable<? extends com.vv.personal.prom.artifactory.proto.Component> values) {
      if (componentsBuilder_ == null) {
        ensureComponentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
                values, components_);
        onChanged();
      } else {
        componentsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
     */
    public Builder clearComponents() {
      if (componentsBuilder_ == null) {
        components_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        componentsBuilder_.clear();
      }
      return this;
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
     */
    public Builder removeComponents(int index) {
      if (componentsBuilder_ == null) {
        ensureComponentsIsMutable();
        components_.remove(index);
        onChanged();
      } else {
        componentsBuilder_.remove(index);
      }
      return this;
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
     */
    public com.vv.personal.prom.artifactory.proto.Component.Builder getComponentsBuilder(
            int index) {
      return getComponentsFieldBuilder().getBuilder(index);
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
     */
    public com.vv.personal.prom.artifactory.proto.ComponentOrBuilder getComponentsOrBuilder(
            int index) {
      if (componentsBuilder_ == null) {
        return components_.get(index);
      } else {
        return componentsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
     */
    public java.util.List<? extends com.vv.personal.prom.artifactory.proto.ComponentOrBuilder>
    getComponentsOrBuilderList() {
      if (componentsBuilder_ != null) {
        return componentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(components_);
      }
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
     */
    public com.vv.personal.prom.artifactory.proto.Component.Builder addComponentsBuilder() {
      return getComponentsFieldBuilder().addBuilder(
              com.vv.personal.prom.artifactory.proto.Component.getDefaultInstance());
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
     */
    public com.vv.personal.prom.artifactory.proto.Component.Builder addComponentsBuilder(
            int index) {
      return getComponentsFieldBuilder().addBuilder(
              index, com.vv.personal.prom.artifactory.proto.Component.getDefaultInstance());
    }

    /**
     * <code>repeated .com.vv.personal.prom.artifactory.proto.Component components = 1;</code>
     */
    public java.util.List<com.vv.personal.prom.artifactory.proto.Component.Builder>
    getComponentsBuilderList() {
      return getComponentsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.vv.personal.prom.artifactory.proto.Component, com.vv.personal.prom.artifactory.proto.Component.Builder, com.vv.personal.prom.artifactory.proto.ComponentOrBuilder>
    getComponentsFieldBuilder() {
      if (componentsBuilder_ == null) {
        componentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                com.vv.personal.prom.artifactory.proto.Component, com.vv.personal.prom.artifactory.proto.Component.Builder, com.vv.personal.prom.artifactory.proto.ComponentOrBuilder>(
                components_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        components_ = null;
      }
      return componentsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.vv.personal.prom.artifactory.proto.ComponentList)
  }

}

