package com.TestRunner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",
plugin = {"pretty", "html:target\\cucumber-html-report",
		"json:target\\cucumber-json-report",
		"junit:target\\cucumber-junit-report",
		"com.cucumber.listener.ExtentCucumberFormatter:target\\cucmber-extent-report\\Extentreport.html"},
tags= {"@tc01_Naukripage_Login,@tc02_Naukripage_Search,@tc03_Naukripage_Mobile,"
		+ "@tc04_Naukripage_Employee"},
glue= {"com.StepDefinition"},
monochrome = true
)
public class RunnerClass {
	@AfterClass
	  public static void extendReport()
	{
		Reporter.loadXMLConfig("src\\test\\resources\\Testdata\\extent-config.xml");
	    Reporter.setSystemInfo("user", System.getProperty("user.name"));
	    Reporter.setSystemInfo("os", "Windows");
	    Reporter.setTestRunnerOutput("Sample test runner output message");
	}
	


}



