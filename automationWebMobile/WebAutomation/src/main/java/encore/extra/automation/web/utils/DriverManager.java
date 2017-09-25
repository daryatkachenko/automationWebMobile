package encore.extra.automation.web.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

/**
 * Created by daria.
 */
public class DriverManager {



    private static WebDriver driver = null;

    private DriverManager() {
    }

    public static WebDriver getDriver(String browser) {
        if (driver == null) {
            if (browser.equals("firefox")) {
                driver = new FirefoxDriver();

            }
            if (browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver",
                        "./webDrivers/chromedriver");
                driver = new ChromeDriver();
            }

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        return driver;
    }

    public static WebDriver getDriver (){
        return driver;
    }


    public static void close() {
        if (driver != null) {
            try {
                driver.quit();
                driver = null;
            } catch (Exception e) {
                e.printStackTrace();
                driver.quit();
                driver = null;
            }
        }
    }


}
