package RunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "feature" }, 
					glue = { "Stepdefination" }, 
					plugin = { "pretty", "html:target/cucumber-reports", 
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },

		tags = "@smoke", 
		monochrome = true)
public class RunnerFile extends AbstractTestNGCucumberTests {

}