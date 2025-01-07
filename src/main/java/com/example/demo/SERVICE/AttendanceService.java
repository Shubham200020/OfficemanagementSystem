package com.example.demo.SERVICE;



import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
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
			ams.setPunchInDay(LocalDateTime.now());
			
			performanceTrackService.saveDate(pr);
			return auAttendanceRepo.save(ams);
		}
	
		return null;
	}
	public AttendanceManagementSystem punchOut(Long id) {
		PerformanceTrack pr=null;
		AttendanceManagementSystem ams=auAttendanceRepo.findById(id).get();
		pr=performanceTrackService.getPerformanceById(ams.getEmployees()).getBody();
		if(pr.getStatus()==PunchinStatus.punchin) {
		ams.setPunchOutDay(LocalDateTime.now());
		ZoneId zone = ZoneId.of("Asia/Kolkata");
		ZonedDateTime punchin = ZonedDateTime.of(ams.getPunchInDay(), zone);
		ZonedDateTime punchout = ZonedDateTime.of(LocalDateTime.now(), zone);
		ams.setStatus(PunchinStatus.punchout);
		Duration duration=Duration.between(punchin,punchout);
		ams.setHours((int)duration.toHours());
		ams.setMinutes((int)duration.toMinutes());
		
		}		
		pr.setStatus(PunchinStatus.punchout);
		performanceTrackService.saveDate(pr);
		return auAttendanceRepo.save(ams);
	}
	public List<AttendanceManagementSystem> getAllData(){
		return auAttendanceRepo.findAll();
	}
	public String deleteAll() {
		auAttendanceRepo.deleteAll();
		return "Delete";
	}
}
