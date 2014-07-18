package com.way2automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.way2automation.twitter.config.Configufile;

public class twitLandingPage {
	WebDriver driver;
	public twitLandingPage(WebDriver driver)
	{
		this.driver = driver;
	}

	@FindBy(xpath = Configufile.profile)
	public WebElement profile;
	
	@FindBy(xpath = Configufile.tweets)
	public WebElement tweets;
	
	@FindBy(xpath = Configufile.following)
	public WebElement following;
	
	@FindBy(xpath = Configufile.followers)
	public WebElement followers;

	
	public twitMyProfile gotoProfile()
	{
		profile.click();
		return PageFactory.initElements(driver,twitMyProfile.class);
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
