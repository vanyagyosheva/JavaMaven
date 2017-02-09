package com.serenity.serenity.pages;

import net.serenitybdd.core.pages.PageObject;
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

@DefaultUrl("https://sentinel2.luxoft.com/sen/login.html")
public class LuxoftLoginPage extends PageObject {
	
	@Managed
    public WebDriver webdriver;
	
	@FindBy(id = "os_username")
	private WebElementFacade email;

	@FindBy(id = "os_password")
	private WebElementFacade password;

	@FindBy(xpath = ".//input[@value ='    Login    ']")
	private WebElementFacade loginButton;
	
	
	public void login(String userEmail, String userPassword) {
		//loginPopup.setWindowFocus();
		//Thread.sleep(5000);
		
		email.click();
		email.type(userEmail);
		password.click();
		password.type(userPassword);
		loginButton.click();
	}
}
