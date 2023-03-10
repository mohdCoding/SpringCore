package com.application.bean;

import java.util.Date;

public class WishGenerator {

	
	private Date date;
	
	public WishGenerator(Date date) {
		System.out.println("IOC Container performing constructor injection");
		this.date = date;
	}

	public String toString() {
		return "WishGenerator [date=" + date + "]";
	}
	
	
}
