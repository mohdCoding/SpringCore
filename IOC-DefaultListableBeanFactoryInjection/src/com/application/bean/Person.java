package com.application.bean;

public class Person {

	private String name;
	private Integer age;
	private String addr;

	static {
		System.out.println("Person.loading()");
	}
	
	
	public Person() {
		
	}
	
	public Person(String name, Integer age, String addr) {
		System.out.println("IOC CONtainer performing constructor injection");
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Person.setName()");
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		System.out.println("Person.setAge()");
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		System.out.println("Person.setAddr()");
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

}
