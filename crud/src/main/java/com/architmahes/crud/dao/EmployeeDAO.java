package com.architmahes.crud.dao;

import com.architmahes.crud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
