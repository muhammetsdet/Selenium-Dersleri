package Selenium_Dersleri;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class C26_BasicAuthentication {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void basicAuthenticationTest(){
//        Go to URL: https://the-internet.herokuapp.com/basic_auth
//        Username: admin
//        Password: admin
//        Syntax:  driver.get("https://USERNAME:PASSWORD@URL");
//        Authenticate using the above method and test data.
//        https://admin:admin@the-internet.herokuapp.com/basic_auth
//        Verify the congratulations message.
       /* admin: kullanıcı adı
                diğer admin şifre*/

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
String congratulations= driver.findElement(By.tagName("p")).getText();
assertTrue(congratulations.contains("Congratulations"));
    }

}
