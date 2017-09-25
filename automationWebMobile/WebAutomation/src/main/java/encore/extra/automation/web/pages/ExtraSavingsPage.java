package encore.extra.automation.web.pages;

import encore.extra.automation.web.Utils;
import org.openqa.selenium.By;

/**
 * Created by daria.
 */
public class ExtraSavingsPage extends Utils {
    public static final String URL_UBER = "https://uber.atlanticcreditfinance.com/";
    public static final String H1_TITTLE = "Extra Savings offers exclusively for you.";
    public static final String H2_SUB_HEADER = "Explore all of our partner offers and how they can help you earn extra savings. Pick the ones that best fit your situation and needs.";
    public static final String UBER_OFFER_FOR_EXTRA_SAVING = "Sign up to be an Uber driver through us, and start earning extra earnings right now. Earn a $300 bonus to your account once you reach a certain number of rides.";

    By h1Tittle = By.cssSelector("h1.title");
    By h2SubHeader = By.cssSelector("h2.subheader");
    By offer =By.cssSelector("div.offer");
    By offerDetailsButton = By.xpath("//div[2]/div/div[2]/div[2]/button");
    By offerDetailsTittle = By.cssSelector("h1.title");
    By enrollButton = By.xpath("//div[2]/button");
    By linlUber= By.xpath("//a[contains(@href, 'https://uber.atlanticcreditfinance.com/')]");

    //TO DO re write for maven https://prod.moven.com/signup/#/welcomeReferral/EncoreCapital/Pilot/2016

    public void checkH1TitleOnExtraSavingsPage(String extraEarningsH1Title){
        Utils.getTextAndMath(h1Tittle,extraEarningsH1Title);
    }

    public void checkH2SubHeaderOnExtraSavingsPage(String extraEarningsH2SubHeader){
        Utils.getTextAndMath(h2SubHeader,extraEarningsH2SubHeader);
    }


    public void checkUberOfferOnExtraSavingsPage(String uberOfferDetails){
        Utils.ifElementDisplayed(offer);
        Utils.getTextAndMath(offer, uberOfferDetails);
    }

    public void mouseOverUberOfferOnExtraSavingsPage(){
        Utils.waitForElementVisible(offer);
        Utils.scrollPage();
        Utils.mouseOver(offer);
    }

    public void clickOnUberOfferDetailsOnExtraSavingsPage(){
        Utils.click(offerDetailsButton);
        Utils.waitForElementVisible(offerDetailsTittle);
    }

    public void checkIsUberOfferDetailsOpened(){
        Utils.waitForElementVisible(offerDetailsTittle);
        Utils.ifElementDisplayed(offerDetailsTittle);
    }

    public void clickOnLinkUber(){
        Utils.waitForElementVisible(linlUber);
        Utils.click(linlUber);
    }

    public void clickOnEnrollButton(){
        Utils.waitForElementVisible(enrollButton);
        Utils.click(enrollButton);
    }
}
