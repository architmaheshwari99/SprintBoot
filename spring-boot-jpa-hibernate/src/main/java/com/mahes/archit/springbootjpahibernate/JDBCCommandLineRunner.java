package com.mahes.archit.springbootjpahibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JDBCCommandLineRunner  implements CommandLineRunner {

    @Autowired
    private JDBCRepository repo;

    @Override
    public void run(String... args) throws Exception{

        repo.insert();
    }

}
