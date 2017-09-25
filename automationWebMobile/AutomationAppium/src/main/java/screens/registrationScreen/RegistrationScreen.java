package screens.registrationScreen;

/**
 * Created by daria.
 */
public interface RegistrationScreen {
    public void checkIsRegistrationScreenOpen();
    public void checkSubTittleRegisterScreenOnFirstRegistrationScreen();
    public void enterDataInSignUpFormOnFirstScreen(String firstName, String lastName, String email, String password);
    public void clickRegisterButtonOnFirstScreenOfRegistration();
    public void checkIsSecondRegistrationScreenOpen();
    public void clickOnSkipButton();
    public void clickOnContinueButton();
    public void clickOnAcceptButtonOnTermsAndConditionScreen();
}
