package com.architmahes.rest.rest;

import com.architmahes.rest.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> students;

    @PostConstruct
    public void loadData(){
        students = new ArrayList<>();
        students.add(new Student("Genjis", "Khan"));
        students.add(new Student("Abraham", "Lincon"));
        students.add(new Student("Laxmi", "Bai"));
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudents(@PathVariable int studentId){

        if(studentId >= students.size() || studentId<0){
            throw new StudentNotFoundException("student id not found: " + studentId);
        }

        return students.get(studentId);
    }


}