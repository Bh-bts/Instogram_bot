package com.Instagram.testcase;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Instagram.Obj.Likes_Obj;

public class LikesHomePage extends Likes_Obj {

	public void likesInc() throws InterruptedException, IOException {

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		LoginPage obj = PageFactory.initElements(driver, LoginPage.class);
		obj.login();
		
		w.until(ExpectedConditions.visibilityOf(like_btn));

		while (true) {

			for (int i = 1; i < 5; i++) {

				WebElement likes = driver.findElement(By.xpath("//article[" + i + "]//*[local-name()='svg'][@aria-label='Like']/ancestor::button"));
				List<WebElement> lk = likes.findElements(By.xpath("./child::node()"));

				if (lk.size() == 1) {

				} else {
					likes.click();
				}

				w.until(ExpectedConditions.visibilityOf(likes));
				js.executeScript("arguments[0].scrollIntoView(true);", likes);

				Thread.sleep(15000);
			}

			driver.navigate().refresh();
			w.until(ExpectedConditions.visibilityOf(like_btn));
		}
	}
}
