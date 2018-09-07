package com.cg.loginPage.bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageBean {
	@FindBy(how=How.ID,id="uname")
	private WebElement username;
	
	@FindBy(how=How.ID,id="pwd")
	private WebElement password;
	
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"submit\"]")
	private WebElement clickSignIn;

public String getUsername() {
	return username.getAttribute("value");
}
public void setUsername(String username) {
	this.username.sendKeys(username);
}
public String getPassword() {
	return password.getAttribute("value");
}
public void setPassword(String password) {
	this.password.sendKeys(password);
	
}

public void ClickSignIn() {
	clickSignIn.click();
}
}
