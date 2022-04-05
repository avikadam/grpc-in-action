package com.bael.r365.grpc.calculator.client;

import com.proto.calculator.CalculatorServiceGrpc;
import com.proto.calculator.SquareRootWithDeadLineRequest;
import com.proto.calculator.SquareRootWithDeadLineResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

public class UnaryAPIWithDeadLine {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                                                      .usePlaintext()
                                                      .build();

        CalculatorServiceGrpc.CalculatorServiceBlockingStub syncStub =
                CalculatorServiceGrpc.newBlockingStub(channel);
        try {
            long delay = 500;
            SquareRootWithDeadLineResponse response = syncStub.withDeadlineAfter(delay,
                                                                                 TimeUnit.MILLISECONDS)
                                                              .squareRootWithDeadLine(SquareRootWithDeadLineRequest.newBuilder()
                                                                                                                   .setNumber(12)
                                                                                                                   .setDeadLine(delay)
                                                                                                                   .build());

            System.out.println(response.getNumberSqrt());
        } catch (StatusRuntimeException e) {
            if (Status.DEADLINE_EXCEEDED.getCode()
                                        .equals(e.getStatus()
                                                 .getCode())) {
                System.out.println("Response deadline exceeded");
            } else {
                e.printStackTrace();
            }
        }
    }
}
