package com.accenture.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accenture.Account;
import com.accenture.Card;
import com.accenture.CurrentAccount;
import com.accenture.SavingAccount;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account account=new SavingAccount();
		//account.createAccount();
		//Account account=new CurrentAccount();
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Account account=context.getBean("myAccount",Account.class);
		CurrentAccount account1=context.getBean("myCurrentAccount",CurrentAccount.class);
		System.out.println(account1.createAccount());
        System.out.println(account1.cardType());
	}

}
