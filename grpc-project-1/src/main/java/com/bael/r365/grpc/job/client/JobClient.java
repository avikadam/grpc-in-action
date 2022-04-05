package com.bael.r365.grpc.job.client;

import com.google.protobuf.Timestamp;
import com.proto.r365.job.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.time.*;

import static com.proto.r365.job.Department.ENGINEERING_VALUE;
import static com.proto.r365.job.Department.forNumber;
import static java.lang.String.valueOf;
import static java.lang.System.out;
import static java.util.Arrays.stream;

public class JobClient {
    private static ManagedChannel channel;

    public static void main(String[] args) {
        channel = ManagedChannelBuilder.forTarget("localhost:50051")
                                       .usePlaintext()
                                       .build();

        JobClient jobClient = new JobClient();
        String[] javaJobs = {"Java Lead 1", "Java Lead 2", "Java Senior Engineer", "Java Engineer"};

        stream(javaJobs)
                .forEach(jobClient::createJobWithTitle);

        // Blocking server call
        jobClient.findJobs(valueOf(forNumber(ENGINEERING_VALUE)));

        // Streaming server call
        jobClient.findDepartmentJobs(forNumber(ENGINEERING_VALUE));
    }

    public void findJobs(String department) {
        JobServiceGrpc.JobServiceBlockingStub jobServiceBlockingStub =
                JobServiceGrpc.newBlockingStub(channel);

        SearchJobRequest request = SearchJobRequest.newBuilder()
                                                   .setDepartment(department)
                                                   .build();

        SearchJobResponse response = jobServiceBlockingStub.getJob(request);

        response.getJobList()
                .forEach(out::println);
    }

    public void findDepartmentJobs(Department department) {
        JobServiceGrpc.JobServiceBlockingStub jobServiceBlockingStub =
                JobServiceGrpc.newBlockingStub(channel);

        DepartmentJobRequest request = DepartmentJobRequest.newBuilder()
                                                           .setDepartment(department)
                                                           .build();

        jobServiceBlockingStub.getDepartmentJobs(request)
                              .forEachRemaining(out::println);
    }

    public void createJobWithTitle(String jobTitle) {
        JobServiceGrpc.JobServiceBlockingStub jobServiceStub =
                JobServiceGrpc.newBlockingStub(channel);

        Skill java = Skill.newBuilder()
                          .setName("Java")
                          .setLevel("Level 4")
                          .setDescription("Java 8 and above")
                          .build();

        Skill microservice = Skill.newBuilder()
                                  .setName("Spring Boot")
                                  .setLevel("Level 4")
                                  .setDescription("Spring boot")
                                  .build();

        Skill aws = Skill.newBuilder()
                         .setName("AWS")
                         .setLevel("Level 2")
                         .setDescription("AWS understanding")
                         .build();

        PrimarySkills primarySkills = PrimarySkills.newBuilder()
                                                   .addSkill(java)
                                                   .addSkill(microservice)
                                                   .build();

        SecondarySkills secondarySkills = SecondarySkills.newBuilder()
                                                         .addSkill(aws)
                                                         .build();

        MustHaveSkills mustHaveSkills = MustHaveSkills.newBuilder()
                                                      .setPrimarySkills(primarySkills)
                                                      .setSecondarySkills(secondarySkills)
                                                      .build();

        GoodToHaveSkills goodToHaveSkills = GoodToHaveSkills.newBuilder()
                                                            .setPrimarySkills(primarySkills)
                                                            .setSecondarySkills(secondarySkills)
                                                            .build();

        Job job = Job.newBuilder()
                     .setDepartment(forNumber(ENGINEERING_VALUE))
                     .setTitle("Java Lead")
                     .setDescription("Excellent java skills")
                     .setPostedBy("HR")
                     .setHiringManager("NA")
                     .setStatus(Status.NEW_OPEN)
                     .setCreateDate(fromLocalDate(LocalDate.now()))
                     .setMustHaveSkills(mustHaveSkills)
                     .setGoodToHaveSkills(goodToHaveSkills)
                     .build();


        CreateJobRequest request = CreateJobRequest.newBuilder()
                                                   .setJob(job)
                                                   .build();

        CreateJobResponse response = jobServiceStub.createJob(request);

        out.println("Received create job response");
        out.println(response.toString());

        out.println("Received create job response");
        out.println(toLocalDate(response.getJob()
                                        .getCreateDate()));
    }

    public static Timestamp fromLocalDate(LocalDate localDate) {
        Instant instant = localDate.atStartOfDay()
                                   .toInstant(ZoneOffset.UTC);
        return Timestamp.newBuilder()
                        .setSeconds(instant.getEpochSecond())
                        .setNanos(instant.getNano())
                        .build();
    }

    public static LocalDate toLocalDate(Timestamp timestamp) {
        Instant instant = Instant.ofEpochSecond(timestamp.getSeconds(), timestamp.getNanos());

        return LocalDateTime.ofInstant(instant, ZoneId.of("UTC"))
                            .toLocalDate();
    }
}
