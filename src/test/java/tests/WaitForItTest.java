package tests;

import base.TestBase;
import categories.SmokeTest;
import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitForItTest extends TestBase {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Category(SmokeTest.class)
    @Test
    public void checkTitle() {
        getDriver().get(BASE_URL + "waitforit.php");
        expectedException.expect(ComparisonFailure.class);
        expectedException.expectMessage("nesedi title");
        Assert.assertEquals("nesedi title", "WAIT FOR IT !!!",
                getDriver().findElement(By.xpath("//h1")).getText());
    }

    @Test
    public void waitForInputText() {
        getDriver().get(BASE_URL + "waitforit.php");
        getDriver().findElement(By.id("startWaitForText")).click();
        new WebDriverWait(getDriver(), 10)
                .until(ExpectedConditions.attributeToBe(By.id("waitForTextInput"), "value", "dary !!!"));
        System.out.println(getDriver().findElement(By.id("waitForTextInput")).getAttribute("value"));
    }

    @Test
    public void waitForClass() {
        getDriver().get(BASE_URL + "waitforit.php");
        getDriver().findElement(By.id("startWaitForProperty")).click();
        new WebDriverWait(getDriver(), 10)
                .until(ExpectedConditions.attributeContains(By.id("waitForProperty"), "class", "error"));
        Assert.assertFalse(getDriver().findElement(By.id("startWaitForProperty")).isEnabled());
    }
}
