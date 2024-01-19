package Tasks;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.DigestException;

import static org.junit.Assert.assertEquals;

public class Task01 {
    /*
 Go to the Amazon URL : https://www.clarusway.com/
 Print the position and size of the page.
 Adjust the position of the page as:
    xCoordinate: 70
    yCoordinate: 70
  Adjust the size of the page as:
    height: 900
    width: 900

 Test that the page is in the position and size you want.
 Close the page.

*/

    @Test
    public void test01() throws InterruptedException {
        WebDriver  driver = new ChromeDriver();
        //Go to the Amazon URL : https://www.clarusway.com/
        driver.get("https://www.clarusway.com/");

        //Print the position and size of the page.
        Point initialPositon = driver.manage().window().getPosition();
        Dimension initialSize = driver.manage().window().getSize();
        Thread.sleep(2000);
        System.out.println("First positon="+initialPositon+" *** First size="+ initialSize);

        /*
        Adjust the position of the page as:
            xCoordinate: 70
            yCoordinate: 70
        Adjust the size of the page as:
            height: 900
            width: 900
         */
        Point targetPosition = new Point(70, 70);
        driver.manage().window().setPosition(targetPosition);
        Dimension targerSize = new Dimension(900, 900);
        driver.manage().window().setSize(targerSize);
        Thread.sleep(2000);

       // Test that the page is in the position and size you want.
        System.out.println("Target position="+targetPosition+" *** Target size=" +targerSize);
        if (targetPosition == initialPositon && targerSize == initialSize) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

driver.close();
    }

}
    /*
    FARKLI TARZ ÇÖZÜMÜ

     public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.clarusway.com/");
        System.out.println(driver.manage().window().getPosition());
        driver.manage().window().setPosition(new Point(70,70));
        driver.manage().window().setSize(new Dimension(900,900));

        int height = driver.    manage().window().getSize().getHeight();
        int width = driver. manage().window().getSize().getWidth();
        int x = driver.manage().window().getPosition().getX();
        int y =driver.manage().window().getPosition().getY();

        Assert.assertTrue(x==70&&y==70&&height==900&&width==900);
        driver.quit();

    }
     */