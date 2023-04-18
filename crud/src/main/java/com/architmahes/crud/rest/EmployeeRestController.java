package com.architmahes.crud.rest;

import com.architmahes.crud.dao.EmployeeDAO;
import com.architmahes.crud.entity.Employee;
import com.architmahes.crud.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService empService;

    public EmployeeRestController(EmployeeService empSvc){
        empService = empSvc;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return empService.findAll();
    }

}
