package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	// create a WebDriver instance
	WebDriver driver = new FirefoxDriver();

	@BeforeClass
	public void beforeClass() {
		// go to a web page
		driver.get("http://alchemy.hguy.co/orangehrm");
	}

	@AfterClass
	public void afterClass() {
		// Close the driver
		driver.close();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void HeaderUrl() {
		WebElement image = driver.findElement(By.tagName("img"));
		System.out.println("Image URL is - " + image.getAttribute("src"));
	}
}
