// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: r365/jobpost/job.proto

package com.proto.r365.job;

/**
 * Protobuf type {@code job.PrimarySkills}
 */
public final class PrimarySkills extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:job.PrimarySkills)
    PrimarySkillsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PrimarySkills.newBuilder() to construct.
  private PrimarySkills(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PrimarySkills() {
    skill_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PrimarySkills();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PrimarySkills(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              skill_ = new java.util.ArrayList<com.proto.r365.job.Skill>();
              mutable_bitField0_ |= 0x00000001;
            }
            skill_.add(
                input.readMessage(com.proto.r365.job.Skill.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        skill_ = java.util.Collections.unmodifiableList(skill_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proto.r365.job.JobOuterClass.internal_static_job_PrimarySkills_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.r365.job.JobOuterClass.internal_static_job_PrimarySkills_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.r365.job.PrimarySkills.class, com.proto.r365.job.PrimarySkills.Builder.class);
  }

  public static final int SKILL_FIELD_NUMBER = 1;
  private java.util.List<com.proto.r365.job.Skill> skill_;
  /**
   * <code>repeated .job.Skill skill = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.proto.r365.job.Skill> getSkillList() {
    return skill_;
  }
  /**
   * <code>repeated .job.Skill skill = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.proto.r365.job.SkillOrBuilder> 
      getSkillOrBuilderList() {
    return skill_;
  }
  /**
   * <code>repeated .job.Skill skill = 1;</code>
   */
  @java.lang.Override
  public int getSkillCount() {
    return skill_.size();
  }
  /**
   * <code>repeated .job.Skill skill = 1;</code>
   */
  @java.lang.Override
  public com.proto.r365.job.Skill getSkill(int index) {
    return skill_.get(index);
  }
  /**
   * <code>repeated .job.Skill skill = 1;</code>
   */
  @java.lang.Override
  public com.proto.r365.job.SkillOrBuilder getSkillOrBuilder(
      int index) {
    return skill_.get(index);
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
    for (int i = 0; i < skill_.size(); i++) {
      output.writeMessage(1, skill_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < skill_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, skill_.get(i));
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
    if (!(obj instanceof com.proto.r365.job.PrimarySkills)) {
      return super.equals(obj);
    }
    com.proto.r365.job.PrimarySkills other = (com.proto.r365.job.PrimarySkills) obj;

    if (!getSkillList()
        .equals(other.getSkillList())) return false;
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
    if (getSkillCount() > 0) {
      hash = (37 * hash) + SKILL_FIELD_NUMBER;
      hash = (53 * hash) + getSkillList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.r365.job.PrimarySkills parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.r365.job.PrimarySkills parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.r365.job.PrimarySkills parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.r365.job.PrimarySkills parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.r365.job.PrimarySkills parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.r365.job.PrimarySkills parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.r365.job.PrimarySkills parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.r365.job.PrimarySkills parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.r365.job.PrimarySkills parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.r365.job.PrimarySkills parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.r365.job.PrimarySkills parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.r365.job.PrimarySkills parseFrom(
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
  public static Builder newBuilder(com.proto.r365.job.PrimarySkills prototype) {
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
   * Protobuf type {@code job.PrimarySkills}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:job.PrimarySkills)
      com.proto.r365.job.PrimarySkillsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.r365.job.JobOuterClass.internal_static_job_PrimarySkills_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.r365.job.JobOuterClass.internal_static_job_PrimarySkills_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.r365.job.PrimarySkills.class, com.proto.r365.job.PrimarySkills.Builder.class);
    }

    // Construct using com.proto.r365.job.PrimarySkills.newBuilder()
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
        getSkillFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (skillBuilder_ == null) {
        skill_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        skillBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.r365.job.JobOuterClass.internal_static_job_PrimarySkills_descriptor;
    }

    @java.lang.Override
    public com.proto.r365.job.PrimarySkills getDefaultInstanceForType() {
      return com.proto.r365.job.PrimarySkills.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.r365.job.PrimarySkills build() {
      com.proto.r365.job.PrimarySkills result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.r365.job.PrimarySkills buildPartial() {
      com.proto.r365.job.PrimarySkills result = new com.proto.r365.job.PrimarySkills(this);
      int from_bitField0_ = bitField0_;
      if (skillBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          skill_ = java.util.Collections.unmodifiableList(skill_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.skill_ = skill_;
      } else {
        result.skill_ = skillBuilder_.build();
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
      if (other instanceof com.proto.r365.job.PrimarySkills) {
        return mergeFrom((com.proto.r365.job.PrimarySkills)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.r365.job.PrimarySkills other) {
      if (other == com.proto.r365.job.PrimarySkills.getDefaultInstance()) return this;
      if (skillBuilder_ == null) {
        if (!other.skill_.isEmpty()) {
          if (skill_.isEmpty()) {
            skill_ = other.skill_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSkillIsMutable();
            skill_.addAll(other.skill_);
          }
          onChanged();
        }
      } else {
        if (!other.skill_.isEmpty()) {
          if (skillBuilder_.isEmpty()) {
            skillBuilder_.dispose();
            skillBuilder_ = null;
            skill_ = other.skill_;
            bitField0_ = (bitField0_ & ~0x00000001);
            skillBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSkillFieldBuilder() : null;
          } else {
            skillBuilder_.addAllMessages(other.skill_);
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
      com.proto.r365.job.PrimarySkills parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.r365.job.PrimarySkills) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.proto.r365.job.Skill> skill_ =
      java.util.Collections.emptyList();
    private void ensureSkillIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        skill_ = new java.util.ArrayList<com.proto.r365.job.Skill>(skill_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.proto.r365.job.Skill, com.proto.r365.job.Skill.Builder, com.proto.r365.job.SkillOrBuilder> skillBuilder_;

    /**
     * <code>repeated .job.Skill skill = 1;</code>
     */
    public java.util.List<com.proto.r365.job.Skill> getSkillList() {
      if (skillBuilder_ == null) {
        return java.util.Collections.unmodifiableList(skill_);
      } else {
        return skillBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .job.Skill skill = 1;</code>
     */
    public int getSkillCount() {
      if (skillBuilder_ == null) {
        return skill_.size();
      } else {
        return skillBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .job.Skill skill = 1;</code>
     */
    public com.proto.r365.job.Skill getSkill(int index) {
      if (skillBuilder_ == null) {
        return skill_.get(index);
      } else {
        return skillBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .job.Skill skill = 1;</code>
     */
    public Builder setSkill(
        int index, com.proto.r365.job.Skill value) {
      if (skillBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkillIsMutable();
        skill_.set(index, value);
        onChanged();
      } else {
        skillBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .job.Skill skill = 1;</code>
     */
    public Builder setSkill(
        int index, com.proto.r365.job.Skill.Builder builderForValue) {
      if (skillBuilder_ == null) {
        ensureSkillIsMutable();
        skill_.set(index, builderForValue.build());
        onChanged();
      } else {
        skillBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .job.Skill skill = 1;</code>
     */
    public Builder addSkill(com.proto.r365.job.Skill value) {
      if (skillBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkillIsMutable();
        skill_.add(value);
        onChanged();
      } else {
        skillBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .job.Skill skill = 1;</code>
     */
    public Builder addSkill(
        int index, com.proto.r365.job.Skill value) {
      if (skillBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkillIsMutable();
        skill_.add(index, value);
        onChanged();
      } else {
        skillBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .job.Skill skill = 1;</code>
     */
    public Builder addSkill(
        com.proto.r365.job.Skill.Builder builderForValue) {
      if (skillBuilder_ == null) {
        ensureSkillIsMutable();
        skill_.add(builderForValue.build());
        onChanged();
      } else {
        skillBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .job.Skill skill = 1;</code>
     */
    public Builder addSkill(
        int index, com.proto.r365.job.Skill.Builder builderForValue) {
      if (skillBuilder_ == null) {
        ensureSkillIsMutable();
        skill_.add(index, builderForValue.build());
        onChanged();
      } else {
        skillBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .job.Skill skill = 1;</code>
     */
    public Builder addAllSkill(
        java.lang.Iterable<? extends com.proto.r365.job.Skill> values) {
      if (skillBuilder_ == null) {
        ensureSkillIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, skill_);
        onChanged();
      } else {
        skillBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .job.Skill skill = 1;</code>
     */
    public Builder clearSkill() {
      if (skillBuilder_ == null) {
        skill_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        skillBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .job.Skill skill = 1;</code>
     */
    public Builder removeSkill(int index) {
      if (skillBuilder_ == null) {
        ensureSkillIsMutable();
        skill_.remove(index);
        onChanged();
      } else {
        skillBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .job.Skill skill = 1;</code>
     */
    public com.proto.r365.job.Skill.Builder getSkillBuilder(
        int index) {
      return getSkillFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .job.Skill skill = 1;</code>
     */
    public com.proto.r365.job.SkillOrBuilder getSkillOrBuilder(
        int index) {
      if (skillBuilder_ == null) {
        return skill_.get(index);  } else {
        return skillBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .job.Skill skill = 1;</code>
     */
    public java.util.List<? extends com.proto.r365.job.SkillOrBuilder> 
         getSkillOrBuilderList() {
      if (skillBuilder_ != null) {
        return skillBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(skill_);
      }
    }
    /**
     * <code>repeated .job.Skill skill = 1;</code>
     */
    public com.proto.r365.job.Skill.Builder addSkillBuilder() {
      return getSkillFieldBuilder().addBuilder(
          com.proto.r365.job.Skill.getDefaultInstance());
    }
    /**
     * <code>repeated .job.Skill skill = 1;</code>
     */
    public com.proto.r365.job.Skill.Builder addSkillBuilder(
        int index) {
      return getSkillFieldBuilder().addBuilder(
          index, com.proto.r365.job.Skill.getDefaultInstance());
    }
    /**
     * <code>repeated .job.Skill skill = 1;</code>
     */
    public java.util.List<com.proto.r365.job.Skill.Builder> 
         getSkillBuilderList() {
      return getSkillFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.proto.r365.job.Skill, com.proto.r365.job.Skill.Builder, com.proto.r365.job.SkillOrBuilder> 
        getSkillFieldBuilder() {
      if (skillBuilder_ == null) {
        skillBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.proto.r365.job.Skill, com.proto.r365.job.Skill.Builder, com.proto.r365.job.SkillOrBuilder>(
                skill_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        skill_ = null;
      }
      return skillBuilder_;
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


    // @@protoc_insertion_point(builder_scope:job.PrimarySkills)
  }

  // @@protoc_insertion_point(class_scope:job.PrimarySkills)
  private static final com.proto.r365.job.PrimarySkills DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.r365.job.PrimarySkills();
  }

  public static com.proto.r365.job.PrimarySkills getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrimarySkills>
      PARSER = new com.google.protobuf.AbstractParser<PrimarySkills>() {
    @java.lang.Override
    public PrimarySkills parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PrimarySkills(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PrimarySkills> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrimarySkills> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.r365.job.PrimarySkills getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

