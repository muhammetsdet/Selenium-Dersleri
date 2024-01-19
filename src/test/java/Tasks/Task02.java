package Tasks;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {
    /*
     Create chrome driver object via WebDriverManager
     Maximize the window
     Open google home page https://www.google.com/
     Wait for 3 seconds
     Go to the https://www.youtube.com/
     Get the title and URL of the page
     Check if the title contains the word "YouTube" print console "Title contains YouTube" or "Title does not contain YouTube"
     Check if the URL contains the word "youtube" print console "URL contains youtube" or "URL does not contain youtube"
     Then go to https://www.instagram.com/
     Get the title and check if it contains the word "Instagram" and print "Title contains Instagram" or "Title does not contain Instagram"
     Navigate Back to the previous webpage
     Refresh the page
     Navigate to forward
     Wait for 3 seconds
     Close the browser
*/
    static WebDriver  driver=new ChromeDriver();

    @Test
    public void testGoogle() throws InterruptedException {
        driver.manage().window().maximize();
        // Open google home page https://www.google.com/
        driver.get("https://www.google.com/");
        Thread.sleep(3000);

        //Go to the https://www.youtube.com/
        driver.get("https://www.youtube.com/");
        Thread.sleep(3000);
        String currentYouTubeTitle=driver.getTitle();
        String currentYouTubeUrl=driver.getCurrentUrl();
        if (currentYouTubeTitle.contains("YouTube")){
            System.out.println("Title contains YouTube");
        }else{
            System.out.println("Title does not contain YouTube");
        }
        if (currentYouTubeUrl.contains("youtube")){
            System.out.println("URL contains youtube");
        }else{
            System.out.println("URL does not contain youtube");
        }

        //Then go to https://www.instagram.com/
        driver.get("https://www.instagram.com/");
        String currentInsTitle=driver.getTitle();

        if (currentInsTitle.contains("Instagram")){
            System.out.println("Title contains Instagram");
        }else{
            System.out.println("Title does not contain Instagram");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        Thread.sleep(3000);
        driver.quit();
    }

}
