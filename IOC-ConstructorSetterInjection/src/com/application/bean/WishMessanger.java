package com.application.bean;

import java.util.Date;

public class WishMessanger {

	private Date date;
	private String name;
	private Integer age;
	private String course;

	public WishMessanger(Date date, String name, Integer age, String course) {
		System.out.println("IOC CONTAINER PERFORMING CONSTRUCTOR INJECTION");
		System.out.println(date);
		this.date = date;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setDate(Date date) {
		System.out.print("IOC CONTAINER PERFORMING SETTER INJECTION");
		System.out.println(date);
		this.date = date;
	}

	@Override
	public String toString() {
		return "WishMessanger [date=" + date + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}



}
