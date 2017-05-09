package com.com.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinLogin {
	WebDriver driver;
	String expected, actual;
	
	@BeforeClass
	public void beforeTest(){
		System.setProperty("webdriver.gecko.driver","C:/Users/hadmin/Downloads/geckodriver.exe");
		this.driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void beforeMethod(){
		driver.get("http://adactin.com/HotelApp/");
	}

	@Test
	public void correctLogin() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("hiamal007");
		driver.findElement(By.id("password")).sendKeys(Keys.TAB);
		driver.findElement(By.id("login")).click();
		expected = "Hello hiamal007!";
		actual = driver.findElement(By.id("username_show")).getAttribute("value");
		Assert.assertEquals(expected, actual);
	}
  
	@Test
	public void incorrectLogin() {
		driver.findElement(By.id("username")).sendKeys("hiamal007");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("password")).sendKeys(Keys.TAB);
		driver.findElement(By.id("login")).click();
		expected = "Invalid Login Details";
		actual = driver.findElement(By.tagName("b")).getText();
		Assert.assertEquals(expected, actual);
	} 
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
