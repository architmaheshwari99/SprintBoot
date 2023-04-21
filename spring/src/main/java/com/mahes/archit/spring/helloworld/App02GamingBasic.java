package com.mahes.archit.spring.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02GamingBasic {

    public static void main(String[] args) {

//        Launch a spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);


//        Configure the things we want Spring to manage-@Configuration
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
//        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("myaddress"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person2"));


        Arrays.stream(context.getBeanDefinitionNames()).forEach(
                System.out::println
        );
    }
}
