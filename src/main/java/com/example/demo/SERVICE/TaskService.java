package com.example.demo.SERVICE;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.POJO.Employee.Employees;
import com.example.demo.POJO.Employee.PerformanceTrack;
import com.example.demo.POJO.Task.AssigmentTask;
import com.example.demo.POJO.Task.Tasks;
import com.example.demo.REPOSITORY.TaskRepo;
import com.example.demo.REPOSITORY.PerformanceTrakingRepo;

@Service
public class TaskService extends EmployeesService{
	@Autowired
	private TaskRepo taskRepo;
	
	public ResponseEntity<Tasks> savetask(Tasks task){
		Tasks tsk=null;
		try {
			tsk=taskRepo.save(task);
			return new ResponseEntity<Tasks>(tsk,HttpStatus.ACCEPTED);
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Tasks>(tsk,HttpStatus.BAD_REQUEST);
		}
	}
	
	public ResponseEntity<List<Tasks>> getAllTask(){
		List<Tasks> listtsk=null;
		try {
			listtsk=taskRepo.findAll();
			return new ResponseEntity<List<Tasks>>(listtsk,HttpStatus.OK);
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<List<Tasks>>(listtsk,HttpStatus.BAD_REQUEST);
		}
	}

	
	public ResponseEntity<Tasks> getById(String id){
		Tasks tsk=null;
		try {
			tsk=taskRepo.findById(id).get();
		return new ResponseEntity<Tasks>(tsk,HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<Tasks>(tsk,HttpStatus.BAD_REQUEST);
		}
	}
	public ResponseEntity<Tasks> addEmployee(String tskid,String empid){
		Tasks tsk=null;
		try {
			Employees emp=super.getEmployeeById(empid).getBody();
			tsk=taskRepo.findById(tskid).get();
			AssigmentTask asstsk=tsk.getAssigmentTask();
			Set<Employees>lstmp=asstsk.getEmployees();
			lstmp.add(emp);
			asstsk.setEmployees(lstmp);
			tsk.setAssigmentTask(asstsk);
			tsk=taskRepo.save(tsk);
			return new ResponseEntity<Tasks>(tsk,HttpStatus.ACCEPTED);
		}
		catch (Exception e) {
			return new ResponseEntity<Tasks>(tsk,HttpStatus.BAD_REQUEST);
		}
	}
	
	public ResponseEntity<Tasks> removeEmployee(String tskid,String empid){
		Tasks tsk=null;
		try {
			Employees emp=super.getEmployeeById(empid).getBody();
			tsk=taskRepo.findById(tskid).get();
			AssigmentTask asstsk=tsk.getAssigmentTask();
			Set<Employees>lstmp=asstsk.getEmployees();
			lstmp.remove(emp);
			asstsk.setEmployees(lstmp);
			tsk.setAssigmentTask(asstsk);
			tsk=taskRepo.save(tsk);
			return new ResponseEntity<Tasks>(tsk,HttpStatus.ACCEPTED);
		}
		catch (Exception e) {
			return new ResponseEntity<Tasks>(tsk,HttpStatus.BAD_REQUEST);
		}
	}
	public ResponseEntity<Tasks> deleteTask(Tasks tsk){
		Tasks tskinst=null;
		try {
			tskinst=tsk;
			taskRepo.delete(tskinst);
			return new ResponseEntity<Tasks>(tskinst,HttpStatus.ACCEPTED);
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Tasks>(tskinst,HttpStatus.BAD_REQUEST);
		}
	}
}
