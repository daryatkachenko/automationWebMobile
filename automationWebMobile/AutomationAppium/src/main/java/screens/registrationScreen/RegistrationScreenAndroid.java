package screens.registrationScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import screens.Utils;

/**
 * Created by daria.
 */
public class RegistrationScreenAndroid implements RegistrationScreen {
    public static final String SUB_TITLE_FIRST_SCREEN = "Add your account information:";
    public static final String SUB_TITTLE_SECOND_SCREEN ="Please enter your contact information:";
    public static final String TITLE_REGISTRATION_SCREEN= "Registration";
    public static final String TITTLE_TERMS_AND_CONDITIONS = "Terms & Conditions";

    @AndroidFindBy(xpath = "//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[2]")
    public MobileElement tittleFirstScreen;

    @AndroidFindBy(xpath = "//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[3]//*[1]//*[1]//*[1]//*[1]")
    public MobileElement subTittleFirstScreen;

    @AndroidFindBy(xpath = "//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[3]//*[1]//*[1]//*[1]//*[1]")
    public MobileElement subTittleSecondScreen;

    @AndroidFindBy(id = "action_skip")
    public MobileElement skipButton;

    @AndroidFindBy(accessibility = "Navigate up")
    public MobileElement backButton;

    @AndroidFindBy(id = "fr_sign_up_first_page_first_name_edit_text")
    public MobileElement firstNameField;

    @AndroidFindBy(id = "fr_sign_up_first_page_last_name_edit_text")
    public MobileElement lastNameField;

    @AndroidFindBy(id = "fr_sign_up_first_page_email_edit_text")
    public MobileElement  emailField;

    @AndroidFindBy(id = "fr_sign_up_first_page_password_edit_text")
    public MobileElement passwordField;

    @AndroidFindBy(id ="fr_sign_up_first_page_on_next_button")
    public MobileElement registerButton;

    @AndroidFindBy(id = "fr_sign_up_second_page_on_next_button")
    public MobileElement continueButtonOnSecondScreen;

    @AndroidFindBy(xpath = "//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[2]")
    public MobileElement titleTemsAndConditionsScreen;

    @AndroidFindBy(id = "fr_terms_and_condition_accept_button")
    public MobileElement acceptTermsAndConditions;


    public RegistrationScreenAndroid(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }

    public void checkIsRegistrationScreenOpen(){
        tittleFirstScreen.isDisplayed();
        Utils.getTextAndMath(tittleFirstScreen,TITLE_REGISTRATION_SCREEN);

    }
    public void checkSubTittleRegisterScreenOnFirstRegistrationScreen(){
        subTittleFirstScreen.isDisplayed();
        Utils.getTextAndMath(subTittleFirstScreen,SUB_TITLE_FIRST_SCREEN);

    }
    public void enterDataInSignUpFormOnFirstScreen(String firstName, String lastName, String email, String password){
        Utils.input(firstNameField,firstName);
        Utils.input(lastNameField,lastName);
        Utils.input(emailField,email);
        Utils.input(passwordField,password);

    }
    public void clickRegisterButtonOnFirstScreenOfRegistration(){
        registerButton.isDisplayed();
        Utils.click(registerButton);

    }

    public void checkIsSecondRegistrationScreenOpen(){
        subTittleSecondScreen.isDisplayed();
        Utils.getTextAndMath(subTittleSecondScreen,SUB_TITTLE_SECOND_SCREEN);


    }

    public void clickOnSkipButton(){
      Utils.click(skipButton);
    }

    public void clickOnContinueButton(){
      Utils.click(continueButtonOnSecondScreen);
    }


    public void clickOnAcceptButtonOnTermsAndConditionScreen(){
      titleTemsAndConditionsScreen.isDisplayed();
      Utils.getTextAndMath(tittleFirstScreen,TITTLE_TERMS_AND_CONDITIONS);
      Utils.click(acceptTermsAndConditions);
    }


}
