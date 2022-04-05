package com.bael.r365.grpc.job.client;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JobHttpClient {

    public static void main(String[] args) throws URISyntaxException, IOException,
            InterruptedException {
        String jobByIdUri = "http://localhost:51051/jobs/6247e1d5ef70b84d814b7bab";
        HttpRequest request = HttpRequest.newBuilder()
                                         .uri(new URI(jobByIdUri))
                                         .GET()
                                         .build();

        HttpResponse<String> response = HttpClient.newHttpClient()
                                                  .send(request,
                                                        HttpResponse.BodyHandlers.ofString());
        System.out.println(response);
    }
}
