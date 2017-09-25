package encore.extra.automation.web.tests.pages;

import encore.extra.automation.web.components.HeaderNavigationBar;
import encore.extra.automation.web.pages.ExtraSavingsPage;
import encore.extra.automation.web.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static encore.extra.automation.web.pages.ExtraSavingsPage.URL_UBER;


/**
 * Created by daria.
 */
public class ExtraSavingsPageTest extends BaseTest {
    protected HeaderNavigationBar headerNavigationBar = new HeaderNavigationBar();
    protected ExtraSavingsPage extraSavingsPage = new ExtraSavingsPage();

    @BeforeMethod
    public void beforeTestClickOnExtraSavingButtonOnHeaderNavBarAndNavigateToExtraSavingsPage(){
        headerNavigationBar.navigateToSpecificPage(ExtraSavingsPage.class);
    }


    @Test
    public void checkH1Tittle(){
        extraSavingsPage.checkH1TitleOnExtraSavingsPage(ExtraSavingsPage.H1_TITTLE);
    }

    @Test
    public void checkH2SubHeader(){
        extraSavingsPage.checkH2SubHeaderOnExtraSavingsPage(ExtraSavingsPage.H2_SUB_HEADER);
    }

    @Test
    public void checkIsUberExtraSavingOfferPresent(){
        extraSavingsPage.checkUberOfferOnExtraSavingsPage(ExtraSavingsPage.UBER_OFFER_FOR_EXTRA_SAVING);

    }

    @Test
    public void clickOnUbderOfferDetailsToGetMoreInfo(){
        extraSavingsPage.checkUberOfferOnExtraSavingsPage(ExtraSavingsPage.UBER_OFFER_FOR_EXTRA_SAVING);
        extraSavingsPage.mouseOverUberOfferOnExtraSavingsPage();
        extraSavingsPage.clickOnUberOfferDetailsOnExtraSavingsPage();
        extraSavingsPage.checkIsUberOfferDetailsOpened();
    }

    @Test
    public void clickOnEnrollButtonToEnrollUberOffer(){
        extraSavingsPage.checkUberOfferOnExtraSavingsPage(ExtraSavingsPage.UBER_OFFER_FOR_EXTRA_SAVING);
        extraSavingsPage.mouseOverUberOfferOnExtraSavingsPage();
        extraSavingsPage.clickOnUberOfferDetailsOnExtraSavingsPage();
        extraSavingsPage.checkIsUberOfferDetailsOpened();
        extraSavingsPage.clickOnEnrollButton();
        Assert.assertEquals(driver.getCurrentUrl(), URL_UBER);
        driver.navigate().back();

    }

    @Test
    public void clickOnLinkToEnrollUberOffer(){
        extraSavingsPage.checkUberOfferOnExtraSavingsPage(ExtraSavingsPage.UBER_OFFER_FOR_EXTRA_SAVING);
        extraSavingsPage.mouseOverUberOfferOnExtraSavingsPage();
        extraSavingsPage.clickOnUberOfferDetailsOnExtraSavingsPage();
        extraSavingsPage.checkIsUberOfferDetailsOpened();
        extraSavingsPage.clickOnLinkUber();
        Assert.assertEquals(driver.getCurrentUrl(), URL_UBER);
        driver.navigate().back();

    }



}
