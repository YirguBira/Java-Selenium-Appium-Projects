package home;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*
 ---junit test runner---
@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestFeatures.class	
})
*/

@RunWith(Cucumber.class)
@CucumberOptions(
				plugin = {"pretty"},
				glue = {"home"}
		)

public class JUTestRunner {
	
}
