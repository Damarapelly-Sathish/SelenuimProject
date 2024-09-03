package com.flipkart.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.flipkart.qa.base.BaseClass;

public class Loginpage extends BaseClass {
	
	public Loginpage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="ap_email")
	WebElement email;
	
	@FindBy(id="ap_password")
	WebElement password;
    
	@FindBy(id="signInSubmit")
	WebElement submit;
	
	public void login(String ema,String pass ) {
		email.sendKeys(ema);
		password.sendKeys(pass);
		submit.click();
	}
	
}
