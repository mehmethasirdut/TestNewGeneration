package TestNewGenerationWorks;

import Utils.GeneralWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _11_ContactUs extends GeneralWebDriver {

    @Test
    @Parameters("message")
    void ContactUS(String cameMessage){

        WebElement contactUsButton = driver.findElement(By.linkText("Contact Us"));
        contactUsButton.click();

        WebElement enquiryArea = driver.findElement(By.id("input-enquiry"));
        enquiryArea.sendKeys(cameMessage);

        WebElement submitButton = driver.findElement(By.cssSelector("[value='Submit']"));
        submitButton.click();

        WebElement contactUslabel = driver.findElement(By.cssSelector("[id='content']>h1"));
        System.out.println(contactUslabel.getText());

        Assert.assertEquals("Contact Us",contactUslabel.getText(),"Karşılaştırma sonucu : ");

    }
}
