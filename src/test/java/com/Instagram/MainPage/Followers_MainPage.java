package com.Instagram.MainPage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Browsers.Util.AllBrowsers;
import com.Instagram.testcase.FollowersPage;
import com.Utils.Properties.PropertiesClass;

public class Followers_MainPage extends FollowersPage {
	
	public Followers_MainPage() throws IOException {
		
		driver = AllBrowsers.startBrowser(PropertiesClass.setBrowser(), PropertiesClass.setURL());
		
	}
	
	@Test
	public void getFollowers() throws InterruptedException, IOException {
		
		FollowersPage obj = PageFactory.initElements(driver, FollowersPage.class);
		obj.followersInc();
		
		
	}
	

}
