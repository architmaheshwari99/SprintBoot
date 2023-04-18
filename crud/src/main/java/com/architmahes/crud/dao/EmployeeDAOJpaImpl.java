package com.architmahes.crud.dao;

import com.architmahes.crud.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    private EntityManager entityManager;

    //    Constructor Injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager em){
        entityManager=em;
    }


    @Override
    public List<Employee> findAll() {

        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);

        List<Employee> employees = theQuery.getResultList();

        return employees;
    }

    @Override
    public Employee findById(int id) {
        Employee emp = entityManager.find(Employee.class, id);
        return emp;
    }

    @Override
    public Employee save(Employee emp) {
        return entityManager.merge(emp);
    }

    @Override
    public void deleteById(int id) {
        Employee emp  = entityManager.find(Employee.class, id);
        entityManager.remove(emp);
    }
}
