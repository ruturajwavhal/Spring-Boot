package com.vednexgen.task_management.controller;

import com.vednexgen.task_management.entity.Task;
import com.vednexgen.task_management.services.TaskServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    private final TaskServices taskServices;

    public TaskController(TaskServices taskServices){
        this.taskServices = taskServices;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task){
        return taskServices.saveTask(task);
    }

    @GetMapping
    public List<Task> getTask(){
        return taskServices.getAllTask();
    }

    @GetMapping("/{title}")
    public Task getTask(@PathVariable String title){
        Task task = taskServices.findByTitle(title);
        return task;
    }


}
