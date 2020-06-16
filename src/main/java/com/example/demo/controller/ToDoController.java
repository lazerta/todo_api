package com.example.demo.controller;

import com.example.demo.domain.ToDo;
import com.example.demo.service.ToDoService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class ToDoController {

    private ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }
    @GetMapping("/{id}")
    ToDo findOne(@PathVariable Integer id){
        return  toDoService.findOne(id);
    }
    @PostMapping
    ToDo save(@RequestBody  ToDo toDo){
        return toDoService.save(toDo);
    }
    @PutMapping("/{id}")
    ToDo update(@PathVariable Integer id,@RequestBody  ToDo toDo){
      return   toDoService.update(id, toDo);
    }
    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id){
        toDoService.delete(id);
    }
    @GetMapping()
    List<ToDo> findAll(){
        return  toDoService.findAll();
    }
}
