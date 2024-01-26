public class A_Tricks {
    /*
***--> Selenium automates browsers. That's it! (Borwserlarımızı otomasyonla yönetmemizi sağlayan bir kütüphanedir.
***-->Maven bir Java derleme ve yönetim aracıdır. pom.xml dosyası ile dependency’leri yönetmemize yardımcı oluyor.
***-->JUnit açık kaynaklı  birim test aracıdır ve küçük/büyük kod birimlerini test etmemizi sağlar.
***-->XPath kısaca xml yolu olarak tanımlanır. Web sayfasındaki herhangi bir ögeyi bulmak için syntax veya dil diye biliriz.
***--> 6 Temel Junit notasyonu vardır. 1--@Test 2--@Before 3--@BeforeClass 4--@After 5--@AfterClass 6--@Ignore
***--> @Test @Ignore("Test 4 ignored: İstendiğinde bu alana parametre olarak testin ignore olma sebebini yazabiliriz")
   -->Method parantezleri olabildiğince kısa ve anlaşılabilir olur.
   -->Shift tab geri almak istediğimiz tüm satırları geri alır
   -->Ctrl + u tuşu sayfanın kaynak kodlarını gösterir
   -->Test methodları public void'dur ve parametreli olmaz.
   -->DRY=Don't Repeat Yourself WET=
   -->Before ve After da @Ignore olmuyor
   -->assertTrue static olduğu için import edilebilir.
   -->Assert.* ifadesi Assert clasındaki tüm methodları import eder.
*** -->Assert equals sadece değerleri karşılaştırır ancak assertSame referanslarıda karşılaştırır. new ile oluşturulan obje farklı referans değeri alan string olur.
   -->new keyword'ü ile String Pool dışında yeni bir obje ile yeni bir referans elde ettik.
***-->Placeholder :::> Kullanıcıya yol göstermek için iç kısımlara yazılan yerler. e mail kutusunun içinde e posta yazarak yol gösteren yazılardır.
   -->Absolute xPath'de hiyararşiyi takip ederek locate eidyoruz relative XPath'de istediğimiz tagden başlayabilir.
***-->Text'in atribute'u olmaz
***-->Bir web elementi class name ile bulmak istediğimizde atribute boşluk içerebileceği için çok tercih edilmez.
***-->Webdriver'daki tagname locator'ı div etiketi  a etketi vb. etiket adlarına sahip ögeleri tanımlamak için kullanılır. Çoğunlukla
      Webelementin bir listesini almak için kullanılır. Bu nedenle findelements() ile kullanılması önerilir.
***-->Link Text içeriği casesensitive'dir
   -->İki tür xPath vardır 1-->Absolute 2-->Relative. Absolute XPath'ın dezavantajı öğenin yolunda herhangi bir değişiklik yapılması durumunda xPath'ın başarısız olmasıdr.
***-->xPath eksenleri daha çok id,name,class olmadığında tercih edilir.
***-->Dropdown üzerinde işlem yapabilmek için select objesi oluşturmamız gerekir.
***-->İmplicitWait NoSuchElementException olduğu zaman işe yarar eğer eleman varsa ExplicitWait daha mantıklı
***-->Oluşturulan Wait objesi bir interface'dir
   -->Set'in içinde index yok ancak List'te index var
   -->Açık olan sayfadan başka bir sayfaya gitmek için driver.navigate.to(String Url)
***-->Interfacelerden obje üretilmiyor
   -->assert pElements.size()==42 diyerekte assert doğrulaması kullanılabilir.
   -->alt+f12 iç terminali açar
   -->ctrl+o Override edebileceğiniz metodları gösterir.
   -->CTRL + Right or Left → Kelimeler arası hızlıca dolaşırsınız
*** -->//input[@type='text' or @name='email'] --- //input[@type='text' and @name='email'] --- //input[contains(@type,'text')]
   Text:
    //tagname[.='text name’]  *** //span[.='Double click the block']
    //*[contains(text(),'piece of text’)]
    //*[text( )= 'text name’]
    //*[.='text name’]
   -->Faker.instance() static methodu ile obje oluşturmadan data üretilebilir.
   -->Robot class selenium haricidir direk bilgisayar mousunu kullanır.
   -->tabel//tbody//tr tbody içindeki tüm satırları yazdırır ancak tabel//tr yaparsak başlığıda dahil eder etmemesi için sadece body içindekini alırız.
   -->findelement içerisine yolu yanlış yazarsa exception fırlatır ancak findelements ise exception atmaz boş liste döndürür.
   -->//tbody/tr[1] böyle bir yazımda üsteki bir table'ın 1. satırını verir ancak //tbody/tr[2] bu ifade başka tek satırlık table'ı geçiş alttaki tablonun 1. satırını değill belirtilen 2. satırırnı verir
   çünkü üstte 2. satır olmadığı için lokasyon alttaki 2. satıra gider.
   -->webTable.findElement(By.xpath(".//tbody/tr[3]")); bu ifadedeki .//tbody/tr[3] kısmının noktası bu ilementten sonra devam et demektir. ve biz . (nokta) koymazsak elementten devam etmez baştaki ifadeye göre alır.
   -->Hiç bir ayarlama yapmazsak log4j fatal ve errror'u yazdırır.
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
   -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->
    -->



     */
}
