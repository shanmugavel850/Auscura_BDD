package CucumberOptions;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/features/search.feature",
		glue ={"stepDefinitions"})

public class search_testrunner extends AbstractTestNGCucumberTests{

}
