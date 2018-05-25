package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enumerators.BananaTableColumn;
import pages.BananaPage;

import java.util.Map;

public class BananaSteps {
    private BananaPage bananaPage;

    @Given("^I am on banana shop page$")
    public void iAmOnBananaShopPage() {
        getBananaPage().openPage();
    }

    @When("^price for one banana is 1.5 €$")
    public void priceForOneBananaIs€() {
    }

    @When("^I have chosen 1 banana$")
    public void iHaveChosenBanana() {
        getBananaPage().enterBananaAmount("1");
        getBananaPage().submitBananaAmount();
    }

    private BananaPage getBananaPage() {
        if (bananaPage == null) {
            bananaPage = new BananaPage();
        }
        return bananaPage;
    }

    @Then("^values in table are following$")
    public void followingPricesAreDisplayed(DataTable table) {
        Map<String, String> tableMap = table.asMap(String.class, String.class);
        getBananaPage().checkTableValue(tableMap.get("total price"), BananaTableColumn.TOTAL_PRICE);
        getBananaPage().checkTableValue(tableMap.get("discount"), BananaTableColumn.DISCOUNT);
    }
}
