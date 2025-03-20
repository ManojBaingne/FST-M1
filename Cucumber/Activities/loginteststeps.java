package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Baseclass;

public class loginteststeps extends Baseclass
{
	@When("the user enters {string} and {string}")
	public void the_user_enters_and(String string1, String string2) 
	{
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        usernameField.clear();
        passwordField.clear();
        usernameField.sendKeys(string1);
        passwordField.sendKeys(string2);
	}

	@Then("get the confirmation text and verify message as {string}")
	public void get_the_confirmation_text_and_verify_message_as(String string) 
	{
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("h2.mt-5"), "Welcome"));
        String message = driver.findElement(By.cssSelector("h2.mt-5")).getText();
        Assertions.assertEquals("Welcome Back, Admin!", message);	
	}

}
