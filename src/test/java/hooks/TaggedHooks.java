package hooks;

import base.WebDriverSingleton;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TaggedHooks {

    private static Scenario scenario;

    @Before
    public void initScenario(Scenario scenario) {
        TaggedHooks.scenario = scenario;
    }

    @Before(value = "@dbconnection", order = 1)
    public void dbconnect() {
        System.out.println("pripajam sa na databazu");
    }

    @Before(order = 2)
    public void setup() {
        WebDriverSingleton.getInstance().initialize();
    }

    @Before(value = "@maximize", order = 3)
    public void maximize() {
        WebDriverSingleton.getInstance().getDriver().manage().window().maximize();
    }

    @After(value = "@close")
    public void tearDown() {
        WebDriverSingleton.getInstance().getDriver().close();
        WebDriverSingleton.getInstance().getDriver().quit();
    }

    @After
    public void closeScenario() {
        if (getScenario().isFailed()) {
            embedScreenshot();
        }
    }

    private void embedScreenshot() {
        byte[] screenshot = ((TakesScreenshot)
                WebDriverSingleton.getInstance().getDriver())
                .getScreenshotAs(OutputType.BYTES);
        getScenario().embed(screenshot, "image/png");
    }

    public static Scenario getScenario() {
        return scenario;
    }
}
