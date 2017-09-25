package appiumTests;

import appiumSuport.AppiumBaseClass;
import appiumSuport.AppiumController;
import org.junit.After;
import org.junit.Before;
import screens.forgotPasswordScreen.ForgotPasswordScreen;
import screens.forgotPasswordScreen.ForgotPasswordScreenAndroid;
import screens.forgotPasswordScreen.ForgotPasswordScreenIOS;
import screens.loginScreen.LoginScreen;
import screens.loginScreen.LoginScreenAndroid;
import screens.loginScreen.LoginScreenIOS;
import screens.registrationScreen.RegistrationScreenAndroid;
import screens.welcomeScreen.WelcomeScreen;
import screens.welcomeScreen.WelcomeScreenIOS;
import screens.registrationScreen.RegistrationScreen;
import screens.registrationScreen.RegistrationScreenIOS;

/**
 * Created by daria.
 */
public class BaseTest extends AppiumBaseClass{
    protected LoginScreen loginScreen;
    protected WelcomeScreen welcomeScreen;
    protected RegistrationScreen registrationScreen;
    protected ForgotPasswordScreen forgotPasswordScreen;


    @Before
    public void setUp() throws Exception {
        AppiumController.instance.start();
        switch (AppiumController.executionOS) {
            case ANDROID:
                loginScreen = new LoginScreenAndroid(driver());
                registrationScreen = new RegistrationScreenAndroid(driver());
                forgotPasswordScreen = new ForgotPasswordScreenAndroid(driver());
                break;
            case IOS:
                welcomeScreen = new WelcomeScreenIOS(driver());
                loginScreen = new LoginScreenIOS(driver());
                registrationScreen = new RegistrationScreenIOS(driver());
                forgotPasswordScreen = new ForgotPasswordScreenIOS(driver());
                break;
        }
    }

    @After
    public void tearDown() {
        AppiumController.instance.stop();
    }
}
