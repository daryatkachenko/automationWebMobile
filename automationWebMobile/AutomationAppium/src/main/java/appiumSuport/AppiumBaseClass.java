package appiumSuport;

import io.appium.java_client.AppiumDriver;

/**
 * Created by daria.
 */
public abstract class AppiumBaseClass {
    protected AppiumDriver driver() {
        return AppiumController.instance.driver;
    }
}
