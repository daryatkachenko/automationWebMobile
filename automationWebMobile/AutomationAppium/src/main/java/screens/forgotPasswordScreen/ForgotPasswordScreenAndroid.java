package screens.forgotPasswordScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import screens.Utils;

/**
 * Created by daria.
 */

public class ForgotPasswordScreenAndroid implements ForgotPasswordScreen {
    @AndroidFindBy(id = "ac_forgot_password_email_text_input_layout")
   public MobileElement emailFieldOnRestorePasswordScreen;

    @AndroidFindBy(id="ac_forgot_password_multi_state_view")
   public MobileElement restorePasswordButton;

    @AndroidFindBy(accessibility = "Navigate up")
    public MobileElement backButton;


    public ForgotPasswordScreenAndroid(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void checkIsForgotPasswordScreenOpened() {
        emailFieldOnRestorePasswordScreen.isDisplayed();
        restorePasswordButton.isDisplayed();
    }


    public void enterDataIntoEmailField(String email){
        Utils.input(emailFieldOnRestorePasswordScreen,email);


    }
    public void clickOnRestorePasswordButton(){
        Utils.click(restorePasswordButton);

    }

    public void clickOnBackButton(){
        Utils.click(backButton);
    }

    }

