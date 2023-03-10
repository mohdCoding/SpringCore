package com.application.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;



import com.application.bo.StudentBO;

public class StudentDaoImpl implements StudentDao {


	DataSource dataSource = null;
	
	public StudentDaoImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public StudentDaoImpl() {
		
	}
	
	public String insert(StudentBO bo) {
		String status = "failure";
		
		try {
			
			 Connection connection = dataSource.getConnection();
			 
			 String query = "insert into student(name, addr, course, fees, discount, discountFees) " +
			                " values (?, ?, ?, ?, ?, ?)";
			 
			 PreparedStatement pstmt = connection.prepareStatement(query);
			 
			 pstmt.setString(1, bo.getName());
			 pstmt.setString(2, bo.getAddr());
			 pstmt.setString(3, bo.getCourse());
			 pstmt.setInt(4, bo.getFees());
			 pstmt.setFloat(5, bo.getDiscount());
			 pstmt.setInt(6, bo.getDiscountFees());
			 
			 Integer rowsAff = pstmt.executeUpdate();
			 
			 if(rowsAff == 1)
			    status = "success";
			 
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}

}
