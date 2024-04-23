package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest
{
    //Create objects of all Page classes
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    LoginPage loginPage = new LoginPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    ReferToFriendPage referToFriendPage = new ReferToFriendPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();

    //Verify User Should Register Successfully
    @Test
    public void verifyUserShouldRegisterSuccessfully()
    {
        //Open Home page & click on register button
        homePage.clickOnRegister();

        //Entre Registration Details
        registrationPage.entreTheRegistrationDetails();

        //Verify Registration message
        registrationResultPage.verifyUserShouldRegisterSuccessfully();

    }

    //User Should Login Successfully
    @Test
    public void verifyUserShouldLoginSuccessfully()
    {
        //Click on login
        homePage.clickOnLogin();

        //Entre the login details
        loginPage.entreLoginDetails();
    }

    //Verify user can refer a product to friend
    @Test
    public void verifyUserCouldReferToFriend()
    {
        //Click on Electronics button
        homePage.clickOnElectronics();

        //Click on Camera & photo
        electronicsPage.clickOnCameraAndPhoto();

        //Refer to friend
        referToFriendPage.referToFriend();
    }

    //User should build his own computer
    @Test
    public void verifyUserShouldBuildOwnComputer()
    {
        //Click on Build your own computer
        homePage.clickOnBuildYourOwnComputer();

        //Build your computer
        buildYourOwnComputerPage.buildYourOwnComputer();

        //Verify shopping cart
        shoppingCartPage.verifyShoppingCart();
    }
}
