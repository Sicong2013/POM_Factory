package com.way2automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class twitMyProfile {

	WebDriver driver;
	public twitMyProfile(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//create webElement
	@FindBy(xpath = ".//*[@id='page-container']/div[3]/div/div[2]/div[2]/div/div[2]/div/div/ul/li[3]/div/button")
	public WebElement editbutton;
    
	//method
	public twitEditProfile editProfile()
	{
		editbutton.click();
		return PageFactory.initElements(driver, twitEditProfile.class);
	}

}
