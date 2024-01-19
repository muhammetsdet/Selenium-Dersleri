package TeamTasks;

import org.junit.Test;
import utilities.TestBase;

public class Task02 extends TestBase {
    @Test
    public void Tc02(){
        driver.get("https://www.yahoo.com");
        driver.get("http://www.amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
