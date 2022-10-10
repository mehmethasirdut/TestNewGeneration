package TestNewGenerationWorks;

import Utils.GeneralWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _08_EditAccount extends GeneralWebDriver {

    @Test
    void EditAccount(){
        editAccount("Ahmet","Demir");
        Tools.WaitFor(2);
        editAccount("ismet","temur");
    }

    void editAccount(String ad, String soyad){
        WebElement edit=driver.findElement(By.linkText("Edit Account"));
        edit.click();

        WebElement firstName=driver.findElement(By.id("input-firstname"));
        firstName.clear();
        firstName.sendKeys(ad);

        WebElement lastName=driver.findElement(By.id("input-lastname"));
        lastName.clear();
        lastName.sendKeys(soyad);

        WebElement cntBtn=driver.findElement(By.cssSelector("input[value='Continue']"));
        cntBtn.click();

        Tools.successMessageValidation();
    }
}
