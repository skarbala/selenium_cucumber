package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class TestBase {

    public static final String BASE_URL = "http://localhost/";

    @Before
    public void setUp() {
        WebDriverSingleton.getInstance().initialize();
        getDriver().manage().window().maximize();
    }

    @After
    public void tearDown() {
        WebDriverSingleton.getInstance().getDriver().close();
        WebDriverSingleton.getInstance().getDriver().quit();
    }

    public WebDriver getDriver() {
        return WebDriverSingleton.getInstance().getDriver();
    }

}
