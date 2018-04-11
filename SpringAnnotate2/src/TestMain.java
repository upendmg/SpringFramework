import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accenture.controller.CountryController;
import com.accenture.model.Country;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CountryController controller=(CountryController)context.getBean("CountryController");
		Country country=controller.createNewCountry();
		System.out.println("Country Name"+country.getCountryName());
		System.out.println("Country Population"+country.getPopulation());
	}

}
