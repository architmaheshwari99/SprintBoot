package com.architmahes.rest.rest;

import com.architmahes.rest.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> l1 = new ArrayList<>();
        l1.add(new Student("Genjis", "Khan"));
        l1.add(new Student("Abraham", "Lincon"));
        l1.add(new Student("Laxmi", "Bai"));

        return l1;
    }

}