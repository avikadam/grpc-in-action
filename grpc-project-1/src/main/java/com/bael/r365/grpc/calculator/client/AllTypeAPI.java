package com.bael.r365.grpc.calculator.client;

import com.proto.calculator.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static java.lang.System.out;

public class AllTypeAPI {

    public static void main(String[] args) {
        out.println("Hello I'm a gRPC client");
        new AllTypeAPI().run();
    }

    private void run() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();

        doUnaryCall(channel);

        doServerStreamingCall(channel);

        doClientStreamingCall(channel);

        doBidiStreamingCall(channel);

        doErrorCall(channel);

        out.println("Shutting down channel");

        channel.shutdown();
    }


    private void doUnaryCall(ManagedChannel channel) {
        // created a greet service client (blocking - synchronous)
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);

        SumRequest request = SumRequest.newBuilder()
                .setFirstNumber(10)
                .setSecondNumber(25)
                .build();

        SumResponse response = stub.sum(request);

        out.println(request.getFirstNumber() + " + " + request.getSecondNumber() + " = " + response.getSumResult());
    }

    private void doServerStreamingCall(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);

        long number = 120L;

        stub.primeNumberDecomposition(PrimeNumberDecompositionRequest.newBuilder()
                        .setNumber(number).build())
                .forEachRemaining(primeNumberDecompositionResponse -> out.println(primeNumberDecompositionResponse.getPrimeFactor()));
    }

    private void doClientStreamingCall(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceStub asyncClient = CalculatorServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<ComputeAverageRequest> requestObserver = asyncClient.computeAverage(new StreamObserver<>() {
            @Override
            public void onNext(ComputeAverageResponse value) {
                out.println("Received a response from the server");
                out.println(value.getAverage());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                out.println("Server has completed sending us data");
                latch.countDown();
            }
        });

        // we send 10000 messages to our server (client streaming)
        for (int i = 0; i < 10000; i++) {
            requestObserver.onNext(ComputeAverageRequest.newBuilder()
                    .setNumber(i)
                    .build());
        }

        // we expect the average to be 10 / 4  = 2.5

        requestObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void doBidiStreamingCall(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceStub asyncClient = CalculatorServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);


        StreamObserver<FindMaximumRequest> requestObserver = asyncClient.findMaximum(new StreamObserver<>() {
            @Override
            public void onNext(FindMaximumResponse value) {
                out.println("Got new maximum from Server: " + value.getMaximum());
            }

            @Override
            public void onError(Throwable t) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                out.println("Server is done sending messages");
            }
        });


        Arrays.asList(3, 5, 17, 9, 8, 30, 12).forEach(
                number -> {
                    out.println("Sending number: " + number);
                    requestObserver.onNext(FindMaximumRequest.newBuilder()
                            .setNumber(number)
                            .build());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

        requestObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void doErrorCall(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub blockingStub = CalculatorServiceGrpc.newBlockingStub(channel);

        int number = -1;

        Optional<SquareRootResponse> squareRootResponse = Optional.empty();
        try {
            squareRootResponse = Optional.ofNullable(blockingStub.squareRoot(SquareRootRequest.newBuilder()
                    .setNumber(number)
                    .build()));
        } catch (StatusRuntimeException e) {
            out.println("Got an exception for square root!");
            e.printStackTrace();
        }
        out.println("SquareRootResponse = " + squareRootResponse.orElse(null));
    }
}
