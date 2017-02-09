package com.serenity.serenity.pages;

import static ch.lambdaj.Lambda.convert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;

import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


public class LuxoftProfilePage extends PageObject {

	@FindBy(linkText = "Profile")
	private WebElementFacade profileLink;

	@FindBy(linkText = "Leaderboard")
	private WebElementFacade leaderboardLink;
	
	@FindBy(id = "participant-search-input")
	private WebElementFacade searchbox;

	@FindBy(xpath = ".//*[@id='game-board-container']/div[1]/div/div[2]/div/div/div[1]/div[2]/ul/li/a")
	private WebElementFacade result;

	@FindBy(xpath = ".//div[@class='game-participant-item-block-inner']")
	private WebElementFacade resultName;
	
	@FindBy(css="#space-menu-link")
	private WebElementFacade spaces;
	
	@FindBy(linkText="HR Department Page")
	private WebElementFacade HRDepartment;
	
	public void profilePageLink() {
		profileLink.click();
	}

	
	public void leaderBoardLink() {
		leaderboardLink.click();
		setImplicitTimeout(15, TimeUnit.SECONDS);	
	}
	
	public void search(String name) {
		searchbox.type(name);
		setImplicitTimeout(15, TimeUnit.SECONDS);	
	}

	public void selectFromSpaces() {
		spaces.click();
		setImplicitTimeout(15, TimeUnit.SECONDS);
		HRDepartment.click();
		setImplicitTimeout(15, TimeUnit.SECONDS);
		
	}

	public List<String> getFirstPick() {
		WebElementFacade titlesList = find(By.tagName("tbody"));
		List<WebElement> results = titlesList.findElements(By.tagName("tr"));
		return convert(results, toStrings());
	}

	private Converter<WebElement, String> toStrings() {
		return new Converter<WebElement, String>() {
			public String convert(WebElement from) {
				return from.getText();
			}
		};
	}
}
