package Selenium_Dersleri;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class C55_Log4J {
    /*
        - All: Günlük kaydını açar ve her şeyi günlüğe kaydeder.
        - DEBUG: Hata ayıklama bilgilerini yazdırır ve geliştirme aşamasında yardımcı olur.
        - INFO: Uygulamanın ilerleyişini vurgulayan bilgi mesajları yazdırır.
        - WARN: Hatalı ve beklenmeyen sistem davranışıyla ilgili bilgileri yazdırır.
        - ERROR: Sistemin devam etmesine izin verebilecek bir hata mesajı yazdırır.
        - FATAL: Uygulamanın çökmesine neden olan sistemin kritik bilgilerini yazdırır.
        - OFF: Kayıt yapılmaz, yani hiçbir şey günlüğe kaydedilmez.
    */
    @Test
    public void log4JTest() {

        Logger logger = LogManager.getLogger(C55_Log4J.class.getName());
        logger.fatal("Fatal Message");// --> Default olarak ayarlama gerektirmeden yazdırılır.
        logger.error("Error Message");// --> Default olarak ayarlama gerektirmeden yazdırılır.
        logger.warn("Warn Message");//Yazdırılması için ayarlama yapılması gerekir.
        logger.info("Info Message");//Yadırılması için ayarlama yapılması gerekir.
        logger.debug("Debug Message");//Yadırılması için ayarlama yapılması gerekir.
        logger.trace("Trace Message");//Yadırılması için ayarlama yapılması gerekir.



    }

}
