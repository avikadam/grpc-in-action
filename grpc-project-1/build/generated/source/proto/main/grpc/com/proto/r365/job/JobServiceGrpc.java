package com.proto.r365.job;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.0)",
    comments = "Source: r365/jobpost/job.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class JobServiceGrpc {

  private JobServiceGrpc() {}

  public static final String SERVICE_NAME = "job.JobService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.r365.job.CreateJobRequest,
      com.proto.r365.job.CreateJobResponse> getCreateJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateJob",
      requestType = com.proto.r365.job.CreateJobRequest.class,
      responseType = com.proto.r365.job.CreateJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.r365.job.CreateJobRequest,
      com.proto.r365.job.CreateJobResponse> getCreateJobMethod() {
    io.grpc.MethodDescriptor<com.proto.r365.job.CreateJobRequest, com.proto.r365.job.CreateJobResponse> getCreateJobMethod;
    if ((getCreateJobMethod = JobServiceGrpc.getCreateJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getCreateJobMethod = JobServiceGrpc.getCreateJobMethod) == null) {
          JobServiceGrpc.getCreateJobMethod = getCreateJobMethod =
              io.grpc.MethodDescriptor.<com.proto.r365.job.CreateJobRequest, com.proto.r365.job.CreateJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.r365.job.CreateJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.r365.job.CreateJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("CreateJob"))
              .build();
        }
      }
    }
    return getCreateJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.r365.job.UpdateJobRequest,
      com.proto.r365.job.UpdateJobResponse> getUpdateJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateJob",
      requestType = com.proto.r365.job.UpdateJobRequest.class,
      responseType = com.proto.r365.job.UpdateJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.r365.job.UpdateJobRequest,
      com.proto.r365.job.UpdateJobResponse> getUpdateJobMethod() {
    io.grpc.MethodDescriptor<com.proto.r365.job.UpdateJobRequest, com.proto.r365.job.UpdateJobResponse> getUpdateJobMethod;
    if ((getUpdateJobMethod = JobServiceGrpc.getUpdateJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getUpdateJobMethod = JobServiceGrpc.getUpdateJobMethod) == null) {
          JobServiceGrpc.getUpdateJobMethod = getUpdateJobMethod =
              io.grpc.MethodDescriptor.<com.proto.r365.job.UpdateJobRequest, com.proto.r365.job.UpdateJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.r365.job.UpdateJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.r365.job.UpdateJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("UpdateJob"))
              .build();
        }
      }
    }
    return getUpdateJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.r365.job.SearchJobRequest,
      com.proto.r365.job.SearchJobResponse> getGetJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJob",
      requestType = com.proto.r365.job.SearchJobRequest.class,
      responseType = com.proto.r365.job.SearchJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.r365.job.SearchJobRequest,
      com.proto.r365.job.SearchJobResponse> getGetJobMethod() {
    io.grpc.MethodDescriptor<com.proto.r365.job.SearchJobRequest, com.proto.r365.job.SearchJobResponse> getGetJobMethod;
    if ((getGetJobMethod = JobServiceGrpc.getGetJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getGetJobMethod = JobServiceGrpc.getGetJobMethod) == null) {
          JobServiceGrpc.getGetJobMethod = getGetJobMethod =
              io.grpc.MethodDescriptor.<com.proto.r365.job.SearchJobRequest, com.proto.r365.job.SearchJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.r365.job.SearchJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.r365.job.SearchJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("GetJob"))
              .build();
        }
      }
    }
    return getGetJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.r365.job.DepartmentJobRequest,
      com.proto.r365.job.DepartmentJobResponse> getGetDepartmentJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDepartmentJobs",
      requestType = com.proto.r365.job.DepartmentJobRequest.class,
      responseType = com.proto.r365.job.DepartmentJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.r365.job.DepartmentJobRequest,
      com.proto.r365.job.DepartmentJobResponse> getGetDepartmentJobsMethod() {
    io.grpc.MethodDescriptor<com.proto.r365.job.DepartmentJobRequest, com.proto.r365.job.DepartmentJobResponse> getGetDepartmentJobsMethod;
    if ((getGetDepartmentJobsMethod = JobServiceGrpc.getGetDepartmentJobsMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getGetDepartmentJobsMethod = JobServiceGrpc.getGetDepartmentJobsMethod) == null) {
          JobServiceGrpc.getGetDepartmentJobsMethod = getGetDepartmentJobsMethod =
              io.grpc.MethodDescriptor.<com.proto.r365.job.DepartmentJobRequest, com.proto.r365.job.DepartmentJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDepartmentJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.r365.job.DepartmentJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.r365.job.DepartmentJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("GetDepartmentJobs"))
              .build();
        }
      }
    }
    return getGetDepartmentJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.r365.job.JobRequest,
      com.proto.r365.job.JobResponse> getFindJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindJob",
      requestType = com.proto.r365.job.JobRequest.class,
      responseType = com.proto.r365.job.JobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.r365.job.JobRequest,
      com.proto.r365.job.JobResponse> getFindJobMethod() {
    io.grpc.MethodDescriptor<com.proto.r365.job.JobRequest, com.proto.r365.job.JobResponse> getFindJobMethod;
    if ((getFindJobMethod = JobServiceGrpc.getFindJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getFindJobMethod = JobServiceGrpc.getFindJobMethod) == null) {
          JobServiceGrpc.getFindJobMethod = getFindJobMethod =
              io.grpc.MethodDescriptor.<com.proto.r365.job.JobRequest, com.proto.r365.job.JobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.r365.job.JobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.r365.job.JobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("FindJob"))
              .build();
        }
      }
    }
    return getFindJobMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobServiceStub>() {
        @java.lang.Override
        public JobServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobServiceStub(channel, callOptions);
        }
      };
    return JobServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobServiceBlockingStub>() {
        @java.lang.Override
        public JobServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobServiceBlockingStub(channel, callOptions);
        }
      };
    return JobServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobServiceFutureStub>() {
        @java.lang.Override
        public JobServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobServiceFutureStub(channel, callOptions);
        }
      };
    return JobServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class JobServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createJob(com.proto.r365.job.CreateJobRequest request,
        io.grpc.stub.StreamObserver<com.proto.r365.job.CreateJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateJobMethod(), responseObserver);
    }

    /**
     */
    public void updateJob(com.proto.r365.job.UpdateJobRequest request,
        io.grpc.stub.StreamObserver<com.proto.r365.job.UpdateJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateJobMethod(), responseObserver);
    }

    /**
     */
    public void getJob(com.proto.r365.job.SearchJobRequest request,
        io.grpc.stub.StreamObserver<com.proto.r365.job.SearchJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetJobMethod(), responseObserver);
    }

    /**
     */
    public void getDepartmentJobs(com.proto.r365.job.DepartmentJobRequest request,
        io.grpc.stub.StreamObserver<com.proto.r365.job.DepartmentJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDepartmentJobsMethod(), responseObserver);
    }

    /**
     */
    public void findJob(com.proto.r365.job.JobRequest request,
        io.grpc.stub.StreamObserver<com.proto.r365.job.JobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindJobMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.r365.job.CreateJobRequest,
                com.proto.r365.job.CreateJobResponse>(
                  this, METHODID_CREATE_JOB)))
          .addMethod(
            getUpdateJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.r365.job.UpdateJobRequest,
                com.proto.r365.job.UpdateJobResponse>(
                  this, METHODID_UPDATE_JOB)))
          .addMethod(
            getGetJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.r365.job.SearchJobRequest,
                com.proto.r365.job.SearchJobResponse>(
                  this, METHODID_GET_JOB)))
          .addMethod(
            getGetDepartmentJobsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.r365.job.DepartmentJobRequest,
                com.proto.r365.job.DepartmentJobResponse>(
                  this, METHODID_GET_DEPARTMENT_JOBS)))
          .addMethod(
            getFindJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.r365.job.JobRequest,
                com.proto.r365.job.JobResponse>(
                  this, METHODID_FIND_JOB)))
          .build();
    }
  }

  /**
   */
  public static final class JobServiceStub extends io.grpc.stub.AbstractAsyncStub<JobServiceStub> {
    private JobServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceStub(channel, callOptions);
    }

    /**
     */
    public void createJob(com.proto.r365.job.CreateJobRequest request,
        io.grpc.stub.StreamObserver<com.proto.r365.job.CreateJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateJob(com.proto.r365.job.UpdateJobRequest request,
        io.grpc.stub.StreamObserver<com.proto.r365.job.UpdateJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getJob(com.proto.r365.job.SearchJobRequest request,
        io.grpc.stub.StreamObserver<com.proto.r365.job.SearchJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDepartmentJobs(com.proto.r365.job.DepartmentJobRequest request,
        io.grpc.stub.StreamObserver<com.proto.r365.job.DepartmentJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetDepartmentJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findJob(com.proto.r365.job.JobRequest request,
        io.grpc.stub.StreamObserver<com.proto.r365.job.JobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindJobMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JobServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<JobServiceBlockingStub> {
    private JobServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.r365.job.CreateJobResponse createJob(com.proto.r365.job.CreateJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.r365.job.UpdateJobResponse updateJob(com.proto.r365.job.UpdateJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.r365.job.SearchJobResponse getJob(com.proto.r365.job.SearchJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.r365.job.DepartmentJobResponse> getDepartmentJobs(
        com.proto.r365.job.DepartmentJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetDepartmentJobsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.r365.job.JobResponse findJob(com.proto.r365.job.JobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindJobMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JobServiceFutureStub extends io.grpc.stub.AbstractFutureStub<JobServiceFutureStub> {
    private JobServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.r365.job.CreateJobResponse> createJob(
        com.proto.r365.job.CreateJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.r365.job.UpdateJobResponse> updateJob(
        com.proto.r365.job.UpdateJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.r365.job.SearchJobResponse> getJob(
        com.proto.r365.job.SearchJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.r365.job.JobResponse> findJob(
        com.proto.r365.job.JobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindJobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_JOB = 0;
  private static final int METHODID_UPDATE_JOB = 1;
  private static final int METHODID_GET_JOB = 2;
  private static final int METHODID_GET_DEPARTMENT_JOBS = 3;
  private static final int METHODID_FIND_JOB = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_JOB:
          serviceImpl.createJob((com.proto.r365.job.CreateJobRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.r365.job.CreateJobResponse>) responseObserver);
          break;
        case METHODID_UPDATE_JOB:
          serviceImpl.updateJob((com.proto.r365.job.UpdateJobRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.r365.job.UpdateJobResponse>) responseObserver);
          break;
        case METHODID_GET_JOB:
          serviceImpl.getJob((com.proto.r365.job.SearchJobRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.r365.job.SearchJobResponse>) responseObserver);
          break;
        case METHODID_GET_DEPARTMENT_JOBS:
          serviceImpl.getDepartmentJobs((com.proto.r365.job.DepartmentJobRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.r365.job.DepartmentJobResponse>) responseObserver);
          break;
        case METHODID_FIND_JOB:
          serviceImpl.findJob((com.proto.r365.job.JobRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.r365.job.JobResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class JobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.r365.job.JobOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JobService");
    }
  }

  private static final class JobServiceFileDescriptorSupplier
      extends JobServiceBaseDescriptorSupplier {
    JobServiceFileDescriptorSupplier() {}
  }

  private static final class JobServiceMethodDescriptorSupplier
      extends JobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (JobServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobServiceFileDescriptorSupplier())
              .addMethod(getCreateJobMethod())
              .addMethod(getUpdateJobMethod())
              .addMethod(getGetJobMethod())
              .addMethod(getGetDepartmentJobsMethod())
              .addMethod(getFindJobMethod())
              .build();
        }
      }
    }
    return result;
  }
}
