package com.example.demo.repository;

import com.example.demo.domain.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// perform database access
// the framework will provide implementation for this interface
@Repository
public interface ToDoRepository extends JpaRepository<ToDo,Integer> {
}
