package com.application.controller;

import com.application.dto.StudentDto;
import com.application.service.StudentService;
import com.application.vo.StudentVO;

public class StudentManagementControllerImpl implements StudentManagementController {

    
	private StudentService service = null;
	
	public StudentManagementControllerImpl() {
		
	}
	
	public StudentManagementControllerImpl(StudentService service) {
		this.service = service;
	}
	
	public String processResults(StudentVO vo) {
		
		String  name = vo.getName();
		String  address = vo.getAddr();
		Integer fees = Integer.valueOf(vo.getFees());
		Float   discount = Float.valueOf(vo.getDiscount());
		
		
		StudentDto dto = new StudentDto();
	    dto.setName(name);
	    dto.setAddr(address);
	    dto.setFees(fees);
	    dto.setDiscount(discount);
	    
		return service.calculateDiscount(dto);
	}

	
}
