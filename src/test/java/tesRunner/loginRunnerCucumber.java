package tesRunner;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  features = {"src/test/java/Features/login1.feature"},
                   dryRun = !true,
                   glue = "Steps",
                   snippets = io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE
                   



		)



public class loginRunnerCucumber extends AbstractTestNGCucumberTests {
	
	

}
