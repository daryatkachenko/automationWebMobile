package encore.extra.automation.web.tests.pages;


import encore.extra.automation.web.pages.HomePage;
import encore.extra.automation.web.tests.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by daria.
 */
public class HomePageTest extends BaseTest {

  protected   HomePage homePage = new HomePage();

   @Test
   public void checkTitleOfHomePage(){
   assertEquals(driver.getTitle(), HomePage.PAGE_TITLE);

    }


    @Test
    public void checkH1Tittle(){
        homePage.checkH1Title(HomePage.H1);

    }

    @Test
    public void checkElementsOnHomePage(){
       homePage.checkExtraEarningCardIsPresent();
       homePage.checkExtraSavingCardIsPresent();
       homePage.checkExtraKnowHowCardIsPresent();
       homePage.checkExtraOpportunitiesCardIsPresent();
    }





}
