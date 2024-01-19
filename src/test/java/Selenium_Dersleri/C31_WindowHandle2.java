package Selenium_Dersleri;

import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class C31_WindowHandle2 extends TestBase {
    @Test
    public void test01(){

//    Open https://www.youtube.com/
        driver.get("https://www.youtube.com/");
//    Create a new tab
        //    Open https://www.linkedin.com/ in the opened tab
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.linkedin.com/");

    //Switch to first tab without getting its windowhandle
 Set<String> windowsHandles=driver.getWindowHandles();
 String currentPageWindowHandle=driver.getWindowHandle();


 for (String w:windowsHandles){

     if (!w.equals(currentPageWindowHandle)){//eğer setten gelen direverın bulunduğu sayfanın değerine eşit değilse diğer sayfaya geç demektir.
         driver.switchTo().window(w);
     }
 }

        System.out.println(driver.getTitle());
 assertEquals("YouTube",driver.getTitle());


 //2.Yol:
        List<String> windowHandelList=new ArrayList<>(driver.getWindowHandles());//Set içindeki elemanlı index tutan ArrayList içine aktarıyoruz
        driver.switchTo().window(windowHandelList.get(0));
        assertEquals("YouTube",driver.getTitle());
    }

}
