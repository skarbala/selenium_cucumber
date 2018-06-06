package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ClickMeBabyPage;

public class ClickMeBabySteps {
    private ClickMeBabyPage clickMeBabyPage;

    @Given("^I am on click me baby page$")
    public void iAmOnClickMeBabyPage() {
        getClickMeBabyPage().openPage();
    }

    @When("^I click on button$")
    public void iClickOnButton() {
        getClickMeBabyPage().clickOnButton();
    }

    @Then("^description is (\\D+)$")
    public void descriptionIsKlik(String expectedDescription) {
        getClickMeBabyPage().checkClickDescription(expectedDescription);
    }

    @When("^I click (\\d+) times? on a button$")
    public void clickOnButton(int numberOfClicks) {
        for (int i = 0; i < numberOfClicks; i++) {
            getClickMeBabyPage().clickOnButton();
        }
    }

    private ClickMeBabyPage getClickMeBabyPage() {
        if (clickMeBabyPage == null) {
            clickMeBabyPage = new ClickMeBabyPage();
        }
        return clickMeBabyPage;
    }
}
