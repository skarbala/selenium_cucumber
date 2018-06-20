package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps", "hooks"},
        tags = {"@smoke"},
        junit = "--step-notifications",
        format = {"json:target/reports/cucumber-reports/SmokeRunner.json"}
)
public class SmokeRunner {
}