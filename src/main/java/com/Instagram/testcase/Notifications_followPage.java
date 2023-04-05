package com.Instagram.testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Instagram.Obj.Notification_follow_Obj;

public class Notifications_followPage extends Notification_follow_Obj {

	public void incFollowers_Notification() throws InterruptedException, IOException {

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));

		LoginPage obj = PageFactory.initElements(driver, LoginPage.class);
		obj.login();

		w.until(ExpectedConditions.visibilityOf(notification_btn));
		notification_btn.click();
		
//		if(w.until(ExpectedConditions.visibilityOf(notification_btn)).isDisplayed() || w.until(ExpectedConditions.visibilityOf(notification_btn))) {
//			
//			
//		}

		Thread.sleep(5000);
		
		while(true) {
			
			
				
				follow_btn.click();
				
			
			
		}
		
		
	}

}
