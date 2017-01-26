package com.mobile.serenity.pages;

import net.serenitybdd.core.pages.PageObject;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

import static ch.lambdaj.Lambda.convert;

public class CarsResultsPage extends PageObject {

	
	
	 public List<String> getCarsResults() {
	        //WebElementFacade carsList = find(By.className("tableListResults"));
	        WebElementFacade carsList = find(By.xpath(".//*[@id='carsForm']/table/tbody/tr[1]/td/table[1]/tbody/tr/td[1]/table[3]/tbody"));
	        List<WebElement> results = carsList.findElements(By.tagName("tr"));
	        System.out.println("NUMBER OF ROWS IN THIS TABLE = "+results.size());
	        int row_num,col_num;
	        row_num=1;
	        for(WebElement trElement : results)
	        {
	            List<WebElement> td_collection=trElement.findElements(By.xpath("td"));
	            //System.out.println("NUMBER OF COLUMNS="+td_collection.size());
	            col_num=1;
	            for(WebElement tdElement : td_collection)
	            {
	                //System.out.println("row # "+row_num+", col # "+col_num+ "text="+tdElement.getText());
	                col_num++;
	            }
	            row_num++;
	        }
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
