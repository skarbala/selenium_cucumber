package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.OptimusPage;

public class OptimusPrimeSteps {
    private OptimusPage optimusPage;

    @Given("^I am on the Optimus prime page$")
    public void iAmOnTheOptimusPrimePage() {
        getOptimusPage().openPage();
    }

    @When("^I enter number (\\d+)$")
    public void iEnterNumber(int number) {
        getOptimusPage().enterNumber(String.valueOf(number));
    }

    @And("^I ask Optimus if it is prime$")
    public void iAskOptimusIfItIsPrime() {
        getOptimusPage().clickOnButton();
    }

    @Then("^Optimus says that the number is (prime|not prime)$")
    public void optimusSaysThatTheNumberIsPrime(String expectedPrime) {
        if (expectedPrime.contains("not")) {
            getOptimusPage().checkResult(false);
        } else {
            getOptimusPage().checkResult(true);
        }
    }

    private OptimusPage getOptimusPage() {
        if (optimusPage == null) {
            optimusPage = new OptimusPage();
        }
        return optimusPage;
    }

}
