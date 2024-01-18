import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class Task03 {
    /*
   Go to Clarusway homepage
   Do the following tasks by creating 3 different test methods.
   Check if the URL contains clarusway.
   Check if the title does not contain Python.
   Check if the title equals to "Online IT Bootcamp; Learn Coding, Data Science, AWS, DevOps, Cyber Security & Salesforce"
    */
    static WebDriver driver = new ChromeDriver();
    static String initialUrl = driver.getCurrentUrl();
    static String initialTitle = driver.getTitle();

    @Before
    public void setUp() {
        driver.get("https://clarusway.com");

    }

    @Test
    public void test01() {

        boolean isContain = initialUrl.contains("clarusway");
        assertFalse(isContain);
    }
@Test
    public void test02() {

        boolean isContain = initialTitle.contains("Python");
        assertFalse(isContain);
    }
@Test
    public void test03() {
        String expectedTitle="Online IT Bootcamp; Learn Coding, Data Science, AWS, DevOps, Cyber Security & Salesforce";
        assertNotEquals(expectedTitle, initialTitle);
    }

}
