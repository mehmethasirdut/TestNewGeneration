package TestNewGenerationWorks;

import Utils.GeneralWebDriver;
import org.testng.annotations.Test;

public class _09_Dependencies {

    @Test
    void startCar(){System.out.println("Car started");}
    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){System.out.println("car drive");}
    @Test(dependsOnMethods = {"startCar","driveCar"})
    void parkCar(){System.out.println("car parked");}
    @Test(dependsOnMethods = {"parkCar"}, alwaysRun=true)
    void stopCar(){System.out.println("car stop");}
}
