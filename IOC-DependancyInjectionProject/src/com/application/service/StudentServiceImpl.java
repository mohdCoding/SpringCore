package com.application.service;

import com.application.bo.StudentBO;
import com.application.dao.StudentDao;
import com.application.dto.StudentDto;

public class StudentServiceImpl implements StudentService {

	private StudentDao dao = null;
	
	public StudentServiceImpl(StudentDao dao) {
		this.dao = dao;
	} 
	
	public StudentServiceImpl() {
		
	}
	
	public String calculateDiscount(StudentDto dto) {
		StudentBO bo = new StudentBO();
		bo.setName(dto.getName());
		bo.setAddr(dto.getAddr());
		bo.setFees(dto.getFees());
		bo.setDiscount(dto.getDiscount());
		bo.setDiscountFees(344);
		return dao.insert(bo);
	}
}
