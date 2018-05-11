package tests;

import org.junit.Assert;
import org.junit.Test;

import base.TestBase;
import pages.ClickMeBabyPage;
import pages.RegistrationPage;

public class RegistrationTest extends TestBase {

    @Test
    public void testSuccessfulRegistration() {
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.openPage();
        registrationPage.enterEmail("matko@vajcia.sk");
    }
}
