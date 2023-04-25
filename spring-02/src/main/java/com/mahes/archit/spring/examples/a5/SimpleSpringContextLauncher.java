package com.mahes.archit.spring.examples.a5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;



@Configuration
@ComponentScan
public class SimpleSpringContextLauncher {

    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("contextConfiguration.xml");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
