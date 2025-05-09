package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
	}

	@Test
	public void testCase1() {
		// this test case will pass
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
	}

	@Test
	public void testCase2() {
		// This test case will fail
		WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
		Assert.assertTrue(blackButton.isDisplayed());
		Assert.assertEquals(blackButton.getText(), "black");
	}

	@Test(enabled = false)
	public void testCase3() {
		// this test will skipped and not count
		String subHeading = driver.findElement(By.className("sub")).getText();
		Assert.assertTrue(subHeading.contains("Practice"));
	}

	@Test
	public void testCase4() {
		// This case will be skipped and shown as skipped
		throw new SkipException("Skipping this case");
	}

	@AfterClass
	public void afterMethod() {
		// Close the driver
		driver.close();
	}
}
