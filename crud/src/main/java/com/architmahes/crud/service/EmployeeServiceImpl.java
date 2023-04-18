package com.architmahes.crud.service;


import com.architmahes.crud.dao.EmployeeRepository;
import com.architmahes.crud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository edao){
        employeeRepository =edao;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result =  employeeRepository.findById(id);

        Employee emp = null;

        if(result.isPresent()){
            emp = result.get();
        } else {
            throw new RuntimeException("Did not find employee id - "+ id);
        }
        return emp;
    }

    @Override
    public Employee save(Employee emp) {
        return employeeRepository.save(emp);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}
