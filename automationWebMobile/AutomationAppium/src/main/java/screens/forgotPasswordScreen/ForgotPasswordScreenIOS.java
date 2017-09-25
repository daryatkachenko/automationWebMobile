package screens.forgotPasswordScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import screens.Utils;

/**
 * Created by daria.
 */
public class ForgotPasswordScreenIOS implements ForgotPasswordScreen {


    @iOSFindBy(xpath = "//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[5]")
    public MobileElement emailField;

    @iOSFindBy(accessibility = "Reset password")
    public MobileElement resetPasswordButton;

    @iOSFindBy(accessibility = "BackButton White")
    public MobileElement backButton;


    public ForgotPasswordScreenIOS(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }

    public void checkIsForgotPasswordScreenOpened(){
        emailField.isDisplayed();
        resetPasswordButton.isDisplayed();

    }


    public void enterDataIntoEmailField(String email){

        Utils.input(emailField,email);
    }

    public void clickOnRestorePasswordButton(){
        Utils.click(resetPasswordButton);
    }

    public void clickOnBackButton(){
        Utils.click(backButton);
    }
}
