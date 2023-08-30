package com.example.tasklist.repository;

import com.example.tasklist.domain.task.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {

    Optional<Task> findById(Integer id);

    List<Task> findAllByUserId(Integer userId);

    void assignToUserById(Integer taskId, Integer userId);

    void update(Task task);

    void create(Task task);

    void delete(Integer id);
}
