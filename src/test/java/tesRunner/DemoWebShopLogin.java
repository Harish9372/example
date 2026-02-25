package tesRunner;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/Features/DemoWeblogin.feature"},
                 dryRun = !true,
                 glue = "Steps",
                 snippets = io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE
                 
		
		
		
		)


public class DemoWebShopLogin extends AbstractTestNGCucumberTests {

	
	
}
