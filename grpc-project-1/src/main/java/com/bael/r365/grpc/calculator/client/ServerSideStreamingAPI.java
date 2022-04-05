package com.bael.r365.grpc.calculator.client;

import com.proto.calculator.CalculatorServiceGrpc;
import com.proto.calculator.PrimeNumberDecompositionRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import static java.lang.System.out;

public class ServerSideStreamingAPI {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                                                      .usePlaintext()
                                                      .build();

        CalculatorServiceGrpc.CalculatorServiceBlockingStub serviceStub =
                CalculatorServiceGrpc.newBlockingStub(channel);

        serviceStub.primeNumberDecomposition(PrimeNumberDecompositionRequest.newBuilder()
                                                                            .setNumber(454678)
                                                                            .build())
                   .forEachRemaining(response -> out.println(response.getPrimeFactor()));
    }
}
