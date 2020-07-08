package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.page.RegistrationPage;

public class RegistrationTest {
	WebDriver driver;
	RegistrationPage register;
	@BeforeSuite 
 	public void LaunchApplication()
 	{	
	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	 driver = new ChromeDriver(); 
	 driver.get("file:///C:/Users/user/Desktop/Offline%20Website/Offline%20Website/index.html");
	 driver.manage().window().maximize();
 	}
 	
	@Test(priority = 1)
	public void RegisterMember()
	{
	RegistrationPage register = new RegistrationPage(driver);
    register.ClickToRegister();
	register.EnterName("ketaki");
	register.EnterMobile("7684939842");
	register.EnterEmail("ketaki@gmail.com");
	register.EnterPassword("12345");
	register.ClickToSignIn();	
	}
	
    @Test(priority = 2)
    public void HandleAlert() throws Throwable
    {
    	Alert al = driver.switchTo().alert();
		al.accept();
    }
	
	@AfterSuite
	public void CloseLaunchApplication(){
		driver.close();
	}
	
}


