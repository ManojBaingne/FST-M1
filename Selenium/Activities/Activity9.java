import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/keyboard-events");
		
		//print the page title
		System.out.println(driver.getTitle());
		
		Actions builder = new Actions(driver);
		
		//Press keys
		builder.sendKeys("This is coming from Selenium").build().perform();
		
		//Print the message from page
		String pageText = driver.findElement(By.cssSelector("h1.mt-3")).getText();
		System.out.println(pageText);
		
		driver.quit();
		
	

	}

}
