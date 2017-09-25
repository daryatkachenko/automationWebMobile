package encore.extra.automation.web.tests.pages;

import encore.extra.automation.web.components.HeaderNavigationBar;
import encore.extra.automation.web.pages.RegistrationPage;
import encore.extra.automation.web.tests.BaseTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by daria.
 */
public class RegisterPageTest extends BaseTest {
    protected HeaderNavigationBar headerNavigationBar = new HeaderNavigationBar();
    protected RegistrationPage registrationPage = new RegistrationPage();

    @BeforeMethod
    public void clickOnJoinButtonInHeaderNavigationMenu(){
        headerNavigationBar.navigateToSpecificPage(RegistrationPage.class);
    }

    @Test
    public void checkIsRegisterPageOpen(){
        registrationPage.checkRegisterPageTitle();
    }

    @Test(dataProvider = "invalidCredentials")
    public void tryRegisterWithBagCredentialsAndWithOutAgree(String firstName, String lastName, String email, String password){
        registrationPage.enterDataIntoRegisterForm(firstName, lastName, email, password);
        registrationPage.clickOnRegisterButton();


    }


    @DataProvider
    public Object[][] invalidCredentials() {
        return new Object[][]{
                {"","","",""},
                {RandomStringUtils.randomAlphanumeric(5),RandomStringUtils.randomAlphanumeric(5),RandomStringUtils.randomAlphanumeric(5),RandomStringUtils.randomAlphanumeric(5)},
                {RandomStringUtils.randomAscii(5),RandomStringUtils.randomAscii(5),RandomStringUtils.randomAscii(5),RandomStringUtils.randomAscii(5)},
                {RandomStringUtils.randomAlphabetic(255).toUpperCase(),RandomStringUtils.randomAlphanumeric(255),RandomStringUtils.randomAscii(255),RandomStringUtils.randomAlphabetic(255).toUpperCase()}

        };
    }
}
