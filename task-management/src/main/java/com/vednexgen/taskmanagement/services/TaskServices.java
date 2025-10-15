package com.vednexgen.taskmanagement.services;

import com.vednexgen.taskmanagement.entity.Task;
import com.vednexgen.taskmanagement.repository.TaskRepository;
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

    public void deleteById(long id){
        taskRepository.deleteById(id);
    }

    public Task findById(long id){
        return taskRepository.findById(id);
    }
}
