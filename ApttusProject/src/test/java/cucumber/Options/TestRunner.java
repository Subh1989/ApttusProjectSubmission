package cucumber.Options;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="src/test/java/features", plugin= {"pretty",
		"html:target/cucumber-reports/cucumber-pretty",
		"json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/re-run.txt"}, glue="stepDefinations")
public class TestRunner extends AbstractTestNGCucumberTests{

}
