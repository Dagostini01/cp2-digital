package br.com.cp2digital.model;

import br.com.cp2digital.dto.CreateTaskDto;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private Boolean status;
    private Date dueDate;
    private Boolean isActive;

    public Task(CreateTaskDto data){
        this.title = data.title();
        this.description = data.description();
        this.dueDate = data.dueDate();
        this.status = false;
        this.isActive = true;
    }
    public Task(){}
}


