package com.cg.project.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonToSearchFeatureStepDefinition {
	private WebDriver driver;
@Given("^User is on amazon home page$")
public void user_is_on_amazon_home_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
}

@When("^User search for 'redmi note (\\d+) pro mobile phones'$")
public void user_search_for_redmi_note_pro_mobile_phones(int arg1) throws Throwable {
	WebElement searchElement = driver.findElement(By.id("twotabsearchtextbox"));
	searchElement.sendKeys("redmi note 5 pro mobile phones");
	searchElement.submit();
}

@Then("^All the link with 'redmi note (\\d+) pro mobile phones' displayed and user get information on 'Redmi (\\d+) \\(Gold, (\\d+)GB\\)' by clicking on link$")
public void all_the_link_with_redmi_note_pro_mobile_phones_displayed_and_user_get_information_on_Redmi_Gold_GB_by_clicking_on_link(int arg1, int arg2, int arg3) throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[2]/div/div[2]/div[1]/div[1]/a/h2")).click();
	String expTitle= "Redmi 5 (Gold, 32GB): Amazon.in: Electronics";
	String acTitle=driver.getTitle();
	Assert.assertEquals(expTitle, acTitle);
}
}
