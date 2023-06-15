package com.virgingames.cucumber.steps;

import com.virgingames.virgingamesinfo.VirginGamesSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;

public class CurrencySteps {

    static ValidatableResponse response;

    @Steps
    VirginGamesSteps virginGamesSteps = new VirginGamesSteps();

    @When("^User sends the GET request for currency GBP endpoint$")
    public void userSendsTheGETRequestForCurrencyGBPEndpoint() {
        response = virginGamesSteps.getCurrencyGBP();

    }

    @Then("^User must get back status code 200")
    public void userMustGetBackStatusCode() {
        response.statusCode(200);

    }

    @When("^User sends the GET request for currency EUR endpoint$")
    public void userSendsTheGETRequestForCurrencyEUREndpoint() {
        response = virginGamesSteps.getCurrencyEUR();

    }

    @When("^User sends the GET request for currency SEK endpoint$")
    public void userSendsTheGETRequestForCurrencySEKEndpoint() {
        response = virginGamesSteps.getCurrencySEK();
    }
}
