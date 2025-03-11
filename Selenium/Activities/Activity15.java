import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		System.out.println("Title of the page is: " + driver.getTitle());

		// locator identification
		WebElement fullName = driver.findElement(By.xpath("//input[starts-with(@id,\"full-name\")]"));
		WebElement email = driver.findElement(By.xpath("//input[contains(@name,\"-email\")]"));
		WebElement eventDate = driver.findElement(By.xpath("//input[contains(@name,\"-event-date-\")]"));
		WebElement details = driver.findElement(By.xpath("//textarea[contains(@id,'-additional-details-')]"));

		fullName.sendKeys("MAnoj");
		email.sendKeys("manoj@gmail.com");
		eventDate.sendKeys("2025-12-20");
		details.sendKeys("please find the info!");

		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		String message = wait
				.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//h3[text()='Your event has been scheduled!']"))).getText();
		System.out.println("Confirmation meassage: " + message);

		driver.quit();

	}

}
