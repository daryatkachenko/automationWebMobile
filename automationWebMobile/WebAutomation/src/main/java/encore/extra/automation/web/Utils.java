package encore.extra.automation.web;


import encore.extra.automation.web.utils.DriverManager;
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * Created by daria.
 */
public abstract class Utils {
    public static final String DEV_URL= "http://ee-s3-encore-extra-dev.s3-website-us-east-1.amazonaws.com";
    public static final String QA_URL = "http://ee-s3-encore-extra-qa.s3-website-us-east-1.amazonaws.com";
    public static final String BROWSER = "chrome";


    // to wait for element to be visible
    public static void waitForElementVisible(By element) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),100);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }



    // to verify if element is displayed
    public static boolean ifElementDisplayed(By element) {
        boolean ifDisplayed = DriverManager.getDriver().findElement(element).isDisplayed();
        return ifDisplayed;

    }

    // to click
    public static void click(By element) {
        WebElement clickableElement = DriverManager.getDriver().findElement(element);
        clickableElement.click();
    }

    // to enter
    public static void input(String input, By element) {
        WebElement inputField = DriverManager.getDriver().findElement(element);
        inputField.clear();
        inputField.sendKeys(input);
    }


    // to generate random date and convert it to String
    public static String randDate(int daysNum, int days) {
        Date myDate = new Date();
        Calendar cal = Calendar.getInstance();
        // cal.setTime(myDate);
        cal.add(Calendar.DATE, (days + 1 + randNumber(daysNum)));
        myDate = cal.getTime();
        SimpleDateFormat sdfr = new SimpleDateFormat("MM/dd/yyyy");
        String departureDate = sdfr.format(myDate);
        return departureDate;
    }

    // to generate random number
    public static int randNumber(int maxNumber) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(maxNumber);
        return randomNumber;
    }


    // to verify if element exists
    public static void verifyIfElementExists(By element, String message) {
        WebElement elementToBeFound = DriverManager.getDriver().findElement(element);
        boolean ifExists = elementToBeFound.isDisplayed();
        Assert.assertTrue(ifExists, message);
    }

    //to get text and math
    public static void getTextAndMath(By element, String text){
        WebElement elementToBeFound = DriverManager.getDriver().findElement(element);
        elementToBeFound.getText().matches(text);
        Asserts.notNull(element,"Such element not found. Element ");

    }


    public static void mouseOver(By element) {
        Actions action = new Actions(DriverManager.getDriver());
        action.moveToElement(DriverManager.getDriver().findElement(element)).build().perform();
    }

    public static void clearTextField(By element) {
        WebElement elementToClear = DriverManager.getDriver().findElement(element);
        elementToClear.clear();
        Asserts.notNull(element,"Such element not found. Element ");
    }

    public static void scrollPage(){
        JavascriptExecutor jse = ((JavascriptExecutor) DriverManager.getDriver());
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }


}
