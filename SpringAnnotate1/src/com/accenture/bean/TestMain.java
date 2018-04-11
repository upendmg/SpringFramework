package com.accenture.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Account account=context.getBean("myAccount",Account.class);
		Payment payment=(Payment) context.getBean("payment");
		System.out.println(payment.toString());
       // System.out.println();
	}

}
