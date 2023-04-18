package com.architmahes.crud.rest;

import com.architmahes.crud.dao.EmployeeRepository;
import com.architmahes.crud.entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeRepository employeeRepository;

    public EmployeeRestController(EmployeeRepository empSvc){
        employeeRepository = empSvc;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable int id){
        Optional<Employee> emp= employeeRepository.findById(id);
        if(!emp.isPresent()){
            throw new RuntimeException("Employee Id not found "+ id);
        }
        return emp.get();
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee emp){
        emp.setId(0);

        Employee e = employeeRepository.save(emp);

        return e;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee emp){
        Employee e = employeeRepository.save(emp);
        return e;
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id){
        Optional<Employee> e = employeeRepository.findById(id);
        if(e==null){
            throw new RuntimeException("Employee not found " + id);
        }
        employeeRepository.deleteById(id);

    }

}
