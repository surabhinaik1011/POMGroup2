package com.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserPage {

	WebDriver driver;
	List<WebElement> cityData;

	public UserPage(WebDriver driver) {
		this.driver = driver;
	}

	private By adduser = By.xpath("//a[contains(@href,'add_user.html')] //button");
	private By userName = By.xpath("//input[@placeholder='Username']");
	private By mobile = By.id("mobile");
	private By email = By.id("email");
	private By course = By.xpath("//input[@placeholder='Java/J2EE']");
	private By gender = By.id("Male");
	private By SelectSate = By.xpath("//div[@class='form-group']//select");
	private By city = By.xpath("//select //option");
	private By password = By.id("password");
	private By submit = By.id("submit");
	private By Cancel = By.xpath("//div[@class='box-footer']//span[1]");

	public WebElement getAddUser(WebDriver driver) {
		return driver.findElement(adduser);
	}

	public WebElement getuserName(WebDriver driver) {
		return driver.findElement(userName);
	}

	public WebElement getmobile(WebDriver driver) {
		return driver.findElement(mobile);
	}

	public WebElement getemail(WebDriver driver) {
		return driver.findElement(email);
	}

	public WebElement getcourse(WebDriver driver) {
		return driver.findElement(course);
	}

	public WebElement getgender(WebDriver driver) {
		return driver.findElement(gender);
	}

	public WebElement getSelectState(WebDriver driver) {
		return driver.findElement(SelectSate);
	}

	public WebElement getpassword(WebDriver driver) {
		return driver.findElement(password);
	}

	public List<WebElement> getcity(WebDriver driver) {
		cityData = driver.findElements(city);
		return cityData;

	}

	public WebElement getsubmit(WebDriver driver) {
		return driver.findElement(submit);
	}

	public WebElement getCancel(WebDriver driver) {
		return driver.findElement(Cancel);
	}

}
