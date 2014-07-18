package com.way2automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.way2automation.twitter.config.Configufile;

public class testtwitLoinPage {
	
	//call the property class, need to import the properties
	public static Properties config = new Properties();
	
	public static void main(String[] args) throws IOException
	{   
		//FileInputStream fis = new FileInputStream("C:\\Users\\sicong.ma\\Selendriod\\POMFactory\\src\\com\\way2automation\\twitter\\config\\OR.properties");
		//config.load(fis);
		
		WebDriver driver = new FirefoxDriver();
		driver.get(Configufile.testsite);
		//driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		//pass pagefactory and then object, and then class, so that when we create a new class, it will initialize all the webelement in it
		twitlogin lp= PageFactory.initElements(driver,twitlogin.class);
		twitLandingPage landingpage = lp.doLogin("chehang13@gmail.com","qatesting123");
		twitMyProfile profile = landingpage.gotoProfile();
		twitEditProfile editProfile = profile.editProfile();
		editProfile.changePic();
		
	}
}
