package br.com.cp2digital.model;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Task {
    private Long id;
    private String title;
    private String description;
    private Boolean status;
    private Date dueDate;
    private Boolean isActive;

    public Task(CreateTaskDto data)
    public Task(){}
}


