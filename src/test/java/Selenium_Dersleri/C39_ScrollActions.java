package Selenium_Dersleri;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C39_ScrollActions extends TestBase {
    //Go to URL: https://clarusway.com/
    //By using PAGE_UP, PAGE_DOWN, ARROW_UP, ARROW_DOWN
    //use actions scroll the page
    //scroll down
    //scroll up.
    @Test
    public void scrollTest(){
        //Go to URL: https://clarusway.com/
driver.get("https://clarusway.com/");
        //By using PAGE_UP, PAGE_DOWN, ARROW_UP, ARROW_DOWN
        Actions actions=new Actions(driver);

        //use actions scroll the page

        //scroll down
actions
        .sendKeys(Keys.PAGE_DOWN)
        .pause(3000)
        .sendKeys(Keys.ARROW_DOWN)

        //scroll up.
        .sendKeys(Keys.PAGE_UP)
        .pause(3000)
        .sendKeys(Keys.ARROW_UP)

        .perform();

    }



}
