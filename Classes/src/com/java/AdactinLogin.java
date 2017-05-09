package com.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:/Users/hadmin/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://adactin.com/HotelApp/");
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("hiamal007");

		driver.findElement(By.id("password")).sendKeys("test");
		driver.findElement(By.id("password")).sendKeys(Keys.TAB);

		driver.findElement(By.id("login")).click();
		
		element = driver.findElement(By.id("location"));
		Select select = new Select(element);
		select.selectByVisibleText("London");
		
		new Select(driver.findElement(By.id("location"))).selectByVisibleText("London");
		
		String orderNo = driver.findElement(By.id("order_no")).getAttribute("value");
		System.out.println(orderNo);
		
		driver.findElement(By.id("order_id_text")).sendKeys(orderNo);
		driver.findElement(By.id("search_hotel_id")).click();
		
		int orderCount = 0;
		while(orderCount!=1){
			List<WebElement> orderList = driver.findElements(By.name("ids[]"));
			orderCount = orderList.size();
		}
		
		
		
		

		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}
}
