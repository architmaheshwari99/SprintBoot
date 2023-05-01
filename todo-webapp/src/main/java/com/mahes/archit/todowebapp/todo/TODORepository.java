package com.mahes.archit.todowebapp.todo;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TODORepository extends JpaRepository<Todo, Integer> {

    public List<Todo> findByUsername(String username);
}
