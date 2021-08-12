package CucumberOptionsss;

import org.junit.runner.RunWith;
import org.testng.annotations.Listeners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features ="src/test/resources/features",
		glue ="StepDefinitions"
		)
//@Listeners(CucumberOptionsss.TestJiraListener.class)

public class TestRunner {
	

}

