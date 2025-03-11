import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {

	public static void main(String[] args) throws InterruptedException {
		
		/*Open a new browser to https://training-support.net/webelements/alerts
          Get the title of the page and print it to the console.
          Find the button to open a PROMPT alert and click it.
          Switch the focus from the main window to the Alert box and get the text in it and print it.
          Type "Awesome!" into the prompt.
          Close the alert by clicking Ok.
          Close the browser.*/
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("Page title is: "+driver.getTitle());
		
		driver.findElement(By.xpath("//button[text()='Prompt']")).click();
		Alert promptAlert = driver.switchTo().alert();
		
		//print text from Alert
		String alertText = promptAlert.getText();
		System.out.println(alertText);
		
		promptAlert.sendKeys("Awesome!");
		Thread.sleep(5000);
		
		promptAlert.accept();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		driver.quit();

	}

}
