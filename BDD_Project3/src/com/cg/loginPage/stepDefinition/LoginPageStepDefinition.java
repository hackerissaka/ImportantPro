package com.cg.loginPage.stepDefinition;

import org.junit.Assert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.loginPage.bean.LoginPageBean;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDefinition {
	
	private LoginPageBean loginPage;
	private WebDriver driver;
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe"); 
	}

	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		driver= new ChromeDriver();
		driver.get("C:\\BDD workspace(use this)\\BDD_Project3\\src\\com\\cg\\loginPage\\stepDefinition\\Login.html");
		Thread.sleep(2000);
		loginPage= new LoginPageBean();
		PageFactory.initElements(driver, loginPage);
	}

	@When("^User does not enter username$")
	public void user_does_not_enter_username() throws Throwable {
	   loginPage.setUsername("admi");
	   Thread.sleep(2000);
	   loginPage.setPassword("12");
	   Thread.sleep(2000);
	   loginPage.ClickSignIn();
	}

	
	@Then("^'Enter Username' Message will display$")
	public void enter_Username_Message_will_display() throws Throwable {
	  String expected = "Incorrect username and password !!!";
	String msg=driver.switchTo().alert().getText();
	  Assert.assertEquals(expected, msg);
	  
	  
	}

	@When("^User does not enter password$")
	public void user_does_not_enter_password() throws Throwable {
	   
	}

	@Then("^'Enter Password' Message will display$")
	public void enter_Password_Message_will_display() throws Throwable {
	   
	}

	@When("^User enter invalid username and password$")
	public void user_enter_invalid_username_and_password() throws Throwable {
	   
	}

	@Then("^'Incorrect username or password\\.' Message will display$")
	public void incorrect_username_or_password_Message_will_display() throws Throwable {
	   
	}

	@When("^user enter valid username and password$")
	public void user_enter_valid_username_and_password() throws Throwable {
	   
	}

	@Then("^target window will open\\.$")
	public void target_window_will_open() throws Throwable {
	    
	}


}
