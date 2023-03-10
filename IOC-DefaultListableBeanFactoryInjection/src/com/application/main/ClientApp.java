package com.application.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.application.bean.Person;

public class ClientApp {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("com/application/cfg/applicationContext.xml");

		Person person1 = factory.getBean("user", Person.class);
		System.out.println(person1);
		
		Person person2 = factory.getBean("user3", Person.class);
		System.out.println(person2);

	}

}
