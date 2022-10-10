package TestNewGenerationWorks;

import Utils.GeneralWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class _07_Subscribe extends GeneralWebDriver {

    By link=By.linkText("Newsletter");
    By yes=By.cssSelector("input[value='1']");
    By no=By.cssSelector("input[value='0']");
    By cnt =By.cssSelector("input[value='Continue']");

    @Test(priority = 1)
    void subscribeFunctionYes()
    {
        wait.until(ExpectedConditions.elementToBeClickable(link));

        WebElement newsletterLink = driver.findElement(link);
        newsletterLink.click();

        WebElement accept= driver.findElement(yes);
        accept.click();

        WebElement continueButton = driver.findElement(cnt);
        continueButton.click();

        Tools.successMessageValidation();
    }

    @Test(priority = 2)
    void subscribeFunctionNo()
    {
        wait.until(ExpectedConditions.elementToBeClickable(link));

        WebElement newsletterLink = driver.findElement(link);
        newsletterLink.click();

        WebElement accept= driver.findElement(no);
        accept.click();

        WebElement continueButton = driver.findElement(cnt);
        continueButton.click();

        Tools.successMessageValidation();
    }

    @Test(priority = 3)
    void subscribeFunctionForBoth()
    {
        wait.until(ExpectedConditions.elementToBeClickable(link));

        WebElement newsletterLink = driver.findElement(link);
        newsletterLink.click();

        WebElement yesRadioButton= driver.findElement(yes);
        WebElement noRadioButton= driver.findElement(no);

        if (yesRadioButton.isSelected())
            noRadioButton.click();
        else
            yesRadioButton.click();

        WebElement continueButton = driver.findElement(cnt);
        continueButton.click();

        Tools.successMessageValidation();
    }
}
