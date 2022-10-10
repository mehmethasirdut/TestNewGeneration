package TestNewGenerationWorks;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _13_DataProvider {
    @Test(dataProvider ="getData")
    void UsernameTest(String username){
        System.out.println("username = " + username);
    }

    @DataProvider
    public Object[] getData(){
        Object[] data ={"Nurhayat","Alper","Uğur","Hakan"};
        return data;
    }
}
