package Selenium_Dersleri;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C10_LocatorPractice1 {
    /*
   Create the driver with BeforeClass and make it static inside the class.
   Go to http://www.google.com
   Type "Green Mile" in the search box and print the number of results.
   Type "Premonition" in the search box and print the number of results.
   Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
   Close with AfterClass.
*/
    private static WebDriver driver;
    WebElement searcBox;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1() {
        // Type "Green Mile" in the search box and print the number of results.
        searcBox.sendKeys("Green Mile");

    }

    @Test
    public void test2() {
        // Type "Premonition" in the search box and print the number of results.
        searcBox.sendKeys("Premonition");

    }

    @Test
    public void test3() {
        //  Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
        searcBox.sendKeys("The Curious Case of Benjamin Button");

    }

    @Test
    public void test4() {
        //  Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
        searcBox.sendKeys("The Matrix");
    }
    @Test
    public void test5() {
        //  Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
        searcBox.sendKeys("Inception");
    }
        @Before
        public void beforeMethod () {
            driver.get("https://google.com");
            searcBox = driver.findElement(By.xpath("//textarea[@name='q']"));

        }
        @After
        public void afterMethod () {
            searcBox.submit();
            String result = driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
            System.out.println("result = " + result);
        }

    }

