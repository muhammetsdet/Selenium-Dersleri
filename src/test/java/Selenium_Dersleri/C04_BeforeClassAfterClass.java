package Selenium_Dersleri;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_BeforeClassAfterClass {
    @BeforeClass
    public static void beforeClass(){
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Before Class");
    }
    @AfterClass
    public static void afterClass() throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("After1 Class");
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void test01(){
        System.out.println("Test 1");
    }
    @Test
    public void test02(){
        System.out.println("Test 2");
    }
    @Test
    public void test03(){
        System.out.println("Test 3");
    }

}
