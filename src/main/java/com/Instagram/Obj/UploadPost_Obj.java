package com.Instagram.Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Browsers.Util.AllBrowsers;

public class UploadPost_Obj extends AllBrowsers{
	
	public @FindBy(xpath = "//input[@name='username']") WebElement userName;
	public @FindBy(xpath = "//input[@name='password']") WebElement passWord;
	public @FindBy(xpath = "//button[@type='submit']") WebElement logIn_btn;
	
	public @FindBy(xpath = "//div[text()='Not Now']") WebElement loginInfo_notNow;
	public @FindBy(xpath = "//button[text()='Not Now']") WebElement popUpNotification;
	
	public @FindBy(xpath = "//div[text()='Create']") WebElement create_btn;
	public @FindBy(xpath = "//input[@accept='image/jpeg,image/png,image/heic,image/heif,video/mp4,video/quicktime']") WebElement uploadPic;
	public @FindBy(xpath = "//button[text()='Select from computer']") WebElement pic_btn;
	public @FindBy(xpath = "//div[text()='Next']") WebElement next_btn;
	public @FindBy(xpath = "//div[text()='Share']") WebElement share_btn;
	
}
