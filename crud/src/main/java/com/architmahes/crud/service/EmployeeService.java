package com.architmahes.crud.service;

import com.architmahes.crud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee emp);

    void deleteById(int id);

}
