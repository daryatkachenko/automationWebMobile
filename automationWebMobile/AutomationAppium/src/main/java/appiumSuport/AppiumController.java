package appiumSuport;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by daria.
 */
public class AppiumController {
    public static OS executionOS = OS.ANDROID;

    public enum OS {
        ANDROID,
        IOS
    }
    public static AppiumController instance = new AppiumController();
    public AppiumDriver driver;

    private File classpathRoot;
    private File appDir;
    private File app;
    private DesiredCapabilities capabilities;




    public void start() throws MalformedURLException {
        if (driver != null) {
            return;
        }
        switch(executionOS){
            case ANDROID:
                setupBaseConfig("/app/android","presentation-debug.apk");
                capabilities =  new CapabilityClass().new Builder()
                        .setAutomationName("UiAutomator2")
                        .setPlatformName("Android")
                        .setPlatformVersion("5.1")
                        .setDeviceName("Meizu M3 Note")
                        .setApp(app.getAbsolutePath())
                        .build();
                capabilities.setCapability("appPackage", "com.encore_extra.app");
                capabilities.setCapability("appActivity", ".view.activity.SignInActivity");
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;
            case IOS:
                setupBaseConfig("/app/ios/","EncoreEXTRA.app");
                capabilities =  new CapabilityClass().new Builder()
                        .setAutomationName("XCUITest")
                        .setPlatformName("ios")
                        .setDeviceName("iPhone 5s")
                        .setPlatformVersion("10.2")
                        .setApp(app.getAbsolutePath())
                        .build();
                driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    private void setupBaseConfig(String appDirName, String appName) {
        classpathRoot = new File(System.getProperty("user.dir"));
        appDir = new File(classpathRoot, appDirName);
        app = new File (appDir, appName);
        capabilities = new DesiredCapabilities();
    }

    public void stop() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
