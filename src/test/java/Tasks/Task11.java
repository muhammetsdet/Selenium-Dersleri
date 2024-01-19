package Tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;




public class Task11 extends TestBase {
    @Test
    public void todoList() throws InterruptedException {
        //Go to http://webdriveruniversity.com/To-Do-List/index.html
        driver.get("http://webdriveruniversity.com/To-Do-List/index.html");

        //Add todos: (Prepare breakfast, Wash the dishes, Take care of baby, Help your kid's homework, Study Selenium, Sleep)
WebElement todos=driver.findElement(By.cssSelector("input[placeholder='Add new todo']"));
todos.sendKeys("Prepare breakfast, Wash the dishes, Take care of baby, Help your kid's homework, Study Selenium, Sleep");
        Actions actions = new Actions(driver);
        actions.click(todos);
        todos.sendKeys(Keys.ENTER);

       // Strikethrough all todos.(Üzerlerini çiziniz)
        WebElement container = driver.findElement(By.id("container"));
        List<WebElement> todosElement = container.findElements(By.tagName("li"));
        for (WebElement todoList : todosElement) {
            System.out.println("Todo List: " + todoList.getText());
            actions.moveToElement(todoList).click().perform();
        }

//driver.findElement(By.xpath("(//li[contains(@id, '')])[4]")).click();


        //Delete all todos.


//        Assert that all todos deleted.


    }

}