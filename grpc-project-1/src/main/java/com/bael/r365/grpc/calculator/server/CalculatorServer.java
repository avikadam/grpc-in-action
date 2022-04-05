package com.bael.r365.grpc.calculator.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;

import java.io.File;
import java.io.IOException;

public interface CalculatorServer {
    int PORT = 50051;

    static Server getServer(boolean secureServer) {
        if (secureServer) {
            return ServerBuilder.forPort(PORT)
                                .addService(new CalculatorServiceImpl())
                                .addService(ProtoReflectionService.newInstance()) // reflection
                                .useTransportSecurity(new File("ssl/server.crt"),
                                                      new File("ssl/server.pem"))
                                .build();
        }

        return ServerBuilder.forPort(PORT)
                            .addService(new CalculatorServiceImpl())
                            .addService(ProtoReflectionService.newInstance()) // reflection
                            .build();
    }

    void start() throws IOException, InterruptedException;
}
