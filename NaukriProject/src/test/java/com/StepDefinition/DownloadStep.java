package com.StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

import com.Base.WrapperClass;
import com.Pages.DownloadPage;
import com.seleniumUtil.SelUtil;


public class DownloadStep extends WrapperClass{
	
	final static Logger LOG = LogManager.getLogger(DownloadStep.class.getName());
	DownloadPage Down;
	SelUtil util;
     // to launch the browser
    @Given("^Download launches the chrome browser$")
    public void download_launches_the_chrome_browser() throws Throwable {
        launchAPP();
        LOG.info("Browser launched sucessfully");
    }
     // to enter the mobile number
    @Then("^user enters the mobile number$")
    public void user_enters_the_mobile_number() throws Throwable {
     Down = new DownloadPage(driver);
     Down.MobileNum("9852781852");
     LOG.info("mobile number entered sucessfully");
    }
    
    // to click the download button and to take screenshot 
    @And("^User clicks the download link button$")
    public void user_clicks_the_download_link_button() throws Throwable {
        Down = new DownloadPage(driver);
        Down.DownloadBtn();
        util = new SelUtil(driver);
		util.takeSnapShot("C:\\Users\\Harshini\\eclipse-workspace\\NaukriProject\\src\\test\\resources\\Screenshot\\Downloadpage.png");
		LOG.info("ScreenShot taken");
		driver.quit();
		LOG.info("Browser quit sucessfully");
    }

}