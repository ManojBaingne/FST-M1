package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Activity1.feature",glue = {"stepDefinitions"},tags = "@activity1")
public class Activity1Runner
{

}
