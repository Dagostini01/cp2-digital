package br.com.cp2digital.dto;

import java.util.Date;

public record CreateTaskDto(
        String title,
        String description,
        Date dueDate
) {
}
