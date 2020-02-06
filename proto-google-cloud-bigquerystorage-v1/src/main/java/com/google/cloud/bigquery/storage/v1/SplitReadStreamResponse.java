/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/storage/v1/storage.proto

package com.google.cloud.bigquery.storage.v1;

/**
 *
 *
 * <pre>
 * Response message for `SplitReadStream`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.storage.v1.SplitReadStreamResponse}
 */
public final class SplitReadStreamResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.storage.v1.SplitReadStreamResponse)
    SplitReadStreamResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SplitReadStreamResponse.newBuilder() to construct.
  private SplitReadStreamResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SplitReadStreamResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SplitReadStreamResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SplitReadStreamResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10:
            {
              com.google.cloud.bigquery.storage.v1.ReadStream.Builder subBuilder = null;
              if (primaryStream_ != null) {
                subBuilder = primaryStream_.toBuilder();
              }
              primaryStream_ =
                  input.readMessage(
                      com.google.cloud.bigquery.storage.v1.ReadStream.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(primaryStream_);
                primaryStream_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.cloud.bigquery.storage.v1.ReadStream.Builder subBuilder = null;
              if (remainderStream_ != null) {
                subBuilder = remainderStream_.toBuilder();
              }
              remainderStream_ =
                  input.readMessage(
                      com.google.cloud.bigquery.storage.v1.ReadStream.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(remainderStream_);
                remainderStream_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.storage.v1.StorageProto
        .internal_static_google_cloud_bigquery_storage_v1_SplitReadStreamResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.storage.v1.StorageProto
        .internal_static_google_cloud_bigquery_storage_v1_SplitReadStreamResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse.class,
            com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse.Builder.class);
  }

  public static final int PRIMARY_STREAM_FIELD_NUMBER = 1;
  private com.google.cloud.bigquery.storage.v1.ReadStream primaryStream_;
  /**
   *
   *
   * <pre>
   * Primary stream, which contains the beginning portion of
   * |original_stream|. An empty value indicates that the original stream can no
   * longer be split.
   * </pre>
   *
   * <code>.google.cloud.bigquery.storage.v1.ReadStream primary_stream = 1;</code>
   *
   * @return Whether the primaryStream field is set.
   */
  public boolean hasPrimaryStream() {
    return primaryStream_ != null;
  }
  /**
   *
   *
   * <pre>
   * Primary stream, which contains the beginning portion of
   * |original_stream|. An empty value indicates that the original stream can no
   * longer be split.
   * </pre>
   *
   * <code>.google.cloud.bigquery.storage.v1.ReadStream primary_stream = 1;</code>
   *
   * @return The primaryStream.
   */
  public com.google.cloud.bigquery.storage.v1.ReadStream getPrimaryStream() {
    return primaryStream_ == null
        ? com.google.cloud.bigquery.storage.v1.ReadStream.getDefaultInstance()
        : primaryStream_;
  }
  /**
   *
   *
   * <pre>
   * Primary stream, which contains the beginning portion of
   * |original_stream|. An empty value indicates that the original stream can no
   * longer be split.
   * </pre>
   *
   * <code>.google.cloud.bigquery.storage.v1.ReadStream primary_stream = 1;</code>
   */
  public com.google.cloud.bigquery.storage.v1.ReadStreamOrBuilder getPrimaryStreamOrBuilder() {
    return getPrimaryStream();
  }

  public static final int REMAINDER_STREAM_FIELD_NUMBER = 2;
  private com.google.cloud.bigquery.storage.v1.ReadStream remainderStream_;
  /**
   *
   *
   * <pre>
   * Remainder stream, which contains the tail of |original_stream|. An empty
   * value indicates that the original stream can no longer be split.
   * </pre>
   *
   * <code>.google.cloud.bigquery.storage.v1.ReadStream remainder_stream = 2;</code>
   *
   * @return Whether the remainderStream field is set.
   */
  public boolean hasRemainderStream() {
    return remainderStream_ != null;
  }
  /**
   *
   *
   * <pre>
   * Remainder stream, which contains the tail of |original_stream|. An empty
   * value indicates that the original stream can no longer be split.
   * </pre>
   *
   * <code>.google.cloud.bigquery.storage.v1.ReadStream remainder_stream = 2;</code>
   *
   * @return The remainderStream.
   */
  public com.google.cloud.bigquery.storage.v1.ReadStream getRemainderStream() {
    return remainderStream_ == null
        ? com.google.cloud.bigquery.storage.v1.ReadStream.getDefaultInstance()
        : remainderStream_;
  }
  /**
   *
   *
   * <pre>
   * Remainder stream, which contains the tail of |original_stream|. An empty
   * value indicates that the original stream can no longer be split.
   * </pre>
   *
   * <code>.google.cloud.bigquery.storage.v1.ReadStream remainder_stream = 2;</code>
   */
  public com.google.cloud.bigquery.storage.v1.ReadStreamOrBuilder getRemainderStreamOrBuilder() {
    return getRemainderStream();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (primaryStream_ != null) {
      output.writeMessage(1, getPrimaryStream());
    }
    if (remainderStream_ != null) {
      output.writeMessage(2, getRemainderStream());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (primaryStream_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getPrimaryStream());
    }
    if (remainderStream_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getRemainderStream());
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
    if (!(obj instanceof com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse other =
        (com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse) obj;

    if (hasPrimaryStream() != other.hasPrimaryStream()) return false;
    if (hasPrimaryStream()) {
      if (!getPrimaryStream().equals(other.getPrimaryStream())) return false;
    }
    if (hasRemainderStream() != other.hasRemainderStream()) return false;
    if (hasRemainderStream()) {
      if (!getRemainderStream().equals(other.getRemainderStream())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPrimaryStream()) {
      hash = (37 * hash) + PRIMARY_STREAM_FIELD_NUMBER;
      hash = (53 * hash) + getPrimaryStream().hashCode();
    }
    if (hasRemainderStream()) {
      hash = (37 * hash) + REMAINDER_STREAM_FIELD_NUMBER;
      hash = (53 * hash) + getRemainderStream().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response message for `SplitReadStream`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.storage.v1.SplitReadStreamResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.storage.v1.SplitReadStreamResponse)
      com.google.cloud.bigquery.storage.v1.SplitReadStreamResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.storage.v1.StorageProto
          .internal_static_google_cloud_bigquery_storage_v1_SplitReadStreamResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.storage.v1.StorageProto
          .internal_static_google_cloud_bigquery_storage_v1_SplitReadStreamResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse.class,
              com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (primaryStreamBuilder_ == null) {
        primaryStream_ = null;
      } else {
        primaryStream_ = null;
        primaryStreamBuilder_ = null;
      }
      if (remainderStreamBuilder_ == null) {
        remainderStream_ = null;
      } else {
        remainderStream_ = null;
        remainderStreamBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.storage.v1.StorageProto
          .internal_static_google_cloud_bigquery_storage_v1_SplitReadStreamResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse build() {
      com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse buildPartial() {
      com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse result =
          new com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse(this);
      if (primaryStreamBuilder_ == null) {
        result.primaryStream_ = primaryStream_;
      } else {
        result.primaryStream_ = primaryStreamBuilder_.build();
      }
      if (remainderStreamBuilder_ == null) {
        result.remainderStream_ = remainderStream_;
      } else {
        result.remainderStream_ = remainderStreamBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse) {
        return mergeFrom((com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse other) {
      if (other
          == com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse.getDefaultInstance())
        return this;
      if (other.hasPrimaryStream()) {
        mergePrimaryStream(other.getPrimaryStream());
      }
      if (other.hasRemainderStream()) {
        mergeRemainderStream(other.getRemainderStream());
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
      com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.bigquery.storage.v1.ReadStream primaryStream_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.storage.v1.ReadStream,
            com.google.cloud.bigquery.storage.v1.ReadStream.Builder,
            com.google.cloud.bigquery.storage.v1.ReadStreamOrBuilder>
        primaryStreamBuilder_;
    /**
     *
     *
     * <pre>
     * Primary stream, which contains the beginning portion of
     * |original_stream|. An empty value indicates that the original stream can no
     * longer be split.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.ReadStream primary_stream = 1;</code>
     *
     * @return Whether the primaryStream field is set.
     */
    public boolean hasPrimaryStream() {
      return primaryStreamBuilder_ != null || primaryStream_ != null;
    }
    /**
     *
     *
     * <pre>
     * Primary stream, which contains the beginning portion of
     * |original_stream|. An empty value indicates that the original stream can no
     * longer be split.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.ReadStream primary_stream = 1;</code>
     *
     * @return The primaryStream.
     */
    public com.google.cloud.bigquery.storage.v1.ReadStream getPrimaryStream() {
      if (primaryStreamBuilder_ == null) {
        return primaryStream_ == null
            ? com.google.cloud.bigquery.storage.v1.ReadStream.getDefaultInstance()
            : primaryStream_;
      } else {
        return primaryStreamBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Primary stream, which contains the beginning portion of
     * |original_stream|. An empty value indicates that the original stream can no
     * longer be split.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.ReadStream primary_stream = 1;</code>
     */
    public Builder setPrimaryStream(com.google.cloud.bigquery.storage.v1.ReadStream value) {
      if (primaryStreamBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        primaryStream_ = value;
        onChanged();
      } else {
        primaryStreamBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Primary stream, which contains the beginning portion of
     * |original_stream|. An empty value indicates that the original stream can no
     * longer be split.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.ReadStream primary_stream = 1;</code>
     */
    public Builder setPrimaryStream(
        com.google.cloud.bigquery.storage.v1.ReadStream.Builder builderForValue) {
      if (primaryStreamBuilder_ == null) {
        primaryStream_ = builderForValue.build();
        onChanged();
      } else {
        primaryStreamBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Primary stream, which contains the beginning portion of
     * |original_stream|. An empty value indicates that the original stream can no
     * longer be split.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.ReadStream primary_stream = 1;</code>
     */
    public Builder mergePrimaryStream(com.google.cloud.bigquery.storage.v1.ReadStream value) {
      if (primaryStreamBuilder_ == null) {
        if (primaryStream_ != null) {
          primaryStream_ =
              com.google.cloud.bigquery.storage.v1.ReadStream.newBuilder(primaryStream_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          primaryStream_ = value;
        }
        onChanged();
      } else {
        primaryStreamBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Primary stream, which contains the beginning portion of
     * |original_stream|. An empty value indicates that the original stream can no
     * longer be split.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.ReadStream primary_stream = 1;</code>
     */
    public Builder clearPrimaryStream() {
      if (primaryStreamBuilder_ == null) {
        primaryStream_ = null;
        onChanged();
      } else {
        primaryStream_ = null;
        primaryStreamBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Primary stream, which contains the beginning portion of
     * |original_stream|. An empty value indicates that the original stream can no
     * longer be split.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.ReadStream primary_stream = 1;</code>
     */
    public com.google.cloud.bigquery.storage.v1.ReadStream.Builder getPrimaryStreamBuilder() {

      onChanged();
      return getPrimaryStreamFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Primary stream, which contains the beginning portion of
     * |original_stream|. An empty value indicates that the original stream can no
     * longer be split.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.ReadStream primary_stream = 1;</code>
     */
    public com.google.cloud.bigquery.storage.v1.ReadStreamOrBuilder getPrimaryStreamOrBuilder() {
      if (primaryStreamBuilder_ != null) {
        return primaryStreamBuilder_.getMessageOrBuilder();
      } else {
        return primaryStream_ == null
            ? com.google.cloud.bigquery.storage.v1.ReadStream.getDefaultInstance()
            : primaryStream_;
      }
    }
    /**
     *
     *
     * <pre>
     * Primary stream, which contains the beginning portion of
     * |original_stream|. An empty value indicates that the original stream can no
     * longer be split.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.ReadStream primary_stream = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.storage.v1.ReadStream,
            com.google.cloud.bigquery.storage.v1.ReadStream.Builder,
            com.google.cloud.bigquery.storage.v1.ReadStreamOrBuilder>
        getPrimaryStreamFieldBuilder() {
      if (primaryStreamBuilder_ == null) {
        primaryStreamBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.bigquery.storage.v1.ReadStream,
                com.google.cloud.bigquery.storage.v1.ReadStream.Builder,
                com.google.cloud.bigquery.storage.v1.ReadStreamOrBuilder>(
                getPrimaryStream(), getParentForChildren(), isClean());
        primaryStream_ = null;
      }
      return primaryStreamBuilder_;
    }

    private com.google.cloud.bigquery.storage.v1.ReadStream remainderStream_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.storage.v1.ReadStream,
            com.google.cloud.bigquery.storage.v1.ReadStream.Builder,
            com.google.cloud.bigquery.storage.v1.ReadStreamOrBuilder>
        remainderStreamBuilder_;
    /**
     *
     *
     * <pre>
     * Remainder stream, which contains the tail of |original_stream|. An empty
     * value indicates that the original stream can no longer be split.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.ReadStream remainder_stream = 2;</code>
     *
     * @return Whether the remainderStream field is set.
     */
    public boolean hasRemainderStream() {
      return remainderStreamBuilder_ != null || remainderStream_ != null;
    }
    /**
     *
     *
     * <pre>
     * Remainder stream, which contains the tail of |original_stream|. An empty
     * value indicates that the original stream can no longer be split.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.ReadStream remainder_stream = 2;</code>
     *
     * @return The remainderStream.
     */
    public com.google.cloud.bigquery.storage.v1.ReadStream getRemainderStream() {
      if (remainderStreamBuilder_ == null) {
        return remainderStream_ == null
            ? com.google.cloud.bigquery.storage.v1.ReadStream.getDefaultInstance()
            : remainderStream_;
      } else {
        return remainderStreamBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Remainder stream, which contains the tail of |original_stream|. An empty
     * value indicates that the original stream can no longer be split.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.ReadStream remainder_stream = 2;</code>
     */
    public Builder setRemainderStream(com.google.cloud.bigquery.storage.v1.ReadStream value) {
      if (remainderStreamBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        remainderStream_ = value;
        onChanged();
      } else {
        remainderStreamBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Remainder stream, which contains the tail of |original_stream|. An empty
     * value indicates that the original stream can no longer be split.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.ReadStream remainder_stream = 2;</code>
     */
    public Builder setRemainderStream(
        com.google.cloud.bigquery.storage.v1.ReadStream.Builder builderForValue) {
      if (remainderStreamBuilder_ == null) {
        remainderStream_ = builderForValue.build();
        onChanged();
      } else {
        remainderStreamBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Remainder stream, which contains the tail of |original_stream|. An empty
     * value indicates that the original stream can no longer be split.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.ReadStream remainder_stream = 2;</code>
     */
    public Builder mergeRemainderStream(com.google.cloud.bigquery.storage.v1.ReadStream value) {
      if (remainderStreamBuilder_ == null) {
        if (remainderStream_ != null) {
          remainderStream_ =
              com.google.cloud.bigquery.storage.v1.ReadStream.newBuilder(remainderStream_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          remainderStream_ = value;
        }
        onChanged();
      } else {
        remainderStreamBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Remainder stream, which contains the tail of |original_stream|. An empty
     * value indicates that the original stream can no longer be split.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.ReadStream remainder_stream = 2;</code>
     */
    public Builder clearRemainderStream() {
      if (remainderStreamBuilder_ == null) {
        remainderStream_ = null;
        onChanged();
      } else {
        remainderStream_ = null;
        remainderStreamBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Remainder stream, which contains the tail of |original_stream|. An empty
     * value indicates that the original stream can no longer be split.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.ReadStream remainder_stream = 2;</code>
     */
    public com.google.cloud.bigquery.storage.v1.ReadStream.Builder getRemainderStreamBuilder() {

      onChanged();
      return getRemainderStreamFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Remainder stream, which contains the tail of |original_stream|. An empty
     * value indicates that the original stream can no longer be split.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.ReadStream remainder_stream = 2;</code>
     */
    public com.google.cloud.bigquery.storage.v1.ReadStreamOrBuilder getRemainderStreamOrBuilder() {
      if (remainderStreamBuilder_ != null) {
        return remainderStreamBuilder_.getMessageOrBuilder();
      } else {
        return remainderStream_ == null
            ? com.google.cloud.bigquery.storage.v1.ReadStream.getDefaultInstance()
            : remainderStream_;
      }
    }
    /**
     *
     *
     * <pre>
     * Remainder stream, which contains the tail of |original_stream|. An empty
     * value indicates that the original stream can no longer be split.
     * </pre>
     *
     * <code>.google.cloud.bigquery.storage.v1.ReadStream remainder_stream = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.storage.v1.ReadStream,
            com.google.cloud.bigquery.storage.v1.ReadStream.Builder,
            com.google.cloud.bigquery.storage.v1.ReadStreamOrBuilder>
        getRemainderStreamFieldBuilder() {
      if (remainderStreamBuilder_ == null) {
        remainderStreamBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.bigquery.storage.v1.ReadStream,
                com.google.cloud.bigquery.storage.v1.ReadStream.Builder,
                com.google.cloud.bigquery.storage.v1.ReadStreamOrBuilder>(
                getRemainderStream(), getParentForChildren(), isClean());
        remainderStream_ = null;
      }
      return remainderStreamBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.storage.v1.SplitReadStreamResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.storage.v1.SplitReadStreamResponse)
  private static final com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse();
  }

  public static com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SplitReadStreamResponse> PARSER =
      new com.google.protobuf.AbstractParser<SplitReadStreamResponse>() {
        @java.lang.Override
        public SplitReadStreamResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SplitReadStreamResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SplitReadStreamResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SplitReadStreamResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.storage.v1.SplitReadStreamResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
