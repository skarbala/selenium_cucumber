package steps;

import cucumber.api.java.en.*;
import pages.RegistrationPage;

public class RegistrationSteps {
    private RegistrationPage registrationPage;

    @Given("^I am on the registration page$")
    public void iAmOnTheRegistrationPage() {
        getRegistrationPage().openPage();
    }

    @And("^I enter email (.*)$")
    public void iEnterEmailMatkoMatkoSk(String email) {
        getRegistrationPage().enterEmail(email);
    }

    @And("^I enter name (.*)$")
    public void iEnterNameMatko(String name) {
        getRegistrationPage().enterName(name);
    }

    @And("^I enter surname (.*)$")
    public void iEnterSurname(String surname) {
        getRegistrationPage().enterSurname(surname);
    }

    @But("^I enter password (.*)$")
    public void iEnterPassword(String password) {
        registrationPage.enterPassword(password);

    } @But("^I repeat password (.*)$")
    public void iRepeatPassword(String password) {
        registrationPage.enterPasswordRepeat(password);
    }

    @And("^I check robot checkbox$")
    public void iCheckRobotCheckbox() {
        getRegistrationPage().checkRobotCheckbox();
    }

    @When("^I click on registration button$")
    public void iClickOnRegistrationButton() {
        getRegistrationPage().submitRegistration();
    }

    private RegistrationPage getRegistrationPage() {
        if (registrationPage == null) {
            registrationPage = new RegistrationPage();
        }
        return registrationPage;
    }

    @Then("^the registration fails$")
    public void theRegistrationFails() {
        getRegistrationPage().checkRegistrationFailed();
    }
}
