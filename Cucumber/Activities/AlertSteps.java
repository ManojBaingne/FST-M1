package stepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Baseclass;

public class AlertSteps extends Baseclass {
	Alert alert;

	@Given("User is on the page")
	public void user_is_on_the_page() {
		driver.get("https://training-support.net/webelements/alerts");
	}

	@When("User clicks the Simple Alert button")
	public void user_clicks_the_simple_alert_button() {
		driver.findElement(By.id("simple")).click();

	}

	@Then("Alert opens")
	public void alert_opens() {
		alert = driver.switchTo().alert();

	}

	@Then("Read the text from it and print it")
	public void read_the_text_from_it_and_print_it() {
		System.out.println("Alert says: " + alert.getText());

	}

	@Then("Close the alert")
	public void close_the_alert() {
		alert.accept();

	}

	@Then("Read the result text")
	public void read_the_result_text() {
		String message = driver.findElement(By.id("result")).getText();
		System.out.println("Action performed: " + message);
	}

	@When("User clicks the Confirmation Alert button")
	public void user_clicks_the_confirmation_alert_button() {
		driver.findElement(By.id("confirmation")).click();
	}

	@Then("Close the alert with Cancel")
	public void close_the_alert_with_cancel() {
		alert.dismiss();

	}

	@When("User clicks the Prompt Alert button")
	public void user_clicks_the_prompt_alert_button() {
		driver.findElement(By.id("prompt")).click();
	}

	@Then("Write a custom message in it")
	public void write_a_custom_message_in_it() {
		alert.sendKeys("Custom Message");

	}

}
