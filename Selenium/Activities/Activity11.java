import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Activity11 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
		//Locate the webElement
		WebElement checkBox = driver.findElement(By.id("checkbox"));
		WebElement toggleCheckBox = driver.findElement(By.xpath("//button[text()=\"Toggle Checkbox\"]"));
		
		//Check if checkBox is visible before and after toggle click
		System.out.println("checkBox is displayed: "+checkBox.isDisplayed());
		toggleCheckBox.click();
		wait.until(ExpectedConditions.invisibilityOf(checkBox));
		System.out.println("checkBox is displayed: "+checkBox.isDisplayed());
		
		toggleCheckBox.click();
		wait.until(ExpectedConditions.elementToBeClickable(checkBox)).click();
		System.out.println("checkBox is selected: "+checkBox.isSelected());
		
		driver.quit();
		
		
		

	}

}
