package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils
{
    public void entreLoginDetails()
    {
        //Enter the email address
        typeText(By.id("Email"), email);

        //Entre the Password
        typeText(By.id("Password"), password);

        //Click on Log In button
        clickOnElement(By.xpath("//button[contains(@class,\"button-1 login-button\")]"));
    }
}
