package appiumTests.ios;

import appiumTests.BaseTest;
import org.junit.Test;

/**
 * Created by daria.
 */
public class WelcomeScreenIOSTest extends BaseTest {

    @Test
    public void checkIsAppOpened(){
        welcomeScreen.checkIsWelcomeScreenOpened();
    }
}
