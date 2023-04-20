package com.mahes.archit.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person (String name, int age) {};

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

    @Bean
    public Person person(){
        var p = new Person("Ravi", 25);
        return p;
    }

    @Bean(name="myaddress")
    public Address address(){
        return new Address("bgmbd", "modinagar", "ind");
    }

}
