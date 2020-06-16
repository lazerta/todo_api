package com.example.demo.service;

import com.example.demo.domain.ToDo;

import java.util.List;

// for to do we allow use to perform different operation
// this bossiness logic is happening
// we gonna support crud(CREATE,Select, update, delete)
public interface ToDoService {
    ToDo findOne(Integer id);
    ToDo save(ToDo toDo);
    ToDo update(Integer id,ToDo toDo);
    void delete(Integer id);
    List<ToDo> findAll();



}
