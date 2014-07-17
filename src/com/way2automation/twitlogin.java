package com.way2automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


//login page has a landing page
public class twitlogin {
	
	// to initialize webdriver
	WebDriver driver;
	//create a constructor
	public twitlogin(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//find x path of this element
	@FindBy(xpath = ".//*[@id='signin-email']")
	public WebElement username;
	//has to be depend on a webelement
	@FindBy(how = How.XPATH, using = ".//*[@id='signin-password']")
	public WebElement password;
	
	@FindBy(xpath = ".//*[@id='front-container']/div[2]/div[2]/form/table/tbody/tr/td[2]/button")
	public WebElement signin;
	
	//create a method, Business Login
	public twitLandingPage doLogin(String myusername, String mypassword)
	{
		//using FindBy annotation xpath
		username.sendKeys(myusername);
		password.sendKeys(mypassword);
		signin.click();
		
		//initialize the pagefactory elemetns
		return PageFactory.initElements(driver, twitLandingPage.class);
		
	}
	

}
