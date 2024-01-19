package TeamTasks;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Task01 extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        driver.navigate().to("https://www.w3schools.com/");
        driver.navigate().to("http://stackoverflow.com/");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
}
