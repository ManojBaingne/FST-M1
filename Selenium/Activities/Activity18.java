import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity18 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("Page title is: "+driver.getTitle());
		
		driver.findElement(By.id("simple")).click();
		
		Alert simpleAlert = driver.switchTo().alert();
		//Print the text from Alert
		String AlertText = simpleAlert.getText();
		System.out.println("Alert text is: "+AlertText);
		
		//Close the Alert by accept
		simpleAlert.accept();
		
		System.out.println(driver.findElement(By.id("result")).getText());
		
		driver.quit();
		

	}

}
