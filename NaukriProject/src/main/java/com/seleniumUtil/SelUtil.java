package com.seleniumUtil;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.WrapperClass;



public class SelUtil  extends WrapperClass {
	
	WebDriver driver;
	WebDriverWait wait;
	By loginbtn=By.id("btnLogin");
	
	public SelUtil(WebDriver driver)
	{
		this.driver=driver;
	}
	public void takeSnapShot(String path1)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(Source, new File(path1));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void gettitle()
	{
		//driver.getTitle();
		System.out.println("Title of the page" + driver.getTitle());
	}
	public void Wait()
	{
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loginbtn)));
		
	}

}
