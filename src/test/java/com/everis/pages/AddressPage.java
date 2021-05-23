package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class AddressPage extends BasePage {

	public AddressPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void confirmaEnderecoEntrega() {
    	WebElement botaoProsseguir = 
    			driver.findElement(By.xpath("//*[@name='processAddress']"));  
    	botaoProsseguir.click();
		log("Acessou a Page Shipping.");		
	}

}