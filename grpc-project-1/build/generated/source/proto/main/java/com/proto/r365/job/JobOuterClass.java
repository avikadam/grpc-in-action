// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: r365/jobpost/job.proto

package com.proto.r365.job;

public final class JobOuterClass {
  private JobOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_Job_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_Job_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_MustHaveSkills_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_MustHaveSkills_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_GoodToHaveSkills_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_GoodToHaveSkills_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_PrimarySkills_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_PrimarySkills_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_SecondarySkills_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_SecondarySkills_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_Skill_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_Skill_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_CreateJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_CreateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_CreateJobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_CreateJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_UpdateJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_UpdateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_UpdateJobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_UpdateJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_DepartmentJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_DepartmentJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_DepartmentJobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_DepartmentJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_SearchJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_SearchJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_SearchJobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_SearchJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_JobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_JobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_job_JobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_job_JobResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026r365/jobpost/job.proto\022\003job\032\037google/pr" +
      "otobuf/timestamp.proto\032\034google/api/annot" +
      "ations.proto\"\256\002\n\003Job\022\n\n\002id\030\001 \001(\t\022\r\n\005titl" +
      "e\030\003 \001(\t\022\023\n\013description\030\004 \001(\t\022\020\n\010postedBy" +
      "\030\007 \001(\t\022\025\n\rhiringManager\030\010 \001(\t\022\033\n\006status\030" +
      "\t \001(\0162\013.job.Status\022.\n\ncreateDate\030\n \001(\0132\032" +
      ".google.protobuf.Timestamp\022#\n\ndepartment" +
      "\030\002 \001(\0162\017.job.Department\022+\n\016mustHaveSkill" +
      "s\030\005 \001(\0132\023.job.MustHaveSkills\022/\n\020goodToHa" +
      "veSkills\030\006 \001(\0132\025.job.GoodToHaveSkills\"j\n" +
      "\016MustHaveSkills\022)\n\rprimarySkills\030\001 \001(\0132\022" +
      ".job.PrimarySkills\022-\n\017secondarySkills\030\002 " +
      "\001(\0132\024.job.SecondarySkills\"l\n\020GoodToHaveS" +
      "kills\022)\n\rprimarySkills\030\001 \001(\0132\022.job.Prima" +
      "rySkills\022-\n\017secondarySkills\030\002 \001(\0132\024.job." +
      "SecondarySkills\"*\n\rPrimarySkills\022\031\n\005skil" +
      "l\030\001 \003(\0132\n.job.Skill\",\n\017SecondarySkills\022\031" +
      "\n\005skill\030\001 \003(\0132\n.job.Skill\"9\n\005Skill\022\014\n\004na" +
      "me\030\001 \001(\t\022\r\n\005level\030\002 \001(\t\022\023\n\013description\030\003" +
      " \001(\t\")\n\020CreateJobRequest\022\025\n\003job\030\001 \001(\0132\010." +
      "job.Job\"*\n\021CreateJobResponse\022\025\n\003job\030\001 \001(" +
      "\0132\010.job.Job\")\n\020UpdateJobRequest\022\025\n\003job\030\001" +
      " \001(\0132\010.job.Job\"*\n\021UpdateJobResponse\022\025\n\003j" +
      "ob\030\001 \001(\0132\010.job.Job\";\n\024DepartmentJobReque" +
      "st\022#\n\ndepartment\030\001 \001(\0162\017.job.Department\"" +
      ".\n\025DepartmentJobResponse\022\025\n\003job\030\001 \001(\0132\010." +
      "job.Job\"\205\001\n\020SearchJobRequest\022\022\n\005title\030\001 " +
      "\001(\tH\000\210\001\001\022\027\n\ndepartment\030\002 \001(\tH\001\210\001\001\022 \n\006sta" +
      "tus\030\003 \001(\0162\013.job.StatusH\002\210\001\001B\010\n\006_titleB\r\n" +
      "\013_departmentB\t\n\007_status\"*\n\021SearchJobResp" +
      "onse\022\025\n\003job\030\001 \003(\0132\010.job.Job\"\033\n\nJobReques" +
      "t\022\r\n\005jobId\030\001 \001(\t\"$\n\013JobResponse\022\025\n\003job\030\001" +
      " \001(\0132\010.job.Job*Y\n\nDepartment\022\022\n\016HUMAN_RE" +
      "SOURCE\020\000\022\017\n\013ENGINEERING\020\001\022\n\n\006SYSTEM\020\002\022\r\n" +
      "\tOPERATION\020\003\022\013\n\007FINANCE\020\004*[\n\006Status\022\014\n\010N" +
      "EW_OPEN\020\000\022\017\n\013HIRE_CLOSED\020\001\022\021\n\rEXPIRE_CLO" +
      "SED\020\002\022\021\n\rCANCEL_CLOSED\020\003\022\014\n\010NEW_HOLD\020\0042\320" +
      "\002\n\nJobService\022:\n\tCreateJob\022\025.job.CreateJ" +
      "obRequest\032\026.job.CreateJobResponse\022:\n\tUpd" +
      "ateJob\022\025.job.UpdateJobRequest\032\026.job.Upda" +
      "teJobResponse\0227\n\006GetJob\022\025.job.SearchJobR" +
      "equest\032\026.job.SearchJobResponse\022L\n\021GetDep" +
      "artmentJobs\022\031.job.DepartmentJobRequest\032\032" +
      ".job.DepartmentJobResponse0\001\022C\n\007FindJob\022" +
      "\017.job.JobRequest\032\020.job.JobResponse\"\025\202\323\344\223" +
      "\002\017\022\r/jobs/{jobId}B\026\n\022com.proto.r365.jobP" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_job_Job_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_job_Job_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_Job_descriptor,
        new java.lang.String[] { "Id", "Title", "Description", "PostedBy", "HiringManager", "Status", "CreateDate", "Department", "MustHaveSkills", "GoodToHaveSkills", });
    internal_static_job_MustHaveSkills_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_job_MustHaveSkills_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_MustHaveSkills_descriptor,
        new java.lang.String[] { "PrimarySkills", "SecondarySkills", });
    internal_static_job_GoodToHaveSkills_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_job_GoodToHaveSkills_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_GoodToHaveSkills_descriptor,
        new java.lang.String[] { "PrimarySkills", "SecondarySkills", });
    internal_static_job_PrimarySkills_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_job_PrimarySkills_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_PrimarySkills_descriptor,
        new java.lang.String[] { "Skill", });
    internal_static_job_SecondarySkills_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_job_SecondarySkills_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_SecondarySkills_descriptor,
        new java.lang.String[] { "Skill", });
    internal_static_job_Skill_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_job_Skill_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_Skill_descriptor,
        new java.lang.String[] { "Name", "Level", "Description", });
    internal_static_job_CreateJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_job_CreateJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_CreateJobRequest_descriptor,
        new java.lang.String[] { "Job", });
    internal_static_job_CreateJobResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_job_CreateJobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_CreateJobResponse_descriptor,
        new java.lang.String[] { "Job", });
    internal_static_job_UpdateJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_job_UpdateJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_UpdateJobRequest_descriptor,
        new java.lang.String[] { "Job", });
    internal_static_job_UpdateJobResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_job_UpdateJobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_UpdateJobResponse_descriptor,
        new java.lang.String[] { "Job", });
    internal_static_job_DepartmentJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_job_DepartmentJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_DepartmentJobRequest_descriptor,
        new java.lang.String[] { "Department", });
    internal_static_job_DepartmentJobResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_job_DepartmentJobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_DepartmentJobResponse_descriptor,
        new java.lang.String[] { "Job", });
    internal_static_job_SearchJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_job_SearchJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_SearchJobRequest_descriptor,
        new java.lang.String[] { "Title", "Department", "Status", "Title", "Department", "Status", });
    internal_static_job_SearchJobResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_job_SearchJobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_SearchJobResponse_descriptor,
        new java.lang.String[] { "Job", });
    internal_static_job_JobRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_job_JobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_JobRequest_descriptor,
        new java.lang.String[] { "JobId", });
    internal_static_job_JobResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_job_JobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_job_JobResponse_descriptor,
        new java.lang.String[] { "Job", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
