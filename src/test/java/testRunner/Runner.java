package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features= {"src/test/java/Features/DemoWeblogin.feature"},
        dryRun = !true,
        glue = "StepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports"},
		snippets = SnippetType.CAMELCASE
		)
public class Runner extends AbstractTestNGCucumberTests {
	
	

}
