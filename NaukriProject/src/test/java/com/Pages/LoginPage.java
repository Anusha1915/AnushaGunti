package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver driver;

@FindBy(xpath=("//*[@id=\"login_Layer\"]/div"))WebElement Login;
@FindBy(xpath=("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[2]/input"))WebElement Username;
@FindBy(xpath=("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[3]/input"))WebElement Password;
@FindBy(xpath=("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[5]/button"))WebElement loginBtn;


public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
	this.driver=driver;
}
// to enter the login credentials
public void login(String un,String pwd)
{
	Login.click();
	Username.sendKeys(un);
	Password.sendKeys(pwd);
	
}
//to click the login button
public void clickLoginBtn() {
	
	loginBtn.click();
	
}
}




