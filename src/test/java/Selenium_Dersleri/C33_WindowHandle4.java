package Selenium_Dersleri;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class C33_WindowHandle4 extends TestBase {

    @Test
    public void test01() throws InterruptedException {

//    Go to https://testpages.eviltester.com/styled/windows-test.html
        driver.get("https://testpages.eviltester.com/styled/windows-test.html");

//    Click on Basic Ajax in new page
        driver.findElement(By.id("gobasicajax")).click();

//    Click on Code In
//        driver bir önceki sayfada kaldı bundan dolayı yeni sayfaya switch yapmamız gerekir.
        String page2WindowHandle = new ArrayList<>(driver.getWindowHandles()).get(1);
        driver.switchTo().window(page2WindowHandle);

        driver.findElement(By.name("submitbutton")).click();//Bu link yeni bir sayfa açıyor.

//    Assert that submit button is  'Code In It'
        String codeInIt = driver.findElement(By.id("_valuesubmitbutton")).getText();
        assertEquals("Code In It", codeInIt);
    }
    
}
