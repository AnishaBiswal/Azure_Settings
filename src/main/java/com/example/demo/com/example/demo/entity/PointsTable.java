package com.example.demo.com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PointsTable")
public class PointsTable {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String action;
	private String points;
	private String startdate;
	private String enddate;
	
	
	public PointsTable() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	
	


	public String getAction() {
		return action;
	}


	public void setAction(String action) {
		this.action = action;
	}


	public String getPoints() {
		return points;
	}


	public void setPoints(String points) {
		this.points = points;
	}


	public String getStartdate() {
		return startdate;
	}


	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}


	public String getEnddate() {
		return enddate;
	}


	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}


	public PointsTable(String action, String points, String startdate, String enddate) {
		
		
		this.action = action;
		this.points = points;
		this.startdate = startdate;
		this.enddate = enddate;
	}
	
	
	
	
	
	

}
