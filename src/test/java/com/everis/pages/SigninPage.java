package com.everis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class SigninPage extends BasePage {

	@FindBy(xpath = "//*[@id='email']")
	protected WebElement campoEmail;
	
	@FindBy(xpath = "//*[@id='passwd']")
	protected WebElement campoPassword;

	@FindBy(xpath = "//*[@id='SubmitLogin']")	
	protected WebElement botaoSignin;
	
	public SigninPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void efetuarLogin() {
		campoEmail.sendKeys("eskokado@gmail.com");
		campoPassword.sendKeys("123456");
		botaoSignin.click();
		log("Efetuou login");
	}

}