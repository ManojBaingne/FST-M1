import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println(driver.getTitle());
		
		//row and column count in the table
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class,'w-full')]/thead/tr/th"));
		System.out.println("Number of colums in table are: "+cols.size());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'w-full')]/tbody/tr"));
		System.out.println("Number od rows in the table is: "+rows.size());
		
		//Find the book name of the 5th row
		WebElement firthRowBook = driver.findElement(By.xpath("//table[contains(@class,'w-full')]/tbody/tr[5]/td[2]"));
		System.out.println("Fift row book name is: "+firthRowBook.getText());
		
		//Click on the fifth header to sort the price
		driver.findElement(By.xpath("//table[contains(@class,'w-full')]/thead/tr/th[5]")).click();
		
		firthRowBook = driver.findElement(By.xpath("//table[contains(@class,'w-full')]/tbody/tr[5]/td[2]"));
		System.out.println("Fift row book name is: "+firthRowBook.getText());
		
		driver.quit();

	}

}
