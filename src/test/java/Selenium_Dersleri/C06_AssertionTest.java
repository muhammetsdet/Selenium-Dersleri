package Selenium_Dersleri;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class C06_AssertionTest {
   static WebDriver driver;
    //    Go to Clarus homepage
   @BeforeClass
   public static void setUp(){
      driver=  new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https:clarusway.com/");

    }
    @AfterClass
    public static void tearDown() throws InterruptedException {
       Thread.sleep(3000);
       driver.quit();
    }


//    Do the following tasks by creating 3 different test methods.






@Test
    public void test01UrlTest(){
   // 1- Test if the URL contains clarusway.
String url =driver.getCurrentUrl();//Actual result
    boolean isContain=url.contains("clarusway");
    assertTrue(isContain);
//assertTrue(url.contains("clarusway"));

}
    @Test
    public void test02TitleTest(){
        // 2- Test if the title does not contain Facebook.
   String title= driver.getTitle();
   boolean isContain =title.contains("Facebook");
assertFalse(isContain);
    }
    @Test
    public void test03UrlTest(){
        //    3- Test if the URL equals to "https://clarusway.com/"
      String actualUrl=  driver.getCurrentUrl();//Actual Result
        String expectedUrl="https://clarusway.com/";//sondaki / forward slash olmazsa test geçemez çünkü string karşılaştırıyor aynı olmalı.
        assertEquals(expectedUrl,actualUrl);

    }


}
