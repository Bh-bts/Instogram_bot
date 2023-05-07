package com.Instagram.MainPage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Browsers.Util.AllBrowsers;
import com.Instagram.testcase.UploadPostPage;
import com.Utils.Properties.PropertiesClass;

public class UploadPic_MainPage extends UploadPostPage{
	
	public UploadPic_MainPage () throws IOException{
		
		driver = AllBrowsers.startBrowser(PropertiesClass.setBrowser(), PropertiesClass.setURL());
		
	}
	@Test
	public void uploadPicture() throws InterruptedException, IOException {
		
		UploadPostPage obj = PageFactory.initElements(driver, UploadPostPage.class);
		obj.uploadPic();
		
	}
}
