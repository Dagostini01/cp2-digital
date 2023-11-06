package br.com.cp2digital.dto;


import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record UpdateTaskDto(
        @NotNull
        Long id,
        String title,
        String description,
        Date dueDate,
        Boolean status
) {
}
