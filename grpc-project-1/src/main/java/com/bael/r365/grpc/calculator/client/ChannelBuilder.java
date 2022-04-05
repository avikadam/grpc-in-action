package com.bael.r365.grpc.calculator.client;

import io.grpc.*;

import java.io.File;
import java.io.IOException;

public class ChannelBuilder {

    public static final String LOCALHOST_50052 = "localhost:50052";

    public static ManagedChannel getChannel(boolean secured) throws IOException {
        if (secured) {
            ChannelCredentials credentials = TlsChannelCredentials.newBuilder()
                                                                  .trustManager(new File("ssl/ca.crt"))
                                                                  .build();
            return Grpc.newChannelBuilder(LOCALHOST_50052, credentials)
                       .build();
        }
        return ManagedChannelBuilder.forTarget(LOCALHOST_50052)
                                    .usePlaintext()
                                    .build();
    }
}