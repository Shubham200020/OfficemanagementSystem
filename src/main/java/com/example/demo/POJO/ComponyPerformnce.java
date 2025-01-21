package com.example.demo.POJO;

import java.sql.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "compony_performance")
public class ComponyPerformnce {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date startFinancialYear;
	private Date endFinancialYear;
	private float totalInvestment;


	private float totalLose;
	private float netprofit;
	private float grosProfit;
	
	
	



	public ComponyPerformnce(Integer id, Date startFinancialYear, Date endFinancialYear, float totalInvestment,
			float totalLose, float netprofit, float grosProfit) {
		super();
		this.id = id;
		this.startFinancialYear = startFinancialYear;
		this.endFinancialYear = endFinancialYear;
		this.totalInvestment = totalInvestment;
		this.totalLose = totalLose;
		this.netprofit = netprofit;
		this.grosProfit = grosProfit;
	}



	public ComponyPerformnce() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public float getNetprofit() {
		return netprofit;
	}



	public void setNetprofit(float netprofit) {
		this.netprofit = netprofit;
	}



	public float getGrosProfit() {
		return grosProfit;
	}



	public void setGrosProfit(float grosProfit) {
		this.grosProfit = grosProfit;
	}



	public float getTotalInvestment() {
		return totalInvestment;
	}



	public void setTotalInvestment(float totalInvestment) {
		this.totalInvestment = totalInvestment;
	}



	public float getTotalLose() {
		return totalLose;
	}



	public void setTotalLose(float totalLose) {
		this.totalLose = totalLose;
	}



	public Date getStartFinancialYear() {
		return startFinancialYear;
	}
	public void setStartFinancialYear(Date startFinancialYear) {
		this.startFinancialYear = startFinancialYear;
	}
	public Date getEndFinancialYear() {
		return endFinancialYear;
	}
	public void setEndFinancialYear(Date endFinancialYear) {
		this.endFinancialYear = endFinancialYear;
	}


}
