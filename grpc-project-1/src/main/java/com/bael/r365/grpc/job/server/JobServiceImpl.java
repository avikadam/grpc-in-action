package com.bael.r365.grpc.job.server;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.mongodb.client.*;
import com.proto.r365.job.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.Optional;

import static com.mongodb.client.model.Filters.eq;

public class JobServiceImpl extends JobServiceGrpc.JobServiceImplBase {

    private final Logger log = Logger.getLogger(JobServiceImpl.class);

    private final MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
    private final MongoDatabase database = mongoClient.getDatabase("r365_doc_db");
    private final MongoCollection<Document> collection = database.getCollection("job_posting");

    @Override
    public void createJob(CreateJobRequest request,
                          StreamObserver<CreateJobResponse> responseObserver) {
        log.log(Level.INFO, "Received Create Job request");

        Job job = request.getJob();
        Optional<String> json = getJson(job);

        if (json.isPresent()) {
            Document doc = Document.parse(json.get());
            collection.insertOne(doc);

            String id = doc.getObjectId("_id")
                           .toString();

            log.log(Level.INFO, "Job created: " + id);

            CreateJobResponse response = CreateJobResponse.newBuilder()
                                                          .setJob(job.toBuilder()
                                                                     .setId(id)
                                                                     .build())
                                                          .build();

            responseObserver.onNext(response);

            responseObserver.onCompleted();
        } else {
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Job request is not " +
                                                                                     "valid, " +
                                                                                     "failed to " +
                                                                                     "create JSON")
                                                            .asRuntimeException());
        }

    }

    @Override
    public void getJob(SearchJobRequest request,
                       StreamObserver<SearchJobResponse> responseObserver) {

        log.log(Level.INFO, "Received search job request");

        FindIterable<Document> result = collection.find(eq("department", request.getDepartment()));
        SearchJobResponse.Builder builder = SearchJobResponse.newBuilder();

        result.forEach(d -> builder.addJob(documentToJob(d)));

        SearchJobResponse response = builder.build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();
    }

    @Override
    public void findJob(JobRequest request, StreamObserver<JobResponse> responseObserver) {
        log.log(Level.INFO, "Received search job request");

        Document document = collection.find(eq("_id", new ObjectId(request.getJobId()))).first();
        JobResponse.Builder builder = JobResponse.newBuilder();

        if (document != null) {
            JobResponse response = builder.setJob(documentToJob(document)).build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getDepartmentJobs(DepartmentJobRequest request,
                                  StreamObserver<DepartmentJobResponse> responseObserver) {
        log.log(Level.INFO, "Received search job request");

        collection.find(eq("department", request.getDepartment()))
                  .iterator()
                  .forEachRemaining(document -> responseObserver.onNext(
                          DepartmentJobResponse.newBuilder()
                                               .setJob(documentToJob(document))
                                               .build()));

        responseObserver.onCompleted();
    }

    private Job documentToJob(Document d) {
        Job.Builder builder = Job.newBuilder();
        try {
            JsonFormat.parser()
                      .ignoringUnknownFields()
                      .merge(d.toJson(), builder);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
        return builder.setId(d.getObjectId("_id")
                              .toString())
                      .build();
    }

    private Optional<String> getJson(Job job) {
        try {
            return Optional.ofNullable(JsonFormat.printer()
                                                 .print(job));
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
