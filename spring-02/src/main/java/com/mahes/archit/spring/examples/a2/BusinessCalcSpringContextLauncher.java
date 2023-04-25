package com.mahes.archit.spring.examples.a2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessCalcSvc{
    @Autowired
    DataService dsvc;

    public int findMax(){
        return Arrays.stream(dsvc.retrieve()).max().orElse(0);
    }
}

@Configuration
@ComponentScan
public class BusinessCalcSpringContextLauncher {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(BusinessCalcSpringContextLauncher.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(BusinessCalcSvc.class).findMax());
    }
}
