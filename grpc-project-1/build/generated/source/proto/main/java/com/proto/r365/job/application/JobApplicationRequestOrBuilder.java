// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: r365/jobapplication/application.proto

package com.proto.r365.job.application;

public interface JobApplicationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:job.JobApplicationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string jobId = 1;</code>
   * @return The jobId.
   */
  java.lang.String getJobId();
  /**
   * <code>string jobId = 1;</code>
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString
      getJobIdBytes();

  /**
   * <code>.job.Application application = 2;</code>
   * @return Whether the application field is set.
   */
  boolean hasApplication();
  /**
   * <code>.job.Application application = 2;</code>
   * @return The application.
   */
  com.proto.r365.job.application.Application getApplication();
  /**
   * <code>.job.Application application = 2;</code>
   */
  com.proto.r365.job.application.ApplicationOrBuilder getApplicationOrBuilder();
}
