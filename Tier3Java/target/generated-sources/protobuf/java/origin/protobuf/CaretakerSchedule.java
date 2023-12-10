// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package origin.protobuf;

/**
 * Protobuf type {@code CaretakerSchedule}
 */
public  final class CaretakerSchedule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CaretakerSchedule)
    CaretakerScheduleOrBuilder {
  // Use CaretakerSchedule.newBuilder() to construct.
  private CaretakerSchedule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CaretakerSchedule() {
    schedule_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CaretakerSchedule(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              schedule_ = new java.util.ArrayList<origin.protobuf.DatePeriodProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            schedule_.add(
                input.readMessage(origin.protobuf.DatePeriodProto.parser(), extensionRegistry));
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
        schedule_ = java.util.Collections.unmodifiableList(schedule_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return origin.protobuf.Protobuf.internal_static_CaretakerSchedule_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return origin.protobuf.Protobuf.internal_static_CaretakerSchedule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            origin.protobuf.CaretakerSchedule.class, origin.protobuf.CaretakerSchedule.Builder.class);
  }

  public static final int SCHEDULE_FIELD_NUMBER = 1;
  private java.util.List<origin.protobuf.DatePeriodProto> schedule_;
  /**
   * <code>repeated .DatePeriodProto schedule = 1;</code>
   */
  public java.util.List<origin.protobuf.DatePeriodProto> getScheduleList() {
    return schedule_;
  }
  /**
   * <code>repeated .DatePeriodProto schedule = 1;</code>
   */
  public java.util.List<? extends origin.protobuf.DatePeriodProtoOrBuilder> 
      getScheduleOrBuilderList() {
    return schedule_;
  }
  /**
   * <code>repeated .DatePeriodProto schedule = 1;</code>
   */
  public int getScheduleCount() {
    return schedule_.size();
  }
  /**
   * <code>repeated .DatePeriodProto schedule = 1;</code>
   */
  public origin.protobuf.DatePeriodProto getSchedule(int index) {
    return schedule_.get(index);
  }
  /**
   * <code>repeated .DatePeriodProto schedule = 1;</code>
   */
  public origin.protobuf.DatePeriodProtoOrBuilder getScheduleOrBuilder(
      int index) {
    return schedule_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < schedule_.size(); i++) {
      output.writeMessage(1, schedule_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < schedule_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, schedule_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof origin.protobuf.CaretakerSchedule)) {
      return super.equals(obj);
    }
    origin.protobuf.CaretakerSchedule other = (origin.protobuf.CaretakerSchedule) obj;

    boolean result = true;
    result = result && getScheduleList()
        .equals(other.getScheduleList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getScheduleCount() > 0) {
      hash = (37 * hash) + SCHEDULE_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static origin.protobuf.CaretakerSchedule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static origin.protobuf.CaretakerSchedule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static origin.protobuf.CaretakerSchedule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static origin.protobuf.CaretakerSchedule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static origin.protobuf.CaretakerSchedule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static origin.protobuf.CaretakerSchedule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static origin.protobuf.CaretakerSchedule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static origin.protobuf.CaretakerSchedule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static origin.protobuf.CaretakerSchedule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static origin.protobuf.CaretakerSchedule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static origin.protobuf.CaretakerSchedule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static origin.protobuf.CaretakerSchedule parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(origin.protobuf.CaretakerSchedule prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
  /**
   * Protobuf type {@code CaretakerSchedule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CaretakerSchedule)
      origin.protobuf.CaretakerScheduleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return origin.protobuf.Protobuf.internal_static_CaretakerSchedule_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return origin.protobuf.Protobuf.internal_static_CaretakerSchedule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              origin.protobuf.CaretakerSchedule.class, origin.protobuf.CaretakerSchedule.Builder.class);
    }

    // Construct using origin.protobuf.CaretakerSchedule.newBuilder()
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
        getScheduleFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (scheduleBuilder_ == null) {
        schedule_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        scheduleBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return origin.protobuf.Protobuf.internal_static_CaretakerSchedule_descriptor;
    }

    public origin.protobuf.CaretakerSchedule getDefaultInstanceForType() {
      return origin.protobuf.CaretakerSchedule.getDefaultInstance();
    }

    public origin.protobuf.CaretakerSchedule build() {
      origin.protobuf.CaretakerSchedule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public origin.protobuf.CaretakerSchedule buildPartial() {
      origin.protobuf.CaretakerSchedule result = new origin.protobuf.CaretakerSchedule(this);
      int from_bitField0_ = bitField0_;
      if (scheduleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          schedule_ = java.util.Collections.unmodifiableList(schedule_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.schedule_ = schedule_;
      } else {
        result.schedule_ = scheduleBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof origin.protobuf.CaretakerSchedule) {
        return mergeFrom((origin.protobuf.CaretakerSchedule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(origin.protobuf.CaretakerSchedule other) {
      if (other == origin.protobuf.CaretakerSchedule.getDefaultInstance()) return this;
      if (scheduleBuilder_ == null) {
        if (!other.schedule_.isEmpty()) {
          if (schedule_.isEmpty()) {
            schedule_ = other.schedule_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureScheduleIsMutable();
            schedule_.addAll(other.schedule_);
          }
          onChanged();
        }
      } else {
        if (!other.schedule_.isEmpty()) {
          if (scheduleBuilder_.isEmpty()) {
            scheduleBuilder_.dispose();
            scheduleBuilder_ = null;
            schedule_ = other.schedule_;
            bitField0_ = (bitField0_ & ~0x00000001);
            scheduleBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getScheduleFieldBuilder() : null;
          } else {
            scheduleBuilder_.addAllMessages(other.schedule_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      origin.protobuf.CaretakerSchedule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (origin.protobuf.CaretakerSchedule) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<origin.protobuf.DatePeriodProto> schedule_ =
      java.util.Collections.emptyList();
    private void ensureScheduleIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        schedule_ = new java.util.ArrayList<origin.protobuf.DatePeriodProto>(schedule_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        origin.protobuf.DatePeriodProto, origin.protobuf.DatePeriodProto.Builder, origin.protobuf.DatePeriodProtoOrBuilder> scheduleBuilder_;

    /**
     * <code>repeated .DatePeriodProto schedule = 1;</code>
     */
    public java.util.List<origin.protobuf.DatePeriodProto> getScheduleList() {
      if (scheduleBuilder_ == null) {
        return java.util.Collections.unmodifiableList(schedule_);
      } else {
        return scheduleBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .DatePeriodProto schedule = 1;</code>
     */
    public int getScheduleCount() {
      if (scheduleBuilder_ == null) {
        return schedule_.size();
      } else {
        return scheduleBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .DatePeriodProto schedule = 1;</code>
     */
    public origin.protobuf.DatePeriodProto getSchedule(int index) {
      if (scheduleBuilder_ == null) {
        return schedule_.get(index);
      } else {
        return scheduleBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .DatePeriodProto schedule = 1;</code>
     */
    public Builder setSchedule(
        int index, origin.protobuf.DatePeriodProto value) {
      if (scheduleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScheduleIsMutable();
        schedule_.set(index, value);
        onChanged();
      } else {
        scheduleBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .DatePeriodProto schedule = 1;</code>
     */
    public Builder setSchedule(
        int index, origin.protobuf.DatePeriodProto.Builder builderForValue) {
      if (scheduleBuilder_ == null) {
        ensureScheduleIsMutable();
        schedule_.set(index, builderForValue.build());
        onChanged();
      } else {
        scheduleBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .DatePeriodProto schedule = 1;</code>
     */
    public Builder addSchedule(origin.protobuf.DatePeriodProto value) {
      if (scheduleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScheduleIsMutable();
        schedule_.add(value);
        onChanged();
      } else {
        scheduleBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .DatePeriodProto schedule = 1;</code>
     */
    public Builder addSchedule(
        int index, origin.protobuf.DatePeriodProto value) {
      if (scheduleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScheduleIsMutable();
        schedule_.add(index, value);
        onChanged();
      } else {
        scheduleBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .DatePeriodProto schedule = 1;</code>
     */
    public Builder addSchedule(
        origin.protobuf.DatePeriodProto.Builder builderForValue) {
      if (scheduleBuilder_ == null) {
        ensureScheduleIsMutable();
        schedule_.add(builderForValue.build());
        onChanged();
      } else {
        scheduleBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .DatePeriodProto schedule = 1;</code>
     */
    public Builder addSchedule(
        int index, origin.protobuf.DatePeriodProto.Builder builderForValue) {
      if (scheduleBuilder_ == null) {
        ensureScheduleIsMutable();
        schedule_.add(index, builderForValue.build());
        onChanged();
      } else {
        scheduleBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .DatePeriodProto schedule = 1;</code>
     */
    public Builder addAllSchedule(
        java.lang.Iterable<? extends origin.protobuf.DatePeriodProto> values) {
      if (scheduleBuilder_ == null) {
        ensureScheduleIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, schedule_);
        onChanged();
      } else {
        scheduleBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .DatePeriodProto schedule = 1;</code>
     */
    public Builder clearSchedule() {
      if (scheduleBuilder_ == null) {
        schedule_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        scheduleBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .DatePeriodProto schedule = 1;</code>
     */
    public Builder removeSchedule(int index) {
      if (scheduleBuilder_ == null) {
        ensureScheduleIsMutable();
        schedule_.remove(index);
        onChanged();
      } else {
        scheduleBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .DatePeriodProto schedule = 1;</code>
     */
    public origin.protobuf.DatePeriodProto.Builder getScheduleBuilder(
        int index) {
      return getScheduleFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .DatePeriodProto schedule = 1;</code>
     */
    public origin.protobuf.DatePeriodProtoOrBuilder getScheduleOrBuilder(
        int index) {
      if (scheduleBuilder_ == null) {
        return schedule_.get(index);  } else {
        return scheduleBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .DatePeriodProto schedule = 1;</code>
     */
    public java.util.List<? extends origin.protobuf.DatePeriodProtoOrBuilder> 
         getScheduleOrBuilderList() {
      if (scheduleBuilder_ != null) {
        return scheduleBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(schedule_);
      }
    }
    /**
     * <code>repeated .DatePeriodProto schedule = 1;</code>
     */
    public origin.protobuf.DatePeriodProto.Builder addScheduleBuilder() {
      return getScheduleFieldBuilder().addBuilder(
          origin.protobuf.DatePeriodProto.getDefaultInstance());
    }
    /**
     * <code>repeated .DatePeriodProto schedule = 1;</code>
     */
    public origin.protobuf.DatePeriodProto.Builder addScheduleBuilder(
        int index) {
      return getScheduleFieldBuilder().addBuilder(
          index, origin.protobuf.DatePeriodProto.getDefaultInstance());
    }
    /**
     * <code>repeated .DatePeriodProto schedule = 1;</code>
     */
    public java.util.List<origin.protobuf.DatePeriodProto.Builder> 
         getScheduleBuilderList() {
      return getScheduleFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        origin.protobuf.DatePeriodProto, origin.protobuf.DatePeriodProto.Builder, origin.protobuf.DatePeriodProtoOrBuilder> 
        getScheduleFieldBuilder() {
      if (scheduleBuilder_ == null) {
        scheduleBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            origin.protobuf.DatePeriodProto, origin.protobuf.DatePeriodProto.Builder, origin.protobuf.DatePeriodProtoOrBuilder>(
                schedule_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        schedule_ = null;
      }
      return scheduleBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:CaretakerSchedule)
  }

  // @@protoc_insertion_point(class_scope:CaretakerSchedule)
  private static final origin.protobuf.CaretakerSchedule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new origin.protobuf.CaretakerSchedule();
  }

  public static origin.protobuf.CaretakerSchedule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CaretakerSchedule>
      PARSER = new com.google.protobuf.AbstractParser<CaretakerSchedule>() {
    public CaretakerSchedule parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CaretakerSchedule(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CaretakerSchedule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CaretakerSchedule> getParserForType() {
    return PARSER;
  }

  public origin.protobuf.CaretakerSchedule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

