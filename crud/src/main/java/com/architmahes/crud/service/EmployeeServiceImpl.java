package com.architmahes.crud.service;


import com.architmahes.crud.dao.EmployeeDAO;
import com.architmahes.crud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO edao){
        employeeDAO=edao;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
