package com.bael.r365.grpc.job.client;

import com.proto.r365.job.JobRequest;
import com.proto.r365.job.JobResponse;
import com.proto.r365.job.JobServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;
import java.net.URISyntaxException;

import static java.lang.System.out;

public class JobEnvoyProxyClient {

    public static void main(String[] args) throws URISyntaxException, IOException,
            InterruptedException {

        // With envoy proxy
        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:51051")
                                                      .usePlaintext()
                                                      .build();

        JobServiceGrpc.JobServiceBlockingStub jobServiceBlockingStub =
                JobServiceGrpc.newBlockingStub(channel);

        JobRequest request = JobRequest.newBuilder()
                                       .setJobId("6247e1d5ef70b84d814b7bab")
                                       .build();

        JobResponse response = jobServiceBlockingStub.findJob(request);

        out.println(response.getJob());
    }
}
