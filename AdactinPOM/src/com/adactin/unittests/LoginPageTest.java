package com.adactin.unittests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.adactin.pages.LoginPage;

public class LoginPageTest {
	
	@Test
	public void txtUsernameText(){
		LoginPage loginPage = new LoginPage();
		loginPage.setTxtUsername("hiamal007");
		Assert.assertEquals("hiamal007", loginPage.getTxtUsername());
	}
	
	@Test
	public void txtPasswordText(){
		LoginPage loginPage = new LoginPage();
		loginPage.setTxtPassword("test");
		Assert.assertEquals("test", loginPage.getTxtPassword());
	}
	
}
