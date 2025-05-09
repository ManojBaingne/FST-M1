package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Baseclass;

public class GoogleSearchSteps extends Baseclass {

	@Given("User is on Google Home Page")
	public void userIsOnGooglePage() throws Throwable {

		driver.get("https://www.google.com");
	}

	@When("User types in Cheese and hits ENTER")
	public void userTypesInCheeseAndHitsENTER() throws Throwable {
		driver.findElement(By.name("q")).sendKeys("Cheese", Keys.RETURN);
	}

	@Then("Show how many search results were shown")
	public void showHowManySearchResultsWereShown() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("hdtb-tls"))).click();
		String resultStats = driver.findElement(By.id("result-stats")).getText();
		System.out.println("Number of results found: " + resultStats);
	}
}
