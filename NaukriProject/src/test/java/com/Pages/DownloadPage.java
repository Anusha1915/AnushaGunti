package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadPage {
	
	WebDriver driver;
	

	@FindBy(xpath=("//*[@id=\"right-section-widgets.download-app-link-wdgt\"]/form/span/input"))WebElement Mobile;
	@FindBy(xpath=("//*[@id=\"right-section-widgets.download-app-link-wdgt\"]/form/input"))WebElement downloadbtn;
	public DownloadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		this.driver=driver;
	}
	//to enter the mobile number
	public void MobileNum(String nu) 
	{
		Mobile.sendKeys(nu);
		
	}
	//to click the download link botton
	public void DownloadBtn() {
		
		downloadbtn.click();
	
	}
		
	}




