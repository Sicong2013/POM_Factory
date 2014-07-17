package com.way2automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class testtwitLoinPage {
	
	public static void main(String[] args)
	{ 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://twitter.com");
		
		//pass pagefactory and then object, and then class, so that when we create a new class, it will initialize all the webelement in it
		twitlogin lp= PageFactory.initElements(driver,twitlogin.class);
		twitLandingPage landingpage = lp.doLogin("sicong.ma10@gmail.com","Woyaoyuanmeng88~");
		landingpage.gotoProfile();
	}
}
