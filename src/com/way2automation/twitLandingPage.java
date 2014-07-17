package com.way2automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class twitLandingPage {
	WebDriver driver;
	public twitLandingPage(WebDriver driver)
	{
		this.driver = driver;
	}

	@FindBy(xpath = ".//*[@id='page-container']/div[1]/div[1]/div/div[1]/div/a")
	public WebElement profile;
	
	@FindBy(xpath = ".//*[@id='page-container']/div[1]/div[1]/div/div[2]/ul/li[1]/a/span[1]")
	public WebElement tweets;
	
	@FindBy(xpath = ".//*[@id='page-container']/div[1]/div[1]/div/div[2]/ul/li[2]/a/span[1]")
	public WebElement following;
	
	@FindBy(xpath = ".//*[@id='page-container']/div[1]/div[1]/div/div[2]/ul/li[3]/a/span[1]")
	public WebElement followers;

	
	public void gotoProfile()
	{
		profile.click();
	}
	
	public void gotoTweets()
	{
		tweets.click();
	}
	
	public void gotoFollowing()
	{
		following.click();
	}
	
	public void gotoFollowers()
	{
		followers.click();
	}
}
