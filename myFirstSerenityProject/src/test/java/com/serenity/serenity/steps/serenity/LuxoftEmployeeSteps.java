package com.serenity.serenity.steps.serenity;

import com.serenity.serenity.pages.ScoreTwiceHomePage;
import com.serenity.serenity.pages.ScoreTwiceLoginPage;
import com.serenity.serenity.pages.ScoreTwiceProductPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;


@SuppressWarnings("serial")
public class ScoreTwiceCustomerSteps extends ScenarioSteps {

	ScoreTwiceHomePage ScoreTwiceHomePage;
	ScoreTwiceProductPage ScoreTwiceProductPage;
	ScoreTwiceLoginPage ScoreTwiceLoginPage;

    @Step
    public void enters(String keyword) {
        ScoreTwiceHomePage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        ScoreTwiceHomePage.lookup_terms();
    }

    @Step
    public void should_see_product(String product) {
    	ScoreTwiceHomePage.getFirstProduct() ;
        assertThat(ScoreTwiceHomePage.getProductsTitle(), hasItem(containsString(product)));
    }

    @Step
    public void is_the_home_page() {
        ScoreTwiceHomePage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
    
    @Step
    public void login(String userEmail, String userPassword) {

    	ScoreTwiceLoginPage.login(userEmail, userPassword);
    }
    
    @Step
    public void addProductToBasket() {

    	ScoreTwiceProductPage.addToBasket();
    }
    
}
