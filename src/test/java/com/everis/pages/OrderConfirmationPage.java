package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class OrderConfirmationPage extends BasePage {

	public OrderConfirmationPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	
	public boolean apresentouMensagemEsperada(String mensagem) {
		
		boolean apresentouMensagem = isElementDisplayed(By.xpath("//strong[normalize-space()='" + mensagem + "']"));
		if (apresentouMensagem) {
			log("Apresentou a mensagem [" + mensagem + "] esperada.");
			return true;
		}
		logFail("Deveria ter apresentado a mensagem [" + mensagem + "] esperada.");
		return false;
	}
	
}