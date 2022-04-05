package com.bael.r365.grpc.calculator.client;

import com.proto.calculator.CalculatorServiceGrpc;
import com.proto.calculator.FindMaximumRequest;
import com.proto.calculator.FindMaximumResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static java.lang.System.out;

public class BidirectionalStreamingAPI {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                                                      .usePlaintext()
                                                      .build();

        CalculatorServiceGrpc.CalculatorServiceStub asyncStub =
                CalculatorServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<FindMaximumRequest> requestStreamObserver =
                asyncStub.findMaximum(new StreamObserver<>() {
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
                        out.println("Server finished sending response");
                    }
                });

        Arrays.asList(3, 5, 17, 9, 8, 30, 12, 12, 2, 3, 4, 5, 6, 7, 8, 9, 0, 52)
              .forEach(number -> {
                  out.println("Sending number: " + number);
                  requestStreamObserver.onNext(FindMaximumRequest.newBuilder()
                                                                 .setNumber(number)
                                                                 .build());
                  try {
                      Thread.sleep(100);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              });

        requestStreamObserver.onCompleted();

        boolean counted = latch.await(3, TimeUnit.SECONDS);

        out.println(counted ? "Finished before wait" : "Waited but not finished");
    }
}
