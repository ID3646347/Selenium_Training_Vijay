package com.adactin.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.adactin.pages.LoginPage;
import com.adactin.pages.SearchHotelPage;

public class LoginPageTestCase {
	LoginPage loginPage;
	SearchHotelPage searchHotelPage;
	
	@Test
	public void correctLogin(){
		loginPage = new LoginPage();
		loginPage.setTxtUsername("hiamal007");
		loginPage.setTxtPassword("test");
		loginPage.clickBtnLogin();
		searchHotelPage = new SearchHotelPage();
		Assert.assertEquals("Hello hiamal007!", searchHotelPage.getTxtWelcomeText());
	}
	
	@Test
	public void incorrectLogin(){
		loginPage.openUrl("http://adactin.com/HotelApp/");
		loginPage.setTxtUsername("hiamal");
		loginPage.setTxtPassword("test");
		loginPage.clickBtnLogin();
		Assert.assertEquals("Invalid Login Details", loginPage.getLblIncorrectLogin());
	}
	
	@Test
	public void emptyUsername(){

	}
	
	@Test
	public void emptyPassword(){

	}

}
