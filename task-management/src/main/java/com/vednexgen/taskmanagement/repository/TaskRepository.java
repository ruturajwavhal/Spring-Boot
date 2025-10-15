package com.vednexgen.taskmanagement.repository;

import com.vednexgen.taskmanagement.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findByTitle(String title);
    Task findById(long id);
}
