import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page is: "+pageTitle);
		
		//Check if text field is visible or not
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='textInput']"));
		System.out.println("TextBox is enabled or not: "+textBox.isEnabled());
		
		//Click on the Enable input button
		driver.findElement(By.xpath("//button[@id='textInputButton']")).click();
		
		//Check if textBox is enabled or not
		System.out.println("TextBox is enabled or not: "+textBox.isEnabled());
		
		driver.quit();
		
		

	}

}
