package steps;

import cucumber.api.java.en.When;
import pages.ClickMeBabyPage;

public class ClickMeBabySteps {
    private ClickMeBabyPage clickMeBabyPage;

     @When("^I click on button$")
    public void iClickOnButton() {
        getClickMeBabyPage().clickOnButton();
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
