package com.application.vo;

public class StudentVO {

	private String name;
	private String addr;
	private String course;
	private String fees;
	private String discount;

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public String getCourse() {
		return course;
	}

	public String getFees() {
		return fees;
	}

	public String getDiscount() {
		return discount;
	}

	

	public void setName(String name) {
		this.name = name;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	

	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", addr=" + addr + ", course=" + course + ", fees=" + fees + ", discount="
				+ discount + "]";
	}

}
