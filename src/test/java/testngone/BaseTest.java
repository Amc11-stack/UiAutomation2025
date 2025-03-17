package testngone;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {


    @BeforeTest
    public void setup() {
        System.out.println("Setup before test");
    }

    @Test
    public void test1() {
        System.out.println("Running test 1");
    }

    @Test
    public void test2() {
        System.out.println("Running test 2");
    }
}
