package Selenium_Dersleri;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C32_WindowHandle3 extends TestBase {
    @Test
    public void test01() throws InterruptedException {

//    Open https://www.youtube.com/ in the opened tab
        driver.get("https://www.youtube.com/");

//    Create a new tab
        //    Open https://www.linkedin.com/ in the opened tab
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.linkedin.com/");

//    Create a new window
        //    Open https://clarusway.com/ in the opened window
        driver.switchTo().newWindow(WindowType.WINDOW).get("https://clarusway.com/");

//    Switch to the LinkedIn tab and write 'You found the LinkedIn tab' in the email area
        for (String w : driver.getWindowHandles()) {
            Thread.sleep(1000);
            driver.switchTo().window(w);
            if (driver.getCurrentUrl().contains("linkedin")) {
                driver.findElement(By.id("session_key")).sendKeys("You found the Linkedin tab");
                break;
            }
        }
    }
}
