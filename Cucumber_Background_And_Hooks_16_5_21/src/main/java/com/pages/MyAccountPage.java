package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

	
	private WebDriver driver;
	
	
	private By OrderHistory  =By.xpath("//span[text()='Order history and details']");
	private By Addresses = By.xpath("//span[normalize-space()='My addresses']");
	
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getAccountPageTitle() {
		
		return driver.getTitle();
	}
	
	public void selectOrderHistory() {
		driver.findElement(OrderHistory).click();
		
	}
	
	public void  selectAddress() {
		driver.findElement(Addresses).click();
	}
}
