package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Activity5.feature",glue = {"stepDefinitions"},tags = "@activity5")
public class Activity5Runner 
{

}
