package com.bael.r365.grpc.calculator.server;

import io.grpc.Server;

import java.io.IOException;

public class CalculatorServerSecuredImpl implements CalculatorServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        CalculatorServer calculatorServer = new CalculatorServerSecuredImpl();
        calculatorServer.start();
    }

    @Override
    public void start() throws IOException, InterruptedException {
        Server server = CalculatorServer.getServer(true);

        server.start();

        Runtime.getRuntime()
               .addShutdownHook(new Thread(() -> {
                   System.out.println("Received Shutdown Request");
                   server.shutdown();
                   System.out.println("Successfully stopped the server");
               }));

        server.awaitTermination();
    }
}
