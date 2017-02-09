package com.serenity.serenity.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.serenity.serenity.steps.serenity.ScoreTwiceCustomerSteps;

import net.thucydides.core.annotations.Steps;

public class ScoreTwiceDefinitionSteps {

	@Steps
	ScoreTwiceCustomerSteps customer;

	@Given("the user is on the ScoreTwice home page")
	public void givenTheCustomerIsOnTheScoreTwiceHomePage() {
		customer.is_the_home_page();
	}
	
	@When("user login userEmail = '$userEmail', userPassword = '$userPassword")
	public void whenTheTheCustomerByeProductAndLogin(String userEmail, String userPassword) {
		customer.login(userEmail, userPassword);
	}

	
	@Then("the user search for '$word'")
	public void whenTheCustomerSearchForProduct(String word) {
		customer.looks_for(word);
	}

	@Then("they should see all the results '$product'")
	public void thenTheyShouldSeeAllResults(String product) {
		customer.should_see_product(product);
	}

	
	@Then("user should add product")
	public void thenTheCustomerByeProduct() {
		customer.addProductToBasket();
	}
}
