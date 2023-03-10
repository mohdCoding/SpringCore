package com.application.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.application.bean.Department;
import com.application.bean.Staff;

public class ClientApp {
	
	public static void main(String ...args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("com/application/cfg/applicationContext.xml");
		
	    Staff staff = (Staff) factory.getBean("s");
	 
	    Department dept = (Department) factory.getBean("d");
	    
	    System.out.println(staff);
		System.out.println(dept);
		
	
	}

}
