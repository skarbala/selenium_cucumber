package tests;

import base.TestBase;
import org.junit.Assert;
import org.junit.Test;
import pages.ClickMeBabyPage;

public class ClickMeBabyTest extends TestBase {

    @Test
    public void testNumberOfClicks() {
        ClickMeBabyPage clickMeBabyPage = new ClickMeBabyPage();
        clickMeBabyPage.openPage();
        clickMeBabyPage.clickOnButton();

        Assert.assertEquals("1", clickMeBabyPage.getNumberOfclicks());
    }
}
