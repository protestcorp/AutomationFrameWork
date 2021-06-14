package CucumberOptionsss;

import org.junit.runner.RunWith;
import org.testng.annotations.Listeners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/features",
		glue ="StepDefinitions"
		)
//@Listeners(Project.FrameWork.Listeners.class)
public class TestRunner {
	

}

