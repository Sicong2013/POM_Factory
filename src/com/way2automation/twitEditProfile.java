package com.way2automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.way2automation.twitter.config.Configufile;

public class twitEditProfile {

	//constructor 
	WebDriver driver;
	public twitEditProfile(WebDriver driver)
	{
		this.driver = driver;
	}
	@FindBy(xpath = Configufile.inlineEditIcon)
	public WebElement inlineEditIcon;
	
	@FindBy(xpath = Configufile.uploadPhoto)
	public WebElement uploadPhoto;
	
	@FindBy(xpath = Configufile.cancelPhoto)
    public WebElement cancelPhoto;
	
	
	//method
	public void changePic()
	{
		inlineEditIcon.click();
		uploadPhoto.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		cancelPhoto.click();
	}
	
	public void changeTitle()
	{
		
	}
	
	public void changeSummary()
	{
		
	}

}
