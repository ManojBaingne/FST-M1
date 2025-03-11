import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/selects");
		System.out.println("Page title is: " + driver.getTitle());

		WebElement dropDown = driver.findElement(By.cssSelector("select.h-10"));
		Select singleSelect = new Select(dropDown);

		// Select the second option using visible Texr
		singleSelect.selectByVisibleText("Two");

		// Print the selected option
		System.out.println("Second option is: " + singleSelect.getFirstSelectedOption().getText());

		// Select the 3rd option using index
		singleSelect.selectByIndex(3);
		System.out.println("3rd index option is: " + singleSelect.getFirstSelectedOption().getText());

		// Select the option by value text
		singleSelect.selectByValue("four");
		System.out.println("4th option by value: " + singleSelect.getFirstSelectedOption().getText());

		// Print all the options from dropDown
		List<WebElement> allOptionsDropdown = singleSelect.getOptions();
		System.out.println("Options from drop down");
		for (WebElement e : allOptionsDropdown) {
			System.out.println(e.getText());
		}

		driver.quit();

	}

}
