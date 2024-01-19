package Selenium_Dersleri;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class C03_Annotations {
    /*
    *** ANNOTATIONS ***
    6 Temel Junit notasyonu vardır.
    @Test: Bağımsız olarak çalışabilecek bir test oluşturmamızı sağlar. Return type -> void Access modifier: Public
    @Before : Test başlamadan önce yapılması gereken hazırlıkları yaptığımız method için kullanılır. Her method'dan önce çalışır.
    @After : Her testten sonra çalışır, test yapıldıktan sonra kapatma gibi fonksiyonları yerine getirir.
    @Ignore : Yazıldığı method’ un çalıştırılmamasını sağlar. Test calistirildiginda bu method’ un Ignore olduğu raporda görünür.
*/

    @Before
public void before(){
    System.out.println("Before Methodu");
}
    @After
    public void after(){
        System.out.println("After Methodu");
    }

    @Test
    public void test01(){
        System.out.println("Test 1");
    }

    @Test
    public void test02(){
        System.out.println("Test 2");
    }
    @Test
    public void test03(){
        System.out.println("Test 3");
    }
    @Test @Ignore("Test 4 ignored: İstendiğinde bu alana parametre olarak testin ignore olma sebebini yazabiliriz")
    public void test04(){
        System.out.println("Test 4");
    }
    @Test
    public void test05(){
        System.out.println("Test 5");
    }

}
