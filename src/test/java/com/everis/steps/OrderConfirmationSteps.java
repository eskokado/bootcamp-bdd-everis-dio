package com.everis.steps;

import org.junit.Assert;

import com.everis.pages.OrderConfirmationPage;

import io.cucumber.java.pt.Entao;

public class OrderConfirmationSteps {

	@Entao("^deve ser apresentado a mensagem \"(.*)\"$")
	public void apresentouMensagemEsperada(String mensagem) {
		OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();
		Assert.assertTrue("Deveria ter apresentado a mensagem [" + mensagem + "]", 
				orderConfirmationPage.apresentouMensagemEsperada(mensagem));
		;
	}	

}