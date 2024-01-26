package Selenium_Dersleri;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C54_WebTables02 extends TestBase{
//Go to URL: http://demo.guru99.com/test/web-table-element.php
//To find first row of table
//To get 3rd row's 3rd column data
//Get all the values of a Dynamic Table

    @Test//Bir web table'ı locate edip içindeki row ve cell değerlerine bu web element ile ulaşabiliriz
    public void webTableTest() {
        //Go to URL: http://demo.guru99.com/test/web-table-element.php
driver.get("http://demo.guru99.com/test/web-table-element.php");

//To find first row of table
WebElement webTable=driver.findElement(By.xpath("//table[@class='dataTable']"));
WebElement row1=webTable.findElement(By.xpath(".//tbody/tr[1]")); // . (nokta) işareti locate edilen web elemnet üzerinden devam et anlamı taşır.
        System.out.println("row1 = " + row1.getText());

//To get 3rd row's 3rd column data
WebElement row3cell3=webTable.findElement(By.xpath("./tbody/tr[3]/td[3]"));
        System.out.println("row3cell3 = " + row3cell3.getText());

//Get all the values of a Dynamic Table
List<WebElement> tableRows=webTable.findElements(By.xpath(".//tr"));
for (WebElement w : tableRows){
    System.out.println(w.getText());
List<WebElement> rowCells=w.findElements(By.xpath(".//td"));

for (WebElement u: rowCells){
    System.out.println(u.getText());

}

}

    }
}
