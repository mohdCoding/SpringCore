package com.application.bean;

public class Student {

	private String name;
	private Integer age;
	private String course;

	static {
       System.out.println("Student.loading........");
	}

	public Student() {
       System.out.println("Student.Student()");
	}

	public void setName(String name) {
		System.out.println("Student.setName()");
		this.name = name;
	}

	public void setAge(Integer age) {
		System.out.println("Student.setAge()");
		this.age = age;
	}

	public void setCourse(String course) {
		System.out.println("Student.setCourse()");
		this.course = course;
	}

	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", course=" + course + "]";
	}

}
