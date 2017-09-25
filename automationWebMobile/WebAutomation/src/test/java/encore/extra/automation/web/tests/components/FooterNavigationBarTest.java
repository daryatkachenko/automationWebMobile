package encore.extra.automation.web.tests.components;

import encore.extra.automation.web.components.FooterNavigationBar;
import encore.extra.automation.web.pages.*;
import encore.extra.automation.web.tests.BaseTest;
import org.testng.annotations.Test;



/**
 * Created by daria.
 */
public class FooterNavigationBarTest extends BaseTest {
    protected FooterNavigationBar footerNavigationBar = new FooterNavigationBar();


    @Test
    public void clickOnPrivacyPolicyButton(){
        footerNavigationBar.navigateToSpecificPage(PrivacyPolicyPage.class);

    }

    @Test
    public void clickOnTermsAndConditionButton(){
        footerNavigationBar.navigateToSpecificPage(TermsAndConditionsPage.class);

    }

    @Test
    public void clickOnAboutEncoreExtraButton(){
        footerNavigationBar.navigateToSpecificPage(AboutPage.class);

    }

    @Test
    public void clickOnHelpSupportButton(){
        footerNavigationBar.navigateToSpecificPage(HelpSupportPage.class);

    }

    @Test
    public void clickOnFaqButton(){
        footerNavigationBar.navigateToSpecificPage(FaqPage.class);

    }
}
