package com.mobile.serenity.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("http://www.cars.bg/")
public class CarsHomePage extends PageObject {
	
	@Managed
    public WebDriver webdriver;

    @FindBy(name="categoryId")
    private WebElementFacade compartmentDropdownList;

    @FindBy(name="brandId")
    private WebElementFacade makesList;
    
    @FindBy(xpath=".//*[@id='Form']/div/table/tbody/tr[3]/td/table/tbody/tr/td[2]/center/div/div/a/b")
    private WebElementFacade searchBtn;

   
    public void lookup_terms() {
        searchBtn.click();
    }

    public void select_from_dropdown(String compertment, String make){
    compartmentDropdownList.click();
    compartmentDropdownList.selectByValue(compertment);
    makesList.click();
    makesList.selectByValue(make);
    }
    
}