package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Activity2.feature",glue = {"stepDefinitions"},tags = "@activity2")
public class Activity2Runner
{
	
	
}
