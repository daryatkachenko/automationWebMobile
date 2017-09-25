package screens.registrationScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import screens.Utils;

/**
 * Created by daria.
 */
public class RegistrationScreenIOS implements RegistrationScreen {
    public static final String SUB_TITLE_FIRST_SCREEN = "Add your account information:";
    public static final String SUB_TITTLE_SECOND_SCREEN ="Please enter your contact information:";
    public static final String TITLE_REGISTRATION_SCREEN= "Registration";
    public static final String TITTLE_TERMS_AND_CONDITIONS = "Terms & Conditions";

    @iOSFindBy(accessibility = "Registration")
    public MobileElement tittleOfRegistrationScreen;

    @iOSFindBy(accessibility = "Add your account information:")
    public MobileElement subTittleFirstScreenOfRegistration;

    @iOSFindBy(xpath = "//*[1]//*[1]//*[1]//*[2]//*[1]//*[1]//*[1]//*[2]")
    public MobileElement firstNameField;

    @iOSFindBy(xpath = "//*[1]//*[1]//*[1]//*[2]//*[1]//*[1]//*[1]//*[3]")
    public MobileElement lastNameField;

    @iOSFindBy(xpath = "//*[1]//*[1]//*[1]//*[2]//*[1]//*[1]//*[1]//*[4]")
    public MobileElement emailField;

    @iOSFindBy(xpath = "//*[1]//*[1]//*[1]//*[2]//*[1]//*[1]//*[1]//*[5]")
    public MobileElement passwordField;

    @iOSFindBy(accessibility = "Register")
    public MobileElement registerButton;

    @iOSFindBy(xpath = "Skip")
    public MobileElement skipButtonOnSecondScreenOfRegistration;

    @iOSFindBy(accessibility = "Please enter your contact information:")
    public MobileElement subTittleSecondScreenOfRegistration;


    @iOSFindBy(accessibility = "Terms & Conditions")
    public MobileElement tittleTermsAndConditionsScreen;

    @iOSFindBy(accessibility = "Accept")
    public MobileElement acceptButton;

    @iOSFindBy(accessibility = "Continue")
    public MobileElement continueButton;




    public RegistrationScreenIOS(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }


    public void checkIsRegistrationScreenOpen(){
        Utils.getTextAndMath(tittleOfRegistrationScreen,TITLE_REGISTRATION_SCREEN);
    }

    public void checkSubTittleRegisterScreenOnFirstRegistrationScreen(){
        Utils.getTextAndMath(subTittleFirstScreenOfRegistration,SUB_TITLE_FIRST_SCREEN);
    }

    public void enterDataInSignUpFormOnFirstScreen(String firstName, String lastName, String email, String password){
        Utils.input(firstNameField,firstName);
        Utils.input(lastNameField,lastName);
        Utils.input(emailField,email);
        Utils.input(passwordField,password);

    }

    public void clickRegisterButtonOnFirstScreenOfRegistration(){
        Utils.click(registerButton);
        Utils.getTextAndMath(subTittleSecondScreenOfRegistration,SUB_TITTLE_SECOND_SCREEN);
    }

    public void checkIsSecondRegistrationScreenOpen(){
        Utils.getTextAndMath(subTittleSecondScreenOfRegistration,SUB_TITTLE_SECOND_SCREEN);
        skipButtonOnSecondScreenOfRegistration.isDisplayed();
        continueButton.isDisplayed();
    }


    public void clickOnSkipButton(){
        Utils.click(skipButtonOnSecondScreenOfRegistration);
        Utils.getTextAndMath(tittleTermsAndConditionsScreen,TITTLE_TERMS_AND_CONDITIONS);
    }

    public void clickOnContinueButton(){
        Utils.click(continueButton);
        Utils.getTextAndMath(tittleTermsAndConditionsScreen,TITTLE_TERMS_AND_CONDITIONS);
    }

    public void clickOnAcceptButtonOnTermsAndConditionScreen(){
        Utils.getTextAndMath(tittleTermsAndConditionsScreen,TITTLE_TERMS_AND_CONDITIONS);
        Utils.click(acceptButton);
    }
}
