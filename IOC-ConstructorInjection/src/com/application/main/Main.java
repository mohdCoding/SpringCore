package com.application.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.application.bean.WishGenerator;

public class Main {

	public static void main(String[] args) {
		
		FileSystemResource resource = new FileSystemResource("./applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		
		WishGenerator wg = (WishGenerator) factory.getBean("wg", WishGenerator.class);

	}

}
