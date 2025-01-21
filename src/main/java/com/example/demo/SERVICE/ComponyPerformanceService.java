package com.example.demo.SERVICE;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.POJO.ComponyPerformnce;
import com.example.demo.REPOSITORY.ComponyPerformanceRepo;

@Service
public class ComponyPerformanceService {
	@Autowired
	private ComponyPerformanceRepo cpr;
	public ResponseEntity<ComponyPerformnce> saveData(ComponyPerformnce cp){
		return new ResponseEntity<ComponyPerformnce>(cpr.save(cp),HttpStatus.ACCEPTED);
	}
	public ResponseEntity<List<ComponyPerformnce>> getData(){
		List<ComponyPerformnce> ls=cpr.findAll();
		return new ResponseEntity<List<ComponyPerformnce>>(ls,HttpStatus.OK);
	}
	public List<Float> getInciment(){
		List<ComponyPerformnce> ls=cpr.findAll();
		List<Float> data=new ArrayList<>();
		Iterator<ComponyPerformnce>la=ls.iterator();
		while(la.hasNext()) {
			ComponyPerformnce sc=la.next();
			data.add(sc.getGrosProfit());
		}
		return data;
	}
	public List<Date> getDate(){
		List<ComponyPerformnce> ls=cpr.findAll();
		List<Date> data=new ArrayList<>();
		Iterator<ComponyPerformnce>la=ls.iterator();
		while(la.hasNext()) {
			ComponyPerformnce sc=la.next();
			data.add(sc.getStartFinancialYear());
		}
		return data;
	}

}
