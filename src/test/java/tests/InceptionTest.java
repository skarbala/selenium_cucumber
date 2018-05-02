package tests;

import base.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InceptionTest extends TestBase {

    @Test
    public void testDeeper() throws InterruptedException {
        getDriver().get(BASE_URL + "inception.php");
        getDriver().manage().window().maximize();
        String parentWindow = getDriver().getWindowHandle();
        getDriver().findElement(By.id("letsGoDeeper")).click();
        new WebDriverWait(getDriver(), 5)
                .until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String handle : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(handle);
        }
        getDriver().findElement(By.xpath("//input[1]")).sendKeys("sangala je nevinny");
        Thread.sleep(3000);
        getDriver().close();
        getDriver().switchTo().window(parentWindow);
    }
}
