package com.zensar;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class BuisnessAppTest { 
	@SuppressWarnings("unchecked")
	@Test
	public void testBusinessApp() {
	CityService cityService = mock(CityService.class);
	
	//LoginService loginService = new LoginServiceStub();//Stub
	
	LoginService loginService = mock(LoginService.class);//Mock 
	
	when(cityService.findCitiesByCountries("INDIA")).thenReturn(Arrays.asList("Hyderabad","Mumbai","Delhi"));
	when(cityService.findCitiesByCountries("USA")).thenReturn(Arrays.asList("New York","Chicago","Philadelphia"));	
	
	when(cityService.findCitiesByCountries(anyString())).thenReturn(Arrays.asList("City1","City2","City3"));
	when(cityService.findCitiesByCountries("SWEDEN")).thenThrow(NullPointerException.class);
	
	when(loginService.authenticate("akshay", "golkonda")).thenReturn(true);
	
	BuisnessApp buisnessApp = new BuisnessApp(cityService,loginService);
	//buisnessApp.retrieveCityListByCountry("SWEDEN");
	//assertEquals(buisnessApp.retrieveCityListByCountry("INDIA").size(),3);
	//assertEquals(buisnessApp.retrieveCityListByCountry("USA").size(),3);
	//assertEquals(buisnessApp.retrieveCityListByCountry("SWEDEN").size(),3);
	assertEquals(buisnessApp.login("akshay", "golkonda"),true);	
	
	}
	
	@Test
	public void testMockVsSpy() {
		/*
		 * List<String> mockList=mock(List.class); mockList.add("ABC");
		 */
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> spyList=spy(list);
		spyList.add("ABC");
		System.out.println(spyList.get(0));
		
	}
}


