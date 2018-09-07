package com.cg.project.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.github.beans.LoginPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GitHubLoginFeatureStepDefinition {
	
/*	private WebDriver driver;
	@Given("^user is on GitHub login page$")
	public void user_is_on_GitHub_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://github.com/login");
	}

	@When("^User enter invalid username and password$")
	public void user_enter_invalid_username_and_password() throws Throwable {
		 WebElement usernameElement= driver.findElement(By.id("login_field"));
		 WebElement passwordElement= driver.findElement(By.id("password"));
		 usernameElement.sendKeys("swetarani604");
		 passwordElement.sendKeys("4343434");
		 passwordElement.submit();
	}

	@Then("^'Incorrect username or password\\.' Message will display$")
	public void incorrect_username_or_password_Message_will_display() throws Throwable {
		String actualElement= driver.findElement(By.xpath("//*[@id=\"js-flash-container\"]/div/div")).getText();
		String expectedElement="Incorrect username or password.";
		Assert.assertEquals(expectedElement, actualElement);
		
	}

	@When("^user enter valid username and password$")
	public void user_enter_valid_username_and_password() throws Throwable {
		 WebElement usernameElement= driver.findElement(By.id("login_field"));
		 WebElement passwordElement= driver.findElement(By.id("password"));
		 usernameElement.sendKeys("swetarani604");
		 passwordElement.sendKeys("14scs380");
		 passwordElement.submit();
	}

	@Then("^user should successfully signin on his GitHub account$")
	public void user_should_successfully_signin_on_his_GitHub_account() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"user-links\"]/li[3]/details/summary/span")).click();
		driver.findElement(By.xpath("//*[@id=\"user-links\"]/li[3]/details/details-menu/ul/li[1]/a/strong")).click();
	 String actualElement= driver.getTitle();
		String expectedElement="swetarani604";
	  Assert.assertEquals(expectedElement, actualElement);
	  
	}
*/
	private WebDriver driver;
	private LoginPage loginPage;
	@Before(order=1)
	public void setUpEnv1() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	}
	
	@Given("^user is on GitHub login page$")
	public void user_is_on_GitHub_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://github.com/login");
		loginPage = new LoginPage();
		PageFactory.initElements(driver, loginPage);
	}
	@When("^User enter invalid username and password$")
	public void user_enter_invalid_username_and_password() throws Throwable {
		loginPage.setUsername("abc");
		loginPage.setPassword("abc@123");
		loginPage.clickSignIn();
	}

	@Then("^'Incorrect username or password\\.' Message will display$")
	public void incorrect_username_or_password_Message_will_display() throws Throwable {
		String expectedElement="Incorrect username or password.";
		Assert.assertEquals(expectedElement, loginPage.getActualErrorMessage());
		
	}

	@When("^user enter valid username and password$")
	public void user_enter_valid_username_and_password() throws Throwable {
		loginPage.setUsername("");
		loginPage.setPassword("");
	}

	@Then("^user should successfully signin on his GitHub account$")
	public void user_should_successfully_signin_on_his_GitHub_account() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"user-links\"]/li[3]/details/summary/span")).click();
		driver.findElement(By.xpath("//*[@id=\"user-links\"]/li[3]/details/details-menu/ul/li[1]/a/strong")).click();
	 String actualElement= driver.getTitle();
		String expectedElement="swetarani604";
	  Assert.assertEquals(expectedElement, actualElement);
	  
	}
}