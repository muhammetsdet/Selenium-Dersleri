package Tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Task08 extends TestBase {

    @Test
    public void checkBoxChecked() {
        //Go to URL: https://app.endtest.io/guides/docs/how-to-test-checkboxes/
        driver.get("https://app.endtest.io/guides/docs/how-to-test-checkboxes/");

//        Select all checkboxes
        WebElement box1 = driver.findElement(By.id("pet1"));
        WebElement box2 = driver.findElement(By.id("pet2"));//This is default so unChecked
        WebElement box3 = driver.findElement(By.id("pet3"));
box1.click();
box2.click();
box3.click();
//        Assert that they are all selected
        if (box1.isSelected() && box2.isSelected() && box3.isSelected()) {
            System.out.println("All checkboxes are selected.");
        } else {
            System.out.println("Not all checkboxes are selected.");
        }
    }
}

/*
    @Test
    public void test(){
        driver.get("https://app.endtest.io/guides/docs/how-to-test-checkboxes/");
        List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        checkboxes.stream().filter(t->!t.isSelected()).forEach(t->t.click());
		for (WebElement w:checkboxes) {assertTrue(w.isSelected());}

    }
 */
