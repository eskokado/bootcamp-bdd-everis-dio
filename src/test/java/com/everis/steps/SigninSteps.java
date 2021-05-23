package com.everis.steps;

import com.everis.pages.SigninPage;

import io.cucumber.java.pt.E;

public class SigninSteps {

	@E("^realiza o login$")
	public void realizaLogin() {
		SigninPage signinPage = new SigninPage();
		signinPage.efetuarLogin();
	}	
}