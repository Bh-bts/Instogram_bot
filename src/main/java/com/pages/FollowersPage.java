package com.pages;

import com.browsers.Browsers;
import com.helpers.ActionsHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * page object model for increase the followers page.
 *
 * @author Bhavin.Thumar
 */
public class FollowersPage extends Browsers {

    public @FindBy(xpath = "//span[text()='See All']") WebElement seeAllButton;
    public @FindBy(xpath = "//div[1]//div[3]//button") WebElement followButton;
    public @FindBy(xpath = "//button[text()='OK']") WebElement warnOKButton;

    /**
     * Increases followers by automatically following users.
     * This method logs in, navigates to the followers page, and starts following users.
     *
     * @throws InterruptedException if the thread is interrupted while sleeping.
     */
    public void increaseFollowers() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login();

        ActionsHelpers.dynamicTimeOut(seeAllButton);
        seeAllButton.click();

        Thread.sleep(5000);
        ActionsHelpers.dynamicTimeOut(followButton);

        int followCounter = 0;

        while (followCounter < 25) {
            for (int i = 3; i <= 25; i++) {
                WebElement follow = driver.findElement(By.xpath("//div[" + i + "]//div[3]//button"));
                follow.click();
                Thread.sleep(20000);

                if (driver.findElements(By.xpath("//button[text()='OK']")).size() > 0) {
                    warnOKButton.click();
                }

                followCounter++;

                if (followCounter >= 25) {
                    return;
                }
            }
            break;
        }
    }
}
