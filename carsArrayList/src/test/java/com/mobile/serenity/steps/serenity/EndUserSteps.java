package com.mobile.serenity.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import java.util.List;

import com.mobile.serenity.pages.CarsHomePage;
import com.mobile.serenity.pages.CarsResultsPage;

//import com.mobile.serenity.pages.CarsResultsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class EndUserSteps extends ScenarioSteps {

	CarsHomePage dictionaryPage;
	CarsResultsPage carsPage;
	
    @Step
    public void searchBySpecificConditions(String compartment, String make) {
        dictionaryPage.select_from_dropdown(compartment, make);

    }

    @Step
    public void starts_search() {
        dictionaryPage.lookup_terms();
    }

    @Step
    public void should_see_cars_results(String definition) {
    	List<String> resultList = carsPage.getCarsResults();
    	assertThat(carsPage.getCarsResults(), hasItem(containsString(definition)));
    	//System.out.print(resultList.indexOf(1));
    }

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

}