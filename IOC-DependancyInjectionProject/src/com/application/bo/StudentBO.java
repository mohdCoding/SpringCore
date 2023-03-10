package com.application.bo;

public class StudentBO {

	private String name;
	private String addr;
	private String course;
	private Integer fees;
	private Float discount;
	private Integer discountFees;

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public String getCourse() {
		return course;
	}

	public Integer getFees() {
		return fees;
	}

	public Float getDiscount() {
		return discount;
	}

	public Integer getDiscountFees() {
		return discountFees;
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

	public void setFees(Integer fees) {
		this.fees = fees;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public void setDiscountFees(Integer discountFees) {
		this.discountFees = discountFees;
	}

	@Override
	public String toString() {
		return "StudentBO [name=" + name + ", addr=" + addr + ", course=" + course + ", fees=" + fees + ", discount="
				+ discount + ", discountFees=" + discountFees + "]";
	}

}
