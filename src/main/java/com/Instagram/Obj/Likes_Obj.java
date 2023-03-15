package com.Instagram.Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.Instagram.testcase.CommentHomePage;

public class Likes_Obj extends CommentHomePage {

	public @FindBy(xpath = "//button[text()='Not Now']") WebElement popUpNotification;
	public @FindBy(xpath = "//article[1]//*[local-name()='svg'][@aria-label='Like']/ancestor::button") WebElement like_btn;

}
