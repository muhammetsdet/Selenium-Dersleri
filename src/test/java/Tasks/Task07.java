package Tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Task07 extends TestBase {
    @Test
    public void testpPTag(){

//  Go to https://testpages.eviltester.com/styled/find-by-playground-test.html
        driver.get("https://testpages.eviltester.com/styled/find-by-playground-test.html");

//  Assert that there are 42 web elements with 'p' tag on the page
      List<WebElement> pTag=driver.findElements(By.tagName("p"));
      assertEquals("There are not as many 'p' Tags as requested on the website.",42, pTag.size());
        //assert pTag.size()==42;
    }
}
