package com.bael.r365.grpc.calculator.client;

import com.google.common.util.concurrent.ListenableFuture;
import com.proto.calculator.CalculatorServiceGrpc;
import com.proto.calculator.SumRequest;
import com.proto.calculator.SumResponse;
import io.grpc.*;

import java.io.IOException;
import java.util.concurrent.*;

import static java.lang.System.out;

public class UnaryAPI {

    public static void main(String[] args) throws ExecutionException, InterruptedException,
            TimeoutException, IOException {
        ManagedChannel channel = ChannelBuilder.getChannel(true);

        CalculatorServiceGrpc.CalculatorServiceFutureStub futureStub =
                CalculatorServiceGrpc.newFutureStub(channel);
        ListenableFuture<SumResponse> listenableFuture = futureStub.sum(SumRequest.newBuilder()
                                                                                  .setFirstNumber(200)
                                                                                  .setSecondNumber(300)
                                                                                  .build());

        // listener task executor
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // add computation complete listener task
        listenableFuture.addListener(() -> out.println("Sum calculated"), executorService);

        // get calculated sum from future
        while (!listenableFuture.isDone()) {
            out.println(listenableFuture.get(2, TimeUnit.SECONDS)
                                        .getSumResult());
        }

        executorService.shutdown();
    }

}
