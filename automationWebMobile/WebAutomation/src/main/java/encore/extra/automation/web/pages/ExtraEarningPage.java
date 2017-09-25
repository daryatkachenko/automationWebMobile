package encore.extra.automation.web.pages;

import encore.extra.automation.web.Utils;
import org.openqa.selenium.By;

/**
 * Created by daria.
 */
public class ExtraEarningPage extends Utils {
    public static final String URL_UBER = "https://uber.atlanticcreditfinance.com/";

    public static final String H1_TITTLE = "Extra Earnings offers exclusively for you.";
    public static final String H2_SUB_HEADER = "Explore all of our partner offers and how they can help you earn extra income.";
    public static final String UBER_OFFER = "Sign up to be an Uber driver through us, and start earning extra earnings right now. Earn a $300 bonus to your account once you reach a certain number of rides.";


    By h1Tittle = By.cssSelector("h1.title");
    By h2SubTittle = By.cssSelector("h2.subheader");
    By offer =By.cssSelector("div.offer");
    By offerDetailsButton = By.xpath("//div[2]/button");
    By offerDetailsTittle = By.cssSelector("h1.title");
    By enrollButton = By.xpath("//div[2]/button");
    By linlUber= By.xpath("//a[contains(@href, 'https://uber.atlanticcreditfinance.com/')]");




    public void checkH1Title(String extraEarningsH1Title){
        Utils.getTextAndMath(h1Tittle,extraEarningsH1Title);
    }

    public void checkH1SubHeader(String extraEarningsH2SubTitle){
        Utils.getTextAndMath(h2SubTittle,extraEarningsH2SubTitle);
    }


    public void checkUberOffer(String uberOfferDetails){
        Utils.ifElementDisplayed(offer);
        Utils.getTextAndMath(offer, uberOfferDetails);
    }

    public void mouseOverUberOffer(){
        Utils.waitForElementVisible(offer);
        Utils.scrollPage();
        Utils.mouseOver(offer);
    }

    public void clickOnUberOfferDetails(){
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
