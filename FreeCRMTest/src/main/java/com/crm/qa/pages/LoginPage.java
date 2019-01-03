package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//page Factory-OR:
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@class='input-group-btn']/input")
	WebElement loginbutton;
	
	@FindBy(xpath="//*[@id=\"navbar-collapse\"]/ul/li[2]/a/font")
	WebElement signupbutton;
	
	@FindBy(xpath="//a[@class='navbar-brand']/img")
	WebElement crmlogo;
	
	//Initializing the page objects-this is constructor
	public LoginPage() {
		PageFactory.initElements(driver, this);
	
	}
	
	//actions:
	 public String validateLoginPageTitle() {
		 
		 return driver.getTitle();
		 
	 }
	 public boolean validateCRMImage() {
		 
		 return crmlogo.isDisplayed();
		 
	 }
	 
	 public HomePage login(String un, String pwd) {
		 username.sendKeys(un);
		 password.sendKeys(pwd);
		 loginbutton.click();
		 return new HomePage();
	 }
	

}
