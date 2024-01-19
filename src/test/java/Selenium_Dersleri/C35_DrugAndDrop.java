package Selenium_Dersleri;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C35_DrugAndDrop extends TestBase {

    @Test
    public void test01() {

        // Go to URL: http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions actions = new Actions(driver);

        // Fill in capitals by country.
        //source elementler
        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement stockholm = driver.findElement(By.id("box2"));
        WebElement washingten = driver.findElement(By.id("box3"));
        WebElement copnehagen = driver.findElement(By.id("box4"));
        WebElement seul = driver.findElement(By.id("box5"));
        WebElement rome = driver.findElement(By.id("box6"));
        WebElement madrid = driver.findElement(By.id("box7"));

        //Target elementler
        WebElement norway = driver.findElement(By.id("box101"));
        WebElement sweden = driver.findElement(By.id("box102"));
        WebElement usa = driver.findElement(By.id("box103"));
        WebElement denmark = driver.findElement(By.id("box104"));
        WebElement southKorea = driver.findElement(By.id("box105"));
        WebElement itlay = driver.findElement(By.id("box106"));
        WebElement spain = driver.findElement(By.id("box107"));

        actions
                .dragAndDrop(oslo, norway)
                .dragAndDrop(stockholm, sweden)
                .dragAndDrop(washingten, usa)
                .dragAndDrop(copnehagen, denmark)
                .dragAndDrop(seul, southKorea)
                .dragAndDrop(rome, itlay)
                .dragAndDrop(madrid, spain)
                .perform();


    }


}
