package pages;

import base.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static base.TestBase.BASE_URL;

public class OptimusPage {

    @FindBy(xpath = "//input[@type='number']")
    private WebElement numberInput;

    @FindBy(css = "button.btn")
    private WebElement submitButton;


    private WebDriver driver;

    private static final String PAGE_URL = "primenumber.php";

    public OptimusPage() {
        driver = WebDriverSingleton.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    public void openPage() {
        driver.get(BASE_URL + PAGE_URL);
    }

    public void clickOnButton() {
        submitButton.click();
    }

    public void enterNumber(String number) {
        numberInput.sendKeys(number);
    }

    public void checkResult(boolean expectedPrime) {
        if (expectedPrime) {
            new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//div[text()='Optimus approves']"))
                    );
        } else {
            new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//div[text()='Optimus is sad']"))
                    );
        }
    }
}
