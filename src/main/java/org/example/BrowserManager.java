package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils
{
    //Open the browser
    public void openTheBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
    }

    //Close the browser
    public void closeTheBrowser()
    {
        driver.quit();
    }
}
