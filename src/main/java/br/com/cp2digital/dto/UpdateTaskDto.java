package br.com.cp2digital.dto;

import org.antlr.v4.runtime.misc.NotNull;

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
