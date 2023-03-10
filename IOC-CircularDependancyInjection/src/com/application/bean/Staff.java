package com.application.bean;

public class Staff {

	
	private Department dept;
	
	public Staff() {
		
	}
	
	public Staff(Department dept) {
		this.dept = dept;
	}
	
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
	
	public String toString() {
		return "Staff [dept = " +  dept + "]"; 
	}
	
}
