package com.application.main;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.application.controller.StudentManagementController;
import com.application.controller.StudentManagementControllerImpl;
import com.application.vo.StudentVO;

public class ClientApp {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("com/application/cfg/applicationContext.xml");

		StudentManagementController controller =(StudentManagementControllerImpl) factory.getBean("controller");

		System.out.println("Enter Student Name");
		String name = in.nextLine();

		System.out.println("Enter Student Address");
		String addr = in.nextLine();
		
		System.out.println("Enter Student Course");
		String course = in.nextLine();
		
		System.out.println("Enter Course Fess");
		String fees = in.nextLine();
		
		StudentVO vo = new StudentVO();
		vo.setName(name);
		vo.setAddr(addr);
		vo.setFees(fees);
		vo.setDiscount("45");
		
		System.out.println(controller.processResults(vo));
	}

}
