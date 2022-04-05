// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: r365/jobpost/job.proto

package com.proto.r365.job;

/**
 * Protobuf type {@code job.MustHaveSkills}
 */
public final class MustHaveSkills extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:job.MustHaveSkills)
    MustHaveSkillsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MustHaveSkills.newBuilder() to construct.
  private MustHaveSkills(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MustHaveSkills() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MustHaveSkills();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MustHaveSkills(
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
          case 10: {
            com.proto.r365.job.PrimarySkills.Builder subBuilder = null;
            if (primarySkills_ != null) {
              subBuilder = primarySkills_.toBuilder();
            }
            primarySkills_ = input.readMessage(com.proto.r365.job.PrimarySkills.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(primarySkills_);
              primarySkills_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.proto.r365.job.SecondarySkills.Builder subBuilder = null;
            if (secondarySkills_ != null) {
              subBuilder = secondarySkills_.toBuilder();
            }
            secondarySkills_ = input.readMessage(com.proto.r365.job.SecondarySkills.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(secondarySkills_);
              secondarySkills_ = subBuilder.buildPartial();
            }

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
    return com.proto.r365.job.JobOuterClass.internal_static_job_MustHaveSkills_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.r365.job.JobOuterClass.internal_static_job_MustHaveSkills_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.r365.job.MustHaveSkills.class, com.proto.r365.job.MustHaveSkills.Builder.class);
  }

  public static final int PRIMARYSKILLS_FIELD_NUMBER = 1;
  private com.proto.r365.job.PrimarySkills primarySkills_;
  /**
   * <code>.job.PrimarySkills primarySkills = 1;</code>
   * @return Whether the primarySkills field is set.
   */
  @java.lang.Override
  public boolean hasPrimarySkills() {
    return primarySkills_ != null;
  }
  /**
   * <code>.job.PrimarySkills primarySkills = 1;</code>
   * @return The primarySkills.
   */
  @java.lang.Override
  public com.proto.r365.job.PrimarySkills getPrimarySkills() {
    return primarySkills_ == null ? com.proto.r365.job.PrimarySkills.getDefaultInstance() : primarySkills_;
  }
  /**
   * <code>.job.PrimarySkills primarySkills = 1;</code>
   */
  @java.lang.Override
  public com.proto.r365.job.PrimarySkillsOrBuilder getPrimarySkillsOrBuilder() {
    return getPrimarySkills();
  }

  public static final int SECONDARYSKILLS_FIELD_NUMBER = 2;
  private com.proto.r365.job.SecondarySkills secondarySkills_;
  /**
   * <code>.job.SecondarySkills secondarySkills = 2;</code>
   * @return Whether the secondarySkills field is set.
   */
  @java.lang.Override
  public boolean hasSecondarySkills() {
    return secondarySkills_ != null;
  }
  /**
   * <code>.job.SecondarySkills secondarySkills = 2;</code>
   * @return The secondarySkills.
   */
  @java.lang.Override
  public com.proto.r365.job.SecondarySkills getSecondarySkills() {
    return secondarySkills_ == null ? com.proto.r365.job.SecondarySkills.getDefaultInstance() : secondarySkills_;
  }
  /**
   * <code>.job.SecondarySkills secondarySkills = 2;</code>
   */
  @java.lang.Override
  public com.proto.r365.job.SecondarySkillsOrBuilder getSecondarySkillsOrBuilder() {
    return getSecondarySkills();
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
    if (primarySkills_ != null) {
      output.writeMessage(1, getPrimarySkills());
    }
    if (secondarySkills_ != null) {
      output.writeMessage(2, getSecondarySkills());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (primarySkills_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPrimarySkills());
    }
    if (secondarySkills_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSecondarySkills());
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
    if (!(obj instanceof com.proto.r365.job.MustHaveSkills)) {
      return super.equals(obj);
    }
    com.proto.r365.job.MustHaveSkills other = (com.proto.r365.job.MustHaveSkills) obj;

    if (hasPrimarySkills() != other.hasPrimarySkills()) return false;
    if (hasPrimarySkills()) {
      if (!getPrimarySkills()
          .equals(other.getPrimarySkills())) return false;
    }
    if (hasSecondarySkills() != other.hasSecondarySkills()) return false;
    if (hasSecondarySkills()) {
      if (!getSecondarySkills()
          .equals(other.getSecondarySkills())) return false;
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
    if (hasPrimarySkills()) {
      hash = (37 * hash) + PRIMARYSKILLS_FIELD_NUMBER;
      hash = (53 * hash) + getPrimarySkills().hashCode();
    }
    if (hasSecondarySkills()) {
      hash = (37 * hash) + SECONDARYSKILLS_FIELD_NUMBER;
      hash = (53 * hash) + getSecondarySkills().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.r365.job.MustHaveSkills parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.r365.job.MustHaveSkills parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.r365.job.MustHaveSkills parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.r365.job.MustHaveSkills parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.r365.job.MustHaveSkills parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.r365.job.MustHaveSkills parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.r365.job.MustHaveSkills parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.r365.job.MustHaveSkills parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.r365.job.MustHaveSkills parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.r365.job.MustHaveSkills parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.r365.job.MustHaveSkills parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.r365.job.MustHaveSkills parseFrom(
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
  public static Builder newBuilder(com.proto.r365.job.MustHaveSkills prototype) {
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
   * Protobuf type {@code job.MustHaveSkills}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:job.MustHaveSkills)
      com.proto.r365.job.MustHaveSkillsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.r365.job.JobOuterClass.internal_static_job_MustHaveSkills_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.r365.job.JobOuterClass.internal_static_job_MustHaveSkills_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.r365.job.MustHaveSkills.class, com.proto.r365.job.MustHaveSkills.Builder.class);
    }

    // Construct using com.proto.r365.job.MustHaveSkills.newBuilder()
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
      if (primarySkillsBuilder_ == null) {
        primarySkills_ = null;
      } else {
        primarySkills_ = null;
        primarySkillsBuilder_ = null;
      }
      if (secondarySkillsBuilder_ == null) {
        secondarySkills_ = null;
      } else {
        secondarySkills_ = null;
        secondarySkillsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.r365.job.JobOuterClass.internal_static_job_MustHaveSkills_descriptor;
    }

    @java.lang.Override
    public com.proto.r365.job.MustHaveSkills getDefaultInstanceForType() {
      return com.proto.r365.job.MustHaveSkills.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.r365.job.MustHaveSkills build() {
      com.proto.r365.job.MustHaveSkills result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.r365.job.MustHaveSkills buildPartial() {
      com.proto.r365.job.MustHaveSkills result = new com.proto.r365.job.MustHaveSkills(this);
      if (primarySkillsBuilder_ == null) {
        result.primarySkills_ = primarySkills_;
      } else {
        result.primarySkills_ = primarySkillsBuilder_.build();
      }
      if (secondarySkillsBuilder_ == null) {
        result.secondarySkills_ = secondarySkills_;
      } else {
        result.secondarySkills_ = secondarySkillsBuilder_.build();
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
      if (other instanceof com.proto.r365.job.MustHaveSkills) {
        return mergeFrom((com.proto.r365.job.MustHaveSkills)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.r365.job.MustHaveSkills other) {
      if (other == com.proto.r365.job.MustHaveSkills.getDefaultInstance()) return this;
      if (other.hasPrimarySkills()) {
        mergePrimarySkills(other.getPrimarySkills());
      }
      if (other.hasSecondarySkills()) {
        mergeSecondarySkills(other.getSecondarySkills());
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
      com.proto.r365.job.MustHaveSkills parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.r365.job.MustHaveSkills) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.proto.r365.job.PrimarySkills primarySkills_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.r365.job.PrimarySkills, com.proto.r365.job.PrimarySkills.Builder, com.proto.r365.job.PrimarySkillsOrBuilder> primarySkillsBuilder_;
    /**
     * <code>.job.PrimarySkills primarySkills = 1;</code>
     * @return Whether the primarySkills field is set.
     */
    public boolean hasPrimarySkills() {
      return primarySkillsBuilder_ != null || primarySkills_ != null;
    }
    /**
     * <code>.job.PrimarySkills primarySkills = 1;</code>
     * @return The primarySkills.
     */
    public com.proto.r365.job.PrimarySkills getPrimarySkills() {
      if (primarySkillsBuilder_ == null) {
        return primarySkills_ == null ? com.proto.r365.job.PrimarySkills.getDefaultInstance() : primarySkills_;
      } else {
        return primarySkillsBuilder_.getMessage();
      }
    }
    /**
     * <code>.job.PrimarySkills primarySkills = 1;</code>
     */
    public Builder setPrimarySkills(com.proto.r365.job.PrimarySkills value) {
      if (primarySkillsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        primarySkills_ = value;
        onChanged();
      } else {
        primarySkillsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.job.PrimarySkills primarySkills = 1;</code>
     */
    public Builder setPrimarySkills(
        com.proto.r365.job.PrimarySkills.Builder builderForValue) {
      if (primarySkillsBuilder_ == null) {
        primarySkills_ = builderForValue.build();
        onChanged();
      } else {
        primarySkillsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.job.PrimarySkills primarySkills = 1;</code>
     */
    public Builder mergePrimarySkills(com.proto.r365.job.PrimarySkills value) {
      if (primarySkillsBuilder_ == null) {
        if (primarySkills_ != null) {
          primarySkills_ =
            com.proto.r365.job.PrimarySkills.newBuilder(primarySkills_).mergeFrom(value).buildPartial();
        } else {
          primarySkills_ = value;
        }
        onChanged();
      } else {
        primarySkillsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.job.PrimarySkills primarySkills = 1;</code>
     */
    public Builder clearPrimarySkills() {
      if (primarySkillsBuilder_ == null) {
        primarySkills_ = null;
        onChanged();
      } else {
        primarySkills_ = null;
        primarySkillsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.job.PrimarySkills primarySkills = 1;</code>
     */
    public com.proto.r365.job.PrimarySkills.Builder getPrimarySkillsBuilder() {
      
      onChanged();
      return getPrimarySkillsFieldBuilder().getBuilder();
    }
    /**
     * <code>.job.PrimarySkills primarySkills = 1;</code>
     */
    public com.proto.r365.job.PrimarySkillsOrBuilder getPrimarySkillsOrBuilder() {
      if (primarySkillsBuilder_ != null) {
        return primarySkillsBuilder_.getMessageOrBuilder();
      } else {
        return primarySkills_ == null ?
            com.proto.r365.job.PrimarySkills.getDefaultInstance() : primarySkills_;
      }
    }
    /**
     * <code>.job.PrimarySkills primarySkills = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.r365.job.PrimarySkills, com.proto.r365.job.PrimarySkills.Builder, com.proto.r365.job.PrimarySkillsOrBuilder> 
        getPrimarySkillsFieldBuilder() {
      if (primarySkillsBuilder_ == null) {
        primarySkillsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.r365.job.PrimarySkills, com.proto.r365.job.PrimarySkills.Builder, com.proto.r365.job.PrimarySkillsOrBuilder>(
                getPrimarySkills(),
                getParentForChildren(),
                isClean());
        primarySkills_ = null;
      }
      return primarySkillsBuilder_;
    }

    private com.proto.r365.job.SecondarySkills secondarySkills_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.r365.job.SecondarySkills, com.proto.r365.job.SecondarySkills.Builder, com.proto.r365.job.SecondarySkillsOrBuilder> secondarySkillsBuilder_;
    /**
     * <code>.job.SecondarySkills secondarySkills = 2;</code>
     * @return Whether the secondarySkills field is set.
     */
    public boolean hasSecondarySkills() {
      return secondarySkillsBuilder_ != null || secondarySkills_ != null;
    }
    /**
     * <code>.job.SecondarySkills secondarySkills = 2;</code>
     * @return The secondarySkills.
     */
    public com.proto.r365.job.SecondarySkills getSecondarySkills() {
      if (secondarySkillsBuilder_ == null) {
        return secondarySkills_ == null ? com.proto.r365.job.SecondarySkills.getDefaultInstance() : secondarySkills_;
      } else {
        return secondarySkillsBuilder_.getMessage();
      }
    }
    /**
     * <code>.job.SecondarySkills secondarySkills = 2;</code>
     */
    public Builder setSecondarySkills(com.proto.r365.job.SecondarySkills value) {
      if (secondarySkillsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        secondarySkills_ = value;
        onChanged();
      } else {
        secondarySkillsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.job.SecondarySkills secondarySkills = 2;</code>
     */
    public Builder setSecondarySkills(
        com.proto.r365.job.SecondarySkills.Builder builderForValue) {
      if (secondarySkillsBuilder_ == null) {
        secondarySkills_ = builderForValue.build();
        onChanged();
      } else {
        secondarySkillsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.job.SecondarySkills secondarySkills = 2;</code>
     */
    public Builder mergeSecondarySkills(com.proto.r365.job.SecondarySkills value) {
      if (secondarySkillsBuilder_ == null) {
        if (secondarySkills_ != null) {
          secondarySkills_ =
            com.proto.r365.job.SecondarySkills.newBuilder(secondarySkills_).mergeFrom(value).buildPartial();
        } else {
          secondarySkills_ = value;
        }
        onChanged();
      } else {
        secondarySkillsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.job.SecondarySkills secondarySkills = 2;</code>
     */
    public Builder clearSecondarySkills() {
      if (secondarySkillsBuilder_ == null) {
        secondarySkills_ = null;
        onChanged();
      } else {
        secondarySkills_ = null;
        secondarySkillsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.job.SecondarySkills secondarySkills = 2;</code>
     */
    public com.proto.r365.job.SecondarySkills.Builder getSecondarySkillsBuilder() {
      
      onChanged();
      return getSecondarySkillsFieldBuilder().getBuilder();
    }
    /**
     * <code>.job.SecondarySkills secondarySkills = 2;</code>
     */
    public com.proto.r365.job.SecondarySkillsOrBuilder getSecondarySkillsOrBuilder() {
      if (secondarySkillsBuilder_ != null) {
        return secondarySkillsBuilder_.getMessageOrBuilder();
      } else {
        return secondarySkills_ == null ?
            com.proto.r365.job.SecondarySkills.getDefaultInstance() : secondarySkills_;
      }
    }
    /**
     * <code>.job.SecondarySkills secondarySkills = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.r365.job.SecondarySkills, com.proto.r365.job.SecondarySkills.Builder, com.proto.r365.job.SecondarySkillsOrBuilder> 
        getSecondarySkillsFieldBuilder() {
      if (secondarySkillsBuilder_ == null) {
        secondarySkillsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.r365.job.SecondarySkills, com.proto.r365.job.SecondarySkills.Builder, com.proto.r365.job.SecondarySkillsOrBuilder>(
                getSecondarySkills(),
                getParentForChildren(),
                isClean());
        secondarySkills_ = null;
      }
      return secondarySkillsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:job.MustHaveSkills)
  }

  // @@protoc_insertion_point(class_scope:job.MustHaveSkills)
  private static final com.proto.r365.job.MustHaveSkills DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.r365.job.MustHaveSkills();
  }

  public static com.proto.r365.job.MustHaveSkills getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MustHaveSkills>
      PARSER = new com.google.protobuf.AbstractParser<MustHaveSkills>() {
    @java.lang.Override
    public MustHaveSkills parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MustHaveSkills(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MustHaveSkills> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MustHaveSkills> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.r365.job.MustHaveSkills getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

