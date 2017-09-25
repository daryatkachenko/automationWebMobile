package encore.extra.automation.web.components;


import encore.extra.automation.web.Utils;
import encore.extra.automation.web.pages.*;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by daria.
 */

public class HeaderNavigationBar extends Utils {
    By homeButton = By.xpath("//li/span");
    By extraEarningNavigationButton = By.xpath("//li[2]/span");
    By extraSavingsNavigationButton = By.xpath("//li[3]/span");
    By aboutNavigationButton = By.xpath("//li[4]/span");
    By helpSupportNavigationButton = By.xpath("//li[5]/span");
    By loginButton = By.xpath("//div/app-user-component/div/app-unauthorized/div/button[1]");
    By joinButton = By.xpath("//div/app-user-component/div/app-unauthorized/div/button[2]");


    //map navigation bar,clicks on button, and return new page
    Map<Class<? extends Utils>, NavigationElement> pages = new HashMap<Class<? extends Utils>, NavigationElement>(){{
        this.put(HomePage.class, new NavigationElement(homeButton, new HomePage()));
        this.put(LoginPage.class, new NavigationElement(loginButton, new LoginPage()));
        this.put(ExtraEarningPage.class, new NavigationElement(extraEarningNavigationButton, new ExtraEarningPage()));
        this.put(ExtraSavingsPage.class, new NavigationElement(extraSavingsNavigationButton, new ExtraSavingsPage()));
        this.put(AboutPage.class, new NavigationElement(aboutNavigationButton,new AboutPage()));
        this.put(HelpSupportPage.class, new NavigationElement(helpSupportNavigationButton,new HelpSupportPage()));
        this.put(RegistrationPage.class, new NavigationElement(joinButton, new RegistrationPage()));
    }};


    public Utils navigateToSpecificPage(Class pageType) {
        NavigationElement navigationElement = pages.get(pageType);
        Utils.click(navigationElement.button);
        return navigationElement.page;
    }



    protected class NavigationElement {
        By button;
        Utils page;
        NavigationElement(By button, Utils page) {
            this.button = button;
            this.page = page;
        }
    }

}
