package com.Instagram.Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Browsers.Util.AllBrowsers;

public class Notification_follow_Obj extends AllBrowsers {

	public @FindBy(xpath = "//div[6]/div/a/div/div[2]/div/div[text()='Notifications']") WebElement notification_btn;
	public @FindBy(xpath = "//span[text()='Today']") WebElement today_notification;
//	public @FindBy(xpath = "//span[text()='New']") WebElement new_notification;
//	public @FindBy(xpath = "//span[text()='Today']") WebElement today_notification;
//	public @FindBy(xpath = "//span[text()='Today']") WebElement today_notification;
	
	public @FindBy(xpath = "//div[text()='Follow']") WebElement follow_btn;
	public @FindBy(xpath = "//div[@style='opacity: 1;']/div/div[2]/div[2]") WebElement today_req;
	

}
