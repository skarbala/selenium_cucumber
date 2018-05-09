package hooks;

import base.WebDriverSingleton;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TaggedHooks {

    @Before
    public void setup(){
        WebDriverSingleton.getInstance().initialize();
    }

    @After
    public void tearDown(){
//        WebDriverSingleton.getInstance().getDriver().close();
//        WebDriverSingleton.getInstance().getDriver().quit();
    }
}
