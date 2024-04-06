package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@smoke and @regression or @smoke",

		features= {"src\\test\\resources\\FeatureWithTags"},
		glue={"StepDefinations"},
	    publish=true,
		plugin= {"pretty","html:target/cucumber-report/htmlreport.html"}
		
		
)



public class CucumberTestRunnerForTags extends AbstractTestNGCucumberTests {
	
	
	

}
