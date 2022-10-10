package TestNewGenerationWorks;

import org.testng.annotations.Test;

public class _01_Main {
        // TestNG için mavende arama yaparken org.testng:testng:6.14.3 bunu yaz ekle
        // Selenium un library sini de ekliyorsun
        // driverı ekle testng hazır

    @Test(priority = 1)
    void openTheWebsite(){
        System.out.println("website was opened");
    }
    @Test(priority = 2)
    void loginTheWebsite(){
        System.out.println("logined the Website");
    }

    @Test(priority = 3)
    void closeTheDrive(){
        System.out.println("closed the Drive");
    }

}
