package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "features",
    glue = {"stepDefinitions"},
    tags = "@SmokeTest",
    plugin = {"html:target/test-reports"},
    monochrome = true)

public class Activity6Runner_html
{
	

}
