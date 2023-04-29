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

        repo.insert(new Course(1, "AWS", "Archit"));
        repo.insert(new Course(2, "Azure", "Casper"));
        repo.delete(2);
        var c=repo.retrieve(1);
        System.out.println(c.toString());
    }

}
