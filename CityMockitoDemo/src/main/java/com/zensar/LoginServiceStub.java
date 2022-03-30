package com.zensar;

public class LoginServiceStub implements LoginService {

	@Override
	public boolean authenticate(String uname, String pwd) {
		if(uname.equalsIgnoreCase("Akshay")&&pwd.equalsIgnoreCase("Golkonda"))
			return true;
		else
			return false;
	}
	
}
