package main;

import java.util.List;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import bean.Course;
import bean.Ineuron;

public class Test {

	public static void main(String[] args) {
		
		
		FileSystemResource resource = new FileSystemResource("./src/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		
		Ineuron company = factory.getBean(Ineuron.class);
		
		Course course = company.getCourse();
		List list = company.getList();
       
		System.out.println(company);
		System.out.println(course);
		System.out.println(list);
		
		
	}

}
