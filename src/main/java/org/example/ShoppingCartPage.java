package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils
{
    //Verify Shopping cart page with selected product
    static String expectedMessage = "Build your own computer";
    public void verifyShoppingCart()
    {
       String actualMessage = captureTextOfTheElement(By.xpath("//a[@class='product-name']"));
        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
