package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Activity3.feature",glue = {"stepDefinitions"},tags = "@activity3")
public class Activity3Runner
{

	
	
	
}
