package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
	
	@Id
	private int aid;
	private String aname;
	private String department;
	private int  salary;
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
//	@Override
//	public String toString() {
//		return "Alien [aid=" + aid + ", aname=" + aname + "]";
//	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
}
