import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
		
		//Find the 3rd header
		String thirdHeaderText = driver.findElement(By.xpath("//h3")).getText();
		System.out.println(thirdHeaderText);
		
		//Find the 5th Color
		Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(),'#5')]")).getCssValue("Color"));
		
		System.out.println("Color as RGB: "+fifthHeaderColor.asRgb());
		System.out.println("Color as hexCode: "+fifthHeaderColor.asHex());
		
		//Purple button classes
		String purpleButtonClass = driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
		System.out.println(purpleButtonClass);
		
		//Find the slat e button and print the text
		String slatButtonText = driver.findElement(By.xpath("//button[contains(@class,'slate')]")).getText();
		System.out.println(slatButtonText);
		
		driver.quit();
		

	}

}