package com.selenium.controls;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestContextDriver {

	private static WebDriver webDriver;

	/**
	 * Returns the web driver
	 * 
	 * @return
	 */
	public static WebDriver GetWebDriver() {
		return webDriver;
	}

	/**
	 * Sets the web driver
	 * 
	 * @param webDriver
	 */
	public static void SetWebDriver(WebDriver webDriver) {
		TestContextDriver.webDriver = webDriver;
	}

	/**
	 * @return
	 */
	public static String GetPageTitle() {
		return TestContextDriver.webDriver.getTitle().trim();
	}

	/**
	 * @param seconds
	 */
	public static void ImplicitlyWait(int seconds) {
		webDriver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	public static void SetPageLoadTimeout(int seconds) {
		webDriver.manage().timeouts().pageLoadTimeout(seconds, TimeUnit.SECONDS);
	}

	public static void SwitchTo() {
		webDriver.switchTo().window(webDriver.getWindowHandle());
	}

	public static void WaitForElementToBeVisible(String element) {
		WebElement wait = new WebDriverWait(webDriver, 10)
				.until(ExpectedConditions.presenceOfElementLocated(By.id(element)));
	}

	public static void WindowMaximize() {

		webDriver.manage().window().maximize();
	}

	public static void SwitchToFrame(int frame) {
		GetWebDriver().switchTo().frame(frame);
	}

	public static void SwitchToDefault() {
		GetWebDriver().switchTo().defaultContent();
	}

}
