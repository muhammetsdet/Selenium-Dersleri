package Tasks;

import org.checkerframework.checker.fenum.qual.SwingTitleJustification;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import utilities.TestBase;

import java.time.Duration;

public class Task10 extends TestBase {
    @Test
    public void jsAlert() throws InterruptedException {
        //Go to https://webdriveruniversity.com/Popup-Alerts/index.html
        driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");

        //Click on JavaScript Alert
        driver.findElement(By.id("button1")).click();

        //Print alert message
        String alertMessage1 = driver.switchTo().alert().getText();
        System.out.println("alertMessage1 = " + alertMessage1);

        //Accept alert
        driver.switchTo().alert().accept();

        //Click on JavaScript Confirm Box
        driver.findElement(By.id("button4")).click();

        //Print alert message
        String alertMessage2 = driver.switchTo().alert().getText();
        System.out.println("alertMessage2 = " + alertMessage2);

        // Cancel alert
        driver.switchTo().alert().dismiss();

        //Click on Modal Popup Box
        driver.findElement(By.id("button2")).click();

        //Print alert message
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        String alertMessage3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']"))).getText();
        System.out.println("alertMessage3 = " + alertMessage3);

//        Close alert
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
    }

}
