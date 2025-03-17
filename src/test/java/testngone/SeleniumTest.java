package testngone;

import ExcelTest.ExcelRead;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumTest {


    @Test(dataProvider = "readexcel" , dataProviderClass = ExcelRead.class
    )
    public void urlTest(String username, String pswd){
        WebDriverManager.chromedriver().setup();
        WebDriver wb = new ChromeDriver();
        wb.get("https://opensource-demo.orangehrmlive.com/");
        wb.manage().window().maximize();
        wb.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        wb.findElement(By.xpath("//input[@name='password']")).sendKeys(pswd);
        wb.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Parameters({"Text"})
    @Test
    public void Method2(String s){
        System.out.println(s);
    }

    @Parameters({"a","b"})
    @Test
    public void Method2(int a,int b){
        Assert.assertTrue(a>b);
    }

}
