package com.way2automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.way2automation.twitter.config.Configufile;

public class twitMyProfile {
 
	public static Properties config = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\sicong.ma\\Selendriod\\POMFactory\\src\\com\\way2automation\\twitter\\config\\OR.properties");
	
	
	WebDriver driver;
	public twitMyProfile(WebDriver driver) throws IOException
	{
		this.driver = driver;
		
	}
	
	//create webElement
	@FindBy(xpath = Configufile.editbutton)
	public WebElement editbutton;
    
	//method
	public twitEditProfile editProfile()
	{
		editbutton.click();
		return PageFactory.initElements(driver, twitEditProfile.class);
	}

}
