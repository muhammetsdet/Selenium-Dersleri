package Selenium_Dersleri;

import org.junit.Test;
import utilities.TestBase;

public class C28_TestBase extends TestBase {
    @Test
    public void test01(){
        driver.get("https://youtube.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
    @Test
    public void test02(){
driver.get("https://linkedin.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
    @Test
    public void test03(){

driver.get("https://google.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());

    }


}
