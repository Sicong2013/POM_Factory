package com.way2automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class twitEditProfile {

	//constructor 
	WebDriver driver;
	public twitEditProfile(WebDriver driver)
	{
		this.driver = driver;
	}
	@FindBy(xpath = ".//*[@id='page-container']/div[3]/div/div[1]/div[1]/button")
	public WebElement inlineEditIcon;
	
	@FindBy(xpath = ".//*[@id='header-choose-existing']/div/div/label/input")
	public WebElement uploadPhoto;
	
	@FindBy(xpath = ".//*[@id='header_image_upload_dialog-dialog']/div[2]/div[2]/div/div/div/div[3]/button[1]")
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
