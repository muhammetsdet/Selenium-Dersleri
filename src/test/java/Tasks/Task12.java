package Tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.time.Duration;

/*
    Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
    Click all the buttons and verify they are all clicked
*/
public class Task12 extends TestBase {
    @Test
    public void allClick() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");
        Actions action=new Actions(driver);

//        WebElement doubleClickBtn = driver.findElement(By.id("onclick"));
//        action.doubleClick(doubleClickBtn).perform();
//
//        driver.findElement(By.id("onblur")).click();
//
//Thread.sleep(2000);
//        WebElement rightClickBtn = driver.findElement(By.id("oncontextmenu"));
//        action.contextClick(rightClickBtn).perform();
//
//        WebElement doubleClick = driver.findElement(By.id("ondoubleclick"));
//        action.doubleClick(doubleClick).perform();
//
//        WebElement clickBtn = driver.findElement(By.id("onfocus"));
//        action.click(clickBtn).perform();
//
//        WebElement keyDown = driver.findElement(By.id("onkeydown"));
//        action.keyDown(keyDown, Keys.LEFT_SHIFT).perform();
//
//Thread.sleep(2000);
//        WebElement keyUp = driver.findElement(By.id("onkeyup"));
//        action.keyDown(keyUp, Keys.LEFT_SHIFT).perform();;
//
//Thread.sleep(2000);
//        WebElement keyPress = driver.findElement(By.id("onkeypress"));
//        action.keyDown(keyPress, Keys.INSERT).perform();
//        keyPress.click();


        for (int i = 2; i <13 ; i++) {
            driver.findElement(By.xpath("(//button[@id])["+i+"]")).click();

        }

    }
}
