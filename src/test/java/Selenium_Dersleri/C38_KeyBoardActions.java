package Selenium_Dersleri;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C38_KeyBoardActions extends TestBase {

    //Go to URL: https://testpages.eviltester.com/styled/basic-html-form-test.html
    //In the username section, print "John" by using the action methods.

    @Test
    public void keyBoardActionsTest(){
        //Go to URL: https://testpages.eviltester.com/styled/basic-html-form-test.html
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");

        //In the username section, print "John" by using the action methods.
        Actions actions=new Actions(driver);
       WebElement userName= driver.findElement(By.name("username"));
        actions
                .click(userName)
                .keyDown(Keys.SHIFT)//Shift tuşuna basılı tutar
                .sendKeys("j")//Shift basılı iken j harfinin girer
                .keyUp(Keys.SHIFT)//Shifte basmayı durdurur
                .sendKeys("ohn")//Shifte basılmazken ohn harflerini girer
                .sendKeys(Keys.ENTER)//Enter'a basar
                .perform();

    }

}
