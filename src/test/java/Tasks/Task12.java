package Tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.time.Duration;

/*
    Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
    Click all the buttons and verify they are all clicked
*/
public class Task12 extends TestBase {
    @Test
    public void allClick() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");
        for (int i = 2; i <13 ; i++) {
            driver.findElement(By.xpath("(//button[@id])["+i+"]")).click();

        }

    }
}
