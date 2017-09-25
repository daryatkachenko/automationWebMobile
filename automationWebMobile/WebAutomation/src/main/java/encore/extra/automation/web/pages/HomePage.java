package encore.extra.automation.web.pages;

import encore.extra.automation.web.Utils;
import org.openqa.selenium.By;

/**
 * Created by daria.
 */
public class HomePage extends Utils {

   public static final String PAGE_TITLE = "NCoreExtra";
   public static final String H1 = "Exclusive offers created just for you";

    By extraEarningCard = By.cssSelector("div.header-card.violet");
    By extraSavingCard = By.cssSelector("div.header-card.orange");
    By extraKnowHowCard = By.cssSelector("div.header-card.red");
    By extraOpportunitiesCard = By.cssSelector("div.header-card.pink");
    By h1title = By.cssSelector("h1.title");

    public void checkExtraSavingCardIsPresent(){
    Utils.ifElementDisplayed(extraSavingCard);
    }

    public void checkExtraEarningCardIsPresent(){
    Utils.ifElementDisplayed(extraEarningCard);

    }

    public void checkExtraKnowHowCardIsPresent(){
    Utils.ifElementDisplayed(extraKnowHowCard);

    }

    public void checkExtraOpportunitiesCardIsPresent(){
    Utils.ifElementDisplayed(extraOpportunitiesCard);
}

    public void checkH1Title(String textToBeMathed){
    Utils.ifElementDisplayed(h1title);
    Utils.getTextAndMath(h1title,textToBeMathed );

    }

}
