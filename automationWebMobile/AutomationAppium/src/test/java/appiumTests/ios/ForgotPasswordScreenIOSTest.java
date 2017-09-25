package appiumTests.ios;

import appiumTests.BaseTest;
import org.junit.Test;

/**
 * Created by daria.
 */
public class ForgotPasswordScreenIOSTest extends BaseTest {

    @Test
    public void clickOnForgotPasswordLinkOnLoginScreen(){
        welcomeScreen.clickOnLoginOrCreateAccountButton();
        loginScreen.clickOnForgotPasswordLink();
        forgotPasswordScreen.checkIsForgotPasswordScreenOpened();
    }


    @Test
    public void enterDataIntoFieldEmail(){
        welcomeScreen.clickOnLoginOrCreateAccountButton();
        loginScreen.clickOnForgotPasswordLink();
        forgotPasswordScreen.enterDataIntoEmailField("email@email.com");
        forgotPasswordScreen.clickOnRestorePasswordButton();

    }


}
