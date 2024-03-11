package com.pages;

import com.browsers.Browsers;
import com.helpers.ActionsHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page object class for the login page.
 *
 * @author Bhavin.Thumar
 */
public class LoginPage extends Browsers {

    @FindBy(xpath = "//input[@name='username']")
    WebElement userNameField;
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;
    @FindBy(xpath = "//button[text()='Not Now']")
    WebElement notNowButton;
    @FindBy(xpath = "//div[text()='Not now']")
    WebElement notNowNotification;

    /**
     * Holds the session ID for the logged-in user.
     */
    public static String sessionId;

    /**
     * Performs the login operation.
     *
     * @throws InterruptedException if the thread is interrupted while sleeping
     */
    public void login() throws InterruptedException {
        ActionsHelpers.dynamicTimeOut(userNameField);

        sessionId = System.getenv("INSTAGRAM_SESSION_ID");
        // sessionId = null;
        if (sessionId != null) {

            driver.manage().addCookie(new Cookie("sessionid", sessionId));
            driver.navigate().refresh();

            Thread.sleep(7000);

            if (driver.findElements(By.xpath("//button[@type='submit']")).size() > 0) {
                performLogin();
            }

        } else {
            performLogin();
        }

        if (driver.findElements(By.xpath("//button[text()='Not Now']")).size() > 0) {
            ActionsHelpers.dynamicTimeOut(notNowButton);
            notNowButton.click();
        }

        if (driver.findElements(By.xpath("//button[text()='Not Now']")).size() > 0) {
            notNowButton.click();
        }
    }

    /**
     * Performs the actual login with username and password.
     *
     * @throws InterruptedException if the thread is interrupted while sleeping
     */
    public void performLogin() throws InterruptedException {
        userNameField.sendKeys(System.getenv("INSTAGRAM_ID"));
        passwordField.sendKeys(System.getenv("INSTAGRAM_PASSWORD"));
        loginButton.click();
        Thread.sleep(10000);

        if (driver.findElements(By.xpath("//div[text()='Not now']")).size() > 0) {
            notNowNotification.click();
        }

        String cookieValue = driver.manage().getCookieNamed("sessionid").getValue();
        sessionId = cookieValue;
    }
}
