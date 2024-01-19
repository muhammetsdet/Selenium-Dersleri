package Selenium_Dersleri;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C11_LocatorPractice2 {
    /*
    //https://id.heroku.com/login sayfasına gidiniz.
    //Bir mail adresi giriniz.
    //Bir password giriniz.
    //Login butonuna tıklayınız.
    //"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
    //Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
    //Tüm sayfaları kapatınız.
*/
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
    public void test01() throws InterruptedException {
    //https://id.heroku.com/login sayfasına gidiniz.
    driver.get("https://id.heroku.com/login");

    //Bir mail adresi giriniz.
    driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
    //Bir password giriniz.
    driver.findElement(By.id("password")).sendKeys("123");
    //Login butonuna tıklayınız.
    driver.findElement(By.name("commit")).click();
    Thread.sleep(2000);
    //"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
   boolean isDisplayed= driver.findElement(By.xpath("//div[@role='alert']")).isDisplayed();
    System.out.println("isDisplayed = " + isDisplayed);

    //Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
    if (isDisplayed){
        System.out.println("Kayıt yapılamadı");
    }else{
        System.out.println("Kayıt Yapıldı");
    }
    //Tüm sayfaları kapatınız.

}

}
