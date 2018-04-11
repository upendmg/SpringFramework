package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.accenture.CreditCard;
import com.accenture.CurrentAccount;

@Configuration
public class BeanConfig {
@Bean
public CreditCard creditCard(){
	return new CreditCard();
}
@Bean
public CurrentAccount currentAccount(){
	return new CurrentAccount();
	
}
}
