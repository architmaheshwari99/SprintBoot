package com.mahes.archit.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Courses> allCourses() {
        return Arrays.asList(
                new Courses(1, "Learn AWS", "in28minutes"),
                new Courses(2, "Learn MongoDB", "in18minutes")
        );
    }
}
