package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class PaymentPage extends BasePage {

	public PaymentPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void pagamentoForConfirmado() {
    	WebElement payByBankWire = 
    			driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));  
    	
    	payByBankWire.click();
		log("Acessou a página de Confirm Order.");		

		
		ConfirmMyOrderPage confirmMyOrderPage = new ConfirmMyOrderPage();
		confirmMyOrderPage.confirmMyOrder();
	}

}