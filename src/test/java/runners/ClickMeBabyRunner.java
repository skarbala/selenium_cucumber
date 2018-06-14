package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/ClickMe.feature",
        glue = {"steps", "hooks"},
        //OR
//        tags = {"@smoke or @release"},
        //AND
//        tags = {"@smoke", "@release"},
        tags = {"not ignore"},
        junit = "--step-notifications"
)
public class ClickMeBabyRunner {
}
