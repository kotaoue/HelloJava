package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static spark.Spark.awaitInitialization;
import static spark.Spark.awaitStop;
import static spark.Spark.port;
import static spark.Spark.stop;

class HelloWorldTest {

    private static final int TEST_PORT = 9876;
    private static final String[] DICE = {"⚀", "⚁", "⚂", "⚃", "⚄", "⚅"};

    @BeforeAll
    static void startServer() {
        port(TEST_PORT);
        HelloWorld.routes();
        awaitInitialization();
    }

    @AfterAll
    static void stopServer() {
        stop();
        awaitStop();
    }

    @Test
    void index_returnsOk() throws Exception {
        HttpResponse<String> response = get("/");
        assertEquals(200, response.statusCode());
    }

    @Test
    void index_containsMessage() throws Exception {
        HttpResponse<String> response = get("/");
        assertTrue(response.body().contains("Hello, World!"));
    }

    @Test
    void index_containsDice() throws Exception {
        HttpResponse<String> response = get("/");
        assertTrue(List.of(DICE).stream().anyMatch(d -> response.body().contains(d)));
    }

    private static HttpResponse<String> get(String path) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:" + TEST_PORT + path))
                .GET()
                .build();
        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }
}
