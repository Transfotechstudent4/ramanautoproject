package Z_cuckrunner;

import java.util.Map;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/features"},
		glue = { "stepdefinitions"},
		tags = { "~@ignore"},
		plugin = {"pretty"})



public class TestRunner 
{
	
}
