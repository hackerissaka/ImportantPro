package com.cg.loginPage.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Feature"},
		glue= {"com.cg.loginPage.stepDefinition"}
		//tags= {"@execute"}
		)
public class TestRunner {

}
