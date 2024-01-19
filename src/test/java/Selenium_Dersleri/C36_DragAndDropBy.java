package Selenium_Dersleri;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;

public class C36_DragAndDropBy extends TestBase {
    @Test
    public void test01() {
        //Go to URL: https://rangeslider.js.org/
        driver.get("https://rangeslider.js.org/");


//Shift 100 units to the right and 100 units to the left on the horizontal axis.
        WebElement slider = driver.findElement(By.xpath("//div[@class='rangeslider__handle'][1]"));

        Actions action =new Actions(driver);
        String unit1=driver.findElement(By.id("js-output")).getText();

        action.dragAndDropBy(slider,55,0).perform();
String unit2=driver.findElement(By.id("js-output")).getText();
assertEquals(unit1,unit2);

    }
}
