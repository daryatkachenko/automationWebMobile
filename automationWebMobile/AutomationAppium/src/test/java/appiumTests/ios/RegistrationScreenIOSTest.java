package appiumTests.ios;

import appiumTests.BaseTest;
import org.junit.Test;

/**
 * Created by daria.
 */
public class RegistrationScreenIOSTest extends BaseTest {

    @Test
    public void clickOnSignUpLinkOnLoginPage(){
        welcomeScreen.clickOnLoginOrCreateAccountButton();
        loginScreen.checkIsLoginScreenOpened();
        loginScreen.clickOnSignUp();
        registrationScreen.checkIsRegistrationScreenOpen();
    }
}
