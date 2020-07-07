package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
	
	@FindBy(id="email")
	private WebElement username;

	@FindBy(id="password")
	private WebElement password;

	@FindBy(xpath="//button")
	private WebElement loginButton;

	@FindBy(xpath="//a[text()='Register a new membership']")
	private WebElement regLink;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void typeUserName(String uName) {
		username.clear();
		username.sendKeys(uName);
	}
	public void typePassword(String pass) {
		password.clear();
		password.sendKeys(pass);

	}
	public DashboardPage clickLoginButton(WebDriver driver) {
		loginButton.click();
		return new DashboardPage(driver);
	}
	
	public RegistrationPage clickOnRegLink(WebDriver driver) {
		regLink.click();
		return new RegistrationPage(driver);
	}
	
	
}
