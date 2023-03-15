package com.Instagram.MainPage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Browsers.Util.AllBrowsers;
import com.Instagram.testcase.CommentHomePage;

public class Comments_MainPage extends CommentHomePage {

	public Comments_MainPage() {

		driver = AllBrowsers.startBrowser("chrome", Weburl);
	}

	@Test
	public void addComments() throws InterruptedException, IOException {

		CommentHomePage cmt = PageFactory.initElements(driver, CommentHomePage.class);
		cmt.incComment();

	}

}
