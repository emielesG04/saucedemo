package com.certification.automation.saucedemo.stepdefinitions;

import com.certification.automation.saucedemo.models.DataLogin;
import com.certification.automation.saucedemo.questions.LoginCorrect;
import com.certification.automation.saucedemo.questions.LoginIncorrect;
import com.certification.automation.saucedemo.tasks.EnterLoginData;
import com.certification.automation.saucedemo.tasks.OpenBrowser;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class Login {

    @Managed
    private WebDriver browser;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(browser)));

        theActorCalled("the user");
    }

    @Given("^that Elvis is at the portal$")
    public void thatElvisIsAtThePortal() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^he enters the credentials to enter$")
    public void heEntersTheCredentialsToEnter(List<DataLogin> dataLogins) {
      OnStage.theActorInTheSpotlight().attemptsTo(EnterLoginData.withData(dataLogins.get(0)));
    }

    @Then("^the user should see the message (.*)")
    public void theUserShouldSeeTheMessageProducts(String login) {
        theActorInTheSpotlight().should(seeThat(LoginCorrect.messages(),
                org.hamcrest.Matchers.is(login)));
    }

    @Then("^The user should see the following error (.*)")
    public void TheUserShouldSeeTheFollowingError(String loginIncorrect) {
        theActorInTheSpotlight().should(seeThat(LoginIncorrect.messages(),
                org.hamcrest.Matchers.is(loginIncorrect)));
    }
    @After
    public void closeScenario() {

        OnStage.drawTheCurtain();
    }
}
