package com.way2automation.twitter.config;

public class Configufile {
	public static String testsite = "http://twitter.com";
	//Xpaths

	//twitLogin
	public static final String username = ".//*[@id='signin-email']";
	public static final String password = ".//*[@id='signin-password']";
	public static final String signin = ".//*[@id='front-container']/div[2]/div[2]/form/table/tbody/tr/td[2]/button";

	//twitLandingPage
	public static final String profile = ".//*[@id='page-container']/div[1]/div[1]/div/div[1]/div/a";
    public static final String tweets = ".//*[@id='page-container']/div[1]/div[1]/div/div[2]/ul/li[1]/a/span[1]";
	public static final String	following = ".//*[@id='page-container']/div[1]/div[1]/div/div[2]/ul/li[2]/a/span[1]";
    public static final String followers = ".//*[@id='page-container']/div[1]/div[1]/div/div[2]/ul/li[3]/a/span[1]";

	//twitMyProfile
    public static final String editbutton = ".//*[@id='page-container']/div[3]/div/div[2]/div[2]/div/div[2]/div/div/ul/li[3]/div/button";


	// twitEditProfile
    public static final String inlineEditIcon= ".//*[@id='page-container']/div[3]/div/div[1]/div[1]/button";
    public static final String uploadPhoto = ".//*[@id='header-choose-existing']/div/div/label/input";
    public static final String cancelPhoto = ".//*[@id='header_image_upload_dialog-dialog']/div[2]/div[2]/div/div/div/div[3]/button[1]";
	 

}
