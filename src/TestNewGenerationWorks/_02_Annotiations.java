package TestNewGenerationWorks;

import org.testng.annotations.*;

public class _02_Annotiations {

//    @BeforeSuite
//      @BeforeGroups
//          @BeforeClass
//              @BeforeMethod
//                  @Test
//              @AfterMethod
//          @AfterClass
//      @AfterGroups
//    @AfterSuite

    @BeforeSuite
    void BeforeSuite(){
        System.out.println("BeforeSuite");
    }

    @BeforeGroups
    void BeforeGroups(){
        System.out.println("BeforeGroups");
    }

    @BeforeClass
    void BeforeClass(){
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    void BeforeMethod(){
        System.out.println("BeforeMethod");
    }

    @Test
    void Test(){
        System.out.println("Test");
    }

    @AfterMethod
    void AfterMethod(){
        System.out.println("AfterMethod");
    }

    @AfterClass
    void AfterClass(){
        System.out.println("AfterClass");
    }

    @AfterGroups
    void AfterGroups(){
        System.out.println("AfterGroups");
    }

    @AfterSuite
    void AfterSuite(){
        System.out.println("AfterSuite");
    }

}
