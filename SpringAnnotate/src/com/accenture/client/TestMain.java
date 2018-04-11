package com.accenture.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.accenture.bean.Employee;
import com.accenture.config.AppConfig;

public class TestMain {
	public static void main (String[] args){
		 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		 Employee emp=context.getBean(Employee.class);
		 System.out.println("Company Name"+emp.getCompany().getCompName());
		 System.out.println("Company Location"+emp.getCompany().getLocation());
		
	}

}
