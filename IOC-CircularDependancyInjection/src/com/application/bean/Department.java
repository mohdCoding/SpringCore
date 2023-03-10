package com.application.bean;

public class Department {

	
	private Staff staff;
	
	public Department() {
		
	}
	
	public Department(Staff staff) {
		this.staff = staff;
	}
	
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
	public String toString() {
		return "Department [staff = " + staff + "]"; 
	}
	
}
