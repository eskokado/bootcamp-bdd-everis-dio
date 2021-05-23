package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class ConfirmMyOrderPage extends BasePage {

	public ConfirmMyOrderPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void confirmMyOrder() {
    	WebElement confirmMyOrder = 
    			driver.findElement(By.xpath("//span[normalize-space()='I confirm my order']"));  
    	
    	confirmMyOrder.click();
		log("Acessou a página de Order Confirmation.");		    		
	}

}