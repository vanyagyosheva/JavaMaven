package com.selenium.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;



public class Home_Page {

	private static WebElement element = null;
	 
	 public static WebElement lnk_MyAccount(WebDriver driver){
	 
	    element = driver.findElement(By.id("toplinks"));
	 
	    return element;
	 
	    }
	 
	 public static WebElement lnk_LogOut(WebDriver driver){
	 
	    element = driver.findElement(By.id("account_logout"));
	 
	 return element;
	 
	    }
}
