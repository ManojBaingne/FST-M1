import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/tabs");
		System.out.println("Page title is: " + driver.getTitle());
		System.out.println("Current window tab: " + driver.getWindowHandle());
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Open A New Tab']"))).click();

		// Wait for second tab to be open
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		// print all the windows handle
		System.out.println("Current open window: " + driver.getWindowHandles());

		// Switch to the latest tab
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}

		// Wait for new page to load
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Another one')")));

		// Print the handle of current tab
		System.out.println("Current tab: " + driver.getWindowHandle());

		// print title and heading of new page
		System.out.println("Title of new page: " + driver.getTitle());
		System.out.println("New page message: " + driver.findElement(By.cssSelector("h2.mt-5")).getText());

		// Click on new page button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Another one')")));

		// wait another tab to be open
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));

		// Switch focuse
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}

		driver.quit();

	}

}
