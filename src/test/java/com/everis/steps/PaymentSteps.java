package com.everis.steps;

import com.everis.pages.PaymentPage;

import io.cucumber.java.pt.Quando;

public class PaymentSteps {

	@Quando("^o pagamento for confirmado$")
	public void pagamentoForConfirmado() {
		PaymentPage paymentPage = new PaymentPage();
		paymentPage.pagamentoForConfirmado();
	}	
}