package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/sinCity",
        glue = {"steps.sinCity", "hooks"},
        junit = "--step-notifications"
)
public class SinCityRunner {
}
