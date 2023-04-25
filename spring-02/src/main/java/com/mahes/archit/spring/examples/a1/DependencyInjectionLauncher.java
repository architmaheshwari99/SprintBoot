package com.mahes.archit.spring.examples.a1;

import com.mahes.archit.spring.game.GameRunner;
import com.mahes.archit.spring.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan
public class DependencyInjectionLauncher {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncher.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
