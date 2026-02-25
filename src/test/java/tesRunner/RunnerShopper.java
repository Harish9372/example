package tesRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = {"src/test/java/Features/shopperlogin.feature"},
                 dryRun = !true,
                 glue = "Steps",
               snippets = SnippetType.CAMELCASE
             

		
		)

public class RunnerShopper extends AbstractTestNGCucumberTests{
	
	

}
