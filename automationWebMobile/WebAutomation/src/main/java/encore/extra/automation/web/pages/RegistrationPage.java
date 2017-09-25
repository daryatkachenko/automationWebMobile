package encore.extra.automation.web.pages;

import encore.extra.automation.web.Utils;
import org.openqa.selenium.By;

/**
 * Created by daria.
 */
public class RegistrationPage extends Utils {
    public static final String REGISTER_PAGE_TITTLE = "I want to create my EncoreExtra account:";
    public static final String ERROR_FIRST_NAME_EMPTY = "First name is required";
    public static final String ERROR_LAST_NAME_EMPTY="Last name is required";
    public static final String ERROR_EMAIL_EMPTY = "Email is required";
    public static final String ERROR_PASSWORD_EMPTY = "Password is required";


    By h1RegistrationPage = By.cssSelector("h1");
    By firstNameField = By.cssSelector("input[name=\"first-name\"]");
    By lastNameField = By.cssSelector("input[name=\"last-name\"]");
    By emailField = By.cssSelector("input[name=\"email\"]");
    By passwordField = By.cssSelector("input[name=\"password\"]");

    By checkBoxAgree = By.cssSelector("//input[@id='isAgree']");
    By registerButton = By.cssSelector("button.btn.user-form-btn");
    By errorEmptyFirstName = By.xpath("//div/span");
    By errorEmptyLastNAme = By.xpath("//div[2]/div/span");
    By errorEmptyEmail = By.xpath("//form/div[2]/div/span");
    By errorEmptyPassword = By.xpath("//div[3]/div/span");
    By errorEmptyCheckBox =  By.cssSelector("label.invalid");



    public void checkRegisterPageTitle(){
        Utils.ifElementDisplayed(h1RegistrationPage);
        Utils.getTextAndMath(h1RegistrationPage,REGISTER_PAGE_TITTLE);
    }

    public void enterDataIntoRegisterForm(String firstName, String lastName, String email, String password){
        Utils.input(firstName,firstNameField);
        Utils.input(lastName, lastNameField);
        Utils.input(email,emailField);
        Utils.input(password, passwordField);

    }

    public void clickOnAgreeTermsAndConditionsCheckBox(){
        Utils.click(checkBoxAgree);
    }

    public void clickOnRegisterButton(){
        Utils.click(registerButton);
    }






}
