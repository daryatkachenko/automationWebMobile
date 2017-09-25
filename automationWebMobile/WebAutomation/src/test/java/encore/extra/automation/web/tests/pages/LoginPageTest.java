package encore.extra.automation.web.tests.pages;

import encore.extra.automation.web.components.HeaderNavigationBar;
import encore.extra.automation.web.pages.LoginPage;
import encore.extra.automation.web.tests.BaseTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by daria.
 */
public class LoginPageTest extends BaseTest {
    protected LoginPage loginPage = new LoginPage();

    protected HeaderNavigationBar headerNavigationBar = new HeaderNavigationBar();

    @BeforeMethod
    public void clickOnLoginButtonInNavigationBar(){
        headerNavigationBar.navigateToSpecificPage(LoginPage.class);
    }

    @Test
    public void checkIsLoginPageOpened(){
        loginPage.checkPageTitle();
    }




    @Test(dataProvider = "invalidEmailAndPassword")
    public void tryToLoginWithBagCredentials(String email,String password){
        loginPage.enterCredentialsIntoLoginForm(email, password);
        loginPage.clickOnLoginButton();
        loginPage.isValidationErrorsDisplay();

    }



    @DataProvider
    public Object[][] invalidEmailAndPassword() {
        return new Object[][]{
                {RandomStringUtils.randomAlphabetic(5),RandomStringUtils.randomAlphanumeric(5)},
                {RandomStringUtils.randomAlphabetic(300) +"@test.ru",RandomStringUtils.randomAlphabetic(300)},
                {RandomStringUtils.randomAlphanumeric(255),RandomStringUtils.randomAlphabetic(255)},
                {"",""}
        };
    }


}
