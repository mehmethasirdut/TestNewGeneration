package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {

    public static void compareToLists(List<String> menuExpectedList, List<WebElement> menuActualList){

        for (int i=0;i<menuExpectedList.size();i++){
            Assert.assertEquals(menuExpectedList.get(i),menuActualList.get(i).getText(),"Karşılaştırma Sonucu");
        }
    }

    public static void successMessageValidation()
    {
        WebElement GreenTextCompare= GeneralWebDriver.driver.findElement
                (By.xpath("//*[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(GreenTextCompare.getText().toLowerCase().contains("success"));
    }

    public static void WaitFor(int sec)
    {

        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static double WebElementToDouble(WebElement e) {
        String result=e.getText();
        result=result.replaceAll("[^\\d]","");
        return Double.parseDouble(result);
    }

}
