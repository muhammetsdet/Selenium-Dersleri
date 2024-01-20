package TeamTasks;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Tas10 extends TestBase {
    @Test
    public void automate(){

        driver.get("https://automationexercise.com/");
driver.findElement(By.cssSelector("i[class='fa fa-home']"));
driver.findElement(By.xpath("//*[text()=' Products']"));
driver.findElement(By.xpath("//*[text()=' Cart']"));
driver.findElement(By.xpath("//*[text()=' Signup / Login']"));
driver.findElement(By.xpath("//*[text()=' Test Cases']"));
driver.findElement(By.xpath("//*[text()=' API Testing']"));
driver.findElement(By.xpath("//*[text()=' Video Tutorials']"));
driver.findElement(By.cssSelector("i[class='fa fa-envelope']"));
    }

}
