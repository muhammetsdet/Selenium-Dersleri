package Tasks;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task06 {
    /*
    Go to http://test.rubywatir.com/ifelse.php
    Click the correct submit button declared in the yellow line
    Finish the test after 50 correct click
*/
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test01() throws InterruptedException {
       // Go to http://test.rubywatir.com/ifelse.php
        driver.get("http://test.rubywatir.com/ifelse.php");
       // Click the correct submit button declared in the yellow line

        for (int i = 0; i <50 ; i++) {
            String number=  driver.findElement(By.xpath("//div[@style='background: yellow']/h2")).getText();
              driver.findElement(By.xpath("//input[contains(@name,"+ number + ")]")).click();

        }
    }

}
