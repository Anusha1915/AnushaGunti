package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/ul[2]/li[2]/a")
	WebElement Employees;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/ul[2]/li[2]/div/ul/li[1]/a")
	WebElement Byonline;
	
	@FindBy(xpath = "//*[@id=\"btn-text\"]")
	WebElement cart;
	
	public EmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	//to click the employees and click on buy online
	public void employee() {
		Actions action = new Actions(driver);
		action.moveToElement(Employees).perform();
		Actions action1 = action.moveToElement(Byonline).click();
		action1.build().perform();
				
	}
	// to click the open cart
	public void ADD_CART() {
		cart.click();
	}

}
