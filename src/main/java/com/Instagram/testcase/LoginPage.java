package com.Instagram.testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Instagram.Obj.Followers_Obj;
import com.Utils.Properties.PropertiesClass;

public class LoginPage extends Followers_Obj {

	public static String ss;

	public void login() throws InterruptedException, IOException {

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOf(userName));

		ss = PropertiesClass.setSession();
		// ss = null;
		if (ss != null) {

			driver.manage().addCookie(new Cookie("sessionid", ss));
			driver.navigate().refresh();

			Thread.sleep(7000);

			if (driver.findElements(By.xpath("//button[@type='submit']")).size() > 0) {
				abc();

			}

		} else {

			abc();

		}
		w.until(ExpectedConditions.visibilityOf(popUpNotification));
		popUpNotification.click();

		if (ss == null) {

			w.until(ExpectedConditions.visibilityOf(popUpNotification));
		}

		if (driver.findElements(By.xpath("//button[text()='Not Now']")).size() > 0) {
			popUpNotification.click();

		}

	}

	public void abc() throws InterruptedException, IOException {

		userName.sendKeys(PropertiesClass.setUserName());
		passWord.sendKeys(PropertiesClass.setPassword());
		logIn_btn.click();
		Thread.sleep(5000);
		String c = driver.manage().getCookieNamed("sessionid").getValue();
		ss = c;
	}

}
