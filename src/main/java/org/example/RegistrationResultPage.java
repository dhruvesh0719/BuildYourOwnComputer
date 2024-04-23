package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;

public class RegistrationResultPage extends Utils
{
    //Requirement for confirmation of Registration
    static String expectedMessage = "Your registration completed";
    public void verifyUserShouldRegisterSuccessfully()
    {
        String actulMessage = captureTextOfTheElement(By.className("result"));
        Assert.assertEquals(actulMessage,expectedMessage);
    }
}
