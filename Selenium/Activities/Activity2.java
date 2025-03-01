import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form");
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("password");
		driver.findElement(By.xpath("//button[text()= 'Submit']")).click();
		Thread.sleep(5000);
		String message = driver.findElement(By.tagName("h1")).getText();
		
		System.out.println(message);
		driver.quit();

	}

}
