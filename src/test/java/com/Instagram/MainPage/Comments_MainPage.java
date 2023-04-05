package com.Instagram.MainPage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Browsers.Util.AllBrowsers;
import com.Instagram.testcase.CommentHomePage;
import com.Utils.Properties.PropertiesClass;

public class Comments_MainPage extends CommentHomePage {

	public Comments_MainPage() throws IOException {

		driver = AllBrowsers.startBrowser(PropertiesClass.setBrowser(), PropertiesClass.setURL());
	}

	@Test
	public void addComments() throws InterruptedException, IOException {

		CommentHomePage cmt = PageFactory.initElements(driver, CommentHomePage.class);
		cmt.incComment();

	}

}
