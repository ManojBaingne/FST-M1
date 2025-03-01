import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
		//title of the page
		String pageTitle = driver.getTitle();
		System.out.println("Page title is: "+pageTitle);
		
		//Find the checkbox
		WebElement checkBox = driver.findElement(By.id("checkbox"));
		System.out.println("CheckBox is visible or not: " +checkBox.isDisplayed());
		
		//Click on togle button
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		
		//Check if checkBox is displayed or not
		System.out.println("CheckBox is visible or not: " +checkBox.isDisplayed());
		
		driver.quit();

	}

}
