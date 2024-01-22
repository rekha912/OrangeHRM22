package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;



public class PimPage extends BaseClass {
	
	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pimLink;
	
	public PimPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnPimLink() {
		pimLink.click();
	}


}
