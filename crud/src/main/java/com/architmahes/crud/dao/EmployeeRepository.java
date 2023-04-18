package com.architmahes.crud.dao;

import com.architmahes.crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//    That's it, no need to code anything LOL
}
