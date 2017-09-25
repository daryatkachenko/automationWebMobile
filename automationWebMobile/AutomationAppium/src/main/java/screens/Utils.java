package screens;

import io.appium.java_client.MobileElement;
import org.junit.Assert;

/**
 * Created by daria.
 */
public abstract class Utils {
    public static void input (MobileElement element, String input){
        element.clear();
        element.setValue(input);

    }

    public static void click(MobileElement element) {
        element.click();
    }



    public static void getTextAndMath(MobileElement element, String text){
        element.getText().matches(text);

    }

    // to verify if element exists
    public static void verifyIfElementExists(MobileElement element, String message) {
        boolean ifExists = element.isDisplayed();
        Assert.assertTrue(message, ifExists);
    }
}
