package br.com.cp2digital.service;

import br.com.cp2digital.dto.UpdateTaskDto;
import br.com.cp2digital.model.Task;
import br.com.cp2digital.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    public void registration(Task task) {
        repository.save(task);
    }

    public Page<Task> listAll(Pageable pageable) {
        return repository.findAllByIsActiveTrue(pageable);
    }

    public Task update(UpdateTaskDto data) {
        Optional<Task> task = repository.findById(data.id());
        if (task.isPresent()) {
            Task updated = task.get();
            if (data.title() != null) {
                updated.setTitle(data.title());
            }
            if (data.description() != null) {
                updated.setDescription(data.description());
            }
            if (data.status() != null) {
                updated.setStatus(data.status());
            }
            if (data.dueDate() != null) {
                updated.setDueDate(data.dueDate());
            }
            repository.save(updated);
            return updated;
        }
        return null;
    }
}
