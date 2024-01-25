package Selenium_Dersleri;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.*;

public class C44_FileExist {
    /*
    Bilgisayarimizdaki bir dosyanin varligini test etmek icin once o dosyaya ulasmamiz gerekir
    Java da dosyay erismek icin dosya yoluna -pathine ihitiyacimiz vardir
    Her bilgisayarin kullanici adi farkli olacagindan masaustu dosya yolu da birbirinden farkl, olacaktir..
    Testlerimizin tum bilgisayarda calismasi icin dosya yolunu DİNAMİK yapmak zorundayiz..

    Files.exists(Paths.get (filePath)); Bilgisayarınızda dosyanın olup olmadığını kontrol eder.
*/
    @Test
    public void test01(){
        //Masa üstünde kayıtlı Flower.bmp dosyasının var olup olmadığını test eden kod:
        String userHome= System.getProperty("user.home");
        System.out.println("userHome = " + userHome);
boolean isFileExist = Files.exists(Path.of(userHome+"/Desktop/Flower.bmp"));
assertTrue("File does not exist", isFileExist);


//Masa üstünde bir dosyanın var olmadığını test eden kod:
     boolean isBirdExist= Files.exists(Path.of(userHome+"/Desktop/Bird.bmp"));
        assertTrue(isBirdExist);
    }
    @Test
    public void test02(){
        //Porjede kayıtlı Addresses.txt dosyasının varlığını test eden kod:

      boolean isFileExist=  Files.exists(Path.of(System.getProperty("user.dir")+"\\Addresses.txt"));
        assertTrue(isFileExist);
        System.out.println("System.getProperty(\"user.dir\") = " + System.getProperty("user.dir"));

    }

}
