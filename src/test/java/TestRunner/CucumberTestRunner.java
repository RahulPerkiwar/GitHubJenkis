package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\Features"},
		glue={"StepDefinations"},
	   // publish=true,
		plugin= {"pretty","html:target/htmlreport.html"} ,
		dryRun=true
		
)

public class CucumberTestRunner extends AbstractTestNGCucumberTests{

}
