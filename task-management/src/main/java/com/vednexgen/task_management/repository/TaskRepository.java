package com.vednexgen.task_management.repository;

import com.vednexgen.task_management.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findByTitle(String title);
}
