package Selenium_Dersleri;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class C27_iFrame {
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

    /*
    iFrame, bir HTML belgesinin içine gömülü bir HTML belgesidir.
    <iframe></iframe>
    iFrame, HTML'de bir etiketle tanımlanır.

    iFrame'ler arasında geçiş yapmamız gerektiğini anlamalıyız. iFrame'ler arasında geçiş yapmak için driver'ın switchTo().frame() komutunu kullanmalıyız.
    switchTo().frame() 'i üç şekilde kullanabiliriz.
    switchTo.frame (int frame Number)
    switchTo.frame (string frame Name Or Id)
    switchTo.frame (WebElement frame Element)

    switchTo.frame (int frame Number): iFrame index'ini yazıp driver'ın o iframe geçmesini sağlanabilir. iFrame index 0’dan başlar.
    driver.switchTo().frame(0);  0. indexteki iframe'e geçmek için  First frame
    driver.switchTo().frame(1);  1. indexteki iframe'e geçmek için   Second frame

    switchTo.frame (string frame Name Or Id): switchTo komutuna Name veya ID iletilip driver'ın o iframe geçmesini sağlanabilir.

    switchTo.frame (WebElement frame Element): WebElement kullanarak geçiş yapmak en esnek seçenektir. Tercih edilen locator ile WebElement kullanarak frame bulanabilir ve ona geçiş yapılabilir.

    driver.switchTo( ).parentFrame( ); 1 üst seviyedeki frame çıkartır.
    driver.switchTo( ).defaultContent( ); En üstteki frame çıkmak için kullanılır.
*/


/*
    Go to URL: https://the-internet.herokuapp.com/iframe
    Verify the Bolded text contains "Editor"
    Locate the text box
    Delete the text in the text box
    Type "Hi everyone"
    Verify the text Elemental Selenium text is displayed on the page.
 */

    @Test
    public void iFrameTest() throws InterruptedException {

//        Go to URL: https://the-internet.herokuapp.com/iframe
        driver.get("https://the-internet.herokuapp.com/iframe");

//        Verify the Bolded text contains “Editor”
        assertTrue(driver.findElement(By.tagName("h3")).getText().contains("Editor"));

//        Locate the text box
        //iFrame'e geçiş işlemi 3 farklı yol ile yapılabilir
        //1.Yol index ile 2.Yol Id ile 3.Yol WebElement ile

        driver.switchTo().frame(0);//index ile 1.YOl

        //driver.switchTo().frame("mce_0_ifr");//id ile 2.Yol

//        WebElement iFrameWebElement=driver.findElement(By.xpath("//iframe[@title='Rich Text Area']"));
//        driver.switchTo().frame(iFrameWebElement);//WebElement ile 3.Yol

        WebElement textBox = driver.findElement(By.id("tinymce"));//Text box bir iFrame içinde bulunduğundan


//        Delete the text in the text box
        Thread.sleep(2000);
        textBox.clear();
//        Type “Hi everyone”
        Thread.sleep(2000);
        textBox.sendKeys("Hi everyone");

//        Verify the text Elemental Selenium text is displayed on the page.
        driver.switchTo().parentFrame();
       // driver.switchTo().defaultContent();

        assertTrue(driver.findElement(By.linkText("Elemental Selenium")).isDisplayed());//Bu element ilk açılan sayfa içerisinde bulunduğu için driver'ı buraya geri getirmemiz gerekir.
     //Sayfadaki iframe sayısı

      int numberOfiFrames=  driver.findElements(By.xpath("//iframe")).size();
        System.out.println("numberOfiFrames = " + numberOfiFrames);

        //automationeexercise sayfasındaki iFrame sayısı:
        driver.get("https://automationexercise.com/");
       int numberOfiFrameAuto= driver.findElements(By.xpath("//iframe")).size();
        System.out.println("numberOfiFrameAuto = " + numberOfiFrameAuto);
        driver.get("https://edition.cnn.com/");
        int numberOfiFrameCnn= driver.findElements(By.xpath("//iframe")).size();
        System.out.println("numberOfiFrameCnn = " + numberOfiFrameCnn);
    }

}
