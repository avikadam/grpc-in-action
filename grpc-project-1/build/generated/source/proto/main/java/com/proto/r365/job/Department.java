// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: r365/jobpost/job.proto

package com.proto.r365.job;

/**
 * Protobuf enum {@code job.Department}
 */
public enum Department
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>HUMAN_RESOURCE = 0;</code>
   */
  HUMAN_RESOURCE(0),
  /**
   * <code>ENGINEERING = 1;</code>
   */
  ENGINEERING(1),
  /**
   * <code>SYSTEM = 2;</code>
   */
  SYSTEM(2),
  /**
   * <code>OPERATION = 3;</code>
   */
  OPERATION(3),
  /**
   * <code>FINANCE = 4;</code>
   */
  FINANCE(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>HUMAN_RESOURCE = 0;</code>
   */
  public static final int HUMAN_RESOURCE_VALUE = 0;
  /**
   * <code>ENGINEERING = 1;</code>
   */
  public static final int ENGINEERING_VALUE = 1;
  /**
   * <code>SYSTEM = 2;</code>
   */
  public static final int SYSTEM_VALUE = 2;
  /**
   * <code>OPERATION = 3;</code>
   */
  public static final int OPERATION_VALUE = 3;
  /**
   * <code>FINANCE = 4;</code>
   */
  public static final int FINANCE_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Department valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Department forNumber(int value) {
    switch (value) {
      case 0: return HUMAN_RESOURCE;
      case 1: return ENGINEERING;
      case 2: return SYSTEM;
      case 3: return OPERATION;
      case 4: return FINANCE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Department>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Department> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Department>() {
          public Department findValueByNumber(int number) {
            return Department.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.proto.r365.job.JobOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final Department[] VALUES = values();

  public static Department valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Department(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:job.Department)
}
