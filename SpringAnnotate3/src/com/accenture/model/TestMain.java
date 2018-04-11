package com.accenture.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accenture.config.AppConfig;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		@SuppressWarnings("resource")
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = context.getBean("person",Person.class);
		System.out.println(person);
	}

}
