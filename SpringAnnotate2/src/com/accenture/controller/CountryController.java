package com.accenture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.accenture.model.Country;
import com.accenture.service.CountryService;

@Controller("CountryController")
public class CountryController {
	@Autowired
	private CountryService service;
	public Country createNewCountry(){
		return service.createNewCountry();
		
	}

}
