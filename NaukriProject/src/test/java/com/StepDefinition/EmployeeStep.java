package com.StepDefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Base.WrapperClass;
import com.Pages.EmployeePage;
import com.seleniumUtil.SelUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class EmployeeStep extends WrapperClass {
	EmployeePage page;
	SelUtil screenshot;
	
	final static Logger LOG = LogManager.getLogger(DownloadStep.class.getName());

	
	    @Given("^Open the Naukri page$")
	    public void open_the_naukri_page()throws IOException {
	    	launchAPP();
	    	LOG.info("launched chrome sucsesfully");
	    }
	    	
	    @And("^Go to For Employees section$")
	    public void go_to_for_employees_section() {
	    	page = new EmployeePage(driver);
	    	page.employee();
	    	LOG.info("employees section opened");
	    	
	    }

	    @And("^Add the required product to cart$")
	    public void add_the_required_product_to_cart() {
	    	page.ADD_CART();
	    	LOG.info("required product is sucessfully added");
	    	
	    	screenshot = new SelUtil(driver);
	    	screenshot.takeSnapShot("C:\\Users\\Harshini\\eclipse-workspace\\NaukriProject\\src\\test\\resources\\Screenshot\\EmployeePage.png");
	    	LOG.info("Screenshot taken");
	    	driver.quit();
	    }

	

}
