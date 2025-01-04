package com.example.demo.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.POJO.Task.Tasks;
import com.example.demo.SERVICE.TaskService;

@RestController
@RequestMapping("/task-controllers")
public class TaskController {
	@Autowired
	private TaskService taskService;
	@PostMapping
	public ResponseEntity<Tasks> saveData(@RequestBody Tasks task){
		return taskService.savetask(task);
	}
	@GetMapping
	public ResponseEntity<List<Tasks>>getData(){
		return taskService.getAllTask();
	}
	@GetMapping("/add/emp/{tskid}/{empid}")
	public ResponseEntity<Tasks> addemployee(@PathVariable("tskid") String tskid,@PathVariable("empid") String empid){
		return taskService.addEmployee(tskid, empid);
	}
	
	@GetMapping("/remove/emp/{tskid}/{empid}")
	public ResponseEntity<Tasks> removeemployee(@PathVariable("tskid") String tskid,@PathVariable("empid") String empid){
		return taskService.removeEmployee(tskid, empid);
	}
	@PostMapping("/get-by-id/{id}")
	public ResponseEntity<Tasks> getById(@PathVariable String id){
		return taskService.getById(id);
	}
	@PostMapping("/delete-task")
	public ResponseEntity<Tasks> deleteData(@RequestBody Tasks task){
		return taskService.deleteTask(task);
	}
}
