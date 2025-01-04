package com.example.demo.SERVICE;



import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.example.demo.POJO.Attendance.AttendanceManagementSystem;
import com.example.demo.POJO.Attendance.PunchinStatus;
import com.example.demo.POJO.Employee.Employees;
import com.example.demo.POJO.Employee.PerformanceTrack;
import com.example.demo.REPOSITORY.AttendanceRepo;


@Service
public class AttendanceService extends EmployeesService{
	@Autowired
	private AttendanceRepo auAttendanceRepo;
	@Autowired
	private PerformanceTrackService performanceTrackService;
	public AttendanceManagementSystem punchIn(String id) {
		PerformanceTrack pr=null;
		Employees es=super.getEmployeeById(id).getBody();
		AttendanceManagementSystem ams=new AttendanceManagementSystem();
		
		pr=performanceTrackService.getPerformanceById(es).getBody();
		if(pr==null) {
			pr=new PerformanceTrack();
			pr.setId(null);
			pr.setEmployees(es);
			pr.setStatus(PunchinStatus.punchout );
		}
		if(pr.getStatus()==PunchinStatus.punchout) {
			pr.setStatus(PunchinStatus.punchin);
			ams.setEmployees(es);
			ams.setStatus(PunchinStatus.punchin);
			ams.setPunchInDay(LocalDate.now());
			ams.setPunchInTime(LocalTime.now());
			performanceTrackService.saveDate(pr);
			return auAttendanceRepo.save(ams);
		}
	
		return null;
	}
	public AttendanceManagementSystem punchOut(Long id) {
		PerformanceTrack pr=null;
		AttendanceManagementSystem ams=auAttendanceRepo.findById(id).get();
		pr=performanceTrackService.getPerformanceById(ams.getEmployees()).getBody();
		pr.setStatus(PunchinStatus.punchout);
		if(pr.getStatus()==PunchinStatus.punchout) {
		ams.setPunchOutDay(LocalDate.now());
		ams.setPunchOutTime(LocalTime.now());
		ams.setStatus(PunchinStatus.punchout);}	
		performanceTrackService.saveDate(pr);
		return auAttendanceRepo.save(ams);
	}
	public List<PerformanceTrack> getAllPerformance(){
		return null;
	}
}
