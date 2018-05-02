package tests;

import base.TestBase;
import base.WebDriverSingleton;
import categories.ReleaseTest;
import categories.SmokeTest;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DummyTest extends TestBase {
    static int numberOfFailedTests;

    int failed = 0;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("setup class");
        numberOfFailedTests = 0;
    }


    @Category(SmokeTest.class)
    @Test
    public void testA() {
        getDriver().get(BASE_URL + "waitforit.php");
    }

    @Category({SmokeTest.class, ReleaseTest.class})
    @Test
    public void testB() {
        getDriver().get(BASE_URL + "waitforit.php");
        Assert.assertEquals("A by sa malo rovnat", "A", "A");
        System.out.println("B");
        numberOfFailedTests++;
        System.out.println("Static " + numberOfFailedTests);
        failed = 10;
        System.out.println(failed);
    }

    @Category(ReleaseTest.class)
    @Test
    public void testC() {
        getDriver().get(BASE_URL + "waitforit.php");
        System.out.println("C");
        System.out.println("Static " + numberOfFailedTests);
        System.out.println(failed);
    }

    @Ignore
    @Test
    public void testD() {
        getDriver().get(BASE_URL + "waitforit.php");
        System.out.println("C");
        System.out.println("Static " + numberOfFailedTests);
        System.out.println(failed);
    }


}
