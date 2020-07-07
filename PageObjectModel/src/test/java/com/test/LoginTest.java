package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.page.LoginPage;



public class LoginTest {
		
		LoginPage lp;
		WebDriver driver;
		
	 		@BeforeSuite
	  		public void beforeMethod() {
		  	System.setProperty("webdriver.chrome.driver", "C:/chromedriver81.exe");
			driver = new ChromeDriver();
			driver.get("file:///D:/jbk/Offline%20Website/index.html");
			driver.manage().window().maximize();
	 		}
	 		
	 		@Test(priority=2)
	 		public void invalidLoginTest() {
	 			lp.typeUserName("kian@gmail.com");
	 			lp.typePassword("123456");
	 			lp.clickLoginButton(driver);
	 		}
	 		
	 		@Test(priority=3)
	 		public void validLoginTest() {
	 			lp.typeUserName("kiran@gmail.com");
	 			lp.typePassword("123456");
	 			lp.clickLoginButton(driver);
	 		}
	 		
	 		
	 		
}
