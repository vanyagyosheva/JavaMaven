package com.serenity.serenity.pages;

import static ch.lambdaj.Lambda.convert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.base.Function;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;

import java.util.concurrent.TimeUnit;


public class ScoreTwiceProductPage extends PageObject {

	@Managed
    public WebDriver webdriver;
	
	@FindBy(className = "buy-btn")
	private WebElementFacade addToBasketButton;

	public void addToBasket() {
			
		//webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		addToBasketButton.click();
		//switchToWindow();
		
		//withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(loginPopup);
       //waitForKeywordToBeUpdatedTo(keyword);
		
	}
	
	//public void switchToWindow(){
		
 // String myWindowHandle = webdriver.getWindowHandle();
	//	webdriver.switchTo().window(myWindowHandle);
	// WebElement loginPopup= webdriver.findElement(By.className("popup login"));
		
//	}
	
//	private void waitForKeywordToBeUpdatedTo(String keyword) {
//        waitForCondition()
//               .withTimeout(5, TimeUnit.SECONDS)
//               .pollingEvery(250,TimeUnit.MILLISECONDS)
//               .until(keywordFieldIsUpdatedTo(keyword));
//  }
//
//	private Function<? super WebDriver, Boolean> keywordFieldIsUpdatedTo(String keyword) {
//        return new Function<WebDriver, Boolean>() {
//            @Override
//            public Boolean apply(WebDriver webDriver) {
//                return $("#search-query").getValue().equalsIgnoreCase(keyword);
//            }
//        };
//	}
	/*public List<String> getProductsTitle() {
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
	}*/
}
