package com.serenity.serenity.steps;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.serenity.serenity.steps.serenity.LuxoftEmployeeSteps;

import net.thucydides.core.annotations.Steps;

public class LuxoftDefinitionSteps {

	@Steps
	LuxoftEmployeeSteps employee;

	@Given("the employee is on the Luxoft login page")
	public void givenTheEmployeeIsOnTheLoginPage() {
		employee.is_the_login_page();
	}
	
	@When("the employee login with userEmail = '$userEmail', userPassword = '$userPassword'")
	public void whenTheEmployeeLogin(String userEmail, String userPassword) {
		employee.login(userEmail, userPassword);
	}

	
	@Then("the employee should search for <leaderboard>")
	@Alias("the employee should search for '$leaderboard'")
	public void whenTheEmployeeSearchForLeaderboard(String leaderboard) {
		employee.profilePageLink();
		employee.leaderBoardLink();
		employee.search(leaderboard);
		employee.lokup_terms();
	}

   @Then("the employee should click on <leaderboard>")
   @Alias("the employee should click on '$leaderboard'")
	public void thenTheyShouldSeeAllResults(String leaderboard) {
		employee.should_see_results(leaderboard);
	}
   
   
   
   @Given("the employee is on the Luxoft profile page '$title'")
	public void givenTheEmployeeIsOnTheLuxoftProfilePage(String title) {
		employee.is_the_profile_page(title);
	}
   @When("the employee  select from '$space' and check 'HR Department Page' page")
   public void thenTheeEmployeeShouldSelectSpaces(String space) {
		employee.selectFromSpaces();
		employee.checkSpacePage(space);
	}
   
   @Then("write to excel Basic HR practices")
   public void thenTheyShouldSeeAllTheComments() {
       employee.should_write_HR_to_excel();
   }


//
//	
//	@Then("user should add product")
//	public void thenTheCustomerByeProduct() {
//		employee.addProductToBasket();
//	}
}
