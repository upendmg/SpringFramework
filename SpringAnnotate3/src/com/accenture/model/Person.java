package com.accenture.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	@Autowired
	private Job job;

	@Override
	public String toString() {
		return "Person [job=" + job + "]";
	}
	
	

}
