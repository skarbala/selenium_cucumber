package steps;

import cucumber.api.java8.En;
import pages.ClickMeBabyPage;

import static hooks.TaggedHooks.getScenario;

public class ClickMeLambdaSteps implements En {

    private ClickMeBabyPage clickMeBabyPage;

    public ClickMeLambdaSteps() {
        Given("^I am on click me baby page$", () ->
                getClickMeBabyPage().openPage()
        );

        Then("^description is (\\w+\\s?\\w+)$", (String expectedDescription) -> {
            getClickMeBabyPage().checkClickDescription(expectedDescription);
            getScenario().write("ahoj robert");
        });
    }

    private ClickMeBabyPage getClickMeBabyPage() {
        if (clickMeBabyPage == null) {
            clickMeBabyPage = new ClickMeBabyPage();
        }
        return clickMeBabyPage;
    }
}
