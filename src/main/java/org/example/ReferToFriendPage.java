package org.example;

import org.openqa.selenium.By;

public class ReferToFriendPage extends Utils
{
    //Method to refer a product to friend
    public void referToFriend()
    {
        //Click on Email a friend
        clickOnElement(By.xpath("//button[@class=\"button-2 email-a-friend-button\"]"));

        //Type Friend's email
        typeText(By.className("friend-email"), "dfha@gmail.com");

        //Click on Send Email Button
        clickOnElement(By.name("send-email"));
    }
}
