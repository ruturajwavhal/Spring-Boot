package com.vednexgen.taskmanagement.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Entity

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "Title cannot be null")
    private String title;

    @NotNull(message = "Discription cannot be null")
    private String discription;

    @NotNull(message = "Task name cannot be null")
    private String taskName;
    private boolean completed;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDiscription() {
        return discription;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isCompleted() {
        return completed;
    }
}
