package step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//plugin = "pretty",
		features = "netflix.feature",
		glue = "step_definitions"
		
		)

public class RunnerTest {

}
