package CucumberOptionsss;



import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)

@CucumberOptions 

(
		features ="src/test/java/features",
		glue ="StepDefinitions" 
		
		)
@Listeners(CucumberOptionsss.Listeners.class)
public class TestRunnerTestNG extends AbstractTestNGCucumberTests {
	
	
}
/*
  Scenario: Login Validation
Given Initialize browser "chrome"
And launching url "demoblaze"
And click on login link
When User login into application with "qwwrtusername" and "0987"
Then Home page is displayed 
*/
