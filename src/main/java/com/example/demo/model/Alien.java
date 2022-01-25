package com.example.demo.model;

import org.bson.codecs.pojo.annotations.BsonId;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Alien {
	

	private int _id;

	private int aid;
	private String aname;
	private String department;
	private int  salary;

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public int getAid() {
		return aid;
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", department=" + department + ", salary=" + salary + "]";
	}

	public Alien() {
	}
	public Alien(int aid,String aname,String department,int salary)
	{
		this.set_id(aid);
		this.setAid(aid);
		this.setAname(aname);
		this.setDepartment(department);
		this.setSalary(salary);
	}
	
	
}


