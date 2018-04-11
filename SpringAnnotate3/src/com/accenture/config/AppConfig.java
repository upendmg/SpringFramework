package com.accenture.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.accenture.model.Job;
import com.accenture.model.Person;

@Configuration
public class AppConfig {
	@Bean
	public Person person(){
		return new Person();
		
	}
	@Bean
	@Primary
	public Job javaDeveloper(){
		return new Job("Java Developer");
		
	}
	@Bean
	public Job frontEndDeveloper(){
		return new Job("Front End Developer");
	}
	
}
