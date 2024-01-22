package Selenium_Dersleri;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

import java.awt.*;
import java.awt.event.KeyEvent;

public class C41_RobotClass extends TestBase {

    @Test
    public void robotClassTest() throws AWTException, InterruptedException {
        //  https://testpages.eviltester.com/styled/basic-html-form-test.html

        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
//driver.findElement(By.name("username")).sendKeys("Ahmet"+ Keys.ENTER);
driver.findElement(By.name("username")).sendKeys("Ahmet");

        //Enter tuşuna robot class ile basmak istiyoruz
        //1.Adım: Robot Class objesini oluştur.
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);//Enter'a bas
        robot.keyRelease(KeyEvent.VK_ENTER);//Enter'a basma işlemini sonlandırır.

Thread.sleep(3000);
robot.mouseWheel(7);
        Thread.sleep(3000);
robot.mouseWheel(-7);
    }

}