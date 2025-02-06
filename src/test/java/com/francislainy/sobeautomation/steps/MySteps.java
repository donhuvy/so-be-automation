package com.francislainy.sobeautomation.steps;

import com.francislainy.sobeautomation.client.RestClient;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import lombok.RequiredArgsConstructor;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RequiredArgsConstructor
public class MySteps {

    private final RestClient restClient;
    private Response response;

    @Given("I send a GET request to the Bored API")
    public void iSendAGETRequestToTheBoredAPI() {
        response = restClient.getRequestSpecification().get("https://google.com");
        System.out.println(">>> foo");
    }

    @Then("the response status should be {int}")
    public void theResponseStatusShouldBe(int arg0) {
        assertEquals(arg0, response.getStatusCode());
    }
}