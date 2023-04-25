package com.mahes.archit.spring.examples.a2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySQLDataService implements DataService{
    @Override
    public int[] retrieve() {
        return new int [] {1,2,3,4,5};
    }
}
