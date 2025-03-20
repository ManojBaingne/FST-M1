package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "features",
    glue = {"stepDefinitions"},
    tags = "@SmokeTest",
    plugin = {"pretty"},
    monochrome = true)
public class Activity6Runner_pretty 
{

}
