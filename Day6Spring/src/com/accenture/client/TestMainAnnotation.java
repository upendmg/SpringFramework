package com.accenture.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.accenture.Account;

import config.BeanConfig;

public class TestMainAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
   Account account=context.getBean("CurrentAccount",Account.class);
   System.out.println(account.createAccount());
   System.out.println(account.cardType());
	
	
	
	}

}
