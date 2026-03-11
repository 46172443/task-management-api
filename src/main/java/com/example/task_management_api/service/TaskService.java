
package com.example.task_management_api.service;

import com.example.task_management_api.entity.Task;
import com.example.task_management_api.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

	private final TaskRepository taskRepository;

	// Constructor Injection
	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	public Task createTask(Task task) {
		return taskRepository.save(task);
	}

	// CREATE
	public Task saveTask(Task task) {
		return taskRepository.save(task);
	}

	// READ ALL
	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}

	// GET BY ID
	public Task getTaskById(int id) {
		// TODO Auto-generated method stub
		return taskRepository.findById((long) id).orElseThrow(() -> new RuntimeException("Task not found"));
	}

	// Full update
	public Task updateTask(int id, Task task) {
		Task existingTask = taskRepository.findById((long) id)
				.orElseThrow(() -> new RuntimeException("Task not found"));
		existingTask.setTitle(task.getTitle());
		existingTask.setDescription(task.getDescription());
		existingTask.setStatus(task.getStatus());
		return taskRepository.save(existingTask);
	}

	public Task updateTask(Long id, Task task) {

		Task existingTask = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));

		if (task.getTitle() != null) {
			existingTask.setTitle(task.getTitle());
		}

		if (task.getDescription() != null) {
			existingTask.setDescription(task.getDescription());
		}

		if (task.getStatus() != null) {
			existingTask.setStatus(task.getStatus());
		}

		return taskRepository.save(existingTask);
	}

	public void deleteTask(int id) {
	    taskRepository.deleteById((long) id);
	}

}