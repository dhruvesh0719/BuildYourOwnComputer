package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


public class Utils extends BasePage
{
    //All reusable variables & methods

    //Store the email address
    static String email = "dhfh"+random()+"fj@gmail.com";

    //Store password
    static String password = "Dhruvesh285";


    //1) Click on element method
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    //2) Type a text inside Text Box
    public static void typeText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    //3) Capture a text from the element
    public static String captureTextOfTheElement(By by)
    {
        return driver.findElement(by).getText();
    }

    //4) Method to generate Random String
    public static String random()
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyyddmmhms");
        Date date = new Date();
        return dateFormat.format(date);
    }

    //5) Explicit wait until visibility of the element located
    public static void explicityWait(By by, int time)
    {
        WebElement element = driver.findElement(by);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //6) Select by Visible  text
    public static void selectByVisibleText(By by, String text)
    {
        WebElement element = driver.findElement(by);
        Select dropDown = new Select(element);
        dropDown.selectByVisibleText(text);

    }

    //7) Select By index
    public static void selectByIndex(By by, int i)
    {
        WebElement element = driver.findElement(by);
        Select dropDown = new Select(element);
        dropDown.deselectByIndex(i);
    }

    //8) Select By value
    public static void selectByValue(By by, String text)
    {
        WebElement element = driver.findElement(by);
        Select dropDown = new Select(element);
        dropDown.selectByValue(text);
    }

    //9) Fluent wait
    public static void fluentWait()
    {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
    }

    //10) Implicitly wait
    public static void implicitWait(int time)
    {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }


}
