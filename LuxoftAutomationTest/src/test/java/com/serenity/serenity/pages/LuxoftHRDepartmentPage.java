package com.serenity.serenity.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.thucydides.core.pages.PageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static ch.lambdaj.Lambda.convert;


public class LuxoftHRDepartmentPage extends PageObject {


	@FindBy(css =".archive-btn")
    private WebElementFacade title;

	@FindBy(id = "HRDepartmentPageHome-ElenaGoryunova")
	private WebElementFacade vp;
	
	@FindBy(id ="HRDepartmentPageHome-KiraLopatkina")
    private WebElementFacade managerdir;

	@FindBy(id ="HRDepartmentPageHome-KaterynaHubaryeva")
    private WebElementFacade globHR;

	@FindBy(id ="HRDepartmentPageHome-ElenaIvanova")
    private WebElementFacade traineedir;

    public String getPageTitle(){
		return title.getText();	
	}
    
    public Object[][] getElementsArray(){
    	
    	Object[][] elements = new Object[2][2];
    	
    	elements[0][0] = traineedir;
    	elements[0][1] = vp;
    	elements[1][0] = managerdir;
    	elements[1][1] = globHR;
    	
    	return elements;
    }
}