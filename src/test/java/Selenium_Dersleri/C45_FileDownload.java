package Selenium_Dersleri;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.*;

public class C45_FileDownload extends TestBase {
    //    Go to URL: https://the-internet.herokuapp.com/download
//    Download selenium-snapshot.png
//    Verify if the file downloaded successfully.
    @Test
    public void tes01() throws InterruptedException {
        //    Go to URL: https://the-internet.herokuapp.com/download
        driver.get("https://the-internet.herokuapp.com/download");
//    Download selenium-snapshot.png
driver.findElement(By.linkText("selenium-snapshot.png")).click();
Thread.sleep(500);
//    Verify if the file downloaded successfully.
       boolean isDownload= Files.exists(Path.of(System.getProperty("user.home")+"/Downloads/selenium-snapshot.png"));
       assertTrue(isDownload);
    }

}
