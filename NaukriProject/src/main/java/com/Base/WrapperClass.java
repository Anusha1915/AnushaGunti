package com.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WrapperClass {

public WebDriver driver;
	public Properties prop;
	public FileInputStream file;

	
   public void launchAPP() throws IOException {
	file = new FileInputStream("C://Users//Harshini//eclipse-workspace//NaukriProject//src//test//resources//configuration.property//config.property");
	prop =new Properties();
	 prop.load(file);
	 String browser = prop.getProperty("browser");
	 String url=prop.getProperty("Url");
	 
	 
	
	 if(browser.equalsIgnoreCase("chrome")) 
	 {
		 System.setProperty("webdriver.chrome.driver", "D://Selenium//chromedriver.exe");
		 driver =new ChromeDriver();
	 }		 
		
	 else if (browser.equalsIgnoreCase("firefox")) 
	 {
		 driver = new FirefoxDriver();
	 }
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   driver.get(url);
   
   Set<String> wins = driver.getWindowHandles();
	 int i=0;
		String mainWin = "";
		for(String win : wins) {
			i++;
			if(i == 1) {
				mainWin = win;
			}
			if(i > 1) {
				driver.switchTo().window(win).close();
			}
			if(i>2)
				break;
		}
		
		driver.switchTo().window(mainWin);
	 
}
   public void quit() {
	   driver.quit();
   }
   
}
   

	
   

