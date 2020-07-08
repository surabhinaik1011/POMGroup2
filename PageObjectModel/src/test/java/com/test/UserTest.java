package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.page.UserPage;

public class UserTest {

	public WebDriver driver;

	@BeforeClass
	public WebDriver getDriver() throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Testing Projects\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/website/Offline%20Website/index.html");

		return driver;
	}

	@Test()
	public void navigateToDashboard() {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}

	@Test(priority = 1)
	public void clickOnUser() {
		driver.findElement(By.xpath("//a[contains(@href,'users.html')]")).click();
	}

	@Test(priority = 2)
	public void clickAddUser() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'add_user.html')] //button")).click();
	}

	@Test(priority = 3)
	public void addUserTest() throws InterruptedException, IOException {
		UserPage up = new UserPage(driver);

		Thread.sleep(1000);
		up.getuserName(driver).sendKeys("Mayur Talan");
		up.getmobile(driver).sendKeys("00000000");
		up.getemail(driver).sendKeys("mayurtalan@gmail.com");
		up.getcourse(driver).sendKeys("Selenium");
		up.getgender(driver).click();
		up.getSelectState(driver).click();
		List<WebElement> cityData = up.getcity(driver);
		System.out.println(cityData.size());

		for (int i = 0; i < cityData.size() - 1; i++) {
			if (cityData.get(i).getText().equalsIgnoreCase("HP")) {
				Thread.sleep(2000);
				cityData.get(i).click();
				break;
			}
		}

		System.out.println(cityData.size());
		up.getpassword(driver).sendKeys("12345");
		up.getsubmit(driver).click();

	}
}
