package com.accenture.dao;

import org.springframework.stereotype.Repository;

import com.accenture.model.Country;

@Repository
public class CountryDAO {

	public Country createNewCountry() {
		// TODO Auto-generated method stub
		Country country=new Country("India",100000001);
		return country;
	}
	}


