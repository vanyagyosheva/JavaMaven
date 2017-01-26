package com.mobile.serenity.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.mobile.serenity.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the Cars home page")
    public void givenTheUserIsOnTheCarsHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up for new car with compartment value = '$compartment', and make value = '$make'")
    public void whenTheUserLooksUpTheDefinitionOf(String compartment, String make) {
        endUser.searchBySpecificConditions(compartment, make);
        endUser.starts_search();
    }

    @Then("the user should see all the cars '$results'")
    public void thenUserShouldSeeCarsResultsPage(String definition) {
        endUser.should_see_cars_results(definition);
    }

}
