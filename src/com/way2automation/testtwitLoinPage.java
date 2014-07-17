package com.way2automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class testtwitLoinPage {
	
	public static void main(String[] args)
	{ 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://twitter.com");
		//driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		//pass pagefactory and then object, and then class, so that when we create a new class, it will initialize all the webelement in it
		twitlogin lp= PageFactory.initElements(driver,twitlogin.class);
		twitLandingPage landingpage = lp.doLogin("chehang13@gmail.com","qatesting123");
		twitMyProfile profile = landingpage.gotoProfile();
		twitEditProfile editProfile = profile.editProfile();
		editProfile.changePic();
		
	}
}
