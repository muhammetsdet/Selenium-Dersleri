package Selenium_Dersleri;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.ThreeDLocation;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_Locators {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testpages.eviltester.com/styled/index.html");
    }

    @Test
    public void locatorTest() throws InterruptedException {
        driver.navigate().refresh();
      WebElement basicpagetest=  driver.findElement(By.id("basicpagetest"));
      basicpagetest.click();

        Thread.sleep(2000);

     WebElement index= driver.findElement(By.linkText("Index"));
        index.click();

        Thread.sleep(2000);

        WebElement locatorFingBy=driver.findElement(By.partialLinkText("Playground"));
        locatorFingBy.click();

        WebElement pName2=driver.findElement(By.name("pName2"));
       String pName2Text=pName2.getText();
        System.out.println(pName2Text);

        String header =driver.findElement(By.tagName("h1")).getText();
        System.out.println("header = " + header);

       WebElement classNameElement= driver.findElement(By.className("normal"));//bu class ile oluşturulan ilk elementi dönecek
        System.out.println("classNameElement.getText() = " + classNameElement.getText());
    }
@AfterClass
    public static void tearDown() {
        driver.quit();
}

}
