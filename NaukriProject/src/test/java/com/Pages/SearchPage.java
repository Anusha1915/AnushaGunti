package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	WebDriver driver;

	@FindBy(xpath=("//*[@id=\"qsb-keyskill-sugg\"]"))WebElement SearchjobsbySkills;
    @FindBy(xpath=("//*[@id=\"qsb-location-sugg\"]"))WebElement Location;
	@FindBy(xpath=("//*[@id=\"search-jobs\"]/button"))WebElement Searchbtn;
	
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		this.driver=driver;
	}
	//to enter the details for search jobs and location
	public void Search(String se, String hy)
	{
		SearchjobsbySkills.sendKeys(se);
		Location.sendKeys(hy);
		
	}
	//to click the search button
	public void SearchBtn() {
		
		Searchbtn.click();
		
	}
}
