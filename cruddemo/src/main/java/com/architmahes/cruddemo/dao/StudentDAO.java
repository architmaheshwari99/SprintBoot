package com.architmahes.cruddemo.dao;

import com.architmahes.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();
}
