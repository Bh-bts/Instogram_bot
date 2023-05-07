package com.Instagram.testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Instagram.Obj.UploadPost_Obj;
import com.Utils.Properties.PropertiesClass;

public class UploadPostPage extends UploadPost_Obj {

	public void uploadPic() throws InterruptedException, IOException {

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		w.until(ExpectedConditions.visibilityOf(userName));

		userName.sendKeys(PropertiesClass.setUserName());
		passWord.sendKeys(PropertiesClass.setPassword());
		logIn_btn.click();
		Thread.sleep(7000);

		w.until(ExpectedConditions.visibilityOf(loginInfo_notNow));
		loginInfo_notNow.click();

		w.until(ExpectedConditions.visibilityOf(popUpNotification));
		popUpNotification.click();

		w.until(ExpectedConditions.visibilityOf(create_btn));
		create_btn.click();

		Thread.sleep(3000);

		w.until(ExpectedConditions.visibilityOf(pic_btn));
		String project_path = System.getProperty("user.dir");
		uploadPic.sendKeys(project_path + "/src/main/resources/Post Pic/pic1.jpg");

		w.until(ExpectedConditions.visibilityOf(next_btn));
		next_btn.click();

		Thread.sleep(3000);

		w.until(ExpectedConditions.visibilityOf(next_btn));
		next_btn.click();

		Thread.sleep(3000);

		w.until(ExpectedConditions.visibilityOf(share_btn));
		share_btn.click();

	}

}
