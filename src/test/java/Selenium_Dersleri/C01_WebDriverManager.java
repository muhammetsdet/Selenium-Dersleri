package Selenium_Dersleri;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverManager {
    /*
Maven:
Java Tabanlı Projeye bağımlılığı yönetmenin bir yoludur.
Projenin kalbidir.
• Maven, büyük projeler üzerinde çalışırken POM (Project Object Model) ile proje oluştururken kullanılabilir.
• Birden çok IDE (IntelliJ, Eclipse, vs.) ile çalışır.
• Maven bir Java derleme ve yönetim aracıdır.
• Maven ile tüm otomasyon sürecini yönetmek için maven projesi oluşturabilirsiniz.
• Maven, pom.xml dosyası ile dependency’leri yönetmemize yardımcı oluyor.
• Maven, Java uygulamalarını derlememize, çalıştırmamıza ve dağıtmamıza yardımcı oluyor.
• Ant ve Gradle gibi başka araçlar da var ancak Maven en popüler olanıdır.
*/
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();//Selenium 4.6 öncesi direkt olarak selenium kütüphanesi ile dirver objesi oluşturulamıyordu.
        driver.get("https://clarusway.com");
        driver.quit();
    }
}
