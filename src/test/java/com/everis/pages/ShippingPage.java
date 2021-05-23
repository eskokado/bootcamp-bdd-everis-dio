package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class ShippingPage extends BasePage {
	
	public ShippingPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void escolheFormaTransporte() {
    	WebElement checkboxTermOfService = 
    			driver.findElement(By.xpath("//input[@id='cgv']"));         	
	   	WebElement botaoProsseguir = 
    			driver.findElement(By.xpath("//button[@name='processCarrier']"));
    	if (!checkboxTermOfService.isSelected()) {    		
    		checkboxTermOfService.sendKeys(Keys.SPACE);
    	}
    	botaoProsseguir.click();
		log("Acessou a Page Payment.");		
	}

}