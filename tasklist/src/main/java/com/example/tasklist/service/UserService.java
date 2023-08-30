package com.example.tasklist.service;

import com.example.tasklist.domain.user.User;

public interface UserService {

    User getById(Integer id);

    User getByUsername(String username);

    User update(User user);

    User create(User user);

    boolean isTaskOwner(Integer userId, Integer taskId);

    void delete(Integer id);

}
