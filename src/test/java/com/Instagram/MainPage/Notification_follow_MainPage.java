package com.Instagram.MainPage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Browsers.Util.AllBrowsers;
import com.Instagram.testcase.Notifications_followPage;
import com.Utils.Properties.PropertiesClass;

public class Notification_follow_MainPage extends Notifications_followPage {

	public Notification_follow_MainPage() throws IOException {

		driver = AllBrowsers.startBrowser("firefox", PropertiesClass.setURL());

	}

	@Test
	public void incFollowers() throws InterruptedException, IOException {

		Notifications_followPage not = PageFactory.initElements(driver, Notifications_followPage.class);
		not.incFollowers_Notification();

	}

}
