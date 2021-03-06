// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: r365/jobpost/job.proto

package com.proto.r365.job;

/**
 * Protobuf enum {@code job.Status}
 */
public enum Status
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NEW_OPEN = 0;</code>
   */
  NEW_OPEN(0),
  /**
   * <code>HIRE_CLOSED = 1;</code>
   */
  HIRE_CLOSED(1),
  /**
   * <code>EXPIRE_CLOSED = 2;</code>
   */
  EXPIRE_CLOSED(2),
  /**
   * <code>CANCEL_CLOSED = 3;</code>
   */
  CANCEL_CLOSED(3),
  /**
   * <code>NEW_HOLD = 4;</code>
   */
  NEW_HOLD(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NEW_OPEN = 0;</code>
   */
  public static final int NEW_OPEN_VALUE = 0;
  /**
   * <code>HIRE_CLOSED = 1;</code>
   */
  public static final int HIRE_CLOSED_VALUE = 1;
  /**
   * <code>EXPIRE_CLOSED = 2;</code>
   */
  public static final int EXPIRE_CLOSED_VALUE = 2;
  /**
   * <code>CANCEL_CLOSED = 3;</code>
   */
  public static final int CANCEL_CLOSED_VALUE = 3;
  /**
   * <code>NEW_HOLD = 4;</code>
   */
  public static final int NEW_HOLD_VALUE = 4;


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
  public static Status valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Status forNumber(int value) {
    switch (value) {
      case 0: return NEW_OPEN;
      case 1: return HIRE_CLOSED;
      case 2: return EXPIRE_CLOSED;
      case 3: return CANCEL_CLOSED;
      case 4: return NEW_HOLD;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Status>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Status> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Status>() {
          public Status findValueByNumber(int number) {
            return Status.forNumber(number);
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
    return com.proto.r365.job.JobOuterClass.getDescriptor().getEnumTypes().get(1);
  }

  private static final Status[] VALUES = values();

  public static Status valueOf(
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

  private Status(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:job.Status)
}

