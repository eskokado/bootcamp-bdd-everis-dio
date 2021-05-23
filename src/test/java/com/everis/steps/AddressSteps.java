package com.everis.steps;

import com.everis.pages.AddressPage;

import io.cucumber.java.pt.E;

public class AddressSteps {

	@E("^confirma o endereco de entrega$")
	public void confirmaEnderecoEntrega() {
		AddressPage addressPage = new AddressPage();
		addressPage.confirmaEnderecoEntrega();
	}	
}