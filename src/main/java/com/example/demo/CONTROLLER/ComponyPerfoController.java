package com.example.demo.CONTROLLER;

import java.sql.Date;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.POJO.ComponyPerformnce;
import com.example.demo.SERVICE.ComponyPerformanceService;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/compony-performance")
public class ComponyPerfoController {
	@Autowired
	private ComponyPerformanceService cps;
	
	@PostMapping
	public ResponseEntity<ComponyPerformnce> saveData(@RequestBody ComponyPerformnce cp){
		ComponyPerformnce data=cp;
		float inv=data.getTotalInvestment();
		float netprofit=data.getNetprofit();
		float grosProfit=netprofit-inv;
		cp.setGrosProfit(grosProfit);
		
		return cps.saveData(cp);
	}
	@GetMapping
	public ResponseEntity<List<ComponyPerformnce>> getData(){
		return cps.getData();
	}
	@GetMapping("/get-inc")
	public List<Float> getInciment(){
		return cps.getInciment();
	}
	@GetMapping("/get-date")
	public List<Date> getDate(){
		return cps.getDate();
	}

}
