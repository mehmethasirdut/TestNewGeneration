package TestNewGenerationWorks;

import Utils.GeneralWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class _06_MenuValidate extends GeneralWebDriver {

    @Test
    void menuValidate(){

        List<String> menuExpectedList=new ArrayList<>();
        menuExpectedList.add("Desktops");
        menuExpectedList.add("Laptops & Notebooks");
        menuExpectedList.add("Components");
        menuExpectedList.add("Tablets");
        menuExpectedList.add("Software");
        menuExpectedList.add("Phones & PDAs");
        menuExpectedList.add("Cameras");
        menuExpectedList.add("MP3 Players");

        List<WebElement> menuActualList=driver.findElements(By.cssSelector("ul[class='nav navbar-nav']>li"));
        Tools.compareToLists(menuExpectedList, menuActualList);
    }
}
