package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(name="username")
	WebElement uname;
	@FindBy(name="password")
	WebElement pass;
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement loginBtn;
	

	
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	
	}
	
	public void loginPageFunctionality(String username ,String password)
	{
		uname.sendKeys(username);
		pass.sendKeys(password);
		loginBtn.click();
	}

}
