package hooks;

import base.WebDriverSingleton;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TaggedHooks {

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
}
