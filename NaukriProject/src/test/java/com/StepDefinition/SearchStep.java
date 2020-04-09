package com.StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.Base.WrapperClass;
import com.Pages.LoginPage;
import com.Pages.SearchPage;
import com.seleniumUtil.SelUtil;


public class SearchStep extends WrapperClass{
	
	final static Logger LOG = LogManager.getLogger(SearchStep.class.getName());
	LoginPage Login;
	SearchPage Search;
	SelUtil util;
    // to launch the browser
	@Given("^search Launches the google browser$")
	public void search_Launches_the_google_browser() throws Throwable {
        launchAPP();
        LOG.info("Browser launch");
    
    }

   /* @When("^User is in login page$")
    public void user_is_in_login_page() throws Throwable {
    	Login = new LoginPage(driver);
  		Login.login("mushamnihasvi@gmail.com","Nihachinna@12");
    	Login.clickLoginBtn();
    	
    }*/
    
	//to enter the searching job details and to click search button
    @Then("^user enters the details for searching jobs$")
    public void user_enters_the_details_for_searching_jobs() throws Throwable {
    	Login = new LoginPage(driver);
  		Login.login("mushamnihasvi@gmail.com","Nihachinna@12");
    	Login.clickLoginBtn();
    	LOG.info("Login button clicked");
   
    	Search = new SearchPage(driver);
    	Search.Search("cognizant technology solutions java developer","Hyderabad/Secunderabad");
    	Search.SearchBtn();
    	LOG.info("Search done sucessfully");
        
    }
    //to take the screenshot

    @Then("^Search Takes a screenshot$")
    public void search_Takes_a_screenshot() throws Throwable {
    	util = new SelUtil(driver);
		util.takeSnapShot("C:\\Users\\Harshini\\eclipse-workspace\\NaukriProject\\src\\test\\resources\\Screenshot\\Searchpage.png");
		System.out.println("ScreenShot taken");
    	LOG.info("screenshot taken");
		driver.quit();
    }
}


