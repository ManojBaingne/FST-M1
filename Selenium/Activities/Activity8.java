import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/mouse-events");
		System.out.println("Page title is: "+driver.getTitle());
		
		//Locate the Web elements
		WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
		WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
		WebElement src = driver.findElement(By.xpath("//h1[text()='src']"));
		WebElement targetButton = driver.findElement(By.xpath("//h1[text()='target']"));
		
		Actions builder = new Actions(driver);
		
		//Perform the left click operation on Corgo.lock and then Corgo.toml
		builder.click(cargoLock).pause(2000).moveToElement(cargoToml).pause(4000).click(cargoToml).build().perform();
		
		//Print the confirmation message
		String actionMessage = driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
		System.out.println(actionMessage);
		
		//Perform double click on src and the right click on target
		builder.doubleClick(src).pause(5000).contextClick(targetButton).pause(3000).build().perform();
		builder.click(driver.findElement(By.xpath("//span[text()='Open']"))).pause(3000).build().perform();
		
		//Print the confirmation message
		actionMessage = driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
		System.out.println(actionMessage);
		
		driver.quit();

	}

}
