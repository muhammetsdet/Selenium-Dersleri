package Deneme;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

public class Deneme extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

        List<WebElement> buttons =driver.findElements(By.xpath("//button[contains(@class, 'click-button')]"));
        Actions actions = new Actions(driver);
        for (int i = buttons.size()-1; i >=1 ; i--) {

            actions
                    .click(buttons.get(i))
                    .sendKeys(Keys.TAB)
                    .contextClick(buttons.get(i))
                    .doubleClick(buttons.get(i))
                    .sendKeys(Keys.RETURN)
                    .perform();

            buttons.get(i-1).click();//Click RESET button

        }
    }
}
