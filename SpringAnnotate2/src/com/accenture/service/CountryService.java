package com.accenture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.dao.CountryDAO;
import com.accenture.model.Country;

@Service
public class CountryService {
	@Autowired
	private CountryDAO dao;

	public Country createNewCountry() {
		return dao.createNewCountry();

	}
}
