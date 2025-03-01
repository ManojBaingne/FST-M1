import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/drag-drop");
		System.out.println("Page title is: "+driver.getTitle());
		
		//Find the locators
		WebElement football = driver.findElement(By.id("ball"));
		WebElement dropZone1 = driver.findElement(By.xpath("//div[@id='dropzone1']"));
		WebElement dropZone2 = driver.findElement(By.id("dropzone2"));
		
		//Drag and drop action 
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(football).moveToElement(dropZone1).pause(5000).release().build().perform();
		
		if(dropZone1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
			System.out.println("Ball dropped in dropZone1");
		}
		
		builder.dragAndDrop(dropZone1, dropZone2).pause(5000).build().perform();
		
		if(dropZone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
			System.out.println("Ball dropped in dropZone2");
		}
		
		//Close the browser
		driver.quit();

		

	}

}
