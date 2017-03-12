package runners

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = ["json:target/cucumber.json","pretty","html:target/cucumber.html"],
        features = "classpath:",
        glue = "classpath:",
        tags = ["@acceptance_tests"],
        dryRun = false,
        strict = true)

class AcceptanceTCRunner {
}
