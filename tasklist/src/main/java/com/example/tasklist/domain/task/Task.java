package com.example.tasklist.domain.task;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Task {

    private Integer id;

    private  String title;

    private String description;

    private Status status;

    private LocalDateTime expirationData;
}
