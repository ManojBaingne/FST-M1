import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity13 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tables");
		
		System.out.println("Page title is: "+driver.getTitle());
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/thead/tr/th"));
		System.out.println("Number of column in table: "+cols.size());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr"));
		System.out.println("Number of rows in the table: "+rows.size());
		
		//list of cell valus of third row
		List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr[3]/td"));
		System.out.println("Below are the values of third row: ");
		
		for(WebElement cell: thirdRow) {
			System.out.println(cell.getText());
		}
		
		//Print th cell value from second row and second column
		WebElement cellValue2 = driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr[2]/td[2]"));
		
		System.out.println("Cell value of second row and second column is: "+cellValue2.getText());
		
		driver.quit();

	}

}
