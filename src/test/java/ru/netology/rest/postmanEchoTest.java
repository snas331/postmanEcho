package ru.netology.rest;


import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class postmanEchoTest {

    @Test
    void shouldReturnSendDate() {
        String text = "hi";
        given()
                .baseUri("https://postman-echo.com")
                .body("hello")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo(text));

    }
}