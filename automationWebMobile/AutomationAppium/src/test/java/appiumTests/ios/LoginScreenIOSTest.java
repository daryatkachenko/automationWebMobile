package appiumTests.ios;

import appiumTests.BaseTest;
import org.junit.Test;

/**
 * Created by daria.
 */
public class LoginScreenIOSTest extends BaseTest {


    @Test
    public void loginWithValidCredentials(){
        welcomeScreen.clickOnLoginOrCreateAccountButton();
        loginScreen.checkIsLoginScreenOpened();
        loginScreen.enterEmailAndPassword("","");
        loginScreen.clickOnLoginButton();

    }
}
