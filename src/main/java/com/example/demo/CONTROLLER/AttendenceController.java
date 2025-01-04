package com.example.demo.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.POJO.Attendance.AttendanceManagementSystem;
import com.example.demo.SERVICE.AttendanceService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/ams")
public class AttendenceController {
	@Autowired
	private AttendanceService as;
	@GetMapping("/punchin/{id}")
	public AttendanceManagementSystem PunchIn(@PathVariable("id") String id) {
		return as.punchIn(id);
		
	}
	@GetMapping("/punch/out/{id}")
	public AttendanceManagementSystem PunchOut(@PathVariable("id")  Long id) {
		return as.punchOut(id);
		
	}
	
}
