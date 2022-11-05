package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	
	@Parameters({"user", "password"})
	@Test()
	public void testParam(@Optional("Sadik") String userName, @Optional("Password123") String pass) {
		System.out.println(userName + " " + pass);
	}

}
