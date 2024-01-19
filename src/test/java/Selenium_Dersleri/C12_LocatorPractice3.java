package Selenium_Dersleri;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class C12_LocatorPractice3 {
/*
    Navigate to website  https://testpages.herokuapp.com/styled/index.html
    Under the Examples
    Click on Locators - Find By Playground Test Page
    Print the URL
    Navigate back
    Print the URL
    Click on WebDriver Example Page
    Print the URL
    Enter value  20 and Enter to "Enter Some Numbers inputBox"
    And then verify 'two, zero' message is displayed
    Close driver.
*/

    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
public void tes01() throws InterruptedException {
//        Navigate to website  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
//        Under the Examples
//        Click on Locators - Find By Playground Test Page
        driver.findElement(By.partialLinkText("Locators - Find")).click();
        Thread.sleep(2000);
//        Print the URL
        System.out.println(driver.getCurrentUrl());
//        Navigate back
        driver.navigate().back();
        Thread.sleep(2000);
//        Print the URL
        System.out.println(driver.getCurrentUrl());
//        Click on WebDriver Example Page
        driver.findElement(By.id("webdriverexamplepage")).click();
        Thread.sleep(2000);
//        Print the URL
        System.out.println(driver.getCurrentUrl());
//        Enter value  20 and Enter to "Enter Some Numbers inputBox"
        driver.findElement(By.id("numentry")).sendKeys("20");
        Thread.sleep(2000);
       // onayla.submit();
      driver.findElement(By.id("submit-to-server")).click();
        Thread.sleep(2000);
//        And then verify 'two, zero' message is displayed
String message=driver.findElement(By.id("message")).getText();
assertEquals("two, zero", message);
//        Close driver...

    }
}
