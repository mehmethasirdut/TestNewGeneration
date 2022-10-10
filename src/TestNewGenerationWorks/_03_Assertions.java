package TestNewGenerationWorks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {

    @Test
    void EqualEx(){

        String s1="Hello";
        String s2="Hello";
        System.out.println(s1.equals(s2));
        Assert.assertEquals(s1,s2,"Karşılaştırma sonucu");
    }

    @Test
    void NotEqualEx(){

        String s1="Hello";
        String s2="Hi";
        System.out.println(!s1.equals(s2));
        Assert.assertNotEquals(s1,s2,"Karşılaştırma sonucu");

    }

    @Test
    void TrueEx(){
        int i1=5;
        int i2=5;
        System.out.println(i1==i2);
        Assert.assertTrue(i1==i2);

    }

    @Test
    void NullEx(){
        String s1=null;
        System.out.println(s1);
        Assert.assertNull(s1,"Karşılaştırma sonucu");
    }

    @Test
    void FailEx(){
        String s1="Hello";
        if (s1.equals("Hello"))
            Assert.fail();
    }

}
