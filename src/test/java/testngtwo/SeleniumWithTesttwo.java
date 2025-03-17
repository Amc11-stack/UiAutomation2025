package testngtwo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumWithTesttwo {


    @Test(dataProvider = "data1")
    public void Home(int a) {
        int i = a;

        Assert.assertTrue(i > 0);
    }

    @Test(dataProvider = "data2")
    public void Home(String s,String y) {
       System.out.println(s+"-"+y);
    }


    @DataProvider(name = "data1")
    public static Object[][] readdata(){
        return  new Object[][] {{10}};
    }

    @DataProvider(name = "data2")
    public static Object[][] readdata1(){
        return  new Object[][] {{"Aman","Choudhury"}};
    }

}
