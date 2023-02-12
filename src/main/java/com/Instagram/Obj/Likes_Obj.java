package com.Instagram.Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Browsers.Util.AllBrowsers;

public class Likes_Obj extends AllBrowsers {

	public @FindBy(xpath = "//button[text()='Not Now']") WebElement popUpNotification;
	public @FindBy(xpath = "//article[1]//*[local-name()='svg'][@aria-label='Like']/ancestor::button") WebElement like_btn;

}
