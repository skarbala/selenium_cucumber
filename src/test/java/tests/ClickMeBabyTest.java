package tests;

import base.TestBase;
import categories.SmokeTest;
import enumerators.SinType;
import models.Sin;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import pages.ClickMeBabyPage;
import pages.SinCityPage;
import pages.SpartaPage;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class ClickMeBabyTest extends TestBase {

    @Test
    public void testNumberOfClicks() throws MalformedURLException {
        ClickMeBabyPage clickMeBabyPage = new ClickMeBabyPage();
        clickMeBabyPage.openPage();
        clickMeBabyPage.clickOnButton();
    }
}
