package com.mahes.archit.spring.examples.a1;

import com.mahes.archit.spring.game.GameRunner;
import com.mahes.archit.spring.game.GamingConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class Dependency1{}

@Component
class Dependency2{}

@Component
class YourBusinessClass{
    Dependency1 d1;

    Dependency2 d2;

    @Autowired
    public void setD1(Dependency1 d1) {
        this.d1 = d1;
    }

    @Autowired
    public void setD2(Dependency2 d2) {
        this.d2 = d2;
    }

    public String toString(){
        return d1 + " " + d2;
    }

}


@Configuration
@ComponentScan
public class DependencyInjectionLauncher {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncher.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(com.mahes.archit.spring.examples.a1.YourBusinessClass.class));

    }
}
