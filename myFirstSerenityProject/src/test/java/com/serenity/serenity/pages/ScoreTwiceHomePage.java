package com.serenity.serenity.pages;

import static ch.lambdaj.Lambda.convert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.scoretwice.bg/mall/")
public class ScoreTwiceHomePage extends PageObject {

	@FindBy(name = "search")
	private WebElementFacade searchTerms;

	@FindBy(xpath = "//*[@id='infinity']/li[1]/article/div[1]/a/img")
	private WebElementFacade firstPick;

	@FindBy(xpath = "//*[@id='search']/form/input[2]")
	private WebElementFacade lookupButton;

	public void enter_keywords(String keyword) {
		searchTerms.type(keyword);
	}

	public void lookup_terms() {
		lookupButton.click();
	}

	public void getFirstProduct() {
		firstPick.click();
	}

	public List<String> getProductsTitle() {
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
