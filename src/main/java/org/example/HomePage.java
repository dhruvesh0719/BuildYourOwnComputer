package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils
{
    //Click on Register
    public void clickOnRegister()
    {
        clickOnElement(By.className("ico-register"));
    }

    //Click on Login Button
    public void clickOnLogin()
    {
        clickOnElement(By.xpath("//a[contains(@class,\"ico-login\")]"));
    }

    //Click on Electronics
    public void clickOnElectronics()
    {
        clickOnElement(By.xpath("//a[contains(@title,\"Show products in category Electronics\")]"));
    }

    //Click on Build your own computer
    public void clickOnBuildYourOwnComputer()
    {
        clickOnElement(By.xpath("//a[text()=\"Build your own computer\"]"));
    }


}
