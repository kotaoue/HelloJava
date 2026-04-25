package controllers;

import org.junit.Test;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static play.test.Helpers.*;

public class HomeControllerTest extends WithApplication {

    @Test
    public void testIndex_returnsOk() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/");
        Result result = route(app, request);
        assertEquals(OK, result.status());
    }

    @Test
    public void testIndex_containsMessage() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/");
        Result result = route(app, request);
        String body = contentAsString(result);
        assertTrue(body.contains("Hello, World!"));
    }

    @Test
    public void testIndex_containsDice() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/");
        Result result = route(app, request);
        String body = contentAsString(result);
        String[] dice = {"⚀", "⚁", "⚂", "⚃", "⚄", "⚅"};
        boolean containsDice = false;
        for (String d : dice) {
            if (body.contains(d)) {
                containsDice = true;
                break;
            }
        }
        assertTrue(containsDice);
    }
}
