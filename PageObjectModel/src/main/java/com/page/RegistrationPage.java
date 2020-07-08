package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;

	@FindBy(linkText= "Register a new membership")
	private WebElement registerMember;
	
	@FindBy(id= "name")
	private WebElement name;
	
	@FindBy(id= "mobile")
	private WebElement mobile;
	
	@FindBy(id= "email")
	private WebElement email;
	
	@FindBy(id= "password")
	private WebElement password;
	
	@FindBy(xpath= "//button")
	private WebElement signinButton;
	
	@FindBy(xpath= "//b")
	private WebElement heading;
	
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickToRegister()
	{
		registerMember.click();
	}
	public void EnterName(String uname)
	{
		name.sendKeys(uname);
	}
	public void EnterMobile(String mob)
	{
		mobile.sendKeys(mob);		
	}
	public void EnterEmail(String eml)
	{
		email.sendKeys(eml);
	}
	public void EnterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void ClickToSignIn()
	{
		signinButton.click();
	}
		
}
