package Selenium_Dersleri;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;//* ifadesi hepsini kapsıyor


public class C05_AssertionMethods {

    @Test
    public void assertEqualsTeset(){
/* Assert.assertEquals("Expected Result","Actual Result");   buradaki expected ile actual birbirine eşit ise test geçer, değil ise test kalır.
         .assertEquals() metodu iki tane parametre kabul eder. Parametreleri karşılaştırma yapar.
         1'inci parametre expected, 2'nci parametre ise actual result içindir
        3 parametreli kullanıldığı zaman birinci parametreye failure mesajı konulabilir */
        String greet="Hello World";
        assertEquals("Hello World", greet);
       // Assert.assertEquals("String değerler birbirine uymadı","Hello world", greet);
    }
    @Test
    public void assertTrueTest() {
       /* Assert.assertTrue(); burada () parantez içindeki değer true ise test geçer, değilse test fail olur
         .assertTrue() metodunun parantez içindeki değer true dönerse,test geçer, false dönerse test kalır
         Bir testten true sonucunu bekliyorsak .assertTrue() kullanırız. Yani pozitif senoryalarda.
         Bir testten false sonucunu bekliyorsak .assertFalse() kullanırız. Yani negatif senaryolarda.
        2 parametreli kullanıldığı zaman birinci parametreye failure mesajı konulabilir*/

        boolean condition=1<3;//"Hello".contains("lo"); dersek de true döner test geçer.
    assertTrue(condition);
    }
@Test
    public void assertFalseTest(){
        boolean condition= "Hello".contains("la");
        assertFalse(condition);
    assertFalse("Condition True döndü(beklenen false idi ve false döndüğü için true oldu) test geçti",1==2);
}
@Test
    public void assertNullTest(){
    //Assert.assertNull() metodunun parantez içindeki değeri null ise test geçer, aksi taktirde fail olur
        String condition=null;
        assertNull(condition);
}
    @Test
    public void assertNotNullTest(){
        //Assert.assertNotNull() metodunun parantez içindeki değeri null DEĞİL ise test geçer, null is fail olur
        String condition="";
        assertNotNull(condition);
    }
    @Test
    public void assertSameTest() {
        /*Assert.assertSame() metodu içindeki 2 değerin referansları karşılaştırır.
                 Aynı referanslara sahiplerse, test geçer, değillerse test kalır*/

        String name1 = "John";
        String name2 = "John";
        String name3=new String ("john");
    assertSame(name1,name2);
  //  assertSame(name1,name3);//Referansları farklı olduğu için test geçmedi demektir
    }
    @Test
    public void assertNotSameTest(){

        // Assert.assertNotSame() metodu içindeki 2 değerin referansları karşılaştırır.
        // Farklı referanslara sahiplerse, test geçer, aksi taktirde test kalır

        String name1 = "John";
        String name2 = "John";
        String name3 = new String("John");// new keyword'ü ile String Pool dışında yeni bir obje ile yeni bir referans elde ettik.

        assertNotSame(name1, name3); // --> Geçer
        assertNotSame(name1, name2); // --> Kalır

    }


}
