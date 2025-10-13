package com.vednexgen.task_management.services;

import com.vednexgen.task_management.entity.Task;
import com.vednexgen.task_management.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServices {
    @Autowired
    private TaskRepository taskRepository;

    public Task saveTask(Task task){
        return taskRepository.save(task);
    }

    public List<Task> getAllTask(){
        return taskRepository.findAll();
    }

    public Task findByTitle(String title){
        return taskRepository.findByTitle(title);
    }

}
