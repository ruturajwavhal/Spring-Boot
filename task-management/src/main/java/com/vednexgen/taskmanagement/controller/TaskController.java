package com.vednexgen.taskmanagement.controller;

import com.vednexgen.taskmanagement.entity.Task;
import com.vednexgen.taskmanagement.services.TaskServices;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    private final TaskServices taskServices;

    public TaskController(TaskServices taskServices){
        this.taskServices = taskServices;
    }

    @PostMapping
    public ResponseEntity<String> createTask(@Valid @RequestBody Task task, BindingResult result){
        if (result.hasErrors()) {
            List<String> errors = new ArrayList<>();
            for (ObjectError error : result.getAllErrors()) {
                errors.add(error.getDefaultMessage());
            }
            return ResponseEntity.badRequest().body(errors.toString());
        }
        taskServices.saveTask(task);
        return ResponseEntity.ok("Task Added successfully");

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

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable long id){
        Task task = taskServices.findById(id);
        @NotNull(message = "Id is not present in Database")
        String title = task.getTitle();
        if(!title.isEmpty())
        {
            taskServices.deleteById(id);

        }
        return "Task "+ id +" is Deleted...";


    }

}
