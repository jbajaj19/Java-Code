package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/login.feature",
		glue = "stepDefinations"
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
