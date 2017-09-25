package screens.welcomeScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import screens.Utils;

/**
 * Created by daria.
 */
public class WelcomeScreenIOS implements WelcomeScreen {

    public WelcomeScreenIOS(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @iOSFindBy(accessibility = "Log in or create account")
    public MobileElement loginOrCreateAccountButton;

    @iOSFindBy(accessibility = "Through our platform we offer better solutions leading to a better life with offers you will not find anywhere else...")
    public MobileElement staticTextOnWelcomeScreen;

    @iOSFindBy(accessibility = "Splash_Background")
    public MobileElement backgroundImage;

    public void checkIsWelcomeScreenOpened(){
        staticTextOnWelcomeScreen.isDisplayed();
        staticTextOnWelcomeScreen.getText().matches("Through our platform we offer better solutions leading to a better life with offers you will not find anywhere else...");
        backgroundImage.isDisplayed();
    }


    public void clickOnLoginOrCreateAccountButton(){
        Utils.click(loginOrCreateAccountButton);
    }






}
