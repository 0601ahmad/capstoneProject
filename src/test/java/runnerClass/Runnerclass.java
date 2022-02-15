package runnerClass;

import org.junit.AfterClass;

import org.junit.runner.RunWith;

import Utilities.ReportClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import utilities.CucumberReportingConfig;

	
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
	features = "classpath:featuresFolder",
	glue = "stepOfDefinitions",
	tags = "@desktop",
	dryRun = false,
	strict = true,
	monochrome = true,
	plugin = {
			"pretty",
			"html:target/site/cucumber-pretty",
			"json:target/cucumber.json"
	},
	publish = true
	)
	
public class Runnerclass {
		@AfterClass
		public static void generateReport() {
			ReportClass.reportConfig();
		}

}
	
