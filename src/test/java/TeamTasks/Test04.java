package TeamTasks;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;

public class Test04 extends TestBase {
    @Test
    public void Tc04() {
        driver.get("https://www.w3schools.com/");
        Point positionOfWeb = driver.manage().window().getPosition();
        Dimension sizeOfWeb = driver.manage().window().getSize();
        System.out.println("positionOfWeb= " + positionOfWeb + "   sizeOfWeb=" + sizeOfWeb);
        driver.manage().window().setPosition(new Point(8, 13));
        driver.manage().window().setSize(new Dimension(902, 751));

        Point setPotion = driver.manage().window().getPosition();
        Dimension setSize = driver.manage().window().getSize();


        System.out.println("setSize=" + setSize + "   setPotion=" + setPotion);

    }

}