package Selenium_Dersleri;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;


import static org.junit.Assert.assertEquals;

public class C16_RelativeLocator {
 /*
Go to https://clarusway.com/
Verify that the link on the left of Salesforce is Cybersecurity"
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
    public void realtiveLocator(){
        driver.get("https://clarusway.com/");

//       ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--disbale-cookies");
//        chromeOptions.addArguments("--accept-all-cookies");
//        driver =new ChromeDriver(chromeOptions);

        WebElement salesForce = driver.findElement(By.linkText("Salesforce"));
        WebElement cyberSecurity = driver.findElement(RelativeLocator.with(By.tagName("span")).toLeftOf(salesForce));

        /*Cybersecurity web elementi için elimizde sadece tag var olduğunu varsayarsak
        locate edebildiğimiz 'Salesforce' web elementini baz alarak solundaki elementi buluyoruz.*/

       driver.findElement(By.id("wt-cli-accept-all-btn")).click();
        cyberSecurity.click();

        assertEquals("https://clarusway.com/cyber-security/", driver.getCurrentUrl());

    }

}
