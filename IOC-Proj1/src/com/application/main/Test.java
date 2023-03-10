package com.application.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.application.bean.Student;
import com.application.bean.WishMessageGenerator;

public class Test {

	public static void main(String[] args) {
		
		FileSystemResource resource = new FileSystemResource("./src/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);

		Object object = factory.getBean("wish");
		WishMessageGenerator generator = (WishMessageGenerator) object;
		
		String result = generator.wish("Cristiano Ronaldo");
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
//		java.util.Date date = factory.getBean(java.util.Date.class, "dt");
//		System.out.println(date.hashCode());
//		System.out.println(date);
//		
//		Student student = factory.getBean(Student.class,"stu");
//	    generator.setPrimitives();
//		System.out.println(student);
	}

}
