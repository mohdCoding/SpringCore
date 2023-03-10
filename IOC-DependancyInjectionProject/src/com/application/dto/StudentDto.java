package com.application.dto;

public class StudentDto {

	private String name;
	private String addr;
	private Integer fees;
	private Float discount;

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public Integer getFees() {
		return fees;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setFees(Integer fees) {
		this.fees = fees;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", addr=" + addr + ", fees=" + fees + ", discount=" + discount + "]";
	}

	
}
