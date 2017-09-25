package screens.loginScreen;

/**
 * Created by daria.
 */
public interface LoginScreen {
    public void clickOnSignUp();
    public void enterEmailAndPassword(String email, String password);
    public void clickOnLoginButton();
    public void checkIsLoginScreenOpened();
    public void clickOnForgotPasswordLink();
}
