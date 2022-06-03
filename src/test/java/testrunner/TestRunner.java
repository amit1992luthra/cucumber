package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/features/sample.feature"
,glue= {"StepDefination"},
//tags= {"@SmokeTest"}, //Single Tag
//tags= {"@SmokeTest","@RegressionTest"},//And Condition
//tags= {"@SmokeTest,@RegressionTest"}) //OR Condition
//tags= {"@FunctionalTest"})//Executing Feature Tag
//tags= {"@FunctionalTest","~@RegressionTest"},
plugin = { "pretty", "junit:target/result.xml","json:target/result1.json"}) //Skipping Scenario
public class TestRunner {
	

}