package TeamTasks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utilities.TestBase;

import static org.junit.Assert.*;

public class Task07 extends TestBase {

    @Before
    public  void before() {
        driver.get("https://youtube.com/");
        for (int i = 1; i <4; i++){
            System.out.println(i+".Test Calisiyor");
        }
    }
    @After
    public  void after() {
        System.out.println("Test Bitti");
    }

    @Test
    public void getCurrentUrl () {
        assertTrue(driver.getCurrentUrl().contains("youtube"));

    }

    @Test
    public void getTitle () {

       assertFalse(driver.getTitle().contains("Video"));

    }

    @Test
    public void getPageSource () {
        assertTrue(driver.getPageSource().contains("youtube"));

    }

}
