package appiumTests.android;

import appiumTests.BaseTest;
import org.junit.Test;

/**
 * Created by daria.
 */
public class LoginScreenAndroidTest extends BaseTest {

    @Test
    public void checkIsLoginScreenOpened(){
        loginScreen.checkIsLoginScreenOpened();
    }

    @Test
    public void tryToLoginWithEmptyFields(){
        loginScreen.enterEmailAndPassword("rtytry","rtyrty");
        loginScreen.clickOnLoginButton();
    }



}
