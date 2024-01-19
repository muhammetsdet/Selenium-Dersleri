package Tasks;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.notification.RunListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;


public class Task04 {
    /*
     Create chrome driver object by using @Before annotation
     Navigate to  https://testpages.herokuapp.com/styled/index.html
     Click on  Calculator under Micro Apps
     Type any number in the first input
     Type any number in the second input
     Click on Calculate
     Get the result(getText() method)
     Verify the result
     Print the result
     Close the browser by using @After annotation
*/
    static WebDriver driver=new ChromeDriver();

@Before
public void setUp(){
    driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
}
@After
public void tearDown() throws InterruptedException {
    Thread.sleep(3000);
    driver.quit();
}
    @Test
    public void test01() throws InterruptedException {

        driver.findElement(By.id("calculatetest")).click();
        driver.findElement(By.id("number1")).sendKeys("33");
        driver.findElement(By.id("number2")).sendKeys("25");
        Thread.sleep(2000);
       driver.findElement(By.id("calculate")).click();
        Thread.sleep(2000);
      String result= driver.findElement(By.id("answer")).getText();
        Thread.sleep(2000);
        Assert.assertEquals("58",result);
        System.out.println("resultPlusNumbers = " + result);
    }

}
