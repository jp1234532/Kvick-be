package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.models.Task;
import com.bezkoder.springjwt.security.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class TaskController {

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    TaskService taskService;

    @GetMapping("/gettasks")
    public List<Task> getTasks() {

        return taskService.getTasks();
    }
}
