package com.serenity.serenity.pages;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class LuxoftLeaderboardPage extends PageObject {


	@FindBy(xpath = ".//*[@id='game-board-container']/div[1]/div/div[2]/div/div/div[1]/div[2]/ul/li/a")
	private WebElementFacade result;

	@FindBy(css = ".game-participant-item-block-inner")
	private WebElementFacade resultName;
	
	@FindBy(css=".Endorsed")
    private WebElementFacade title;

	public void lookup_terms() {
		result.click();
		setImplicitTimeout(15, TimeUnit.SECONDS);	
	}


	public void getFirstPick() {
		resultName.click();	
		setImplicitTimeout(15, TimeUnit.SECONDS);	
		
	}
	
	public String getResutPageTitle(){
		String text = title.getText();
		return text;
	}
}
