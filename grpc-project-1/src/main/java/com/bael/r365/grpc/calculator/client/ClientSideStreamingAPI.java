package com.bael.r365.grpc.calculator.client;

import com.proto.calculator.CalculatorServiceGrpc;
import com.proto.calculator.ComputeAverageRequest;
import com.proto.calculator.ComputeAverageResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static java.lang.System.out;

public class ClientSideStreamingAPI {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                                                      .usePlaintext()
                                                      .build();
        CalculatorServiceGrpc.CalculatorServiceStub asyncStub =
                CalculatorServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<ComputeAverageRequest> requestObserver =
                asyncStub.computeAverage(new StreamObserver<>() {
                    @Override
                    public void onNext(ComputeAverageResponse value) {
                        out.println("Received a response from the server");
                        out.println(value.getAverage());
                    }

                    @Override
                    public void onError(Throwable t) {
                        // do nothing
                    }

                    @Override
                    public void onCompleted() {
                        out.println("Server response completed");
                        latch.countDown();
                    }
                });

        // Send stream of requests
        for (int i = 0; i < 10000; i++) {
            requestObserver.onNext(ComputeAverageRequest.newBuilder()
                                                        .setNumber(i)
                                                        .build());
        }

        requestObserver.onCompleted();

        boolean counted = latch.await(3, TimeUnit.SECONDS);

        out.println(counted ? "Processed before finishing wait time" : "Waited but " +
                "processing not finished");
    }
}
