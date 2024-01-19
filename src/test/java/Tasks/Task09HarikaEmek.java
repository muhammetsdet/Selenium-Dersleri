package Tasks;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import static org.junit.Assert.assertTrue;

public class Task09HarikaEmek extends TestBase {

    @Test
    public void mathOperation() throws InterruptedException {
        Faker faker = new Faker();
//        Go to https://testpages.eviltester.com/styled/calculator
        //        Get the result--- Verify the result---Print the result

        for (int i = 0; i < 4; i++) {
            driver.get("https://testpages.eviltester.com/styled/calculator");
            WebElement calculate = driver.findElement(By.id("function"));
            Select select = new Select(calculate);

            int fakeNum1 = (int) faker.number().randomNumber();
            int fakeNum2 = (int) faker.number().randomNumber();

            driver.findElement(By.id("number1")).sendKeys("" + fakeNum1 + "");
            driver.findElement(By.id("number2")).sendKeys("" + fakeNum2 + "");

            select.selectByIndex(i);

            driver.findElement(By.id("calculate")).click();
            int plus=fakeNum1+fakeNum2;
            int times=fakeNum1*fakeNum2;
            int minus=fakeNum1-fakeNum2;
            int divide=fakeNum1/fakeNum2;
            String result = driver.findElement(By.id("answer")).getText();

         switch (i) {
             case 0:if ((fakeNum1+fakeNum2)==plus){
                 System.out.println("plus is true= " + result);
             }else{
                 System.out.println("The results are different");
             }
                 break;
             case 1:if ((fakeNum1*fakeNum2)==times){
                 System.out.println("times is true= " + result);
             }else{
                 System.out.println("The results are different");
             }break;
             case 2:if ((fakeNum1-fakeNum2)==minus){
                 System.out.println("minus true= " + result);
             }else{
                 System.out.println("The results are different");
             }break;
             case 3:if ((fakeNum1/fakeNum2)==divide){
                 System.out.println("divide is true= " + result);
             }else{
                 System.out.println("The results are different");
             }break;
         }

        }

    }
}


/*
   if (i == 0) {
                System.out.println("plus = " + result);
            } else if (i == 1) {
                System.out.println("times " + result);
            } else if (i == 2) {
                System.out.println("minus " + result);
            } else if (i == 3) {
                System.out.println("divide " + result);
            }

 */
