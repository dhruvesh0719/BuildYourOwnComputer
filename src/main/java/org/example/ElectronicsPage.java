package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils
{
    public void clickOnCameraAndPhoto()
    {
        //Click on Camera & photo
        clickOnElement(By.xpath("//a[text()=\" Camera & photo \"]"));

        //Click on Leica T Mirrorless Digital Camera
        clickOnElement(By.xpath("//h2[@class='product-title']//a[normalize-space()='Leica T Mirrorless Digital Camera']"));

    }
}
