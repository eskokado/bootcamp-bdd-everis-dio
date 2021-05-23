package com.everis.steps;

import com.everis.pages.ShippingPage;

import io.cucumber.java.pt.E;

public class ShippingSteps {

	@E("^escolhe a forma de transporte$")
	public void escolheFormaTransporte() {
		ShippingPage shippingPage = new ShippingPage();
		shippingPage.escolheFormaTransporte();
	}	
}