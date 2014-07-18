package com.way2automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.way2automation.twitter.config.Configufile;


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
	@FindBy(xpath = Configufile.username)
	public WebElement username;
	//has to be depend on a webelement
	@FindBy(how = How.XPATH, using = Configufile.password)
	public WebElement password;
	
	@FindBy(xpath =Configufile.signin)
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
