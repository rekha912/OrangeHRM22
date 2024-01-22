package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class AddEmpPage extends BaseClass {

	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement AddEmployee;
	
	@FindBy(name="firstName")
	private WebElement firstName ; 
	
	@FindBy(name="middleName")
	private WebElement middleName; 
	
	@FindBy(name="lastName")
	private WebElement lastName; 
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement  save; 
	
	public AddEmpPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addEmployee(String fname,String mname,String lname)
	{
		AddEmployee.click();
		firstName.sendKeys(fname);
		middleName.sendKeys(mname);
		lastName.sendKeys(lname);
		save.click();
		
		
		}
}
