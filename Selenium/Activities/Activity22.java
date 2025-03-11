import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity22 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/popups");
		driver.findElement(By.id("launcher")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
		
		//Find the input WebElement
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		
		//Enter the credential
		username.sendKeys("admin");
		password.sendKeys("password");
		
		//Click on the submit button
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		//Print the success messgae
		String message = driver.findElement(By.cssSelector("h2.text-center")).getText();
		System.out.println("Login message is: "+message);
		
		driver.quit();
		

	}

}
