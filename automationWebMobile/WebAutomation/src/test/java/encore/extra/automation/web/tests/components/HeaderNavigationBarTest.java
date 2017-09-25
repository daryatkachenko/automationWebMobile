package encore.extra.automation.web.tests.components;

import encore.extra.automation.web.components.HeaderNavigationBar;
import encore.extra.automation.web.pages.*;
import encore.extra.automation.web.tests.BaseTest;
import org.testng.annotations.Test;




/**
 * Created by daria.
 */
public class HeaderNavigationBarTest extends BaseTest {

protected HeaderNavigationBar headerNavigationBar = new HeaderNavigationBar();


    @Test
    public void clickOnAbout(){
        headerNavigationBar.navigateToSpecificPage(AboutPage.class);


    }

    @Test
    public void clickOnExtraEarning(){
        headerNavigationBar.navigateToSpecificPage(ExtraEarningPage.class);


    }

    @Test
    public void clickOnExtraSavings(){
        headerNavigationBar.navigateToSpecificPage(ExtraSavingsPage.class);


    }


    @Test
    public void clickOnHelpSupport(){
        headerNavigationBar.navigateToSpecificPage(HelpSupportPage.class);


    }

    @Test
    public void clickOnHomePage(){
        headerNavigationBar.navigateToSpecificPage(HomePage.class);

    }


    @Test
    public void  clickOnLogin() throws InterruptedException {
        headerNavigationBar.navigateToSpecificPage(LoginPage.class);
        Thread.sleep(10);
    }
}
