package encore.extra.automation.web.tests.pages;

import encore.extra.automation.web.components.HeaderNavigationBar;
import encore.extra.automation.web.pages.ExtraEarningPage;
import encore.extra.automation.web.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by daria.
 */
public class ExtraEarningPageTest extends BaseTest {

    protected HeaderNavigationBar headerNavigationBar = new HeaderNavigationBar();
    protected ExtraEarningPage extraEarningPage =new ExtraEarningPage();


   @BeforeMethod
   public void beforeTestClicksOnExtraEarningButtonOnNavBarAndNavigateToExtraEarningPage(){
      headerNavigationBar.navigateToSpecificPage(ExtraEarningPage.class);
   }


    @Test
    public void checkH1Title(){
        extraEarningPage.checkH1Title(ExtraEarningPage.H1_TITTLE);
    }

    @Test
    public void checkH2SubHeader(){
        extraEarningPage.checkH1SubHeader(ExtraEarningPage.H2_SUB_HEADER);
    }

    @Test
    public void checkIsUberOfferPresent(){
        extraEarningPage.checkUberOffer(extraEarningPage.UBER_OFFER);
    }


    @Test
    public void clickOnUberDetails(){
        extraEarningPage.mouseOverUberOffer();
        extraEarningPage.clickOnUberOfferDetails();
        extraEarningPage.checkIsUberOfferDetailsOpened();

    }

    @Test
    public void clickOnUberLink(){
        extraEarningPage.mouseOverUberOffer();
        extraEarningPage.clickOnUberOfferDetails();
        extraEarningPage.checkIsUberOfferDetailsOpened();
        extraEarningPage.clickOnLinkUber();
        Assert.assertEquals(driver.getCurrentUrl(), ExtraEarningPage.URL_UBER);
        driver.navigate().back();
    }

    @Test
    public void clickOnEnrollButton(){
        extraEarningPage.mouseOverUberOffer();
        extraEarningPage.clickOnUberOfferDetails();
        extraEarningPage.checkIsUberOfferDetailsOpened();
        extraEarningPage.clickOnEnrollButton();
        Assert.assertEquals(driver.getCurrentUrl(), ExtraEarningPage.URL_UBER);
        driver.navigate().back();
    }
}
