package Tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.nio.file.WatchEvent;

import static org.junit.Assert.assertTrue;

public class Task13 extends TestBase {

    @Test
    public void test01() throws InterruptedException {
// Go to URL: https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html
        driver.get("https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html");
        String number=driver.findElement(By.id("sliderOutput2")).getText();

        // Shift 34 units to the up and 34 units to the down on the vertical axis.
        Actions action =new Actions(driver);
WebElement sliderUpDown=driver.findElement(By.xpath("//div[@data-options='display_selector:#sliderOutput2;vertical:true;']"));
        action.dragAndDropBy(sliderUpDown,0,-59).perform();

        String num1=driver.findElement(By.id("sliderOutput2")).getText();
        System.out.println(num1);

        action.dragAndDropBy(sliderUpDown,0,62).perform();
        String num2=driver.findElement(By.id("sliderOutput2")).getText();
        System.out.println(num2);

       assertTrue(number.equals("50") && num1.equals("84") && num2.equals("16"));

    }
}
