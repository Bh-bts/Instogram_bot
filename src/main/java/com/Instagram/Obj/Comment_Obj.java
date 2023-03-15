package com.Instagram.Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Browsers.Util.AllBrowsers;

public class Comment_Obj extends AllBrowsers{
	
	public @FindBy(xpath = "//article[1]//*[local-name()='svg'][@aria-label='Comment']/ancestor::button") WebElement cmtBtn;
	public @FindBy(xpath = "//div[@role='dialog']//article//textarea[@aria-label='Add a comment…']") WebElement cmtBox;
	public @FindBy(xpath = "//div[@role='dialog']//article[1]//textarea[@aria-label='Add a comment…']/following-sibling::div/div") WebElement postBtn;
	public @FindBy(xpath = "//article//*[local-name()='svg'][@aria-label='Loading...']") WebElement loader;
	public @FindBy(xpath = "//*[local-name()='svg'][@aria-label='Close']/ancestor::div[@role='button']") WebElement closeBtn;
	
}
