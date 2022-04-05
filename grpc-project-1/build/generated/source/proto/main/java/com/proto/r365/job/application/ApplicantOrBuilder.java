// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: r365/jobapplication/application.proto

package com.proto.r365.job.application;

public interface ApplicantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:job.Applicant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string email = 2;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 2;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>string phone = 3;</code>
   * @return The phone.
   */
  java.lang.String getPhone();
  /**
   * <code>string phone = 3;</code>
   * @return The bytes for phone.
   */
  com.google.protobuf.ByteString
      getPhoneBytes();

  /**
   * <code>string years_of_experience = 4;</code>
   * @return The yearsOfExperience.
   */
  java.lang.String getYearsOfExperience();
  /**
   * <code>string years_of_experience = 4;</code>
   * @return The bytes for yearsOfExperience.
   */
  com.google.protobuf.ByteString
      getYearsOfExperienceBytes();

  /**
   * <code>optional string cover_letter = 5;</code>
   * @return Whether the coverLetter field is set.
   */
  boolean hasCoverLetter();
  /**
   * <code>optional string cover_letter = 5;</code>
   * @return The coverLetter.
   */
  java.lang.String getCoverLetter();
  /**
   * <code>optional string cover_letter = 5;</code>
   * @return The bytes for coverLetter.
   */
  com.google.protobuf.ByteString
      getCoverLetterBytes();

  /**
   * <code>optional string reference = 6;</code>
   * @return Whether the reference field is set.
   */
  boolean hasReference();
  /**
   * <code>optional string reference = 6;</code>
   * @return The reference.
   */
  java.lang.String getReference();
  /**
   * <code>optional string reference = 6;</code>
   * @return The bytes for reference.
   */
  com.google.protobuf.ByteString
      getReferenceBytes();

  /**
   * <code>optional string alternatePhone = 7;</code>
   * @return Whether the alternatePhone field is set.
   */
  boolean hasAlternatePhone();
  /**
   * <code>optional string alternatePhone = 7;</code>
   * @return The alternatePhone.
   */
  java.lang.String getAlternatePhone();
  /**
   * <code>optional string alternatePhone = 7;</code>
   * @return The bytes for alternatePhone.
   */
  com.google.protobuf.ByteString
      getAlternatePhoneBytes();

  /**
   * <code>optional string linkedInUrl = 8;</code>
   * @return Whether the linkedInUrl field is set.
   */
  boolean hasLinkedInUrl();
  /**
   * <code>optional string linkedInUrl = 8;</code>
   * @return The linkedInUrl.
   */
  java.lang.String getLinkedInUrl();
  /**
   * <code>optional string linkedInUrl = 8;</code>
   * @return The bytes for linkedInUrl.
   */
  com.google.protobuf.ByteString
      getLinkedInUrlBytes();

  /**
   * <code>string resumeUrl = 9;</code>
   * @return The resumeUrl.
   */
  java.lang.String getResumeUrl();
  /**
   * <code>string resumeUrl = 9;</code>
   * @return The bytes for resumeUrl.
   */
  com.google.protobuf.ByteString
      getResumeUrlBytes();
}