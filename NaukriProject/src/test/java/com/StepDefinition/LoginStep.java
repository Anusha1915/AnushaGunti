package com.StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Base.WrapperClass;
import com.Pages.LoginPage;
import com.seleniumUtil.SelUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep extends WrapperClass{

	final static Logger LOG = LogManager.getLogger(LoginStep.class.getName());
	       LoginPage Login;
           SelUtil util;
           
           //to launch the browser
          @Given("^user launches chrome browser$")
          public void user_launches_chrome_browser() throws Throwable {
        	  launchAPP();
        	  LOG.info("launched the browser");
      		
          }
          // to open the naukri page
          @When("^user opens the Login Naukri page$")
          public void user_opens_the_login_naukri_page() throws Throwable {
        	  Login = new LoginPage(driver);
               LOG.info("Naukri page is opened");
          }
            // to enter the username and password
          @Then("^enters username and password$")
          public void enters_username_and_password() throws Throwable {
        	Login = new LoginPage(driver);
      		Login.login("mushamnihasvi@gmail.com","Nihachinna@12");
      		
      		LOG.info("text is entered and searched");
          }
           // to click login button and to take the screenshot
          @Then("^user clicks on login button$")
          public void user_clicks_on_login_button() throws Throwable {
        	  LoginPage Login = new LoginPage(driver);
      		Login.clickLoginBtn();
      		util = new SelUtil(driver);
    		util.takeSnapShot("C:\\Users\\Harshini\\eclipse-workspace\\NaukriProject\\src\\test\\resources\\Screenshot\\Loginpage.png");
    		
      		LOG.info("clicks on the submit button");
    		driver.quit();
          }

      }