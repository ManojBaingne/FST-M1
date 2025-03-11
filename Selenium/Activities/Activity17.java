import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/selects");
		System.out.println("Page title is: "+driver.getTitle());
		
		WebElement dropDown = driver.findElement(By.xpath("//select[contains(@class,'-80')]"));
		//Pass WebElement to dropDown
		Select multiDropDown = new Select(dropDown);
		multiDropDown.selectByVisibleText("HTML");
		
		//Select 4th, 5th and 6th option from index
		for(int i=3; i<6; i++) {
			multiDropDown.selectByIndex(i);
		}
		
		//Select "Node" options by value
		multiDropDown.selectByValue("nodejs");
		
		//Print selected option
		List<WebElement> selectedOptions = multiDropDown.getAllSelectedOptions();
		System.out.println("All selected options from dropdown");
		for(WebElement e:selectedOptions) {
			System.out.println(e.getText());
		}
		
		//Deselect 5th option from index
		multiDropDown.deselectByIndex(5);
		
		selectedOptions = multiDropDown.getAllSelectedOptions();
		System.out.println("All selected options from dropdown after index 5 deselect");
		for(WebElement e:selectedOptions) {
			System.out.println(e.getText());
		}
		
		driver.quit();
	}

}
