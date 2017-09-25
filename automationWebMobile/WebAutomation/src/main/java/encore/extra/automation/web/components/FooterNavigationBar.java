package encore.extra.automation.web.components;

import encore.extra.automation.web.Utils;
import encore.extra.automation.web.pages.*;
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by daria.
 */
public class FooterNavigationBar extends Utils {

    By helpSupportNavigationButton = By.xpath("//li[5]/span");
    By termsAndConditionButton = By.xpath("//a[contains(@href, '#/terms')]");
    By privacyPolicyButton = By.xpath("//a[contains(@href, '#/privacy')]");
    By faqButton = By.xpath("//a[contains(@href, '#/faq')]");
    By aboutEncoreExtraButton = By.xpath("//a[contains(text(),'About')]");


    Map<Class<? extends Utils>, FooterNavigationBar.NavigationElement> pages = new HashMap<Class<? extends Utils>, FooterNavigationBar.NavigationElement>(){{
        this.put(HelpSupportPage.class, new NavigationElement(helpSupportNavigationButton,new HelpSupportPage()));
        this.put(TermsAndConditionsPage.class, new NavigationElement(termsAndConditionButton, new TermsAndConditionsPage()));
        this.put(PrivacyPolicyPage.class, new NavigationElement(privacyPolicyButton, new PrivacyPolicyPage()));
        this.put(FaqPage.class,new NavigationElement(faqButton, new FaqPage()));
        this.put(AboutPage.class, new NavigationElement(aboutEncoreExtraButton, new AboutPage()));
    }};


    public Utils navigateToSpecificPage(Class pageType) {
        FooterNavigationBar.NavigationElement navigationElement = pages.get(pageType);
        Asserts.notNull(navigationElement, "Such page not found in screens map. Page");
        Utils.click(navigationElement.button);
        return navigationElement.page;
    }

    private class NavigationElement {
        By button;
        Utils page;
        NavigationElement(By button, Utils page) {
            this.button = button;
            this.page = page;
        }
    }

}

