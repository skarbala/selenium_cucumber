package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enumerators.SinType;
import models.Sin;
import pages.SinCityPage;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SinCitySteps {
    private SinCityPage sinCityPage;
    private Sin sin;

    @Given("^I (?:am on|open) Sin City page$")
    public void iAmOnSinCityPage() {
        getSinCityPage().openPage();
    }

    @And("^I enter sin title$")
    public void iEnterSinTitle() {
        getSinCityPage().fillSinTitle("Vydal som novy album");
    }

    @And("^I enter sin author$")
    public void iEnterSinAuthor() {
        getSinCityPage().fillSinAuthor("Martin J.");
    }

    @And("^I enter sin message$")
    public void iEnterSinMessage() {
        getSinCityPage().fillSinMessage("Vydal som novy album s Bozankou");
    }

    @When("^I confess my sin$")
    public void iConfessMySin() {
        getSinCityPage().confessSin();
    }

    @Then("^my sin appears in the list of all sins$")
    public void mySinAppearsInTheListOfAllSins() {
        getSinCityPage().checkSinVisibleInTheList("Vydal som novy album");
    }

    @And("^I select 'robbery' tag$")
    public void iSelectRobberyTag() {
        getSinCityPage().markTag(Collections.singletonList(SinType.ROBBERY));
    }

    private SinCityPage getSinCityPage() {
        if (sinCityPage == null) {
            sinCityPage = new SinCityPage();
        }
        return sinCityPage;
    }

    @And("^I select following sins$")
    public void iSelectFollowingSins(List<String> tags) {
        List<SinType> sinTypes = tags
                .stream()
                .map(s -> SinType.valueOf(s.toUpperCase().replaceAll("\\s", "_")))
                .collect(Collectors.toList());
        getSinCityPage().markTag(sinTypes);
    }

    @And("^I enter sin title (.+) and sin author (.+)$")
    public void iEnterSinTitlePocuvamOneDirectionAndSinAuthorBrano(String title, String author) {
        getSinCityPage().fillSinTitle(title);
        getSinCityPage().fillSinAuthor(author);
    }

    @When("^I confess a valid sin without tags$")
    public void iConfessAValidSinWithoutTags() {
        sin = new Sin("zrazil som bozanku", "J. Statham", "Zrazil som Bozanku na V3Ske");
        getSinCityPage().fillSinTitle(sin.getTitle());
        getSinCityPage().fillSinAuthor(sin.getAuthor());
        getSinCityPage().fillSinMessage(sin.getMessage());
        getSinCityPage().confessSin();
    }

    @When("^I open sin detail$")
    public void iOpenSinDetail() {
        getSinCityPage().openDetail(sin);
    }

    @Then("^the information are correct$")
    public void theInformationAreCorrect() {
        getSinCityPage().checkDetail(sin);
    }
}
