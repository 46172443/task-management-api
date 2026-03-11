package com.example.task_management_api.controller;

import org.springframework.web.bind.annotation.*;

import com.example.task_management_api.entity.Task;
import com.example.task_management_api.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

	private final TaskService taskService;

	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}

	// CREATE
	@PostMapping
	public Task createTask(@RequestBody Task task) {
		return taskService.createTask(task);
	}

	// READ ALL
	@GetMapping
	public List<Task> getAllTasks() {
		return taskService.getAllTasks();
	}

	// READ BY ID
	@GetMapping("/{id}")
	public Task getTaskById(@PathVariable int id) {
		return taskService.getTaskById(id);
	}

	// UPDATE FULL OBJECT
	@PutMapping("/{id}")
	public Task updateTask(@PathVariable int id, @RequestBody Task task) {
		return taskService.updateTask(id, task);
	}

	// PARTIAL UPDATE
	@PatchMapping("/{id}")
	public Task updateTaskTitle(@PathVariable int id, @RequestBody Task task) {
		return taskService.updateTask(id, task);
	}

	// DELETE

	@DeleteMapping("/{id}")
	public String deleteTask(@PathVariable int id) {
		taskService.deleteTask(id);
		return "Task deleted successfully";
	}

}
