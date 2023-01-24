package com.Instagram.testcase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Instagram.Obj.Followers_Obj;

public class FollowersPage extends Followers_Obj {

	public String ss;

	public void followersInc() throws InterruptedException, IOException {

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOf(userName));

		ss = "57543233224%3AGbxZ7gOIX0NFv1%3A26%3AAYf9ZPJr4VQScu6MRZDxH91U5VvhrjT0kTyjEIzjDw";
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

		w.until(ExpectedConditions.visibilityOf(seeAll_btn));
		seeAll_btn.click();

		Thread.sleep(5000);
		w.until(ExpectedConditions.visibilityOf(follow_btn));

		while (true) {

			for (int i = 1; i <= 25; i++) {

				WebElement a = driver.findElement(By.xpath("//div[" + i + "]/div[3]/button"));
				a.click();
				Thread.sleep(30000);

				if (driver.findElements(By.xpath("//button[text()='OK']")).size() > 0) {
					warnPop.click();

				}
			}

			driver.navigate().refresh();
			w.until(ExpectedConditions.visibilityOf(follow_btn));

		}

	}

	public void abc() throws InterruptedException, IOException {

		FileReader reader = new FileReader("config.properties");

		Properties p = new Properties();
		p.load(reader);

		String username = p.getProperty("user_name");
		String password = p.getProperty("password");

		userName.sendKeys(username);
		passWord.sendKeys(password);
		logIn_btn.click();
		Thread.sleep(5000);
		String c = driver.manage().getCookieNamed("sessionid").getValue();
		ss = c;
	}

}
