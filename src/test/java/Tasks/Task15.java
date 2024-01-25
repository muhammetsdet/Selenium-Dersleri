package Tasks;

import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

/*
  Go to http://szimek.github.io/signature_pad/
  Draw the line or shape you want on the screen
  Press the clear button after drawing
*/
public class Task15 extends TestBase {
@Test
    public void draw(){
    //Go to http://szimek.github.io/signature_pad/
    driver.get(" http://szimek.github.io/signature_pad/");
    WebElement canvas=driver.findElement(By.cssSelector("canvas[width='831']"));
    WebElement backgroundCloro=driver.findElement(By.xpath("//*[text()='Change background color']"));
    WebElement undo=driver.findElement(By.xpath("//*[text()='Undo']"));
    //Draw the line or shape you want on the screen
    Actions action=new Actions(driver);
    action
            .moveToElement(backgroundCloro).click()
            .release()
            .moveToElement(canvas).click()
            .clickAndHold()
            .moveToElement(undo)
            .release()
            .moveToElement(canvas).click()
            .moveByOffset(50,0)
            .moveByOffset(0, -50).release().perform();


}

}
