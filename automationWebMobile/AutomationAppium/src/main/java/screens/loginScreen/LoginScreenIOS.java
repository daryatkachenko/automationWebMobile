package screens.loginScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import screens.Utils;

/**
 * Created by daria.
 */
public class LoginScreenIOS implements LoginScreen {

    @iOSFindBy(accessibility = "Login_Logo")
    public MobileElement logoOnLoginPage;

    @iOSFindBy(xpath = "//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[3]")
    public MobileElement emailFieldInput;


    @iOSFindBy(xpath = "//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[4]")
    public MobileElement passwordFiledInput;

    @iOSFindBy(accessibility = "Login")
    public MobileElement loginButton;


    @iOSFindBy(accessibility = "Forgot password?")
    public MobileElement forgotPasswordLink;

    @iOSFindBy(accessibility = "Social FB")
    public MobileElement signUpSocialFB;

    @iOSFindBy(accessibility = "Social GP")
    public MobileElement signUpSocialGP;

    @iOSFindBy(accessibility = "Social IN")
    public MobileElement signUpSocialIN;

    @iOSFindBy(accessibility = "I don't have an account. Sign up")
    public MobileElement signUpLink;





    public LoginScreenIOS(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


    public void checkIsLoginScreenOpened(){
        logoOnLoginPage.isDisplayed();
        emailFieldInput.isDisplayed();
        passwordFiledInput.isDisplayed();
        loginButton.isDisplayed();
        forgotPasswordLink.isDisplayed();
        signUpSocialFB.isDisplayed();
        signUpSocialGP.isDisplayed();
        signUpSocialIN.isDisplayed();

    }


    public void clickOnSignUp(){
        signUpLink.click();

    }

    public void enterEmailAndPassword(String email, String password){
        Utils.input(emailFieldInput,email);
        Utils.input(passwordFiledInput,password);
    }

    public void clickOnLoginButton(){
        Utils.click(loginButton);
    }

    public void clickOnForgotPasswordLink(){
        Utils.click(forgotPasswordLink);
    }


}
