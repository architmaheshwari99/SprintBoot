package com.mahes.archit.spring.examples.a4.a0;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class NormalClass{
    private SomeDependency sd;

    public NormalClass(SomeDependency sd) {
        this.sd = sd;
    }

    @PostConstruct
    public void initialize() {
        sd.getReady();
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("Clean");

        sd.clean();
    }
}

@Component
class SomeDependency {

    public void getReady() {
        System.out.println("Dependency Ready");
    }

    public void clean() {
        System.out.println("Clean");
    }
}

@Configuration
@ComponentScan
public class SimpleSpringContextLauncher {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncher.class);
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(NormalClass.class));
    }
}
