package encore.extra.automation.web.pages;

import encore.extra.automation.web.Utils;
import org.openqa.selenium.By;

/**
 * Created by daria.
 */
public class LoginPage extends Utils {
   public static final String ERROR_EMPTY_EMAIL = "Email is required";
   public static final String ERROR_EMPTY_PASSWORD = "Password is required";
   public static final String ERROR_WRONG_FORMAT_EMAIL="Wrong email format";

   public static final String ERROR_SMALL_PASSWORD = "Password must be at least 6 characters";
   public static final String ERROR_BIG_PASSWORD = "Password must be less than 255 characters";

    By h1LoginPage = By.cssSelector("h1");
    By emailField = By.cssSelector("input[name=\"email\"]");
    By passwordField = By.cssSelector("input[name=\"password\"]");
    By loginButton = By.cssSelector("button.btn.user-form-btn");
    By errorEmptyEmailField= By.cssSelector("span.alert");
    By errorEmptyPassword = By.xpath("//div[2]/div/span");
    By errorInvalidEmail = By.xpath("//div[2]/span");
    By errorValidationSmallPassword = By.xpath("//div[2]/div[2]/span");
    By errorValidationBigPassword = By.xpath("//div[3]/span");



    public void checkPageTitle(){
        Utils.ifElementDisplayed(h1LoginPage);
        Utils.getTextAndMath(h1LoginPage,"Login");
    }

    public void enterCredentialsIntoLoginForm(String email, String password){
        Utils.input(email,emailField);
        Utils.input(password,passwordField);

    }

    public void clickOnLoginButton(){
        Utils.click(loginButton);
    }




   public void isValidationErrorsDisplay(){
       if (Utils.ifElementDisplayed(errorValidationSmallPassword))
           Utils.getTextAndMath(errorValidationSmallPassword,ERROR_SMALL_PASSWORD);
       else if (Utils.ifElementDisplayed(errorValidationBigPassword))
           Utils.getTextAndMath(errorValidationBigPassword,ERROR_BIG_PASSWORD);
       else if (Utils.ifElementDisplayed(errorEmptyEmailField))
           Utils.getTextAndMath(errorEmptyEmailField,ERROR_EMPTY_EMAIL);
       else if ( Utils.ifElementDisplayed(errorEmptyPassword))
           Utils.getTextAndMath(errorEmptyPassword, ERROR_EMPTY_PASSWORD);
       else if (Utils.ifElementDisplayed(errorInvalidEmail))
           Utils.getTextAndMath(errorInvalidEmail,ERROR_WRONG_FORMAT_EMAIL);

   }



}
