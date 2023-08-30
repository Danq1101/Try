package com.example.tasklist.service;

import com.example.tasklist.domain.task.Task;

import java.util.List;

public interface TaskService {

    Task getById(Integer id);

    List<Task> getAllByUserId(Integer id);

    Task update(Task task);

    Task create(Task task, Integer userId);

    void delete(Integer id);

}
