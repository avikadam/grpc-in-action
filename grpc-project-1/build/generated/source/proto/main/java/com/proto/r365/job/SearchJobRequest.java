// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: r365/jobpost/job.proto

package com.proto.r365.job;

/**
 * Protobuf type {@code job.SearchJobRequest}
 */
public final class SearchJobRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:job.SearchJobRequest)
    SearchJobRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchJobRequest.newBuilder() to construct.
  private SearchJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchJobRequest() {
    title_ = "";
    department_ = "";
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchJobRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SearchJobRequest(
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
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            title_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            department_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();
            bitField0_ |= 0x00000004;
            status_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return com.proto.r365.job.JobOuterClass.internal_static_job_SearchJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.r365.job.JobOuterClass.internal_static_job_SearchJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.r365.job.SearchJobRequest.class, com.proto.r365.job.SearchJobRequest.Builder.class);
  }

  private int bitField0_;
  public static final int TITLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object title_;
  /**
   * <code>optional string title = 1;</code>
   * @return Whether the title field is set.
   */
  @java.lang.Override
  public boolean hasTitle() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string title = 1;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>optional string title = 1;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPARTMENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object department_;
  /**
   * <code>optional string department = 2;</code>
   * @return Whether the department field is set.
   */
  @java.lang.Override
  public boolean hasDepartment() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string department = 2;</code>
   * @return The department.
   */
  @java.lang.Override
  public java.lang.String getDepartment() {
    java.lang.Object ref = department_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      department_ = s;
      return s;
    }
  }
  /**
   * <code>optional string department = 2;</code>
   * @return The bytes for department.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDepartmentBytes() {
    java.lang.Object ref = department_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      department_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_;
  /**
   * <code>optional .job.Status status = 3;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override public boolean hasStatus() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional .job.Status status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>optional .job.Status status = 3;</code>
   * @return The status.
   */
  @java.lang.Override public com.proto.r365.job.Status getStatus() {
    @SuppressWarnings("deprecation")
    com.proto.r365.job.Status result = com.proto.r365.job.Status.valueOf(status_);
    return result == null ? com.proto.r365.job.Status.UNRECOGNIZED : result;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, department_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeEnum(3, status_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, title_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, department_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, status_);
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
    if (!(obj instanceof com.proto.r365.job.SearchJobRequest)) {
      return super.equals(obj);
    }
    com.proto.r365.job.SearchJobRequest other = (com.proto.r365.job.SearchJobRequest) obj;

    if (hasTitle() != other.hasTitle()) return false;
    if (hasTitle()) {
      if (!getTitle()
          .equals(other.getTitle())) return false;
    }
    if (hasDepartment() != other.hasDepartment()) return false;
    if (hasDepartment()) {
      if (!getDepartment()
          .equals(other.getDepartment())) return false;
    }
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (status_ != other.status_) return false;
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
    if (hasTitle()) {
      hash = (37 * hash) + TITLE_FIELD_NUMBER;
      hash = (53 * hash) + getTitle().hashCode();
    }
    if (hasDepartment()) {
      hash = (37 * hash) + DEPARTMENT_FIELD_NUMBER;
      hash = (53 * hash) + getDepartment().hashCode();
    }
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + status_;
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.r365.job.SearchJobRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.r365.job.SearchJobRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.r365.job.SearchJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.r365.job.SearchJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.r365.job.SearchJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.r365.job.SearchJobRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.r365.job.SearchJobRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.r365.job.SearchJobRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.r365.job.SearchJobRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.r365.job.SearchJobRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.r365.job.SearchJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.r365.job.SearchJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proto.r365.job.SearchJobRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
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
  /**
   * Protobuf type {@code job.SearchJobRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:job.SearchJobRequest)
      com.proto.r365.job.SearchJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.r365.job.JobOuterClass.internal_static_job_SearchJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.r365.job.JobOuterClass.internal_static_job_SearchJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.r365.job.SearchJobRequest.class, com.proto.r365.job.SearchJobRequest.Builder.class);
    }

    // Construct using com.proto.r365.job.SearchJobRequest.newBuilder()
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
      title_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      department_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      status_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.r365.job.JobOuterClass.internal_static_job_SearchJobRequest_descriptor;
    }

    @java.lang.Override
    public com.proto.r365.job.SearchJobRequest getDefaultInstanceForType() {
      return com.proto.r365.job.SearchJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.r365.job.SearchJobRequest build() {
      com.proto.r365.job.SearchJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.r365.job.SearchJobRequest buildPartial() {
      com.proto.r365.job.SearchJobRequest result = new com.proto.r365.job.SearchJobRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.title_ = title_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.department_ = department_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.status_ = status_;
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
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proto.r365.job.SearchJobRequest) {
        return mergeFrom((com.proto.r365.job.SearchJobRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.r365.job.SearchJobRequest other) {
      if (other == com.proto.r365.job.SearchJobRequest.getDefaultInstance()) return this;
      if (other.hasTitle()) {
        bitField0_ |= 0x00000001;
        title_ = other.title_;
        onChanged();
      }
      if (other.hasDepartment()) {
        bitField0_ |= 0x00000002;
        department_ = other.department_;
        onChanged();
      }
      if (other.hasStatus()) {
        setStatus(other.getStatus());
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
      com.proto.r365.job.SearchJobRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.r365.job.SearchJobRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object title_ = "";
    /**
     * <code>optional string title = 1;</code>
     * @return Whether the title field is set.
     */
    public boolean hasTitle() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string title = 1;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string title = 1;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string title = 1;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string title = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      bitField0_ = (bitField0_ & ~0x00000001);
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>optional string title = 1;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      title_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object department_ = "";
    /**
     * <code>optional string department = 2;</code>
     * @return Whether the department field is set.
     */
    public boolean hasDepartment() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string department = 2;</code>
     * @return The department.
     */
    public java.lang.String getDepartment() {
      java.lang.Object ref = department_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        department_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string department = 2;</code>
     * @return The bytes for department.
     */
    public com.google.protobuf.ByteString
        getDepartmentBytes() {
      java.lang.Object ref = department_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        department_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string department = 2;</code>
     * @param value The department to set.
     * @return This builder for chaining.
     */
    public Builder setDepartment(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      department_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string department = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDepartment() {
      bitField0_ = (bitField0_ & ~0x00000002);
      department_ = getDefaultInstance().getDepartment();
      onChanged();
      return this;
    }
    /**
     * <code>optional string department = 2;</code>
     * @param value The bytes for department to set.
     * @return This builder for chaining.
     */
    public Builder setDepartmentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      department_ = value;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <code>optional .job.Status status = 3;</code>
     * @return Whether the status field is set.
     */
    @java.lang.Override public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .job.Status status = 3;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>optional .job.Status status = 3;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      bitField0_ |= 0x00000004;
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .job.Status status = 3;</code>
     * @return The status.
     */
    @java.lang.Override
    public com.proto.r365.job.Status getStatus() {
      @SuppressWarnings("deprecation")
      com.proto.r365.job.Status result = com.proto.r365.job.Status.valueOf(status_);
      return result == null ? com.proto.r365.job.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .job.Status status = 3;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.proto.r365.job.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .job.Status status = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000004);
      status_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:job.SearchJobRequest)
  }

  // @@protoc_insertion_point(class_scope:job.SearchJobRequest)
  private static final com.proto.r365.job.SearchJobRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.r365.job.SearchJobRequest();
  }

  public static com.proto.r365.job.SearchJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchJobRequest>
      PARSER = new com.google.protobuf.AbstractParser<SearchJobRequest>() {
    @java.lang.Override
    public SearchJobRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SearchJobRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SearchJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.r365.job.SearchJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

