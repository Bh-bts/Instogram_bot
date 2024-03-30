package com.pages;

import java.util.List;

import com.browsers.Browsers;
import com.helpers.ActionsHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page object class for likes on the home page.
 *
 * @author Bhavin.Thumar
 */
public class LikesHomePage extends Browsers {

    public @FindBy(xpath = "//article[1]//*[local-name()='svg'][@aria-label='Like']/ancestor::div[@role='button']") WebElement likeButton;

    /**
     * Increases the number of likes.
     *
     * @throws InterruptedException if the thread is interrupted while sleeping
     */
    public void increaseLikes() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login();

        ActionsHelpers.dynamicTimeOut(likeButton);

        int likeCounter = 0;

        while (likeCounter < 5) {
            for (int i = 1; i < 5; i++) {
                WebElement like = driver.findElement(By.xpath("//article[" + i + "]//*[local-name()='svg'][@aria-label='Like']/ancestor::div[@role='button']"));
                List<WebElement> likes = like.findElements(By.xpath("//article[" + i + "]//*[local-name()='svg'][@aria-label='Like']/ancestor::div[@role='button']"));

                like.click();
                ActionsHelpers.dynamicTimeOut(like);
                ActionsHelpers.scrollTillElement(like);

                Thread.sleep(15000);

                likeCounter++;

                if (likeCounter >= 5) {
                    return;
                }
            }
            break;
        }
    }
}
