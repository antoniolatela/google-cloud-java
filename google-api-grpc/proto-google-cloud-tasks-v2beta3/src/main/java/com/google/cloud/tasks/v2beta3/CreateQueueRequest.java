// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta3/cloudtasks.proto

package com.google.cloud.tasks.v2beta3;

/**
 * <pre>
 * Request message for [CreateQueue][google.cloud.tasks.v2beta3.CloudTasks.CreateQueue].
 * </pre>
 *
 * Protobuf type {@code google.cloud.tasks.v2beta3.CreateQueueRequest}
 */
public  final class CreateQueueRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.tasks.v2beta3.CreateQueueRequest)
    CreateQueueRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateQueueRequest.newBuilder() to construct.
  private CreateQueueRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateQueueRequest() {
    parent_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateQueueRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            com.google.cloud.tasks.v2beta3.Queue.Builder subBuilder = null;
            if (queue_ != null) {
              subBuilder = queue_.toBuilder();
            }
            queue_ = input.readMessage(com.google.cloud.tasks.v2beta3.Queue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(queue_);
              queue_ = subBuilder.buildPartial();
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
    return com.google.cloud.tasks.v2beta3.CloudTasksProto.internal_static_google_cloud_tasks_v2beta3_CreateQueueRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tasks.v2beta3.CloudTasksProto.internal_static_google_cloud_tasks_v2beta3_CreateQueueRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tasks.v2beta3.CreateQueueRequest.class, com.google.cloud.tasks.v2beta3.CreateQueueRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required.
   * The location name in which the queue will be created.
   * For example: `projects/PROJECT_ID/locations/LOCATION_ID`
   * The list of allowed locations can be obtained by calling Cloud
   * Tasks' implementation of
   * [ListLocations][google.cloud.location.Locations.ListLocations].
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required.
   * The location name in which the queue will be created.
   * For example: `projects/PROJECT_ID/locations/LOCATION_ID`
   * The list of allowed locations can be obtained by calling Cloud
   * Tasks' implementation of
   * [ListLocations][google.cloud.location.Locations.ListLocations].
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUEUE_FIELD_NUMBER = 2;
  private com.google.cloud.tasks.v2beta3.Queue queue_;
  /**
   * <pre>
   * Required.
   * The queue to create.
   * [Queue's name][google.cloud.tasks.v2beta3.Queue.name] cannot be the same as an existing queue.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Queue queue = 2;</code>
   */
  public boolean hasQueue() {
    return queue_ != null;
  }
  /**
   * <pre>
   * Required.
   * The queue to create.
   * [Queue's name][google.cloud.tasks.v2beta3.Queue.name] cannot be the same as an existing queue.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Queue queue = 2;</code>
   */
  public com.google.cloud.tasks.v2beta3.Queue getQueue() {
    return queue_ == null ? com.google.cloud.tasks.v2beta3.Queue.getDefaultInstance() : queue_;
  }
  /**
   * <pre>
   * Required.
   * The queue to create.
   * [Queue's name][google.cloud.tasks.v2beta3.Queue.name] cannot be the same as an existing queue.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Queue queue = 2;</code>
   */
  public com.google.cloud.tasks.v2beta3.QueueOrBuilder getQueueOrBuilder() {
    return getQueue();
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (queue_ != null) {
      output.writeMessage(2, getQueue());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (queue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getQueue());
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
    if (!(obj instanceof com.google.cloud.tasks.v2beta3.CreateQueueRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.tasks.v2beta3.CreateQueueRequest other = (com.google.cloud.tasks.v2beta3.CreateQueueRequest) obj;

    boolean result = true;
    result = result && getParent()
        .equals(other.getParent());
    result = result && (hasQueue() == other.hasQueue());
    if (hasQueue()) {
      result = result && getQueue()
          .equals(other.getQueue());
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasQueue()) {
      hash = (37 * hash) + QUEUE_FIELD_NUMBER;
      hash = (53 * hash) + getQueue().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tasks.v2beta3.CreateQueueRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tasks.v2beta3.CreateQueueRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tasks.v2beta3.CreateQueueRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tasks.v2beta3.CreateQueueRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tasks.v2beta3.CreateQueueRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tasks.v2beta3.CreateQueueRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tasks.v2beta3.CreateQueueRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tasks.v2beta3.CreateQueueRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.tasks.v2beta3.CreateQueueRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.tasks.v2beta3.CreateQueueRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.tasks.v2beta3.CreateQueueRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tasks.v2beta3.CreateQueueRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.tasks.v2beta3.CreateQueueRequest prototype) {
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
   * <pre>
   * Request message for [CreateQueue][google.cloud.tasks.v2beta3.CloudTasks.CreateQueue].
   * </pre>
   *
   * Protobuf type {@code google.cloud.tasks.v2beta3.CreateQueueRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tasks.v2beta3.CreateQueueRequest)
      com.google.cloud.tasks.v2beta3.CreateQueueRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.tasks.v2beta3.CloudTasksProto.internal_static_google_cloud_tasks_v2beta3_CreateQueueRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tasks.v2beta3.CloudTasksProto.internal_static_google_cloud_tasks_v2beta3_CreateQueueRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tasks.v2beta3.CreateQueueRequest.class, com.google.cloud.tasks.v2beta3.CreateQueueRequest.Builder.class);
    }

    // Construct using com.google.cloud.tasks.v2beta3.CreateQueueRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (queueBuilder_ == null) {
        queue_ = null;
      } else {
        queue_ = null;
        queueBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.tasks.v2beta3.CloudTasksProto.internal_static_google_cloud_tasks_v2beta3_CreateQueueRequest_descriptor;
    }

    public com.google.cloud.tasks.v2beta3.CreateQueueRequest getDefaultInstanceForType() {
      return com.google.cloud.tasks.v2beta3.CreateQueueRequest.getDefaultInstance();
    }

    public com.google.cloud.tasks.v2beta3.CreateQueueRequest build() {
      com.google.cloud.tasks.v2beta3.CreateQueueRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.tasks.v2beta3.CreateQueueRequest buildPartial() {
      com.google.cloud.tasks.v2beta3.CreateQueueRequest result = new com.google.cloud.tasks.v2beta3.CreateQueueRequest(this);
      result.parent_ = parent_;
      if (queueBuilder_ == null) {
        result.queue_ = queue_;
      } else {
        result.queue_ = queueBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.tasks.v2beta3.CreateQueueRequest) {
        return mergeFrom((com.google.cloud.tasks.v2beta3.CreateQueueRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tasks.v2beta3.CreateQueueRequest other) {
      if (other == com.google.cloud.tasks.v2beta3.CreateQueueRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasQueue()) {
        mergeQueue(other.getQueue());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.tasks.v2beta3.CreateQueueRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.tasks.v2beta3.CreateQueueRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required.
     * The location name in which the queue will be created.
     * For example: `projects/PROJECT_ID/locations/LOCATION_ID`
     * The list of allowed locations can be obtained by calling Cloud
     * Tasks' implementation of
     * [ListLocations][google.cloud.location.Locations.ListLocations].
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required.
     * The location name in which the queue will be created.
     * For example: `projects/PROJECT_ID/locations/LOCATION_ID`
     * The list of allowed locations can be obtained by calling Cloud
     * Tasks' implementation of
     * [ListLocations][google.cloud.location.Locations.ListLocations].
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required.
     * The location name in which the queue will be created.
     * For example: `projects/PROJECT_ID/locations/LOCATION_ID`
     * The list of allowed locations can be obtained by calling Cloud
     * Tasks' implementation of
     * [ListLocations][google.cloud.location.Locations.ListLocations].
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * The location name in which the queue will be created.
     * For example: `projects/PROJECT_ID/locations/LOCATION_ID`
     * The list of allowed locations can be obtained by calling Cloud
     * Tasks' implementation of
     * [ListLocations][google.cloud.location.Locations.ListLocations].
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * The location name in which the queue will be created.
     * For example: `projects/PROJECT_ID/locations/LOCATION_ID`
     * The list of allowed locations can be obtained by calling Cloud
     * Tasks' implementation of
     * [ListLocations][google.cloud.location.Locations.ListLocations].
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.tasks.v2beta3.Queue queue_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.tasks.v2beta3.Queue, com.google.cloud.tasks.v2beta3.Queue.Builder, com.google.cloud.tasks.v2beta3.QueueOrBuilder> queueBuilder_;
    /**
     * <pre>
     * Required.
     * The queue to create.
     * [Queue's name][google.cloud.tasks.v2beta3.Queue.name] cannot be the same as an existing queue.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 2;</code>
     */
    public boolean hasQueue() {
      return queueBuilder_ != null || queue_ != null;
    }
    /**
     * <pre>
     * Required.
     * The queue to create.
     * [Queue's name][google.cloud.tasks.v2beta3.Queue.name] cannot be the same as an existing queue.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 2;</code>
     */
    public com.google.cloud.tasks.v2beta3.Queue getQueue() {
      if (queueBuilder_ == null) {
        return queue_ == null ? com.google.cloud.tasks.v2beta3.Queue.getDefaultInstance() : queue_;
      } else {
        return queueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required.
     * The queue to create.
     * [Queue's name][google.cloud.tasks.v2beta3.Queue.name] cannot be the same as an existing queue.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 2;</code>
     */
    public Builder setQueue(com.google.cloud.tasks.v2beta3.Queue value) {
      if (queueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        queue_ = value;
        onChanged();
      } else {
        queueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required.
     * The queue to create.
     * [Queue's name][google.cloud.tasks.v2beta3.Queue.name] cannot be the same as an existing queue.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 2;</code>
     */
    public Builder setQueue(
        com.google.cloud.tasks.v2beta3.Queue.Builder builderForValue) {
      if (queueBuilder_ == null) {
        queue_ = builderForValue.build();
        onChanged();
      } else {
        queueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required.
     * The queue to create.
     * [Queue's name][google.cloud.tasks.v2beta3.Queue.name] cannot be the same as an existing queue.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 2;</code>
     */
    public Builder mergeQueue(com.google.cloud.tasks.v2beta3.Queue value) {
      if (queueBuilder_ == null) {
        if (queue_ != null) {
          queue_ =
            com.google.cloud.tasks.v2beta3.Queue.newBuilder(queue_).mergeFrom(value).buildPartial();
        } else {
          queue_ = value;
        }
        onChanged();
      } else {
        queueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required.
     * The queue to create.
     * [Queue's name][google.cloud.tasks.v2beta3.Queue.name] cannot be the same as an existing queue.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 2;</code>
     */
    public Builder clearQueue() {
      if (queueBuilder_ == null) {
        queue_ = null;
        onChanged();
      } else {
        queue_ = null;
        queueBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required.
     * The queue to create.
     * [Queue's name][google.cloud.tasks.v2beta3.Queue.name] cannot be the same as an existing queue.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 2;</code>
     */
    public com.google.cloud.tasks.v2beta3.Queue.Builder getQueueBuilder() {
      
      onChanged();
      return getQueueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required.
     * The queue to create.
     * [Queue's name][google.cloud.tasks.v2beta3.Queue.name] cannot be the same as an existing queue.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 2;</code>
     */
    public com.google.cloud.tasks.v2beta3.QueueOrBuilder getQueueOrBuilder() {
      if (queueBuilder_ != null) {
        return queueBuilder_.getMessageOrBuilder();
      } else {
        return queue_ == null ?
            com.google.cloud.tasks.v2beta3.Queue.getDefaultInstance() : queue_;
      }
    }
    /**
     * <pre>
     * Required.
     * The queue to create.
     * [Queue's name][google.cloud.tasks.v2beta3.Queue.name] cannot be the same as an existing queue.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.tasks.v2beta3.Queue, com.google.cloud.tasks.v2beta3.Queue.Builder, com.google.cloud.tasks.v2beta3.QueueOrBuilder> 
        getQueueFieldBuilder() {
      if (queueBuilder_ == null) {
        queueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.tasks.v2beta3.Queue, com.google.cloud.tasks.v2beta3.Queue.Builder, com.google.cloud.tasks.v2beta3.QueueOrBuilder>(
                getQueue(),
                getParentForChildren(),
                isClean());
        queue_ = null;
      }
      return queueBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.tasks.v2beta3.CreateQueueRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tasks.v2beta3.CreateQueueRequest)
  private static final com.google.cloud.tasks.v2beta3.CreateQueueRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.tasks.v2beta3.CreateQueueRequest();
  }

  public static com.google.cloud.tasks.v2beta3.CreateQueueRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateQueueRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateQueueRequest>() {
    public CreateQueueRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateQueueRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateQueueRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateQueueRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.tasks.v2beta3.CreateQueueRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
