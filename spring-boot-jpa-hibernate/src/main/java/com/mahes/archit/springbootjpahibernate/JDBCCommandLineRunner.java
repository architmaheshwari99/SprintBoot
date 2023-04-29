package com.mahes.archit.springbootjpahibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JDBCCommandLineRunner  implements CommandLineRunner {

//    @Autowired
//    private JDBCRepository repo;

//    @Autowired
//    private JPARepository repo;

    @Autowired
    private CourseJPA repo;

    @Override
    public void run(String... args) throws Exception{

        repo.save(new Course(1, "AWS", "Archit"));
        repo.save(new Course(2, "Azure", "Casper"));
        repo.deleteById(2l);
        var c=repo.findById(1l);
        System.out.println(c.toString());
        System.out.println(repo.findByAuthor("Archit"));
    }

}
