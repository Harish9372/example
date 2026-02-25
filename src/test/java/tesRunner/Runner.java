package tesRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = {"src/test/java/Features/login.feature"},
                 dryRun = !true,
                 glue = "Steps",
                 snippets = SnippetType.CAMELCASE
		
		)

public class Runner extends AbstractTestNGCucumberTests {
	

}
