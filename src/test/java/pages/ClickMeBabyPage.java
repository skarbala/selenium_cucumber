package pages;

import base.WebDriverSingleton;
import models.Sin;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

import static base.TestBase.BASE_URL;

public class ClickMeBabyPage {

    @FindBy(css = "button")
    private WebElement clickMeButton;

    @FindBy(id = "clicks")
    private WebElement numberOfClicks;

    @FindBy(css = "div.description p")
    private WebElement clickDescriptiton;

    private WebDriver driver;

    private static final String PAGE_URL = "clickmebaby.php";

    public ClickMeBabyPage() {
        driver = WebDriverSingleton.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    public void openPage() {
        driver.get(BASE_URL + PAGE_URL);
    }

    public void clickOnButton() {
        clickMeButton.click();
    }

    public String getNumberOfClicks() {
        return numberOfClicks.getText();
    }

    public String getClickDescription() {
        return clickDescriptiton.getText();
    }

    public void checkClickDescription(String expectedDescription) {
        Assert.assertEquals(expectedDescription, getClickDescription());
    }
}
