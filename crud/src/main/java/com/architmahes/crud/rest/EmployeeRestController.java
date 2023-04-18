package com.architmahes.crud.rest;

import com.architmahes.crud.dao.EmployeeDAO;
import com.architmahes.crud.entity.Employee;
import com.architmahes.crud.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable int id){
        Employee emp= empService.findById(id);
        if(emp==null){
            throw new RuntimeException("Employee Id not found "+ id);
        }
        return emp;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee emp){
        emp.setId(0);

        Employee e = empService.save(emp);

        return e;
    }

}
