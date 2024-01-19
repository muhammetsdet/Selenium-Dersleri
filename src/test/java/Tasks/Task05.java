package Tasks;

import com.github.javafaker.Faker;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task05 {
    /*
   Go to https://thinking-tester-contact-list.herokuapp.com/
   Create a user
   Sing in Application
   Add 5 contacts
*/
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        //driver.quit();
    }

    @Test
    public void createUser() throws InterruptedException {
//        Go to https://thinking-tester-contact-list.herokuapp.com/
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
//        Create a user
        driver.findElement(By.id("signup")).click();

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Muhammet");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Salah");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("liverpoolSalah3333@gmail.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("salah33");

        driver.findElement(By.id("submit")).click();
        addContact();


    }

    private void addContact() {
        Faker faker = new Faker();
        driver.findElement(By.id("add-contact")).click();
        //driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys(faker.name().firstName());
        driver.findElement(By.id("firstName")).sendKeys(faker.name().firstName());
        driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys(faker.name().lastName());
        // driver.findElement(By.cssSelector("input[id='birthdate']")).sendKeys(faker.date().birthday());//kabul etmiyor neden?
        driver.findElement(By.cssSelector("input[id='birthdate']")).sendKeys("1994-04-02");
        driver.findElement(By.cssSelector("input[id='email']")).sendKeys(faker.internet().emailAddress());
       driver.findElement(By.cssSelector("input[id='phone']")).sendKeys(faker.phoneNumber().phoneNumber().substring(10));//Nasıl sınırlama getirebiliriz
        driver.findElement(By.cssSelector("input[id='phone']")).sendKeys("123456987");
        driver.findElement(By.cssSelector("input[id='street1']")).sendKeys(faker.address().streetAddress());
        driver.findElement(By.cssSelector("input[id='street2']")).sendKeys(faker.address().streetAddress());
        driver.findElement(By.cssSelector("input[id='city']")).sendKeys(faker.address().city());
        driver.findElement(By.cssSelector("input[id='stateProvince']")).sendKeys(faker.address().state());
        driver.findElement(By.cssSelector("input[id='postalCode']")).sendKeys(faker.address().zipCode());
        driver.findElement(By.cssSelector("input[id='country']")).sendKeys(faker.address().country());
        driver.findElement(By.id("submit")).click();

    }
}
