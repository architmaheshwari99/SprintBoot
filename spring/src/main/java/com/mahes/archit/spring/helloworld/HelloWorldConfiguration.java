package com.mahes.archit.spring.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person (String name, int age, Address address) {};

record Address (String line1, String city, String country) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Mahesh";
    }

    @Bean
    public int age() {
        return 24;
    }

//    @Bean
//    public Person person(){
//        return new Person("Ravi", 25);
//    }

    @Bean(name="myaddress")
    @Qualifier("addressQualifier")
    public Address address(){
        return new Address("bgmbd", "modinagar", "ind");
    }

    @Bean
    public Person person1(String name, int age, @Qualifier("addressQualifier") Address address){
        return new Person(name, age, address);
    }

    @Bean
    @Primary
    public Person person2(){
        return new Person(name(), age(), new Address("bgmbd", "modinagar", "ind"));
    }

    @Bean
    public Person person3(){
        return new Person(name(), age(), new Address("bgmbd", "modinagar", "ind"));
    }


}
