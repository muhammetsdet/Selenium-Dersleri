package Selenium_Dersleri;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C20_FakerClass {
    //Java Faker: Sahte data üretmek için kullanılır.
    @Test
    public void fakerClassTest(){
        //Faker objesi oluştur
   Faker faker= new Faker();

   //Objeyi kullanarak fake data üret
        //Firstname
       String firstName= faker.name().firstName();
        System.out.println("firstName = " + firstName);
       String lastName= faker.name().lastName();
        System.out.println("lastName = " + lastName);
        System.out.println(firstName + " "+lastName);
        String fullName= faker.name().fullName();
        System.out.println("fullName = " + fullName);
        System.out.println(faker.name().title());
        System.out.println(faker.address().fullAddress());
        System.out.println(faker.phoneNumber().phoneNumber());
        System.out.println(faker.phoneNumber().cellPhone());

        System.out.println("Faker.instance().animal().name() = " + Faker.instance().animal().name());//Static olarak direk böylede yapılabilir. Faker.instance() static methodu ile obje oluşturmadan data üretilebilir.
        System.out.println("faker.funnyName().name() = " + faker.funnyName().name());
        System.out.println("faker.internet().emailAddress() = " + faker.internet().emailAddress());
        System.out.println("faker.internet().password(5,9) = " + faker.internet().password());
        System.out.println("faker.date().birthday() = " + faker.date().birthday());
        faker.number().numberBetween(4,7);
        System.out.println("faker.lorem().sentence() = " + faker.lorem().sentence());
        System.out.println("faker.lordOfTheRings().character() = " + faker.lordOfTheRings().character());
    }

}
