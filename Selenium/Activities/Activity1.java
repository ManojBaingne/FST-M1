import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://training-support.net");
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		WebElement button = driver.findElement(By.linkText("About Us"));
		button.click();
		String newTitle = driver.getTitle();
		System.out.println("Title of the new page is: "+newTitle);
		driver.quit();

	}

}
