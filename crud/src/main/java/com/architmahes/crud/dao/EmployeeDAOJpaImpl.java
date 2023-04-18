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
}
