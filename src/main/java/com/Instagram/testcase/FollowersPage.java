package com.Instagram.testcase;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Instagram.Obj.Followers_Obj;

public class FollowersPage extends Followers_Obj {

	

	public void followersInc() throws InterruptedException, IOException {

		LoginPage obj = PageFactory.initElements(driver, LoginPage.class);
		obj.login();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));

		w.until(ExpectedConditions.visibilityOf(seeAll_btn));
		seeAll_btn.click();

		Thread.sleep(5000);
		w.until(ExpectedConditions.visibilityOf(follow_btn));

		while (true) {

			for (int i = 1; i <= 25; i++) {

				WebElement a = driver.findElement(By.xpath("//div[" + i + "]//div[3]//button"));
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

	
}
