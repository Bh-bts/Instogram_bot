package com.Instagram.MainPage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Browsers.Util.AllBrowsers;
import com.Instagram.testcase.LikesHomePage;
import com.Utils.Properties.PropertiesClass;

public class Likes_MainHomePage extends LikesHomePage {

	public Likes_MainHomePage() throws IOException {

		driver = AllBrowsers.startBrowser(PropertiesClass.setBrowser(), PropertiesClass.setURL());
	}

	@Test
	public void incLike() throws InterruptedException, IOException {

		LikesHomePage obj = PageFactory.initElements(driver, LikesHomePage.class);
		obj.likesInc();

	}

}
