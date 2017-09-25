package encore.extra.automation.web.tests;

import encore.extra.automation.web.Utils;
import encore.extra.automation.web.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



/**
 * Created by daria.
 */
public class BaseTest {
    protected WebDriver driver;


    @BeforeClass
    public void setUp() {
        DriverManager.getDriver(Utils.BROWSER);
        driver = DriverManager.getDriver();
        driver.get(Utils.DEV_URL);

    }



    @AfterClass
    public void tearDown() throws InterruptedException {
        // Clean up environment
        DriverManager.close();
    }

}

