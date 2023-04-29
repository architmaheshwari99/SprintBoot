package com.mahes.archit.springbootjpahibernate;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseJPA extends JpaRepository<Course, Long> {

    List<Course> findByAuthor(String author);
}
