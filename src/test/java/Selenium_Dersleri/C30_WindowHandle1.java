package Selenium_Dersleri;

import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C30_WindowHandle1 extends TestBase {
 @Test
    public void test01(){
     String firstWindowHandle=driver.getWindowHandle();
//    Create a new tab
     driver.switchTo().newWindow(WindowType.TAB);
     String secondWindowHandle=driver.getWindowHandle();
//    Create a new window
     driver.switchTo().newWindow(WindowType.WINDOW);
     String thirdWindowHandle=driver.getWindowHandle();

//    Open https://www.linkedin.com/ in the second tab
     //driver 3. sayfada olduğu için önce driver'ı ikinci tab'a switch yapmamız lazım.
driver.switchTo().window(secondWindowHandle);
driver.get("https://www.linkedin.com/");


//    Open https://clarusway.com/ in the last window
     //driver 2. tabde olduğu için yeni window için switch yapmamız gerekiyor.
     driver.switchTo().window(thirdWindowHandle);
     driver.get("https://clarusway.com/");

     //opende https://www.youtube.com/ in the first tab
     driver.switchTo().window(firstWindowHandle).get("https://www.youtube.com/");
     driver.switchTo().window(secondWindowHandle);//Önce açılan sayfaya geri geliyor

 }






}
