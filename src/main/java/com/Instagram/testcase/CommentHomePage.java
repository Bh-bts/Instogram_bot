package com.Instagram.testcase;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Instagram.Obj.Comment_Obj;

public class CommentHomePage extends Comment_Obj {

	public void incComment() throws InterruptedException, IOException {

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));

		LoginPage obj = PageFactory.initElements(driver, LoginPage.class);
		obj.login();

		w.until(ExpectedConditions.visibilityOf(cmtBtn));

		while (true) {

			for (int i = 1; i < 5; i++) {
				
				WebElement a = driver.findElement(By.xpath("//article[" + i + "]//*[local-name()='svg'][@aria-label='Comment']/ancestor::button"));
				a.click();

				w.until(ExpectedConditions.visibilityOf(cmtBox));

				String[] strings = {"good", "very good", "pretty", "gorgeous", "beautiful❤", "Impressive", "Look beautiful"};
		        Random random = new Random();
		        String randomString = strings[random.nextInt(strings.length)];
				
		        Thread.sleep(3000);
				cmtBox.click();
				Thread.sleep(1000);
				cmtBox.sendKeys(randomString);
				Thread.sleep(2000);

				postBtn.click();
				w.until(ExpectedConditions.invisibilityOf(loader));

				closeBtn.click();

				Thread.sleep(5000);

			}

			driver.navigate().refresh();
			w.until(ExpectedConditions.visibilityOf(cmtBtn));

		}

	}

}
