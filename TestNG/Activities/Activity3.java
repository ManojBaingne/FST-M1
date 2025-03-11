package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;

	@BeforeClass
	public void BeforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form");
	}

	@Test
	public void loginTest() {
		//Find user name and password field
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		
		//Enter the credential
		username.sendKeys("admin");
		password.sendKeys("password");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		//Read login message
		String loginMessage = driver.findElement(By.cssSelector("h2.text-center")).getText();
		Assert.assertEquals("Welcome Back, Admin!", loginMessage);
	}

	@AfterClass
	public void afterClass() {
		// Close driver
		driver.close();
	}

}
