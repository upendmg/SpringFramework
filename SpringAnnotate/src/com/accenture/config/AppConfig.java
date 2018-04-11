package com.accenture.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.accenture.bean.Company;
import com.accenture.bean.Employee;

@Configuration
public class AppConfig {
	@Bean
	public Company getCompany(){
		Company company=new Company();
		company.setCompName("Accenture");
		company.setLocation("Global Village Kengari");
		return company;
		
	}
	@Bean
	public Employee getEmployee(){
		return new Employee();
	}

}
