package pages;

import base.WebDriverSingleton;
import enumerators.BananaTableColumn;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static base.TestBase.BASE_URL;

public class BananaPage  {
    private final String PAGE_URL = "bananashop.php";

    @FindBy(css = "button")
    private WebElement submitButton;
    @FindBy(css = "input")
    private WebElement bananaAmountInput;
    @FindBy(css = "table")
    private WebElement resultTable;

  private WebDriver driver;

  public BananaPage() {
    driver = WebDriverSingleton.getInstance().getDriver();
    PageFactory.initElements(driver, this);
  }

  public void openPage() {
    driver.get(BASE_URL + PAGE_URL);
  }


  public void enterBananaAmount(String bananaAmount) {
    bananaAmountInput.clear();
    bananaAmountInput.sendKeys(bananaAmount);
  }

    public String getTableValue(BananaTableColumn bananaTableColumns) {
        return resultTable.findElement(By.xpath("//tr[" + bananaTableColumns.getRowIndex() + "]/td[2]")).getText();
    }

    public void submitBananaAmount() {
        submitButton.click();
    }

    public void checkTableValue(String expectedResult, BananaTableColumn bananaTableColumn) {
        Assert.assertTrue(getTableValue(bananaTableColumn).contains(expectedResult));
    }
}
