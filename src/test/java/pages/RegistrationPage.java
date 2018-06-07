package pages;

import base.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static base.TestBase.BASE_URL;
import static org.junit.Assert.assertTrue;

public class RegistrationPage {

  private static final String PAGE_URL = "registration.php";
  @FindBy(name = "email")
  private WebElement emailInput;

  @FindBy(name = "name")
  private WebElement nameInput;

  @FindBy(name = "surname")
  private WebElement surnameInput;

  @FindBy(name = "password")
  private WebElement passwordInput;

  @FindBy(name = "password-repeat")
  private WebElement passwordRepeatInput;

  @FindBy(id = "checkbox")
  private WebElement robotCheckbox;

  @FindBy(css = "button.btn-success")
  private WebElement submitButton;

  private WebDriver driver;

  public RegistrationPage() {
    driver = WebDriverSingleton.getInstance().getDriver();
    PageFactory.initElements(driver, this);
  }

  public void openPage() {
    driver.get(BASE_URL + PAGE_URL);
  }

  public void enterEmail(String email) {
    emailInput.clear();
    emailInput.sendKeys(email);
  }

  public void enterName(String name) {
    nameInput.clear();
    nameInput.sendKeys(name);
  }

  public void enterSurname(String surname) {
    surnameInput.clear();
    surnameInput.sendKeys(surname);
  }

  public void enterPassword(String password) {
    passwordInput.clear();
    passwordInput.sendKeys(password);
  }

  public void enterPasswordRepeat(String passwordRepeat) {
    passwordRepeatInput.clear();
    passwordRepeatInput.sendKeys(passwordRepeat);
  }

  public void checkRobotCheckbox() {
    robotCheckbox.click();
  }

  public void submitRegistration() {
    submitButton.click();
  }

  public void checkRegistrationFailed(){
    assertTrue(driver.findElement(By.cssSelector("div.alert-danger")).isDisplayed());
  }
}
