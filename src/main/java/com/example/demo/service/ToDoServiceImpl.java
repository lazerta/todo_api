package com.example.demo.service;

import com.example.demo.domain.ToDo;
import com.example.demo.repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ToDoServiceImpl implements ToDoService {
    private ToDoRepository repository;

  public ToDoServiceImpl(ToDoRepository repository) {
    this.repository = repository;
  }

  @Override
    public ToDo findOne(Integer id){
        return  repository.findById(id).get();
    }

    @Override
    public ToDo save(ToDo toDo) {
     return   repository.save(toDo);

    }

    @Override
    public ToDo update(Integer id, ToDo toDo) {

      toDo.setId(id);
      return repository.save(toDo);
    }

    @Override
    public void delete(Integer id) {
      repository.deleteById(id);

    }

    @Override
    public List<ToDo> findAll()
    {
        return repository.findAll();
    }
}
