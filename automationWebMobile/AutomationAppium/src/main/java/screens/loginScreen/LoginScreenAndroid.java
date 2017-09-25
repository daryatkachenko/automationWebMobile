package screens.loginScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import screens.Utils;

/**
 * Created by daria.
 */
public class LoginScreenAndroid implements LoginScreen {


    @AndroidFindBy(id = "ac_sign_in_link_to_sign_up_link_text_view")
    public MobileElement signUpLink;

    @AndroidFindBy(id = "ac_sign_in_login_button")
    public MobileElement loginButton;

    @AndroidFindBy(id = "ac_sign_in_email_edit_text")
    public MobileElement emailField;

    @AndroidFindBy (id = "ac_sign_in_password_edit_text")
    public MobileElement passwordField;

    @AndroidFindBy(id = "ac_sign_in_link_to_forgot_password_link_text_view")
    public MobileElement forgotPasswordLink;

    @AndroidFindBy(id = "ac_sign_in_logo_image_view")
    public MobileElement logoOnLoginScreen;

    public LoginScreenAndroid (AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickOnLoginButton(){
        Utils.click(loginButton);


    }

    public void clickOnSignUp(){
        Utils.click(signUpLink);
    }

    public void enterEmailAndPassword(String email, String password){
        Utils.input(emailField,email);
        Utils.input(passwordField,password);

    }

    public void checkIsLoginScreenOpened(){
        logoOnLoginScreen.isDisplayed();
        emailField.isDisplayed();
        passwordField.isDisplayed();
        loginButton.isDisplayed();
        signUpLink.isDisplayed();
        forgotPasswordLink.isDisplayed();

    }

   public void clickOnForgotPasswordLink(){
     Utils.click(forgotPasswordLink);
    }
}
