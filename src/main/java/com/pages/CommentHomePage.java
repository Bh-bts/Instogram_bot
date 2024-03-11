package com.pages;

import java.util.Random;

import com.browsers.Browsers;
import com.helpers.ActionsHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page object class for commenting on the home page.
 *
 * @author Bhavin.Thumar
 */
public class CommentHomePage extends Browsers {

    @FindBy(xpath = "//article[1]//*[local-name()='svg'][@aria-label='Comment']/ancestor::div[@role='button']")
    WebElement commentButton;
    @FindBy(xpath = "//div[@role='dialog']//article//textarea[@aria-label='Add a comment…']")
    WebElement commentBox;
    @FindBy(xpath = "//div[@role='dialog']//article[1]//textarea[@aria-label='Add a comment…']/following-sibling::div/div")
    WebElement postButton;
    @FindBy(xpath = "//div[@role='dialog']//article//*[local-name()='svg'][@aria-label='Loading...']")
    WebElement loader;
    @FindBy(xpath = "//*[local-name()='svg'][@aria-label='Close']//*[local-name()='polyline'][@fill='none']/ancestor::div[@role='button']")
    WebElement closeButton;

    /**
     * Increases comments on articles displayed on the home page.
     *
     * @throws InterruptedException if the thread is interrupted while sleeping
     */
    public void increaseComments() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login();

        ActionsHelpers.dynamicTimeOut(commentButton);

        int commentCounter = 0;

        while (commentCounter < 5) {
            for (int i = 1; i < 5; i++) {
                WebElement postCommentElement = driver.findElement(By.xpath("//article[" + i + "]//*[local-name()='svg'][@aria-label='Comment']/ancestor::div[@role='button']"));
                postCommentElement.click();
                ActionsHelpers.dynamicTimeOut(commentBox);

                String[] comments = {"Good", "Very Good", "Pretty", "Gorgeous", "Beautiful❤", "Impressive", "Look Beautiful"};
                String randomComment = comments[new Random().nextInt(comments.length)];

                Thread.sleep(3000);
                commentBox.click();
                Thread.sleep(1000);
                commentBox.sendKeys(randomComment);
                Thread.sleep(2000);

                postButton.click();
                ActionsHelpers.dynamicTimeOut(loader);
                closeButton.click();

                Thread.sleep(5000);

                commentCounter++;

                if (commentCounter >= 5) {
                    return;
                }
            }
            break;
        }
    }
}
