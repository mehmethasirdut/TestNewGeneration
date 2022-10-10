package TestNewGenerationWorks;

import org.testng.annotations.Test;

public class _04_EnableTest {

    @Test
    void Test1(){
        System.out.println("Test 1");
    }
    @Test(enabled = false)
    void Test2(){
        System.out.println("Test 2");
    }
    @Test
    void Test3(){
        System.out.println("Test 3");
    }
    @Test
    void Test4(){
        System.out.println("Test 4");
    }
}
