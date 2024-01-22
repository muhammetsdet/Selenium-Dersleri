package Tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

import static org.junit.Assert.assertTrue;

/*
Given
    Go to https://demo.guru99.com/test/drag_drop.html
When
    Drag orange elements on proper boxes below
Then
    Verify they are dropped.
*/
public class Task14 extends TestBase {
    @Test
    public void dragTest(){
        //        Go to https://demo.guru99.com/test/drag_drop.html
driver.get("https://demo.guru99.com/test/drag_drop.html");
        Actions actions = new Actions(driver);

        List<WebElement> todosElement = driver.findElements(By.cssSelector("li[class='placeholder']"));

        WebElement debitSide = driver.findElement(By.xpath("//*[text()=' 5000 ']"));
        WebElement creditSide = driver.findElement(By.xpath("//*[text()=' 5000 ']"));
        WebElement bank = driver.findElement(By.id("credit2"));
        WebElement sales = driver.findElement(By.id("credit1"));

        actions
                .dragAndDrop(bank,todosElement.get(0))
                .dragAndDrop(debitSide,todosElement.get(1))
                .dragAndDrop(sales,todosElement.get(2))
                .dragAndDrop(creditSide,todosElement.get(3))
                .perform();

//        Verify they are dropped.
assertTrue(driver.findElement(By.xpath("//*[text()='Perfect!']")).isDisplayed());

    }

}
