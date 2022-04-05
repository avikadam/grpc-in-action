package com.bael.r365.grpc.calculator.server;

import com.proto.calculator.*;
import io.grpc.Context;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class CalculatorServiceImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {

    @Override
    public void sum(SumRequest request, StreamObserver<SumResponse> responseObserver) {

        SumResponse sumResponse = SumResponse.newBuilder()
                                             .setSumResult(request.getFirstNumber() + request.getSecondNumber())
                                             .build();

        responseObserver.onNext(sumResponse);

        responseObserver.onCompleted();
    }

    @Override
    public void primeNumberDecomposition(PrimeNumberDecompositionRequest request,
                                         StreamObserver<PrimeNumberDecompositionResponse> responseObserver) {
        long number = request.getNumber();
        Long divisor = 2L;

        while (number > 1) {
            if (number % divisor == 0) {
                number = number / divisor;
                responseObserver.onNext(PrimeNumberDecompositionResponse.newBuilder()
                                                                        .setPrimeFactor(divisor)
                                                                        .build());
            } else {
                divisor = divisor + 1;
                System.out.println(divisor);
            }
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<ComputeAverageRequest> computeAverage(StreamObserver<ComputeAverageResponse> responseObserver) {
        return new StreamObserver<>() {
            // running sum and count
            int sum = 0;
            int count = 0;

            @Override
            public void onNext(ComputeAverageRequest value) {
                // increment the sum
                sum += value.getNumber();
                // increment the count
                count += 1;
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                // compute average
                double average = (double) sum / count;
                responseObserver.onNext(
                        ComputeAverageResponse.newBuilder()
                                              .setAverage(average)
                                              .build()
                                       );
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<FindMaximumRequest> findMaximum(StreamObserver<FindMaximumResponse> responseObserver) {
        return new StreamObserver<>() {

            int currentMaximum = 0;

            @Override
            public void onNext(FindMaximumRequest value) {
                int currentNumber = value.getNumber();

                if (currentNumber > currentMaximum) {
                    currentMaximum = currentNumber;
                    responseObserver.onNext(
                            FindMaximumResponse.newBuilder()
                                               .setMaximum(currentMaximum)
                                               .build()
                                           );
                }

            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onCompleted();
            }

            @Override
            public void onCompleted() {
                // send the current last maximum
                responseObserver.onNext(
                        FindMaximumResponse.newBuilder()
                                           .setMaximum(currentMaximum)
                                           .build());
                // the server is done sending data
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void squareRoot(SquareRootRequest request,
                           StreamObserver<SquareRootResponse> responseObserver) {
        int number = request.getNumber();

        if (number >= 0) {
            double numberRoot = Math.sqrt(number);
            responseObserver.onNext(SquareRootResponse.newBuilder()
                                                      .setNumberRoot(numberRoot)
                                                      .build());
            responseObserver.onCompleted();
        } else {
            // we construct the exception
            responseObserver.onError(
                    Status.INVALID_ARGUMENT
                            .withDescription("The number being sent is not positive")
                            .augmentDescription("Number sent: " + number)
                            .asRuntimeException());
        }
    }

    @Override
    public void squareRootWithDeadLine(SquareRootWithDeadLineRequest request,
                                       StreamObserver<SquareRootWithDeadLineResponse> responseObserver) {

        try {
            if (!Context.current()
                        .isCancelled()) {
                System.out.println("Context is not cancelled, sleeping for deadline");
                Thread.sleep(request.getDeadLine());
            } else {
                System.out.println("Context is already cancelled, returning");
                return;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        responseObserver.onNext(SquareRootWithDeadLineResponse.newBuilder()
                                                              .setNumberSqrt(Math.sqrt(request.getNumber()))
                                                              .build());

        responseObserver.onCompleted();
    }

}
