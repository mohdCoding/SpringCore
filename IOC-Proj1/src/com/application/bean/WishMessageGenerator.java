package com.application.bean;

import java.util.Date;

public class WishMessageGenerator {

	private Date date = null;
	private Student student;

	static {
		System.out.println("WishMessageGenerator.loading...");
	}

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setStudent(Student student) {
		  this.student = student;
	}
	
	public void setPrimitives() {
		student.setName("Mohammed Haroon");
		student.setAge(20);
		student.setCourse("JavaFullstack with springboot microservices");
	}
	
	public String wish(String name) {
		System.out.println("setter method");
		System.out.println(date);
		System.out.println(date.hashCode());
		System.out.println("===================");
		Integer hour = date.getHours();

		if (hour <= 12)
			return "Good Morning " + name + " have a nice day";
		else if (hour <= 16)
			return "Good Afternoon " + name;
		else
			return "Good Night " + name;
	}

}
