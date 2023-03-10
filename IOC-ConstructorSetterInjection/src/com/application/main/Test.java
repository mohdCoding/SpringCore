package com.application.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.application.bean.WishMessanger;

public class Test {

	public static void main(String[] args) {
		
		FileSystemResource resource = new FileSystemResource("./applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);

		WishMessanger message = factory.getBean("wmg", WishMessanger.class);
		System.out.println(message);
	}

}
