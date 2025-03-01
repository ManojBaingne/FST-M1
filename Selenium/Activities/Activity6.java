import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Title of the webPage is: " + driver.getTitle());

		// Find the check box and check if it is selected or not
		System.out.println(
				"Check box is selected: " + driver.findElement(By.xpath("//input[@name=(\"checkbox\")]")).isSelected());

		// Click on the check box
		driver.findElement(By.xpath("//input[@name=(\"checkbox\")]")).click();

		// Find the check box and check if it is selected or not
		System.out.println(
				"Check box is selected: " + driver.findElement(By.xpath("//input[@name=(\"checkbox\")]")).isSelected());
		
		driver.quit();

	}

}
