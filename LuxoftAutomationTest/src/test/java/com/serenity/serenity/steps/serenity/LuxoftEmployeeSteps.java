package com.serenity.serenity.steps.serenity;

import com.serenity.serenity.pages.LuxoftHRDepartmentPage;
import com.serenity.serenity.pages.LuxoftLeaderboardPage;
import com.serenity.serenity.pages.LuxoftLoginPage;
import com.serenity.serenity.pages.LuxoftProfilePage;
import com.serenity.serenity.utilities.ExcelUtils;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import java.io.IOException;

import org.hamcrest.Matcher;
import org.openqa.selenium.By;


@SuppressWarnings("serial")
public class LuxoftEmployeeSteps extends ScenarioSteps {

	
	LuxoftLoginPage LoginPage;
	LuxoftProfilePage ProfilePage;
	LuxoftLeaderboardPage LeaderboardPage;
	LuxoftHRDepartmentPage HRDepartmentPage;
	
    @Step
    public void is_the_login_page() {
        LoginPage.open();
    }

    @Step
    public void login(String userEmail, String userPassword) {

    	LoginPage.login(userEmail, userPassword);
    }

    @Step
	public void profilePageLink() {
		ProfilePage.profilePageLink();
		
	}

    @Step
	public void leaderBoardLink() {
		ProfilePage.leaderBoardLink();
		
	}

    @Step
	public void search(String name) {
		ProfilePage.search(name);
		
	}

    @Step
	public void lokup_terms() {
		LeaderboardPage.lookup_terms();
	//assertThat(ProfilePage.getResutPageTitle(), hasItem(containsString(name)));
		    
	}
    
    @Step
    public void should_see_results(String name) {
  	  LeaderboardPage.getFirstPick();
  	  assertThat(LeaderboardPage.getResutPageTitle()).containsIgnoringCase(name);
    
    }
    
    @Step
    public void is_the_profile_page(String title) {
        assertThat(ProfilePage.getTitle().contains(title));
    }

    @Step
	public void selectFromSpaces() {
		ProfilePage.selectFromSpaces();
		 
	}

    @Step
	public void checkSpacePage(String space) {
		assertThat(HRDepartmentPage.getPageTitle()).containsIgnoringCase(space);
	}
    
    @Step
	public void should_write_HR_to_excel() {
		
		try {
			ExcelUtils.writeTableToExcel("HR name", "HR name 2",HRDepartmentPage.getElementsArray() ,1,1 );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

   
    
//    @Step
//    public void addProductToBasket() {
//
//    	ScoreTwiceProductPage.addToBasket();
//    }
    
}
