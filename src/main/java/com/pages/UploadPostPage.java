package com.pages;

import com.browsers.Browsers;
import com.helpers.ActionsHelpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page object class for uploading a post.
 *
 * @author Bhavin.Thumar
 */
public class UploadPostPage extends Browsers {

    @FindBy(xpath = "//span[text()='Create']")
    WebElement createButton;
    @FindBy(xpath = "//input[@accept='image/jpeg,image/png,image/heic,image/heif,video/mp4,video/quicktime']")
    WebElement uploadPicture;
    @FindBy(xpath = "//button[text()='Select from computer']")
    WebElement selectFromComputerButton;
    @FindBy(xpath = "//div[text()='Next']")
    WebElement nextButton;
    @FindBy(xpath = "//div[text()='Share']")
    WebElement shareButton;

    /**
     * Uploads a picture.
     *
     * @throws InterruptedException if the thread is interrupted while sleeping
     */
    public void uploadPic() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login();

        ActionsHelpers.dynamicTimeOut(createButton);
        createButton.click();

        Thread.sleep(3000);

        ActionsHelpers.dynamicTimeOut(selectFromComputerButton);
        String project_path = System.getProperty("user.dir");
        uploadPicture.sendKeys(project_path + "/src/test/resources/post_pic/pic1.jpg");

        ActionsHelpers.dynamicTimeOut(nextButton);
        nextButton.click();

        Thread.sleep(3000);

        ActionsHelpers.dynamicTimeOut(nextButton);
        nextButton.click();

        Thread.sleep(3000);

        ActionsHelpers.dynamicTimeOut(shareButton);
        shareButton.click();
    }
}
