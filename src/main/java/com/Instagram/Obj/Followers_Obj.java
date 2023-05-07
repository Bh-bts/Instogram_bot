package com.Instagram.Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.Instagram.testcase.LikesHomePage;

public abstract class Followers_Obj extends LikesHomePage{

	public @FindBy(xpath = "//input[@name='username']") WebElement userName;
	public @FindBy(xpath = "//input[@name='password']") WebElement passWord;
	public @FindBy(xpath = "//button[@type='submit']") WebElement logIn_btn;
	public @FindBy(xpath = "//button[text()='Not Now']") WebElement popUpNotification;
	public @FindBy(xpath = "//div[text()='Not Now']") WebElement loginInfo_notNow;
	
	public int i=0;
	
	public @FindBy(xpath = "//span[text()='See All']") WebElement seeAll_btn;
	public @FindBy(xpath = "//div[1]//div[3]//button") WebElement follow_btn;
	
	//Limit while following
	public @FindBy(xpath = "//button[text()='OK']") WebElement warnPop;
	
}
