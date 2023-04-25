package com.mahes.archit.spring.examples.a2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MongoDbDataService implements DataService{
    @Override
    public int[] retrieve() {
        return new int [] {11,22,33,44,55};
    }
}
