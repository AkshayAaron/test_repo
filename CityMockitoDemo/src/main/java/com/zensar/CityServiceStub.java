package com.zensar;

import java.util.Arrays;
import java.util.List;

public class CityServiceStub implements CityService {
	
	public List<String> findCitiesByCountries(String country) {
		if(country.equalsIgnoreCase("INDIA"))
				return Arrays.asList("Hyderabad","Mumbai","Delhi");
		else if(country.equalsIgnoreCase("USA"))
				return Arrays.asList("New York","Chicago","Philadelphia");
		return null;
	}
	
}
