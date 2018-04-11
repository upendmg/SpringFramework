package com.accenture.model;

public class Country {
	private String countryName;
	private long population;
	public Country(String countryName, long population) {
		super();
		this.countryName = countryName;
		this.population = population;
	}
	public String getCountryName() {
		return countryName;
	}
	
	public long getPopulation() {
		return population;
	}
	
	

}
