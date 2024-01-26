package Selenium_Dersleri;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C52_ScreenShot2 extends TestBase {
/*
    Go to https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
    Take full page screenshot
    Take specific element's screenshot
*/

    @Test
    public void screenShotTest() throws InterruptedException {

//        Go to https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//        Take full page screenshot
        Thread.sleep(2000);
        getFullPageScreenShot();

//        Take specific element's screenshot
        WebElement imgWebElement = driver.findElement(By.xpath("//img[@alt='company-branding']"));
        getSpecificElementsScreenShot(imgWebElement);

    }

}
