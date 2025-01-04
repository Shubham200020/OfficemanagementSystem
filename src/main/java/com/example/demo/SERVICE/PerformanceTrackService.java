package com.example.demo.SERVICE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.POJO.Employee.Employees;
import com.example.demo.POJO.Employee.PerformanceTrack;
import com.example.demo.REPOSITORY.PerformanceTrakingRepo;



@Service
public class PerformanceTrackService {
	@Autowired
	private PerformanceTrakingRepo taskTrakingRepo;
	public ResponseEntity<PerformanceTrack> saveDate(PerformanceTrack data){
		PerformanceTrack tsktrac=null;
		try {
			tsktrac=taskTrakingRepo.save(data);
			return new ResponseEntity<PerformanceTrack>(tsktrac,HttpStatus.ACCEPTED);
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<PerformanceTrack>(tsktrac,HttpStatus.BAD_REQUEST);
		}
	}

	public ResponseEntity<List<PerformanceTrack>> getAllData(){
		List<PerformanceTrack>listTask=null;
		try {
			listTask=taskTrakingRepo.findAll();
			return new ResponseEntity<List<PerformanceTrack>>(listTask,HttpStatus.ACCEPTED);
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<List<PerformanceTrack>>(listTask,HttpStatus.BAD_REQUEST);
		}
	}
	
	public ResponseEntity<PerformanceTrack> getPerformanceById(Employees id){
		PerformanceTrack tsktrac=null;
		try {
			tsktrac=taskTrakingRepo.findByEmployees(id);
			return new ResponseEntity<PerformanceTrack>(tsktrac,HttpStatus.ACCEPTED);
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<PerformanceTrack>(tsktrac,HttpStatus.BAD_REQUEST);
		}
	}

}
