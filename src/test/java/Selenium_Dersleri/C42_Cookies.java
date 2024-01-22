package Selenium_Dersleri;



import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class C42_Cookies extends TestBase {


    @Test
    public void cookiesTest(){

        //Go to URL: https://kitchen.applitools.com/ingredients/cookie
driver.get("https://kitchen.applitools.com/ingredients/cookie");

        //Print all the cookies.
Set<Cookie> allCookies=driver.manage().getCookies();
allCookies.forEach(System.out::println);

        //Get Cookie.
        System.out.println("--Get Cookie--");
        System.out.println("Protein Cookie: " + driver.manage().getCookieNamed("protein"));
        System.out.println("Get Value");
        System.out.println("Protein Cookie Value: " + driver.manage().getCookieNamed("protein").getValue());

        //Find the total number of cookies.
int totalNumberOfCookies=driver.manage().getCookies().size();
        System.out.println("totalNumberOfCookies = " + totalNumberOfCookies);
        //Add Cookie.
Cookie cookieSugar=new Cookie("Karbonhidrat","Sugar");
driver.manage().addCookie(cookieSugar);
        System.out.println("Sugar sonrası cookie sayısı: "+driver.manage().getCookies().size());
        //Edit Cookie.

        //Delete Cookie.
        driver.manage().deleteCookie(cookieSugar);
        System.out.println("Sugar silindikten sonra cookie sayısı: "+driver.manage().getCookies().size());

        //Delete All Cookies.
        driver.manage().deleteAllCookies();
        System.out.println("Tüm cookie silindikten sonra cookie sayısı: "+driver.manage().getCookies().size());
    }

}
